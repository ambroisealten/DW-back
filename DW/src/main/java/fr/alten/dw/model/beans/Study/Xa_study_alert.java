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
 */
@Entity
@Table(name = "dwh_xa_study_alert")
public class Xa_study_alert implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 5324705644896246147L;

	@Id
	@Column(name = "id")
	private Long id;
	private int instance_key;
	private int facility_key;
	private double ttf_lvl_2;
	private double ttf_lvl_1;
	private double dap_lvl_2;
	private double dap_lvl_1;
	private double air_kerma_lvl_1;
	private double air_kerma_lvl_2;
	private String study_description;
	private Timestamp dt_last_update_dwh;

	public Xa_study_alert() {
		super();
	}

	public double getAir_kerma_lvl_1() {
		return this.air_kerma_lvl_1;
	}

	public double getAir_kerma_lvl_2() {
		return this.air_kerma_lvl_2;
	}

	public double getDap_lvl_1() {
		return this.dap_lvl_1;
	}

	public double getDap_lvl_2() {
		return this.dap_lvl_2;
	}

	public Timestamp getDt_last_update_dwh() {
		return this.dt_last_update_dwh;
	}

	public int getFacility_key() {
		return this.facility_key;
	}

	public Long getId() {
		return this.id;
	}

	public int getInstance_key() {
		return this.instance_key;
	}

	public String getStudy_description() {
		return this.study_description;
	}

	public double getTtf_lvl_1() {
		return this.ttf_lvl_1;
	}

	public double getTtf_lvl_2() {
		return this.ttf_lvl_2;
	}

	public void setAir_kerma_lvl_1(final double air_kerma_lvl_1) {
		this.air_kerma_lvl_1 = air_kerma_lvl_1;
	}

	public void setAir_kerma_lvl_2(final double air_kerma_lvl_2) {
		this.air_kerma_lvl_2 = air_kerma_lvl_2;
	}

	public void setDap_lvl_1(final double dap_lvl_1) {
		this.dap_lvl_1 = dap_lvl_1;
	}

	public void setDap_lvl_2(final double dap_lvl_2) {
		this.dap_lvl_2 = dap_lvl_2;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setFacility_key(final int facility_key) {
		this.facility_key = facility_key;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setInstance_key(final int instance_key) {
		this.instance_key = instance_key;
	}

	public void setStudy_description(final String study_description) {
		this.study_description = study_description;
	}

	public void setTtf_lvl_1(final double ttf_lvl_1) {
		this.ttf_lvl_1 = ttf_lvl_1;
	}

	public void setTtf_lvl_2(final double ttf_lvl_2) {
		this.ttf_lvl_2 = ttf_lvl_2;
	}

}
