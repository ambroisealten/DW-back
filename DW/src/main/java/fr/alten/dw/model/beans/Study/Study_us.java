/**
 * 
 */
package fr.alten.dw.model.beans.Study;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name="dwh_study_us")
public class Study_us implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1554349587541451866L;

	@Id
	@Column(name="id")
	private Long id;
	private Integer instance_key;
	private String instance_name;
	private Double patient_height;
	private Double patient_weight;
	private Timestamp study_datetime;
	private Timestamp study_datetime_utc;
	private String modality;
	private String patient_id;
	private String patient_last_name;
	private String patient_sex;
	private Timestamp patient_birth_date;
	private String patient_first_name;
	private String nature_of_exam;
	private Double patient_age;
	private Integer total_study_last_month;
	private Date study_date;
	private Timestamp study_end_date;
	private Integer total_number_of_exposures;
	private Integer week_number;
	private Integer day_number;
	private Integer study_hour;
	private String hour_interval;
	private Integer exam_duration_sched;
	private Integer exam_prep_time_before;
	private Integer exam_prep_time_after;
	private Integer patient_appointment_delay;
	private Integer patient_waiting_time;
	private Integer exam_duration;
	private Boolean contrast_bolus_agent_use_detected;
	private String patient_age_range;
	private Timestamp study_end_estimated;
	private Timestamp study_end_mpps;

	public Study_us() {
		super();
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getInstance_key() {
		return instance_key;
	}
	
	public void setInstance_key(Integer instance_key) {
		this.instance_key = instance_key;
	}
	
	public String getInstance_name() {
		return instance_name;
	}
	
	public void setInstance_name(String instance_name) {
		this.instance_name = instance_name;
	}
	
	public Double getPatient_height() {
		return patient_height;
	}
	
	public void setPatient_height(Double patient_height) {
		this.patient_height = patient_height;
	}
	
	public Double getPatient_weight() {
		return patient_weight;
	}
	
	public void setPatient_weight(Double patient_weight) {
		this.patient_weight = patient_weight;
	}
	
	public Timestamp getStudy_datetime() {
		return study_datetime;
	}
	
	public void setStudy_datetime(Timestamp study_datetime) {
		this.study_datetime = study_datetime;
	}
	
	public Timestamp getStudy_datetime_utc() {
		return study_datetime_utc;
	}
	
	public void setStudy_datetime_utc(Timestamp study_datetime_utc) {
		this.study_datetime_utc = study_datetime_utc;
	}
	
	public String getModality() {
		return modality;
	}
	
	public void setModality(String modality) {
		this.modality = modality;
	}
	
	public String getPatient_id() {
		return patient_id;
	}
	
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	
	public String getPatient_last_name() {
		return patient_last_name;
	}
	
	public void setPatient_last_name(String patient_last_name) {
		this.patient_last_name = patient_last_name;
	}
	
	public String getPatient_sex() {
		return patient_sex;
	}
	
	public void setPatient_sex(String patient_sex) {
		this.patient_sex = patient_sex;
	}
	
	public Timestamp getPatient_birth_date() {
		return patient_birth_date;
	}
	
	public void setPatient_birth_date(Timestamp patient_birth_date) {
		this.patient_birth_date = patient_birth_date;
	}
	
	public String getPatient_first_name() {
		return patient_first_name;
	}
	
	public void setPatient_first_name(String patient_first_name) {
		this.patient_first_name = patient_first_name;
	}
	
	public String getNature_of_exam() {
		return nature_of_exam;
	}
	
	public void setNature_of_exam(String nature_of_exam) {
		this.nature_of_exam = nature_of_exam;
	}
	
	public Double getPatient_age() {
		return patient_age;
	}
	
	public void setPatient_age(Double patient_age) {
		this.patient_age = patient_age;
	}
	
	public Integer getTotal_study_last_month() {
		return total_study_last_month;
	}
	
	public void setTotal_study_last_month(Integer total_study_last_month) {
		this.total_study_last_month = total_study_last_month;
	}
	
	public Date getStudy_date() {
		return study_date;
	}
	
	public void setStudy_date(Date study_date) {
		this.study_date = study_date;
	}
	
	public Timestamp getStudy_end_date() {
		return study_end_date;
	}
	
	public void setStudy_end_date(Timestamp study_end_date) {
		this.study_end_date = study_end_date;
	}
	
	public Integer getTotal_number_of_exposures() {
		return total_number_of_exposures;
	}
	
	public void setTotal_number_of_exposures(Integer total_number_of_exposures) {
		this.total_number_of_exposures = total_number_of_exposures;
	}
	
	public Integer getWeek_number() {
		return week_number;
	}
	
	public void setWeek_number(Integer week_number) {
		this.week_number = week_number;
	}
	
	public Integer getDay_number() {
		return day_number;
	}
	
	public void setDay_number(Integer day_number) {
		this.day_number = day_number;
	}
	
	public Integer getStudy_hour() {
		return study_hour;
	}
	
	public void setStudy_hour(Integer study_hour) {
		this.study_hour = study_hour;
	}
	
	public String getHour_Integererval() {
		return hour_interval;
	}
	
	public void setHour_Integererval(String hour_Integererval) {
		this.hour_interval = hour_Integererval;
	}
	
	public Integer getExam_duration_sched() {
		return exam_duration_sched;
	}
	
	public void setExam_duration_sched(Integer exam_duration_sched) {
		this.exam_duration_sched = exam_duration_sched;
	}
	
	public Integer getExam_prep_time_before() {
		return exam_prep_time_before;
	}
	
	public void setExam_prep_time_before(Integer exam_prep_time_before) {
		this.exam_prep_time_before = exam_prep_time_before;
	}
	
	public Integer getExam_prep_time_after() {
		return exam_prep_time_after;
	}
	
	public void setExam_prep_time_after(Integer exam_prep_time_after) {
		this.exam_prep_time_after = exam_prep_time_after;
	}
	
	public Integer getPatient_appoIntegerment_delay() {
		return patient_appointment_delay;
	}
	
	public void setPatient_appoIntegerment_delay(Integer patient_appoIntegerment_delay) {
		this.patient_appointment_delay = patient_appoIntegerment_delay;
	}
	
	public Integer getPatient_waiting_time() {
		return patient_waiting_time;
	}
	
	public void setPatient_waiting_time(Integer patient_waiting_time) {
		this.patient_waiting_time = patient_waiting_time;
	}
	
	public Integer getExam_duration() {
		return exam_duration;
	}
	
	public void setExam_duration(Integer exam_duration) {
		this.exam_duration = exam_duration;
	}
	
	public Boolean getContrast_bolus_agent_use_detected() {
		return contrast_bolus_agent_use_detected;
	}
	
	public void setContrast_bolus_agent_use_detected(Boolean contrast_bolus_agent_use_detected) {
		this.contrast_bolus_agent_use_detected = contrast_bolus_agent_use_detected;
	}
	
	public String getPatient_age_range() {
		return patient_age_range;
	}
	
	public void setPatient_age_range(String patient_age_range) {
		this.patient_age_range = patient_age_range;
	}
	
	public Timestamp getStudy_end_estimated() {
		return study_end_estimated;
	}
	
	public void setStudy_end_estimated(Timestamp study_end_estimated) {
		this.study_end_estimated = study_end_estimated;
	}
	
	public Timestamp getStudy_end_mpps() {
		return study_end_mpps;
	}
	
	public void setStudy_end_mpps(Timestamp study_end_mpps) {
		this.study_end_mpps = study_end_mpps;
	}
}
