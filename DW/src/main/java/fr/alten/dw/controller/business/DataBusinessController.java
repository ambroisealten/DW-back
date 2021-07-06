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

/**
 * Controller for data logic.
 *
 * @author Lucas Royackkers, Andy Chabalier
 *
 */
@Service
@SuppressWarnings("rawtypes")
public class DataBusinessController {

	@Autowired
	private DataRepository dataRepository;
	private final CorrespondenceDataMap dataMap;
	private final Package basePackage;

	public DataBusinessController() throws InstantiationException, IllegalAccessException {
		this.dataMap = CorrespondenceDataMap.getInstance();
		this.basePackage = BeanScheme.class.getPackage();
	}

	/**
	 * Fetch data between two delimiters.
	 *
	 * @param tableToFetch the table to fetch
	 * @param lineStart    the first line to fetch
	 * @param numberLine   the number of line to fetch after lineStart
	 * @return the list of all data between the provided limits
	 * @throws ClassNotFoundException if the class cannot be located
	 * @throws IOException            If I/O errors occur
	 */
	@SuppressWarnings("unchecked")
	public List<?> getAllDataOfAnObjectWithinStartAndEnd(final String tableToFetch, final Integer lineStart,
			final Integer numberLine) throws ClassNotFoundException, IOException {
		final String translatedTableName = this.dataMap.getTableWithName(tableToFetch);

		// We use utility reflection method to get all beans
		for (final Class classFound : ReflectionClass.getClasses(this.basePackage.getName())) {
			if (classFound.getSimpleName().equals(translatedTableName)) {
				return this.dataRepository.findByTableWithLimits(classFound, ReflectionClass.getBeanId(classFound),
						lineStart, numberLine);
			}
		}
		return new ArrayList<>();
	}

	/**
	 * Fetch the number of row of a specific column of a table.
	 *
	 * @param table  the table to analyze
	 * @param column the column to fetch
	 * @return a long representing the number of row in the column
	 */
	public long getCountOfDataForColumn(final Class table, final Field column) {
		return this.dataRepository.countNumberOfDataField(table, column);
	}

	/**
	 * Fetch the number of row of a table.
	 *
	 * @param table the table to fetch
	 * @return a long representing the number of row in a table
	 */
	public long getCountOfDataForObject(final Class table) {
		return this.dataRepository.countNumberOfData(table);
	}

	/**
	 *
	 * @param table  the table to analyze
	 * @param column the column to fetch
	 * @return the list of data from a table
	 * @throws ClassNotFoundException if the class cannot be located
	 * @throws IOException            If I/O errors occur
	 */
	@SuppressWarnings("unchecked")
	public List<?> getDataFromColumn(final String table, final String column)
			throws ClassNotFoundException, IOException {
		final String translatedTableName = this.dataMap.getTableWithName(table);

		for (final Class classFound : ReflectionClass.getClasses(this.basePackage.getName())) {
			if (classFound.getSimpleName().equals(translatedTableName)) {
				return this.dataRepository.findByTableAndColumn(classFound, this.dataMap.getColumnWithName(column));
			}
		}
		return new ArrayList<>();
	}

	/**
	 * Fetch all data from a specific table.
	 *
	 * @param table the table to fetch
	 * @return the list of data from a table
	 * @throws ClassNotFoundException if the class cannot be located
	 * @throws IOException            If I/O errors occur
	 */
	@SuppressWarnings("unchecked")
	public List<?> getDataOfTable(final String table) throws ClassNotFoundException, IOException {
		final String translatedTableName = this.dataMap.getTableWithName(table);

		for (final Class classFound : ReflectionClass.getClasses(this.basePackage.getName())) {
			if (classFound.getSimpleName().equals(translatedTableName)) {
				return this.dataRepository.findByTable(classFound);
			}
		}
		return new ArrayList<>();
	}

}
