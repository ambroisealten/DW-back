/**
 * 
 */
package fr.alten.dw.model.beans.Drl;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 */

public class Drl_definition_series_type implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3727494014363636093L;

	
	
	private int instance_key;
	private int id;
	private String exam_name;
	private String type;
	private int facility_key;
	private String modality;
	private int age_min;
	private int age_max;
	private double weight_min;
	private double weight_max;
	private double height_min;
	private double height_max;
	private double body_part_thickness_min;
	private double body_part_thickness_max;
	private double ct_series_ctdi;
	private double ct_series_dlp;
	private double ct_study_dlp;
	private double xa_dap;
	private int xa_fluoro_time;
	private double xa_air_kerma;
	private double mg_series_od;
	private double mg_study_od;
	private double rf_series_dap;
	private double rf_series_ed;
	private double rf_study_dap;
	private double rf_study_ed;
	private Timestamp dt_last_update_dwh;
	private double alert_factor;
	
	public Drl_definition_series_type() {
		super();
	}

	public int getInstance_key() {
		return instance_key;
	}

	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExam_name() {
		return exam_name;
	}

	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFacility_key() {
		return facility_key;
	}

	public void setFacility_key(int facility_key) {
		this.facility_key = facility_key;
	}

	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

	public int getAge_min() {
		return age_min;
	}

	public void setAge_min(int age_min) {
		this.age_min = age_min;
	}

	public int getAge_max() {
		return age_max;
	}

	public void setAge_max(int age_max) {
		this.age_max = age_max;
	}

	public double getWeight_min() {
		return weight_min;
	}

	public void setWeight_min(double weight_min) {
		this.weight_min = weight_min;
	}

	public double getWeight_max() {
		return weight_max;
	}

	public void setWeight_max(double weight_max) {
		this.weight_max = weight_max;
	}

	public double getHeight_min() {
		return height_min;
	}

	public void setHeight_min(double height_min) {
		this.height_min = height_min;
	}

	public double getHeight_max() {
		return height_max;
	}

	public void setHeight_max(double height_max) {
		this.height_max = height_max;
	}

	public double getBody_part_thickness_min() {
		return body_part_thickness_min;
	}

	public void setBody_part_thickness_min(double body_part_thickness_min) {
		this.body_part_thickness_min = body_part_thickness_min;
	}

	public double getBody_part_thickness_max() {
		return body_part_thickness_max;
	}

	public void setBody_part_thickness_max(double body_part_thickness_max) {
		this.body_part_thickness_max = body_part_thickness_max;
	}

	public double getCt_series_ctdi() {
		return ct_series_ctdi;
	}

	public void setCt_series_ctdi(double ct_series_ctdi) {
		this.ct_series_ctdi = ct_series_ctdi;
	}

	public double getCt_series_dlp() {
		return ct_series_dlp;
	}

	public void setCt_series_dlp(double ct_series_dlp) {
		this.ct_series_dlp = ct_series_dlp;
	}

	public double getCt_study_dlp() {
		return ct_study_dlp;
	}

	public void setCt_study_dlp(double ct_study_dlp) {
		this.ct_study_dlp = ct_study_dlp;
	}

	public double getXa_dap() {
		return xa_dap;
	}

	public void setXa_dap(double xa_dap) {
		this.xa_dap = xa_dap;
	}

	public int getXa_fluoro_time() {
		return xa_fluoro_time;
	}

	public void setXa_fluoro_time(int xa_fluoro_time) {
		this.xa_fluoro_time = xa_fluoro_time;
	}

	public double getXa_air_kerma() {
		return xa_air_kerma;
	}

	public void setXa_air_kerma(double xa_air_kerma) {
		this.xa_air_kerma = xa_air_kerma;
	}

	public double getMg_series_od() {
		return mg_series_od;
	}

	public void setMg_series_od(double mg_series_od) {
		this.mg_series_od = mg_series_od;
	}

	public double getMg_study_od() {
		return mg_study_od;
	}

	public void setMg_study_od(double mg_study_od) {
		this.mg_study_od = mg_study_od;
	}

	public double getRf_series_dap() {
		return rf_series_dap;
	}

	public void setRf_series_dap(double rf_series_dap) {
		this.rf_series_dap = rf_series_dap;
	}

	public double getRf_series_ed() {
		return rf_series_ed;
	}

	public void setRf_series_ed(double rf_series_ed) {
		this.rf_series_ed = rf_series_ed;
	}

	public double getRf_study_dap() {
		return rf_study_dap;
	}

	public void setRf_study_dap(double rf_study_dap) {
		this.rf_study_dap = rf_study_dap;
	}

	public double getRf_study_ed() {
		return rf_study_ed;
	}

	public void setRf_study_ed(double rf_study_ed) {
		this.rf_study_ed = rf_study_ed;
	}

	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}

	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public double getAlert_factor() {
		return alert_factor;
	}

	public void setAlert_factor(double alert_factor) {
		this.alert_factor = alert_factor;
	}

}
