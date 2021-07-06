package fr.alten.dw.model.dao;

import java.lang.reflect.Field;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas Royackkers, Andy Chabalier
 *
 */
@Service
public class DataRepository {
	@Autowired
	private EntityManager entityManager;

	/**
	 * Fetch the number of row of a table. the corresponding query is: SELECT
	 * COUNT(*) FROM table
	 * 
	 * @param table the table to analyse
	 * @return a long representing the number of row in a table
	 */
	public long countNumberOfData(final Class<?> table) {
		return (long) this.entityManager.createQuery("SELECT COUNT(d) FROM " + table.getSimpleName() + " d")
				.getSingleResult();
	}

	/**
	 * Fetch the number of row of a specific column of a table.
	 *
	 * the corresponding query is: SELECT COUNT(column) FROM table
	 * 
	 * @param table  the table to analyze
	 * @param column the column name to analyze
	 * @return a long representing the number of row in the column
	 */
	public long countNumberOfDataField(final Class<?> table, final Field column) {
		return (long) this.entityManager
				.createQuery("SELECT COUNT(d." + column.getName() + ") FROM " + table.getSimpleName() + " d")
				.getSingleResult();
	}

	/**
	 * Fetch all data from a specific table.
	 *
	 * the corresponding query is: SELECT * FROM table;
	 *
	 * @param table the table name
	 * @return the list of data from a table
	 */
	public <T, ID> List<?> findByTable(final Class<T> table) {
		return this.entityManager.createQuery("SELECT d FROM " + table.getSimpleName() + " d").getResultList();
	}

	/**
	 * Fetch all data of a column of a specific table
	 *
	 * the corresponding query is: SELECT column FROM table;
	 *
	 * @param table  the table to analyze
	 * @param column the column name to fetch
	 * @return the list of data from a table
	 */
	public <T, ID> List<?> findByTableAndColumn(final Class<T> table, final String column) {
		return this.entityManager.createQuery("SELECT d." + column + " FROM " + table.getSimpleName() + " d")
				.getResultList();
	}

	/**
	 * Fetch data between two delimiters. In fact, the request work with a start
	 * row, and a number witch represent the number of row since the start row. that
	 * method fetch data ordered by descending id. Should be the recent one first.
	 *
	 * the corresponding query is: SELECT * FROM table ORDER BY ID DESC LIMIT
	 * lineStart, lineNumber;
	 *
	 * @param table      the table to fetch
	 * @param id         the id field name. Use to fetch with an order
	 * @param lineStart  the first line to fetch
	 * @param lineNumber the number of line to fetch after lineStart
	 * @return the list of all data between the provided limits
	 */
	public <T, ID> List<?> findByTableWithLimits(final Class<T> table, final String id, final int lineStart,
			final int lineNumber) {
		return this.entityManager.createQuery("SELECT d FROM " + table.getSimpleName() + " d ORDER BY " + id + " DESC")
				.setFirstResult(lineStart).setMaxResults(lineNumber).getResultList();

	}

}
