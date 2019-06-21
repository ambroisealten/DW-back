/**
 * 
 */
package fr.alten.dw.model.beans.Study;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Thomas Decamp
 *
 */
@Entity
@Table(name="dwh_count_study")
public class Count_study implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7308052773756676197L;
	
	@Id
	@Column(name="id")
	private Long id;
	private Integer instance_key;
	private Date study_date;
	private String modality;
	private Integer nb_days;
	private Integer count_study;
	private Timestamp dt_last_update_dwh;
	
	
	public Count_study() {
		super();
	}


	public Integer getInstance_key() {
		return instance_key;
	}


	public void setInstance_key(Integer instance_key) {
		this.instance_key = instance_key;
	}


	public Date getStudy_date() {
		return study_date;
	}


	public void setStudy_date(Date study_date) {
		this.study_date = study_date;
	}


	public String getModality() {
		return modality;
	}


	public void setModality(String modality) {
		this.modality = modality;
	}


	public Integer getNb_days() {
		return nb_days;
	}


	public void setNb_days(Integer nb_days) {
		this.nb_days = nb_days;
	}


	public Integer getCount_study() {
		return count_study;
	}


	public void setCount_study(Integer count_study) {
		this.count_study = count_study;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
	
}
