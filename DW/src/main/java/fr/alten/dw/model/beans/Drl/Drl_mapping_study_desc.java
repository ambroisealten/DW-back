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
}
