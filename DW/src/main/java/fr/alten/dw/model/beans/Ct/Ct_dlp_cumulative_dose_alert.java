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
public class Ct_dlp_cumulative_dose_alert implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3284805650694846526L;
	
	
	private Long id;
	private int instance_key;
	private int facility_key;
	private double dlp_lvl_1;
	private double dlp_lvl_2;
	private String target_region;
	private Timestamp dt_last_update_dwh;

	
	public Ct_dlp_cumulative_dose_alert() {
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


	public double getDlp_lvl_1() {
		return dlp_lvl_1;
	}


	public void setDlp_lvl_1(double dlp_lvl_1) {
		this.dlp_lvl_1 = dlp_lvl_1;
	}


	public double getDlp_lvl_2() {
		return dlp_lvl_2;
	}


	public void setDlp_lvl_2(double dlp_lvl_2) {
		this.dlp_lvl_2 = dlp_lvl_2;
	}


	public String getTarget_region() {
		return target_region;
	}


	public void setTarget_region(String target_region) {
		this.target_region = target_region;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
	
	
}
