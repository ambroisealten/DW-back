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
import fr.alten.dw.model.beans.Data;
import fr.alten.dw.utils.CorrespondenceDataMap;
import fr.alten.dw.utils.ReflectionClass;

/**
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

	private final Package pack;

	public DataSchemeBusinessController() throws ClassNotFoundException, IOException {
		dataMap = CorrespondenceDataMap.getInstance();
		pack = BeanScheme.class.getPackage();
	}

	public ArrayList<BeanScheme> getDataScheme() throws ClassNotFoundException, SecurityException, IOException {
		getNoEmptyOrForbiddenDataClass();
		final ArrayList<BeanScheme> result = new ArrayList<BeanScheme>();
		for (final Class classFound : ReflectionClass.getClasses(pack.getName())) {
			if (!getNoEmptyOrForbiddenDataClass().contains(classFound)) {
				final String translatedClassName = dataMap.getTableName(classFound.getSimpleName());
				final BeanScheme bean = new BeanScheme(translatedClassName);
				for (final Field fieldFound : classFound.getDeclaredFields()) {
					if (!fieldFound.getName().equals("serialVersionUID") && !getNoEmptyOrForbiddenDataField().contains(fieldFound) ) {
						final String translatedColumnName = dataMap.getColumnName(fieldFound.getName());
						bean.addField(translatedColumnName, fieldFound.getType().getSimpleName());
					}
				}
				result.add(bean);
			}
		}
		return result;
	}

	public List<Class> getNoEmptyOrForbiddenDataClass() throws ClassNotFoundException, IOException {
		if(emptyOrForbiddenDataClass.size() == 0) {
			emptyOrForbiddenDataClass.add(BeanScheme.class);
			emptyOrForbiddenDataClass.add(Data.class);
			for (final Class classFound : ReflectionClass.getClasses(pack.getName())) {
				if (classFound.getName() != BeanScheme.class.getName() && classFound.getName() != Data.class.getName()) {
					if (dataBusinessController.getCountOfDataForObject(classFound) == 0) {
						emptyOrForbiddenDataClass.add(classFound);
					}
				}
			}
		}
		return emptyOrForbiddenDataClass;
	}

	public List<Field> getNoEmptyOrForbiddenDataField() throws ClassNotFoundException, IOException {
		if(emptyOrForbiddenDataField.size() == 0) {
			Arrays.stream(ReflectionClass.getClasses(pack.getName())).filter(c -> {
				try {
					return !getNoEmptyOrForbiddenDataClass().contains(c);
				} catch (ClassNotFoundException | IOException e) {
					return false;
				}
			}).forEach(cl -> {
				for(final Field field : cl.getDeclaredFields()) {
					if(!field.getName().equals("serialVersionUID") && dataBusinessController.getCountOfDataForColumn(cl,field) == 0) {
						emptyOrForbiddenDataField.add(field);
					}
				}
			});
		}
		return emptyOrForbiddenDataField;
	}

	@EventListener(ApplicationReadyEvent.class)
	public void init() throws ClassNotFoundException, IOException {
		getNoEmptyOrForbiddenDataClass();
		getNoEmptyOrForbiddenDataField();
	}
}
