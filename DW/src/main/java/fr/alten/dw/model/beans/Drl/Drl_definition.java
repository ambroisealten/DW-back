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

}
