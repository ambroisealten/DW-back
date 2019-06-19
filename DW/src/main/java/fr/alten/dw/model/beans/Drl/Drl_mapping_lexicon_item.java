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

public class Drl_mapping_lexicon_item implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5306524808841010392L;

	
	
	private int drl_definition_key;
	private int instance_key;
	private Long lexicon_key;
	private String lexicon_field1;
	private String lexicon_field2;
	private Long lexicon_element_key;
	private String lexicon_rpid;
	private String lexicon_short_name;
	private String lexicon_long_name;
	private String lexicon_long_description;
	private int lexicon_item_key;
	private String lexicon_age_info;
	private String lexicon_bmi_info;
	private Timestamp dt_last_update_dwh;

            
	public Drl_mapping_lexicon_item() {
		super();
	}

}
