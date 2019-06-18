/**
 * 
 */
package fr.alten.dw.model.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 */
public class Alert implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6547202156767598056L;
	
	
	private int instance_key;
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

	public int getInstance_key() {
		return instance_key;
	}

	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public int getPatient_key() {
		return patient_key;
	}

	public void setPatient_key(int patient_key) {
		this.patient_key = patient_key;
	}

	public Long getStudy_key() {
		return study_key;
	}

	public void setStudy_key(Long study_key) {
		this.study_key = study_key;
	}

	public Long getSeries_key() {
		return series_key;
	}

	public void setSeries_key(Long series_key) {
		this.series_key = series_key;
	}

	public String getAlert_type() {
		return alert_type;
	}

	public void setAlert_type(String alert_type) {
		this.alert_type = alert_type;
	}

	public String getAlert_cause() {
		return alert_cause;
	}

	public void setAlert_cause(String alert_cause) {
		this.alert_cause = alert_cause;
	}

	public double getAlert_threshold_level1() {
		return alert_threshold_level1;
	}

	public void setAlert_threshold_level1(double alert_threshold_level1) {
		this.alert_threshold_level1 = alert_threshold_level1;
	}

	public double getAlert_threshold_level2() {
		return alert_threshold_level2;
	}

	public void setAlert_threshold_level2(double alert_threshold_level2) {
		this.alert_threshold_level2 = alert_threshold_level2;
	}

	public Boolean getAlert_reviewed() {
		return alert_reviewed;
	}

	public void setAlert_reviewed(Boolean alert_reviewed) {
		this.alert_reviewed = alert_reviewed;
	}

	public Timestamp getAlert_raised_date() {
		return alert_raised_date;
	}

	public void setAlert_raised_date(Timestamp alert_raised_date) {
		this.alert_raised_date = alert_raised_date;
	}

	public double getAlert_raised_value() {
		return alert_raised_value;
	}

	public void setAlert_raised_value(double alert_raised_value) {
		this.alert_raised_value = alert_raised_value;
	}

	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}

	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

	public String getLaterality() {
		return laterality;
	}

	public void setLaterality(String laterality) {
		this.laterality = laterality;
	}

	public String getExam_name() {
		return exam_name;
	}

	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}

	public String getAlert_raised_type() {
		return alert_raised_type;
	}

	public void setAlert_raised_type(String alert_raised_type) {
		this.alert_raised_type = alert_raised_type;
	}

	public int getAlert_cumulative() {
		return alert_cumulative;
	}

	public void setAlert_cumulative(int alert_cumulative) {
		this.alert_cumulative = alert_cumulative;
	}
			
}
