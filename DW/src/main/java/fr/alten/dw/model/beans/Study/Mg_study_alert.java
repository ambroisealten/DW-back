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
@Table(name="dwh_mg_study_alert")
public class Mg_study_alert implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8064950366647588287L;

	@Id
	@Column(name="id")
	private Long id;
	private int instance_key;
	private double od_lvl_2;
	private double od_lvl_1;
	private double tne_lvl_2;
	private double tne_lvl_1;
	private int facility_key;
	private String study_description;
	private Timestamp dt_last_update_dwh;

			
	public Mg_study_alert() {
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


	public double getOd_lvl_2() {
		return od_lvl_2;
	}


	public void setOd_lvl_2(double od_lvl_2) {
		this.od_lvl_2 = od_lvl_2;
	}


	public double getOd_lvl_1() {
		return od_lvl_1;
	}


	public void setOd_lvl_1(double od_lvl_1) {
		this.od_lvl_1 = od_lvl_1;
	}


	public double getTne_lvl_2() {
		return tne_lvl_2;
	}


	public void setTne_lvl_2(double tne_lvl_2) {
		this.tne_lvl_2 = tne_lvl_2;
	}


	public double getTne_lvl_1() {
		return tne_lvl_1;
	}


	public void setTne_lvl_1(double tne_lvl_1) {
		this.tne_lvl_1 = tne_lvl_1;
	}


	public int getFacility_key() {
		return facility_key;
	}


	public void setFacility_key(int facility_key) {
		this.facility_key = facility_key;
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
