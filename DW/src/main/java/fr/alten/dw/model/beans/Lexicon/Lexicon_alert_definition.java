/**
 *
 */
package fr.alten.dw.model.beans.Lexicon;

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
@Table(name = "dwh_lexicon_alert_definition")
public class Lexicon_alert_definition implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -6066241705914613754L;
	@Id
	@Column(name = "id")
	private Long id;
	private Integer instance_key;
	private Integer facility_key;
	private Boolean calculated_from_parent;
	private Long lexicon_key;
	private Long lexicon_element_key;
	private Double weight_low;
	private Double weight_high;
	private Double bmi_low;
	private Double bmi_high;
	private Double size_low;
	private Double size_high;
	private Double dlp_level_1;
	private Double dlp_level_2;
	private Double ctdi_level_1;
	private Double ctdi_level_2;
	private Long nb_records;
	private Integer age_low;
	private Integer age_high;
	private Integer tnie_level_1;
	private Integer tnie_level_2;
	private String dtype;
	private String weighting_criteria;
	private String info_criteria;
	private Timestamp dt_last_update_dwh;

	public Lexicon_alert_definition() {
		super();
	}

	public Integer getAge_high() {
		return this.age_high;
	}

	public Integer getAge_low() {
		return this.age_low;
	}

	public Double getBmi_high() {
		return this.bmi_high;
	}

	public Double getBmi_low() {
		return this.bmi_low;
	}

	public Boolean getCalculated_from_parent() {
		return this.calculated_from_parent;
	}

	public Double getCtdi_level_1() {
		return this.ctdi_level_1;
	}

	public Double getCtdi_level_2() {
		return this.ctdi_level_2;
	}

	public Double getDlp_level_1() {
		return this.dlp_level_1;
	}

	public Double getDlp_level_2() {
		return this.dlp_level_2;
	}

	public Timestamp getDt_last_update_dwh() {
		return this.dt_last_update_dwh;
	}

	public String getDtype() {
		return this.dtype;
	}

	public Integer getFacility_key() {
		return this.facility_key;
	}

	public Long getId() {
		return this.id;
	}

	public String getInfo_criteria() {
		return this.info_criteria;
	}

	public Integer getInstance_key() {
		return this.instance_key;
	}

	public Long getLexicon_element_key() {
		return this.lexicon_element_key;
	}

	public Long getLexicon_key() {
		return this.lexicon_key;
	}

	public Long getNb_records() {
		return this.nb_records;
	}

	public Double getSize_high() {
		return this.size_high;
	}

	public Double getSize_low() {
		return this.size_low;
	}

	public Integer getTnie_level_1() {
		return this.tnie_level_1;
	}

	public Integer getTnie_level_2() {
		return this.tnie_level_2;
	}

	public Double getWeight_high() {
		return this.weight_high;
	}

	public Double getWeight_low() {
		return this.weight_low;
	}

	public String getWeighting_criteria() {
		return this.weighting_criteria;
	}

	public void setAge_high(final Integer age_high) {
		this.age_high = age_high;
	}

	public void setAge_low(final Integer age_low) {
		this.age_low = age_low;
	}

	public void setBmi_high(final Double bmi_high) {
		this.bmi_high = bmi_high;
	}

	public void setBmi_low(final Double bmi_low) {
		this.bmi_low = bmi_low;
	}

	public void setCalculated_from_parent(final Boolean calculated_from_parent) {
		this.calculated_from_parent = calculated_from_parent;
	}

	public void setCtdi_level_1(final Double ctdi_level_1) {
		this.ctdi_level_1 = ctdi_level_1;
	}

	public void setCtdi_level_2(final Double ctdi_level_2) {
		this.ctdi_level_2 = ctdi_level_2;
	}

	public void setDlp_level_1(final Double dlp_level_1) {
		this.dlp_level_1 = dlp_level_1;
	}

	public void setDlp_level_2(final Double dlp_level_2) {
		this.dlp_level_2 = dlp_level_2;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setDtype(final String dtype) {
		this.dtype = dtype;
	}

	public void setFacility_key(final Integer facility_key) {
		this.facility_key = facility_key;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setInfo_criteria(final String info_criteria) {
		this.info_criteria = info_criteria;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setLexicon_element_key(final Long lexicon_element_key) {
		this.lexicon_element_key = lexicon_element_key;
	}

	public void setLexicon_key(final Long lexicon_key) {
		this.lexicon_key = lexicon_key;
	}

	public void setNb_records(final Long nb_records) {
		this.nb_records = nb_records;
	}

	public void setSize_high(final Double size_high) {
		this.size_high = size_high;
	}

	public void setSize_low(final Double size_low) {
		this.size_low = size_low;
	}

	public void setTnie_level_1(final Integer tnie_level_1) {
		this.tnie_level_1 = tnie_level_1;
	}

	public void setTnie_level_2(final Integer tnie_level_2) {
		this.tnie_level_2 = tnie_level_2;
	}

	public void setWeight_high(final Double weight_high) {
		this.weight_high = weight_high;
	}

	public void setWeight_low(final Double weight_low) {
		this.weight_low = weight_low;
	}

	public void setWeighting_criteria(final String weighting_criteria) {
		this.weighting_criteria = weighting_criteria;
	}

}
