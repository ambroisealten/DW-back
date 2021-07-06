/**
 *
 */
package fr.alten.dw.controller.business;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import fr.alten.dw.model.beans.BeanScheme;
import fr.alten.dw.model.beans.ScreenConfig;
import fr.alten.dw.utils.CorrespondenceDataMap;
import fr.alten.dw.utils.ReflectionClass;

/**
 * Controller for data scheme business logic. This controller make introspection
 * on beans to build the data scheme
 *
 * @author Andy Chabalier
 *
 */
@Service
@SuppressWarnings("rawtypes")
public class DataSchemeBusinessController {

	private final List<Class> emptyOrForbiddenDataClass = new ArrayList<Class>();
	private final List<Field> emptyOrForbiddenDataField = new ArrayList<Field>();

	@Autowired
	private DataBusinessController dataBusinessController;

	private final CorrespondenceDataMap dataMap;

	private final Package basePackage;

	public DataSchemeBusinessController() throws ClassNotFoundException, IOException {
		this.dataMap = CorrespondenceDataMap.getInstance();
		this.basePackage = BeanScheme.class.getPackage();
	}

	/**
	 * Build the data scheme
	 *
	 * @return the list of {@link BeanScheme}
	 * @throws ClassNotFoundException if the class cannot be located
	 * @throws SecurityException      If a security manager, s, is present and any
	 *                                of the following conditions is met: • the
	 *                                caller's class loader is not the same as the
	 *                                class loader of this class and invocation of
	 *                                s.checkPermission method with
	 *                                RuntimePermission("accessDeclaredMembers")denies
	 *                                access to the declared fields within this
	 *                                class the caller's class loader is not the
	 *                                same as or an ancestor of the class loader for
	 *                                the current class and invocation of
	 *                                s.checkPackageAccess() denies access to the
	 *                                package of this class
	 * @throws IOException            If I/O errors occur
	 */
	public List<BeanScheme> getDataScheme() throws ClassNotFoundException, SecurityException, IOException {
		this.getEmptyOrForbiddenDataClass();
		final ArrayList<BeanScheme> result = new ArrayList<BeanScheme>();
		// Use utility reflection class to fetch all beans class
		for (final Class classFound : ReflectionClass.getClasses(this.basePackage.getName())) {
			// If the class found is not a class with corresponding database table empty or
			// a no-data beans.
			if (!this.getEmptyOrForbiddenDataClass().contains(classFound)) {
				final String translatedClassName = this.dataMap.getTableName(classFound.getSimpleName());
				final BeanScheme bean = new BeanScheme(translatedClassName);
				for (final Field fieldFound : classFound.getDeclaredFields()) {
					// If the filed found is not a field with corresponding database column empty or
					// a no-data field.
					if (!fieldFound.getName().equals("serialVersionUID")
							&& !this.getEmptyOrForbiddenDataField().contains(fieldFound)) {
						final String translatedColumnName = this.dataMap.getColumnName(fieldFound.getName());
						bean.addField(translatedColumnName, fieldFound.getType().getSimpleName());
					}
				}
				result.add(bean);
			}
		}
		return result;
	}

	/**
	 * Fetch all class witch they are not forbidden to access and empty class on
	 * database. If the private member class emptyOrForbiddenDataClass is empty,
	 * that can mean it's not initialize. Then this method make introspection and
	 * request to database to add item on list. If emptyOrForbiddenDataClass is not
	 * empty, than return the list of empty or forbidden classes
	 *
	 * @return the list of all class except forbidden class and class with no data
	 *         in database
	 * @throws ClassNotFoundException if the class cannot be located
	 * @throws IOException            If I/O errors occur
	 */
	public List<Class> getEmptyOrForbiddenDataClass() throws ClassNotFoundException, IOException {
		// Check if the emptyOrForbiddenDataClass field is empty. If true, that means
		// this field could be not initialized
		if (this.emptyOrForbiddenDataClass.size() == 0) {
			// Add forbidden class
			this.emptyOrForbiddenDataClass.add(BeanScheme.class);
			this.emptyOrForbiddenDataClass.add(ScreenConfig.class);
			for (final Class classFound : ReflectionClass.getClasses(this.basePackage.getName())) {
				if (classFound.getName() != BeanScheme.class.getName()
						&& classFound.getName() != ScreenConfig.class.getName()) {
					// Check if the table have some data
					if (this.dataBusinessController.getCountOfDataForObject(classFound) == 0) {
						this.emptyOrForbiddenDataClass.add(classFound);
					}
				}
			}
		}
		return this.emptyOrForbiddenDataClass;
	}

	/**
	 * Fetch all fields witch they are not forbidden to access and empty column on
	 * database. If the private member class emptyOrForbiddenDataField is empty,
	 * that can mean it's not initialize. Then this method make introspection and
	 * request to database to add item on list. If emptyOrForbiddenDataField is not
	 * empty, than return the list of empty or forbidden fields
	 *
	 * @return the list of all fields except forbidden class and class with no data
	 *         in database
	 * @throws ClassNotFoundException if the class cannot be located
	 * @throws IOException            If I/O errors occur
	 */
	public List<Field> getEmptyOrForbiddenDataField() throws ClassNotFoundException, IOException {
		// Check if the emptyOrForbiddenDataField field is empty. If true, that means
		// this field could be not initialized
		if (this.emptyOrForbiddenDataField.size() == 0) {
			Arrays.stream(ReflectionClass.getClasses(this.basePackage.getName())).filter(c -> {
				// We filter the array to stay with only good beans
				try {
					return !this.getEmptyOrForbiddenDataClass().contains(c);
				} catch (ClassNotFoundException | IOException e) {
					return false;
				}
			}).forEach(cl -> {
				for (final Field field : cl.getDeclaredFields()) {
					// Check if the column have some data
					if (!field.getName().equals("serialVersionUID")
							&& this.dataBusinessController.getCountOfDataForColumn(cl, field) == 0) {
						this.emptyOrForbiddenDataField.add(field);
					}
				}
			});
		}
		return this.emptyOrForbiddenDataField;
	}

	/**
	 * Init method listening the {@link ApplicationReadyEvent}. This method allow
	 * the server to init emptyOrForbiddenDataClass and emptyOrForbiddenDataField
	 * member class on server init This allow more reaction of firsts requests.
	 *
	 * @throws ClassNotFoundException if the class cannot be located
	 * @throws IOException            If I/O errors occur
	 */
	@EventListener(ApplicationReadyEvent.class)
	public void init() throws ClassNotFoundException, IOException {
		this.getEmptyOrForbiddenDataClass();
		this.getEmptyOrForbiddenDataField();
	}
}
