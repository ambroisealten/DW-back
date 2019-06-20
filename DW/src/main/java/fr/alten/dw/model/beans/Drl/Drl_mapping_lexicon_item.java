/**
 *
 */
package fr.alten.dw.model.beans.Drl;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Thomas Decamp
 */
@Entity
@Table(name="dwh_drl_mapping_lexicon_item")
public class Drl_mapping_lexicon_item implements Serializable {


	/**
	 *
	 */
	private static final long serialVersionUID = 5306524808841010392L;


	@Id
	@Column(name="id")
	private Integer drl_definition_key;
	private Integer instance_key;
	private Long lexicon_key;
	private String lexicon_field1;
	private String lexicon_field2;
	private Long lexicon_element_key;
	private String lexicon_rpid;
	private String lexicon_short_name;
	private String lexicon_long_name;
	private String lexicon_long_description;
	private Integer lexicon_item_key;
	private String lexicon_age_info;
	private String lexicon_bmi_info;
	private Timestamp dt_last_update_dwh;


	public Drl_mapping_lexicon_item() {
		super();
	}


	public Integer getDrl_definition_key() {
		return drl_definition_key;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public Integer getInstance_key() {
		return instance_key;
	}


	public String getLexicon_age_info() {
		return lexicon_age_info;
	}


	public String getLexicon_bmi_info() {
		return lexicon_bmi_info;
	}


	public Long getLexicon_element_key() {
		return lexicon_element_key;
	}


	public String getLexicon_field1() {
		return lexicon_field1;
	}


	public String getLexicon_field2() {
		return lexicon_field2;
	}


	public Integer getLexicon_item_key() {
		return lexicon_item_key;
	}


	public Long getLexicon_key() {
		return lexicon_key;
	}


	public String getLexicon_long_description() {
		return lexicon_long_description;
	}


	public String getLexicon_long_name() {
		return lexicon_long_name;
	}


	public String getLexicon_rpid() {
		return lexicon_rpid;
	}


	public String getLexicon_short_name() {
		return lexicon_short_name;
	}


	public void setDrl_definition_key(final Integer drl_definition_key) {
		this.drl_definition_key = drl_definition_key;
	}


	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}


	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}


	public void setLexicon_age_info(final String lexicon_age_info) {
		this.lexicon_age_info = lexicon_age_info;
	}


	public void setLexicon_bmi_info(final String lexicon_bmi_info) {
		this.lexicon_bmi_info = lexicon_bmi_info;
	}


	public void setLexicon_element_key(final Long lexicon_element_key) {
		this.lexicon_element_key = lexicon_element_key;
	}


	public void setLexicon_field1(final String lexicon_field1) {
		this.lexicon_field1 = lexicon_field1;
	}


	public void setLexicon_field2(final String lexicon_field2) {
		this.lexicon_field2 = lexicon_field2;
	}


	public void setLexicon_item_key(final Integer lexicon_item_key) {
		this.lexicon_item_key = lexicon_item_key;
	}


	public void setLexicon_key(final Long lexicon_key) {
		this.lexicon_key = lexicon_key;
	}


	public void setLexicon_long_description(final String lexicon_long_description) {
		this.lexicon_long_description = lexicon_long_description;
	}


	public void setLexicon_long_name(final String lexicon_long_name) {
		this.lexicon_long_name = lexicon_long_name;
	}


	public void setLexicon_rpid(final String lexicon_rpid) {
		this.lexicon_rpid = lexicon_rpid;
	}


	public void setLexicon_short_name(final String lexicon_short_name) {
		this.lexicon_short_name = lexicon_short_name;
	}

}
