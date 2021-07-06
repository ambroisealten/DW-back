/**
 *
 */
package fr.alten.dw.model.beans;

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
@Table(name = "dwh_alert")
public class Alert implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -6547202156767598056L;

	private int instance_key;
	@Id
	@Column(name = "id")
	private Long id;
	private String discriminator;
	private int patient_key;
	private Long study_key;
	private Long series_key;
	private String alert_type;
	private String alert_cause;
	private double alert_threshold_level1;
	private double alert_threshold_level2;
	private Boolean alert_reviewed;
	private Timestamp alert_raised_date;
	private double alert_raised_value;
	private Timestamp dt_last_update_dwh;
	private String modality;
	private String laterality;
	private String exam_name;
	private String alert_raised_type;
	private int alert_cumulative;

	public Alert() {
		super();
	}

	public String getAlert_cause() {
		return this.alert_cause;
	}

	public int getAlert_cumulative() {
		return this.alert_cumulative;
	}

	public Timestamp getAlert_raised_date() {
		return this.alert_raised_date;
	}

	public String getAlert_raised_type() {
		return this.alert_raised_type;
	}

	public double getAlert_raised_value() {
		return this.alert_raised_value;
	}

	public Boolean getAlert_reviewed() {
		return this.alert_reviewed;
	}

	public double getAlert_threshold_level1() {
		return this.alert_threshold_level1;
	}

	public double getAlert_threshold_level2() {
		return this.alert_threshold_level2;
	}

	public String getAlert_type() {
		return this.alert_type;
	}

	public String getDiscriminator() {
		return this.discriminator;
	}

	public Timestamp getDt_last_update_dwh() {
		return this.dt_last_update_dwh;
	}

	public String getExam_name() {
		return this.exam_name;
	}

	public Long getId() {
		return this.id;
	}

	public int getInstance_key() {
		return this.instance_key;
	}

	public String getLaterality() {
		return this.laterality;
	}

	public String getModality() {
		return this.modality;
	}

	public int getPatient_key() {
		return this.patient_key;
	}

	public Long getSeries_key() {
		return this.series_key;
	}

	public Long getStudy_key() {
		return this.study_key;
	}

	public void setAlert_cause(final String alert_cause) {
		this.alert_cause = alert_cause;
	}

	public void setAlert_cumulative(final int alert_cumulative) {
		this.alert_cumulative = alert_cumulative;
	}

	public void setAlert_raised_date(final Timestamp alert_raised_date) {
		this.alert_raised_date = alert_raised_date;
	}

	public void setAlert_raised_type(final String alert_raised_type) {
		this.alert_raised_type = alert_raised_type;
	}

	public void setAlert_raised_value(final double alert_raised_value) {
		this.alert_raised_value = alert_raised_value;
	}

	public void setAlert_reviewed(final Boolean alert_reviewed) {
		this.alert_reviewed = alert_reviewed;
	}

	public void setAlert_threshold_level1(final double alert_threshold_level1) {
		this.alert_threshold_level1 = alert_threshold_level1;
	}

	public void setAlert_threshold_level2(final double alert_threshold_level2) {
		this.alert_threshold_level2 = alert_threshold_level2;
	}

	public void setAlert_type(final String alert_type) {
		this.alert_type = alert_type;
	}

	public void setDiscriminator(final String discriminator) {
		this.discriminator = discriminator;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setExam_name(final String exam_name) {
		this.exam_name = exam_name;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setInstance_key(final int instance_key) {
		this.instance_key = instance_key;
	}

	public void setLaterality(final String laterality) {
		this.laterality = laterality;
	}

	public void setModality(final String modality) {
		this.modality = modality;
	}

	public void setPatient_key(final int patient_key) {
		this.patient_key = patient_key;
	}

	public void setSeries_key(final Long series_key) {
		this.series_key = series_key;
	}

	public void setStudy_key(final Long study_key) {
		this.study_key = study_key;
	}

}
