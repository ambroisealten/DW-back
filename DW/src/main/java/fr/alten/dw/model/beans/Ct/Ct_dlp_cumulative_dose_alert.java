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
@Table(name="dwh_ct_dlp_cumulative_dose_alert")
public class Ct_dlp_cumulative_dose_alert implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 3284805650694846526L;

	@Id
	@Column(name="id")
	private Long id;
	private Integer instance_key;
	private Integer facility_key;
	private Double dlp_lvl_1;
	private Double dlp_lvl_2;
	private String target_region;
	private Timestamp dt_last_update_dwh;


	public Ct_dlp_cumulative_dose_alert() {
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


	public String getTarget_region() {
		return target_region;
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


	public void setTarget_region(final String target_region) {
		this.target_region = target_region;
	}


}
