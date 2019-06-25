/**
 *
 */
package fr.alten.dw.controller.business;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

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

	public ArrayList<BeanScheme> getDataScheme() throws ClassNotFoundException, SecurityException, IOException {
		final CorrespondenceDataMap dataMap = CorrespondenceDataMap.getInstance();

		final ArrayList<BeanScheme> result = new ArrayList<BeanScheme>();
		final Package pack = BeanScheme.class.getPackage();
		for (final Class classFound : ReflectionClass.getClasses(pack.getName())) {
			if (classFound.getName() != BeanScheme.class.getName() && classFound.getName() != Data.class.getName()) {
				String translatedClassName = dataMap.getTableName(classFound.getSimpleName());
				final BeanScheme bean = new BeanScheme(translatedClassName);
				
				for (final Field fieldFound : classFound.getDeclaredFields()) {
					if (!fieldFound.getName().equals("serialVersionUID")) {
						final String translatedColumnName = dataMap.getColumnName(fieldFound.getName());
						
						bean.addField(translatedColumnName, fieldFound.getType().getSimpleName());
					}
				}
				result.add(bean);
			}
		}
		return result;
	}

}
