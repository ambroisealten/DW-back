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

public class Drl_definition implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2107670832394713655L;

	
	
	private int drl_definition_key;
	private int instance_key;
	private Long series_type_key;
	private String series_type;
	private String series_type_modality;
	private Timestamp dt_last_update_dwh;

            
	public Drl_definition() {
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


	public Long getSeries_type_key() {
		return series_type_key;
	}


	public void setSeries_type_key(Long series_type_key) {
		this.series_type_key = series_type_key;
	}


	public String getSeries_type() {
		return series_type;
	}


	public void setSeries_type(String series_type) {
		this.series_type = series_type;
	}


	public String getSeries_type_modality() {
		return series_type_modality;
	}


	public void setSeries_type_modality(String series_type_modality) {
		this.series_type_modality = series_type_modality;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

}
