package fr.alten.dw.model.dao;

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

	public long countNumberOfData(final Class<?> simpleName) {
		return (long) entityManager.createQuery("SELECT COUNT(d) FROM " + simpleName.getSimpleName() + " d")
				.getSingleResult();
	}

	public <T, ID> List<?> findByTable(final Class<T> type) {
		return entityManager.createQuery("SELECT d FROM " + type.getSimpleName() + " d").getResultList();
	}

	public <T, ID> List<?> findByTableWithLimits(final Class<T> type, final String id, final int lineStart,
			final int lineNumber) {
		return entityManager.createQuery("SELECT d FROM " + type.getSimpleName() + " d ORDER BY " + id + " DESC")
				.setFirstResult(lineStart).setMaxResults(lineNumber).getResultList();

	}

}
