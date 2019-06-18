/**
 * 
 */
package fr.alten.dw.model.beans.Study;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 *
 */
public class Count_study implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7308052773756676197L;


	private int instance_key;
	private Date study_date;
	private String modality;
	private int nb_days;
	private int count_study;
	private Timestamp dt_last_update_dwh;
	
	
	public Count_study() {
		super();
	}


	public int getInstance_key() {
		return instance_key;
	}


	public void setInstance_key(int instance_key) {
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


	public int getNb_days() {
		return nb_days;
	}


	public void setNb_days(int nb_days) {
		this.nb_days = nb_days;
	}


	public int getCount_study() {
		return count_study;
	}


	public void setCount_study(int count_study) {
		this.count_study = count_study;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
	
}
