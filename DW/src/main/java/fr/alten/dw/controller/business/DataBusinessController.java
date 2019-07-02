package fr.alten.dw.controller.business;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.alten.dw.model.beans.BeanScheme;
import fr.alten.dw.model.dao.DataRepository;
import fr.alten.dw.utils.CorrespondenceDataMap;
import fr.alten.dw.utils.ReflectionClass;

@Service
@SuppressWarnings("rawtypes")
public class DataBusinessController {

	@Autowired
	private DataRepository dataRepository;

	public DataBusinessController() throws InstantiationException, IllegalAccessException {
	}

	@SuppressWarnings("unchecked")
	public List<?> getAllDataOfAnObjectWithinStartAndEnd(final String objectSearched, final Integer lineStart,
			final Integer lineEnd) throws ClassNotFoundException, IOException {
		final Package pack = BeanScheme.class.getPackage();
		final CorrespondenceDataMap dataMap = CorrespondenceDataMap.getInstance();
		final String translatedTableName = dataMap.getTableWithName(objectSearched);

		for (final Class classFound : ReflectionClass.getClasses(pack.getName())) {
			if (classFound.getSimpleName().equals(translatedTableName)) {
				return dataRepository.findByTableWithLimits(classFound, ReflectionClass.getBeanId(classFound),
						lineStart, lineEnd);
			}
		}
		return new ArrayList<>();
	}

	public long getCountOfDataForColumn(final Class cl, final Field field) {
		return dataRepository.countNumberOfDataField(cl,field);
	}

	public long getCountOfDataForObject(final Class objectSearched) throws ClassNotFoundException, IOException {
		return dataRepository.countNumberOfData(objectSearched);
	}

	@SuppressWarnings("unchecked")
	public List<?> getDataForObject(final String objectSearched) throws ClassNotFoundException, IOException {
		final Package pack = BeanScheme.class.getPackage();
		final CorrespondenceDataMap dataMap = CorrespondenceDataMap.getInstance();
		final String translatedTableName = dataMap.getTableWithName(objectSearched);

		for (final Class classFound : ReflectionClass.getClasses(pack.getName())) {
			if (classFound.getSimpleName().equals(translatedTableName)) {
				return dataRepository.findByTable(classFound);
			}
		}
		return new ArrayList<>();
	}

}
