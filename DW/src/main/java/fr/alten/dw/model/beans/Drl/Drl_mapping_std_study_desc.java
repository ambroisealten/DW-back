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
public class Drl_mapping_std_study_desc implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7059012386135613271L;

	
	
	private int drl_definition_key;
	private int instance_key;
	private Long standard_study_description_key;
	private String standard_study_description_name;
	private String standard_study_description_modality;
	private Timestamp dt_last_update_dwh;

	
	
	public Drl_mapping_std_study_desc() {
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



	public Long getStandard_study_description_key() {
		return standard_study_description_key;
	}



	public void setStandard_study_description_key(Long standard_study_description_key) {
		this.standard_study_description_key = standard_study_description_key;
	}



	public String getStandard_study_description_name() {
		return standard_study_description_name;
	}



	public void setStandard_study_description_name(String standard_study_description_name) {
		this.standard_study_description_name = standard_study_description_name;
	}



	public String getStandard_study_description_modality() {
		return standard_study_description_modality;
	}



	public void setStandard_study_description_modality(String standard_study_description_modality) {
		this.standard_study_description_modality = standard_study_description_modality;
	}



	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}



	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
	
	
}
