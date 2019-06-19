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

public class Drl_mapping_series_desc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4874794447116088106L;

	
	
	private int drl_definition_key;
	private int instance_key;
	private Long series_desc_key;
	private String series_desc_name;
	private String series_desc_modality;
	private Timestamp dt_last_update_dwh;

			
	public Drl_mapping_series_desc() {
		super();
	}

}
