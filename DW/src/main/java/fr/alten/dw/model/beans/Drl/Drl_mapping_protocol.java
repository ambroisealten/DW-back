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

}
