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

}
