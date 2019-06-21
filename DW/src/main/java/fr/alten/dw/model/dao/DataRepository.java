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
/*
 * public interface DataRepository extends JpaRepository<Lexicon ,Long> {
 * 
 * @Query(value = "SELECT * FROM #{?2} WHERE id = ?1", nativeQuery = true)
 * List<Lexicon> findDataWithId(long id,String table);
 */
@Service
public class DataRepository {
	@Autowired
	private EntityManager entityManager;

	public <T, ID> List findByTable(Class<T> type) {
		System.out.println(type);
		return entityManager.createQuery("SELECT d FROM "+type.getName()+" d").getResultList();
	}

}
