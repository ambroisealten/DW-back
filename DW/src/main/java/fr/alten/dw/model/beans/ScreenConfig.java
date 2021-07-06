package fr.alten.dw.model.beans;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Bean to store screen configuration
 * 
 * @author Lucas Royackkers
 *
 */
@Entity
@Table(name = "dwh_screen_config")
public class ScreenConfig implements Serializable {

	private static final long serialVersionUID = 2288365769678297467L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	private String displayed_name;
	@Column(columnDefinition = "LONGTEXT")
	private String screen_saved;
	private Date date_of_creation;

	public ScreenConfig() {
		super();
	}

	public Date getDate_of_creation() {
		return this.date_of_creation;
	}

	public String getDisplayed_name() {
		return this.displayed_name;
	}

	public Long getId() {
		return this.id;
	}

	public String getScreen_saved() {
		return this.screen_saved;
	}

	public void setDate_of_creation(final Date date_of_creation) {
		this.date_of_creation = date_of_creation;
	}

	public void setDisplayed_name(final String displayed_name) {
		this.displayed_name = displayed_name;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setScreen_saved(final String screen_saved) {
		this.screen_saved = screen_saved;
	}

}
