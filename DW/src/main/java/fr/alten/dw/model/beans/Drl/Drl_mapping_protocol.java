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

public class Drl_mapping_protocol implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1574690587411374436L;

	
	
	private int drl_definition_key;
	private int instance_key;
	private Long protocol_key;
	private String protocol_name;
	private String protocol_modality;
	private Timestamp dt_last_update_dwh;

            
	public Drl_mapping_protocol() {
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


	public Long getProtocol_key() {
		return protocol_key;
	}


	public void setProtocol_key(Long protocol_key) {
		this.protocol_key = protocol_key;
	}


	public String getProtocol_name() {
		return protocol_name;
	}


	public void setProtocol_name(String protocol_name) {
		this.protocol_name = protocol_name;
	}


	public String getProtocol_modality() {
		return protocol_modality;
	}


	public void setProtocol_modality(String protocol_modality) {
		this.protocol_modality = protocol_modality;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

}
