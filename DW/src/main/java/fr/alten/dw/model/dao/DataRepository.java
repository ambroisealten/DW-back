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

	public <T, ID> List<?> findByTable(final Class<T> type) {
		return entityManager.createQuery("SELECT d FROM "+type.getName()+" d").getResultList();
	}

}
