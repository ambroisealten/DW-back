package fr.alten.dw.model.beans;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Lucas Royackkers
 *
 */
@Entity
@Table(name="dwh_chart_config")
public class ChartConfig implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2288365769678297467L;
	@Id
	@Column(name="id")
	private Long id;
	private String displayed_name;
	private String chart_saved;
	private Date date_of_creation;

	public ChartConfig() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDisplayed_name() {
		return displayed_name;
	}

	public void setDisplayed_name(String displayed_name) {
		this.displayed_name = displayed_name;
	}

	public String getChart_saved() {
		return chart_saved;
	}

	public void setChart_saved(String chart_saved) {
		this.chart_saved = chart_saved;
	}

	public Date getDate_of_creation() {
		return date_of_creation;
	}

	public void setDate_of_creation(Date date_of_creation) {
		this.date_of_creation = date_of_creation;
	}

}
