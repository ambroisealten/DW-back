package fr.alten.dw.model.dao;

import java.lang.reflect.Field;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas Royackkers
 *
 */
@Service
public class DataRepository {
	@Autowired
	private EntityManager entityManager;

	public long countNumberOfData(final Class<?> table) {
		return (long) entityManager.createQuery("SELECT COUNT(d) FROM " + table.getSimpleName() + " d")
				.getSingleResult();
	}

	public long countNumberOfDataField(final Class<?> table, final Field field) {
		return (long) entityManager.createQuery("SELECT COUNT(d."+ field.getName() +") FROM " + table.getSimpleName() + " d")
				.getSingleResult();
	}

	public <T, ID> List<?> findByTable(final Class<T> type) {
		return entityManager.createQuery("SELECT d FROM " + type.getSimpleName() + " d").getResultList();
	}

	public <T, ID> List<?> findByTableAndColumn(final Class<T> classFound, final String columnWithName) {
		return entityManager.createQuery("SELECT d."+columnWithName+" FROM " + classFound.getSimpleName() + " d")
				.getResultList();
	}

	public <T, ID> List<?> findByTableWithLimits(final Class<T> type, final String id, final int lineStart,
			final int lineNumber) {
		return entityManager.createQuery("SELECT d FROM " + type.getSimpleName() + " d ORDER BY " + id + " DESC")
				.setFirstResult(lineStart).setMaxResults(lineNumber).getResultList();

	}

}
