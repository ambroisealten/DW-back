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

public class Drl_mapping_ae implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -71443065893247503L;

	
	
	private int drl_definition_key;
	private int instance_key;
	private Long ae_key;
	private String aet;
	private Timestamp dt_last_update_dwh;

            
	public Drl_mapping_ae() {
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


	public Long getAe_key() {
		return ae_key;
	}


	public void setAe_key(Long ae_key) {
		this.ae_key = ae_key;
	}


	public String getAet() {
		return aet;
	}


	public void setAet(String aet) {
		this.aet = aet;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

}
