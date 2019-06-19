/**
 * 
 */
package fr.alten.dw.model.beans.Drl;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 */

import java.io.Serializable;

public class Drl_mapping_study_desc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1175192497996365047L;

	
	
	private int drl_definition_key;
	private int instance_key;
	private Long study_description_key;
	private String study_description_name;
	private String study_description_modality;
	private Timestamp dt_last_update_dwh;
	
	
	public Drl_mapping_study_desc() {
		super();
	}


	public int getDrl_definition_key() {
		return drl_definition_key;
	}


	public void setDrl_definition_key(int drl_definition_key) {
		this.drl_definition_key = drl_definition_key;
	}


	public int getInstance_key() {
		return instance_key;
	}


	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
	}


	public Long getStudy_description_key() {
		return study_description_key;
	}


	public void setStudy_description_key(Long study_description_key) {
		this.study_description_key = study_description_key;
	}


	public String getStudy_description_name() {
		return study_description_name;
	}


	public void setStudy_description_name(String study_description_name) {
		this.study_description_name = study_description_name;
	}


	public String getStudy_description_modality() {
		return study_description_modality;
	}


	public void setStudy_description_modality(String study_description_modality) {
		this.study_description_modality = study_description_modality;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
	
	
}
