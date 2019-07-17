package fr.alten.dw.model.dao;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
public class ScreenConfigRepository {

	@Autowired
	private EntityManager entityManager;

	/**
	 * Fetch the configuration of a screen
	 *
	 * the corresponding query is: SELECT * FROM table where id=screenId AND
	 * displayed_name=screenDisplayName
	 *
	 * @param table               the table name where screen are stored
	 * @param screenId            the id of the screen to fetch
	 * @param screenDisplayedName the name of the screen to fetch
	 * @return the list of all screen corresponding to the Id and displayed name
	 */
	public <T, ID> List<?> findByIdAndDisplayedName(final Class<?> table, final int screenId,
			final String screenDisplayedName) {
		return this.entityManager.createQuery("SELECT d FROM " + table.getSimpleName() + " d WHERE id = " + screenId
				+ "AND displayed_name = '" + screenDisplayedName + "'").getResultList();
	}

	/**
	 * The transactional annotation means that we are doing a transaction within the
	 * database (insert queries aren't naturally supported by JPA) Thus, we must
	 * specify that we are giving (inserting) a new information to the database, to
	 * make it work like a normal SQL query.
	 *
	 * @param screenDisplayedName the screen display name
	 * @param screenConfiguration a JSON Object (as a String) that contains all the
	 *                            screen configurations (type, filters, etc.)
	 * @return the ID of the inserted line in the database if the query is
	 *         successful, 0 otherwise
	 */
	@Transactional
	public int saveScreenConfig(final String screenDisplayedName, final String screenConfiguration) {
		final BigInteger tableLength = (BigInteger) this.entityManager
				.createNativeQuery("SELECT COUNT(*) FROM dwh_screen_config").getSingleResult();

		final Query query = this.entityManager.createNativeQuery(
				"INSERT INTO dwh_screen_config (id,displayed_name,screen_saved,date_of_creation) VALUES (?,?,?,?)");

		query.setParameter(1, 0).setParameter(2, screenDisplayedName).setParameter(3, screenConfiguration)
				.setParameter(4, DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now()).toString());

		return query.executeUpdate() > 0 ? tableLength.intValue() + 1 : 0;
	}
}
