/**
 * 
 */
package fr.alten.dw.model.beans.Lexicon;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 */
public class Lexicon_alert_definition implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4781852994751244502L;

	
	private Long id;
	private int instance_key;
	private int facility_key;
	private Boolean calculated_from_parent;
	private Long lexicon_key;
	private Long lexicon_element_key;
	private double weight_low;
	private double weight_high;
	private double bmi_low;
	private double bmi_high;
	private double size_low;
	private double size_high;
	private double dlp_level_1;
	private double dlp_level_2;
	private double ctdi_level_1;
	private double ctdi_level_2;
	private Long nb_records;
	private int age_low;
	private int age_high;
	private int tnie_level_1;
	private int tnie_level_2;
	private String dtype;
	private String weighting_criteria;
	private String info_criteria;
	private Timestamp dt_last_update_dwh;
	
	public Lexicon_alert_definition() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Boolean getCalculated_from_parent() {
		return calculated_from_parent;
	}

	public void setCalculated_from_parent(Boolean calculated_from_parent) {
		this.calculated_from_parent = calculated_from_parent;
	}

	public Long getLexicon_key() {
		return lexicon_key;
	}

	public void setLexicon_key(Long lexicon_key) {
		this.lexicon_key = lexicon_key;
	}

	public Long getLexicon_element_key() {
		return lexicon_element_key;
	}

	public void setLexicon_element_key(Long lexicon_element_key) {
		this.lexicon_element_key = lexicon_element_key;
	}

	public double getWeight_low() {
		return weight_low;
	}

	public void setWeight_low(double weight_low) {
		this.weight_low = weight_low;
	}

	public double getWeight_high() {
		return weight_high;
	}

	public void setWeight_high(double weight_high) {
		this.weight_high = weight_high;
	}

	public double getBmi_low() {
		return bmi_low;
	}

	public void setBmi_low(double bmi_low) {
		this.bmi_low = bmi_low;
	}

	public double getBmi_high() {
		return bmi_high;
	}

	public void setBmi_high(double bmi_high) {
		this.bmi_high = bmi_high;
	}

	public double getSize_low() {
		return size_low;
	}

	public void setSize_low(double size_low) {
		this.size_low = size_low;
	}

	public double getSize_high() {
		return size_high;
	}

	public void setSize_high(double size_high) {
		this.size_high = size_high;
	}

	public double getDlp_level_1() {
		return dlp_level_1;
	}

	public void setDlp_level_1(double dlp_level_1) {
		this.dlp_level_1 = dlp_level_1;
	}

	public double getDlp_level_2() {
		return dlp_level_2;
	}

	public void setDlp_level_2(double dlp_level_2) {
		this.dlp_level_2 = dlp_level_2;
	}

	public double getCtdi_level_1() {
		return ctdi_level_1;
	}

	public void setCtdi_level_1(double ctdi_level_1) {
		this.ctdi_level_1 = ctdi_level_1;
	}

	public double getCtdi_level_2() {
		return ctdi_level_2;
	}

	public void setCtdi_level_2(double ctdi_level_2) {
		this.ctdi_level_2 = ctdi_level_2;
	}

	public Long getNb_records() {
		return nb_records;
	}

	public void setNb_records(Long nb_records) {
		this.nb_records = nb_records;
	}

	public int getAge_low() {
		return age_low;
	}

	public void setAge_low(int age_low) {
		this.age_low = age_low;
	}

	public int getAge_high() {
		return age_high;
	}

	public void setAge_high(int age_high) {
		this.age_high = age_high;
	}

	public int getTnie_level_1() {
		return tnie_level_1;
	}

	public void setTnie_level_1(int tnie_level_1) {
		this.tnie_level_1 = tnie_level_1;
	}

	public int getTnie_level_2() {
		return tnie_level_2;
	}

	public void setTnie_level_2(int tnie_level_2) {
		this.tnie_level_2 = tnie_level_2;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public String getWeighting_criteria() {
		return weighting_criteria;
	}

	public void setWeighting_criteria(String weighting_criteria) {
		this.weighting_criteria = weighting_criteria;
	}

	public String getInfo_criteria() {
		return info_criteria;
	}

	public void setInfo_criteria(String info_criteria) {
		this.info_criteria = info_criteria;
	}

	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}

	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
	
}
