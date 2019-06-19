/**
 * 
 */
package fr.alten.dw.model.beans.Ct;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 */
public class Ct_lexicon_mapping implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6081988667082508179L;

	
	private Long ssd_key;
	private int lexicon_item_key;
	private int instance_key;
	private int facility_key;
	private Long lexicon_key;
	private String field_1_type;
	private Long field_1_value;
	private String field_1_name;
	private String field_2_type;
	private Long field_2_value;
	private String field_2_name;
	private String age_info;
	private String bmi_info;
	private Long lexicon_element_key;
	private String rpid;
	private String radlex_short_name;
	private String radlex_long_name;
	private String radlex_long_description;
	private String radlex_dtype;
	private String radlex_lexicon_type;
	private Timestamp dt_last_update_dwh;
	
	public Ct_lexicon_mapping() {
		super();
	}

	public Long getSsd_key() {
		return ssd_key;
	}

	public void setSsd_key(Long ssd_key) {
		this.ssd_key = ssd_key;
	}

	public int getLexicon_item_key() {
		return lexicon_item_key;
	}

	public void setLexicon_item_key(int lexicon_item_key) {
		this.lexicon_item_key = lexicon_item_key;
	}

	public int getInstance_key() {
		return instance_key;
	}

	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
	}

	public int getFacility_key() {
		return facility_key;
	}

	public void setFacility_key(int facility_key) {
		this.facility_key = facility_key;
	}

	public Long getLexicon_key() {
		return lexicon_key;
	}

	public void setLexicon_key(Long lexicon_key) {
		this.lexicon_key = lexicon_key;
	}

	public String getField_1_type() {
		return field_1_type;
	}

	public void setField_1_type(String field_1_type) {
		this.field_1_type = field_1_type;
	}

	public Long getField_1_value() {
		return field_1_value;
	}

	public void setField_1_value(Long field_1_value) {
		this.field_1_value = field_1_value;
	}

	public String getField_1_name() {
		return field_1_name;
	}

	public void setField_1_name(String field_1_name) {
		this.field_1_name = field_1_name;
	}

	public String getField_2_type() {
		return field_2_type;
	}

	public void setField_2_type(String field_2_type) {
		this.field_2_type = field_2_type;
	}

	public Long getField_2_value() {
		return field_2_value;
	}

	public void setField_2_value(Long field_2_value) {
		this.field_2_value = field_2_value;
	}

	public String getField_2_name() {
		return field_2_name;
	}

	public void setField_2_name(String field_2_name) {
		this.field_2_name = field_2_name;
	}

	public String getAge_info() {
		return age_info;
	}

	public void setAge_info(String age_info) {
		this.age_info = age_info;
	}

	public String getBmi_info() {
		return bmi_info;
	}

	public void setBmi_info(String bmi_info) {
		this.bmi_info = bmi_info;
	}

	public Long getLexicon_element_key() {
		return lexicon_element_key;
	}

	public void setLexicon_element_key(Long lexicon_element_key) {
		this.lexicon_element_key = lexicon_element_key;
	}

	public String getRpid() {
		return rpid;
	}

	public void setRpid(String rpid) {
		this.rpid = rpid;
	}

	public String getRadlex_short_name() {
		return radlex_short_name;
	}

	public void setRadlex_short_name(String radlex_short_name) {
		this.radlex_short_name = radlex_short_name;
	}

	public String getRadlex_long_name() {
		return radlex_long_name;
	}

	public void setRadlex_long_name(String radlex_long_name) {
		this.radlex_long_name = radlex_long_name;
	}

	public String getRadlex_long_description() {
		return radlex_long_description;
	}

	public void setRadlex_long_description(String radlex_long_description) {
		this.radlex_long_description = radlex_long_description;
	}

	public String getRadlex_dtype() {
		return radlex_dtype;
	}

	public void setRadlex_dtype(String radlex_dtype) {
		this.radlex_dtype = radlex_dtype;
	}

	public String getRadlex_lexicon_type() {
		return radlex_lexicon_type;
	}

	public void setRadlex_lexicon_type(String radlex_lexicon_type) {
		this.radlex_lexicon_type = radlex_lexicon_type;
	}

	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}

	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
	
	
}
