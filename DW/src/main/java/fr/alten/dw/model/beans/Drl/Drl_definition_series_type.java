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
@Table(name="dwh_drl_definition_series_type")
public class Drl_definition_series_type implements Serializable {


	/**
	 *
	 */
	private static final long serialVersionUID = 3727494014363636093L;



	private Integer instance_key;
	@Id
	@Column(name="id")
	private Integer id;
	private String exam_name;
	private String type;
	private Integer facility_key;
	private String modality;
	private Integer age_min;
	private Integer age_max;
	private Double weight_min;
	private Double weight_max;
	private Double height_min;
	private Double height_max;
	private Double body_part_thickness_min;
	private Double body_part_thickness_max;
	private Double ct_series_ctdi;
	private Double ct_series_dlp;
	private Double ct_study_dlp;
	private Double xa_dap;
	private Integer xa_fluoro_time;
	private Double xa_air_kerma;
	private Double mg_series_od;
	private Double mg_study_od;
	private Double rf_series_dap;
	private Double rf_series_ed;
	private Double rf_study_dap;
	private Double rf_study_ed;
	private Timestamp dt_last_update_dwh;
	private Double alert_factor;

	public Drl_definition_series_type() {
		super();
	}

	public Integer getAge_max() {
		return age_max;
	}

	public Integer getAge_min() {
		return age_min;
	}

	public Double getAlert_factor() {
		return alert_factor;
	}

	public Double getBody_part_thickness_max() {
		return body_part_thickness_max;
	}

	public Double getBody_part_thickness_min() {
		return body_part_thickness_min;
	}

	public Double getCt_series_ctdi() {
		return ct_series_ctdi;
	}

	public Double getCt_series_dlp() {
		return ct_series_dlp;
	}

	public Double getCt_study_dlp() {
		return ct_study_dlp;
	}

	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}

	public String getExam_name() {
		return exam_name;
	}

	public Integer getFacility_key() {
		return facility_key;
	}

	public Double getHeight_max() {
		return height_max;
	}

	public Double getHeight_min() {
		return height_min;
	}

	public Integer getId() {
		return id;
	}

	public Integer getInstance_key() {
		return instance_key;
	}

	public Double getMg_series_od() {
		return mg_series_od;
	}

	public Double getMg_study_od() {
		return mg_study_od;
	}

	public String getModality() {
		return modality;
	}

	public Double getRf_series_dap() {
		return rf_series_dap;
	}

	public Double getRf_series_ed() {
		return rf_series_ed;
	}

	public Double getRf_study_dap() {
		return rf_study_dap;
	}

	public Double getRf_study_ed() {
		return rf_study_ed;
	}

	public String getType() {
		return type;
	}

	public Double getWeight_max() {
		return weight_max;
	}

	public Double getWeight_min() {
		return weight_min;
	}

	public Double getXa_air_kerma() {
		return xa_air_kerma;
	}

	public Double getXa_dap() {
		return xa_dap;
	}

	public Integer getXa_fluoro_time() {
		return xa_fluoro_time;
	}

	public void setAge_max(final Integer age_max) {
		this.age_max = age_max;
	}

	public void setAge_min(final Integer age_min) {
		this.age_min = age_min;
	}

	public void setAlert_factor(final Double alert_factor) {
		this.alert_factor = alert_factor;
	}

	public void setBody_part_thickness_max(final Double body_part_thickness_max) {
		this.body_part_thickness_max = body_part_thickness_max;
	}

	public void setBody_part_thickness_min(final Double body_part_thickness_min) {
		this.body_part_thickness_min = body_part_thickness_min;
	}

	public void setCt_series_ctdi(final Double ct_series_ctdi) {
		this.ct_series_ctdi = ct_series_ctdi;
	}

	public void setCt_series_dlp(final Double ct_series_dlp) {
		this.ct_series_dlp = ct_series_dlp;
	}

	public void setCt_study_dlp(final Double ct_study_dlp) {
		this.ct_study_dlp = ct_study_dlp;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setExam_name(final String exam_name) {
		this.exam_name = exam_name;
	}

	public void setFacility_key(final Integer facility_key) {
		this.facility_key = facility_key;
	}

	public void setHeight_max(final Double height_max) {
		this.height_max = height_max;
	}

	public void setHeight_min(final Double height_min) {
		this.height_min = height_min;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setMg_series_od(final Double mg_series_od) {
		this.mg_series_od = mg_series_od;
	}

	public void setMg_study_od(final Double mg_study_od) {
		this.mg_study_od = mg_study_od;
	}

	public void setModality(final String modality) {
		this.modality = modality;
	}

	public void setRf_series_dap(final Double rf_series_dap) {
		this.rf_series_dap = rf_series_dap;
	}

	public void setRf_series_ed(final Double rf_series_ed) {
		this.rf_series_ed = rf_series_ed;
	}

	public void setRf_study_dap(final Double rf_study_dap) {
		this.rf_study_dap = rf_study_dap;
	}

	public void setRf_study_ed(final Double rf_study_ed) {
		this.rf_study_ed = rf_study_ed;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public void setWeight_max(final Double weight_max) {
		this.weight_max = weight_max;
	}

	public void setWeight_min(final Double weight_min) {
		this.weight_min = weight_min;
	}

	public void setXa_air_kerma(final Double xa_air_kerma) {
		this.xa_air_kerma = xa_air_kerma;
	}

	public void setXa_dap(final Double xa_dap) {
		this.xa_dap = xa_dap;
	}

	public void setXa_fluoro_time(final Integer xa_fluoro_time) {
		this.xa_fluoro_time = xa_fluoro_time;
	}

}
