/**
 *
 */
package fr.alten.dw.model.beans.Ct;

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
@Table(name="dwh_ct_study_alert")
public class Ct_study_alert implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -2578958467636247853L;

	@Id
	@Column(name="id")
	private Long id;
	private Integer instance_key;
	private Double tnie_lvl_2;
	private Double dlp_lvl_1;
	private Double tnie_lvl_1;
	private Double dlp_lvl_2;
	private Integer facility_key;
	private String study_description;
	private Timestamp dt_last_update_dwh;


	public Ct_study_alert() {
		super();
	}


	public Double getDlp_lvl_1() {
		return dlp_lvl_1;
	}


	public Double getDlp_lvl_2() {
		return dlp_lvl_2;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public Integer getFacility_key() {
		return facility_key;
	}


	public Long getId() {
		return id;
	}


	public Integer getInstance_key() {
		return instance_key;
	}


	public String getStudy_description() {
		return study_description;
	}


	public Double getTnie_lvl_1() {
		return tnie_lvl_1;
	}


	public Double getTnie_lvl_2() {
		return tnie_lvl_2;
	}


	public void setDlp_lvl_1(final Double dlp_lvl_1) {
		this.dlp_lvl_1 = dlp_lvl_1;
	}


	public void setDlp_lvl_2(final Double dlp_lvl_2) {
		this.dlp_lvl_2 = dlp_lvl_2;
	}


	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}


	public void setFacility_key(final Integer facility_key) {
		this.facility_key = facility_key;
	}


	public void setId(final Long id) {
		this.id = id;
	}


	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}


	public void setStudy_description(final String study_description) {
		this.study_description = study_description;
	}


	public void setTnie_lvl_1(final Double tnie_lvl_1) {
		this.tnie_lvl_1 = tnie_lvl_1;
	}


	public void setTnie_lvl_2(final Double tnie_lvl_2) {
		this.tnie_lvl_2 = tnie_lvl_2;
	}


}
