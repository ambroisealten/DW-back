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
}
