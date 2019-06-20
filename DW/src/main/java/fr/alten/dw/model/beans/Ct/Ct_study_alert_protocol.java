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
public class Ct_study_alert_protocol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8652939664891133868L;


	private Long id;
	private int instance_key;
	private int facility_key;
	private double tnie_lvl_2;
	private double dlp_lvl_1;
	private double tnie_lvl_1;
	private double dlp_lvl_2;
	private String protocol;
	private Timestamp dt_last_update_dwh;
	
	public Ct_study_alert_protocol() {
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

	public double getTnie_lvl_2() {
		return tnie_lvl_2;
	}

	public void setTnie_lvl_2(double tnie_lvl_2) {
		this.tnie_lvl_2 = tnie_lvl_2;
	}

	public double getDlp_lvl_1() {
		return dlp_lvl_1;
	}

	public void setDlp_lvl_1(double dlp_lvl_1) {
		this.dlp_lvl_1 = dlp_lvl_1;
	}

	public double getTnie_lvl_1() {
		return tnie_lvl_1;
	}

	public void setTnie_lvl_1(double tnie_lvl_1) {
		this.tnie_lvl_1 = tnie_lvl_1;
	}

	public double getDlp_lvl_2() {
		return dlp_lvl_2;
	}

	public void setDlp_lvl_2(double dlp_lvl_2) {
		this.dlp_lvl_2 = dlp_lvl_2;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}

	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
	
	
}
