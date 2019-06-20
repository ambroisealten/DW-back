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
public class Ct_acquisition_alert implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6349052036829548562L;

	
	private Long id;
	private int instance_key;
	private double dlp_lvl_1;
	private double dlp_lvl_2;
	private double ctdi_vol_lvl_2;
	private double ctdi_vol_lvl_1;
	private Long protocol_key;
	private int facility_key;
	private String target_region;
	private String acquisition_type;
	private String type;
	private String study_description;
    private Timestamp dt_last_update_dwh;
    

	public Ct_acquisition_alert() {
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


	public double getCtdi_vol_lvl_2() {
		return ctdi_vol_lvl_2;
	}


	public void setCtdi_vol_lvl_2(double ctdi_vol_lvl_2) {
		this.ctdi_vol_lvl_2 = ctdi_vol_lvl_2;
	}


	public double getCtdi_vol_lvl_1() {
		return ctdi_vol_lvl_1;
	}


	public void setCtdi_vol_lvl_1(double ctdi_vol_lvl_1) {
		this.ctdi_vol_lvl_1 = ctdi_vol_lvl_1;
	}


	public Long getProtocol_key() {
		return protocol_key;
	}


	public void setProtocol_key(Long protocol_key) {
		this.protocol_key = protocol_key;
	}


	public int getFacility_key() {
		return facility_key;
	}


	public void setFacility_key(int facility_key) {
		this.facility_key = facility_key;
	}


	public String getTarget_region() {
		return target_region;
	}


	public void setTarget_region(String target_region) {
		this.target_region = target_region;
	}


	public String getAcquisition_type() {
		return acquisition_type;
	}


	public void setAcquisition_type(String acquisition_type) {
		this.acquisition_type = acquisition_type;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
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
