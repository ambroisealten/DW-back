/**
 * 
 */
package fr.alten.dw.model.beans.Study;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 *
 */
public class Rf_study_alert implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6955201361209038931L;

	
	
	private Long id;
	private int instance_key;
	private int facility_key;
	private double ttf_lvl_2;
	private double ttf_lvl_1;
	private double dap_lvl_1;
	private double dap_lvl_2;
	private double ed_lvl_1;
	private double ed_lvl_2;
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


	public double getTtf_lvl_2() {
		return ttf_lvl_2;
	}


	public void setTtf_lvl_2(double ttf_lvl_2) {
		this.ttf_lvl_2 = ttf_lvl_2;
	}


	public double getTtf_lvl_1() {
		return ttf_lvl_1;
	}


	public void setTtf_lvl_1(double ttf_lvl_1) {
		this.ttf_lvl_1 = ttf_lvl_1;
	}


	public double getDap_lvl_1() {
		return dap_lvl_1;
	}


	public void setDap_lvl_1(double dap_lvl_1) {
		this.dap_lvl_1 = dap_lvl_1;
	}


	public double getDap_lvl_2() {
		return dap_lvl_2;
	}


	public void setDap_lvl_2(double dap_lvl_2) {
		this.dap_lvl_2 = dap_lvl_2;
	}


	public double getEd_lvl_1() {
		return ed_lvl_1;
	}


	public void setEd_lvl_1(double ed_lvl_1) {
		this.ed_lvl_1 = ed_lvl_1;
	}


	public double getEd_lvl_2() {
		return ed_lvl_2;
	}


	public void setEd_lvl_2(double ed_lvl_2) {
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
