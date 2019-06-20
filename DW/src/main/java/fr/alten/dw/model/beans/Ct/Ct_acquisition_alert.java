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
@Table(name="dwh_ct_acquisition_alert")
public class Ct_acquisition_alert implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -6349052036829548562L;

	@Id
	@Column(name="id")
	private Long id;
	private Integer instance_key;
	private Double dlp_lvl_1;
	private Double dlp_lvl_2;
	private Double ctdi_vol_lvl_2;
	private Double ctdi_vol_lvl_1;
	private Long protocol_key;
	private Integer facility_key;
	private String target_region;
	private String acquisition_type;
	private String type;
	private String study_description;
	private Timestamp dt_last_update_dwh;


	public Ct_acquisition_alert() {
		super();
	}


	public String getAcquisition_type() {
		return acquisition_type;
	}


	public Double getCtdi_vol_lvl_1() {
		return ctdi_vol_lvl_1;
	}


	public Double getCtdi_vol_lvl_2() {
		return ctdi_vol_lvl_2;
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


	public Long getProtocol_key() {
		return protocol_key;
	}


	public String getStudy_description() {
		return study_description;
	}


	public String getTarget_region() {
		return target_region;
	}


	public String getType() {
		return type;
	}


	public void setAcquisition_type(final String acquisition_type) {
		this.acquisition_type = acquisition_type;
	}


	public void setCtdi_vol_lvl_1(final Double ctdi_vol_lvl_1) {
		this.ctdi_vol_lvl_1 = ctdi_vol_lvl_1;
	}


	public void setCtdi_vol_lvl_2(final Double ctdi_vol_lvl_2) {
		this.ctdi_vol_lvl_2 = ctdi_vol_lvl_2;
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


	public void setProtocol_key(final Long protocol_key) {
		this.protocol_key = protocol_key;
	}


	public void setStudy_description(final String study_description) {
		this.study_description = study_description;
	}


	public void setTarget_region(final String target_region) {
		this.target_region = target_region;
	}


	public void setType(final String type) {
		this.type = type;
	}


}
