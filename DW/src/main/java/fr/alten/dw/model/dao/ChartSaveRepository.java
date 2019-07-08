package fr.alten.dw.model.dao;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Lucas Royackkers
 *
 */
@Service
public class ChartSaveRepository {

	@Autowired
	private EntityManager entityManager;

	@Transactional
	public int createChartSave(final String chartDisplayedName, final String chartConfiguration) {
		BigInteger tableLength = (BigInteger) entityManager.createNativeQuery("SELECT COUNT(*) FROM dwh_chart_config").getSingleResult();
		
		Query query = entityManager.createNativeQuery(
				"INSERT INTO dwh_chart_config (id,displayed_name,chart_saved,date_of_creation) VALUES (?,?,?,?)");
		
		query.setParameter(1, 0).setParameter(2, chartDisplayedName).setParameter(3, chartConfiguration).setParameter(4,
				"2018-12-12");
		if(query.executeUpdate() > 0) {
			return tableLength.intValue()+1;
		}
		else {
			return 0;
		}
	}

	public <T, ID> List<?> findByIdAndDisplayedName(final Class<?> type, final int chartId,
			final String chartDisplayedName) {
		return entityManager.createQuery("SELECT d FROM " + type.getSimpleName() + " d WHERE id = " + chartId
				+ "AND displayed_name = '" + chartDisplayedName + "'").getResultList();
	}
}
