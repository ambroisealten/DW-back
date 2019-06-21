/**
 * 
 */
package fr.alten.dw.model.beans.Study;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Thomas Decamp
 *
 */
@Entity
@Table(name="dwh_rf_study_alert")
public class Rf_study_alert implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6955201361209038931L;
	
	@Id
	@Column(name="id")
	private Long id;
	private Integer instance_key;
	private Integer facility_key;
	private Double ttf_lvl_2;
	private Double ttf_lvl_1;
	private Double dap_lvl_1;
	private Double dap_lvl_2;
	private Double ed_lvl_1;
	private Double ed_lvl_2;
	private String study_description;
	private Timestamp dt_last_update_dwh;

	
	public Rf_study_alert() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getInstance_key() {
		return instance_key;
	}


	public void setInstance_key(Integer instance_key) {
		this.instance_key = instance_key;
	}


	public Integer getFacility_key() {
		return facility_key;
	}


	public void setFacility_key(Integer facility_key) {
		this.facility_key = facility_key;
	}


	public Double getTtf_lvl_2() {
		return ttf_lvl_2;
	}


	public void setTtf_lvl_2(Double ttf_lvl_2) {
		this.ttf_lvl_2 = ttf_lvl_2;
	}


	public Double getTtf_lvl_1() {
		return ttf_lvl_1;
	}


	public void setTtf_lvl_1(Double ttf_lvl_1) {
		this.ttf_lvl_1 = ttf_lvl_1;
	}


	public Double getDap_lvl_1() {
		return dap_lvl_1;
	}


	public void setDap_lvl_1(Double dap_lvl_1) {
		this.dap_lvl_1 = dap_lvl_1;
	}


	public Double getDap_lvl_2() {
		return dap_lvl_2;
	}


	public void setDap_lvl_2(Double dap_lvl_2) {
		this.dap_lvl_2 = dap_lvl_2;
	}


	public Double getEd_lvl_1() {
		return ed_lvl_1;
	}


	public void setEd_lvl_1(Double ed_lvl_1) {
		this.ed_lvl_1 = ed_lvl_1;
	}


	public Double getEd_lvl_2() {
		return ed_lvl_2;
	}


	public void setEd_lvl_2(Double ed_lvl_2) {
		this.ed_lvl_2 = ed_lvl_2;
	}


	public String getStudy_description() {
		return study_description;
	}


	public void setStudy_description(String study_description) {
		this.study_description = study_description;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
	
}
