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
@Table(name = "dwh_study_us")
public class Study_us implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -1554349587541451866L;

	@Id
	@Column(name = "id")
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

	public Boolean getContrast_bolus_agent_use_detected() {
		return this.contrast_bolus_agent_use_detected;
	}

	public Integer getDay_number() {
		return this.day_number;
	}

	public Integer getExam_duration() {
		return this.exam_duration;
	}

	public Integer getExam_duration_sched() {
		return this.exam_duration_sched;
	}

	public Integer getExam_prep_time_after() {
		return this.exam_prep_time_after;
	}

	public Integer getExam_prep_time_before() {
		return this.exam_prep_time_before;
	}

	public String getHour_Integererval() {
		return this.hour_interval;
	}

	public Long getId() {
		return this.id;
	}

	public Integer getInstance_key() {
		return this.instance_key;
	}

	public String getInstance_name() {
		return this.instance_name;
	}

	public String getModality() {
		return this.modality;
	}

	public String getNature_of_exam() {
		return this.nature_of_exam;
	}

	public Double getPatient_age() {
		return this.patient_age;
	}

	public String getPatient_age_range() {
		return this.patient_age_range;
	}

	public Integer getPatient_appoIntegerment_delay() {
		return this.patient_appointment_delay;
	}

	public Timestamp getPatient_birth_date() {
		return this.patient_birth_date;
	}

	public String getPatient_first_name() {
		return this.patient_first_name;
	}

	public Double getPatient_height() {
		return this.patient_height;
	}

	public String getPatient_id() {
		return this.patient_id;
	}

	public String getPatient_last_name() {
		return this.patient_last_name;
	}

	public String getPatient_sex() {
		return this.patient_sex;
	}

	public Integer getPatient_waiting_time() {
		return this.patient_waiting_time;
	}

	public Double getPatient_weight() {
		return this.patient_weight;
	}

	public Date getStudy_date() {
		return this.study_date;
	}

	public Timestamp getStudy_datetime() {
		return this.study_datetime;
	}

	public Timestamp getStudy_datetime_utc() {
		return this.study_datetime_utc;
	}

	public Timestamp getStudy_end_date() {
		return this.study_end_date;
	}

	public Timestamp getStudy_end_estimated() {
		return this.study_end_estimated;
	}

	public Timestamp getStudy_end_mpps() {
		return this.study_end_mpps;
	}

	public Integer getStudy_hour() {
		return this.study_hour;
	}

	public Integer getTotal_number_of_exposures() {
		return this.total_number_of_exposures;
	}

	public Integer getTotal_study_last_month() {
		return this.total_study_last_month;
	}

	public Integer getWeek_number() {
		return this.week_number;
	}

	public void setContrast_bolus_agent_use_detected(final Boolean contrast_bolus_agent_use_detected) {
		this.contrast_bolus_agent_use_detected = contrast_bolus_agent_use_detected;
	}

	public void setDay_number(final Integer day_number) {
		this.day_number = day_number;
	}

	public void setExam_duration(final Integer exam_duration) {
		this.exam_duration = exam_duration;
	}

	public void setExam_duration_sched(final Integer exam_duration_sched) {
		this.exam_duration_sched = exam_duration_sched;
	}

	public void setExam_prep_time_after(final Integer exam_prep_time_after) {
		this.exam_prep_time_after = exam_prep_time_after;
	}

	public void setExam_prep_time_before(final Integer exam_prep_time_before) {
		this.exam_prep_time_before = exam_prep_time_before;
	}

	public void setHour_Integererval(final String hour_Integererval) {
		this.hour_interval = hour_Integererval;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setInstance_name(final String instance_name) {
		this.instance_name = instance_name;
	}

	public void setModality(final String modality) {
		this.modality = modality;
	}

	public void setNature_of_exam(final String nature_of_exam) {
		this.nature_of_exam = nature_of_exam;
	}

	public void setPatient_age(final Double patient_age) {
		this.patient_age = patient_age;
	}

	public void setPatient_age_range(final String patient_age_range) {
		this.patient_age_range = patient_age_range;
	}

	public void setPatient_appoIntegerment_delay(final Integer patient_appoIntegerment_delay) {
		this.patient_appointment_delay = patient_appoIntegerment_delay;
	}

	public void setPatient_birth_date(final Timestamp patient_birth_date) {
		this.patient_birth_date = patient_birth_date;
	}

	public void setPatient_first_name(final String patient_first_name) {
		this.patient_first_name = patient_first_name;
	}

	public void setPatient_height(final Double patient_height) {
		this.patient_height = patient_height;
	}

	public void setPatient_id(final String patient_id) {
		this.patient_id = patient_id;
	}

	public void setPatient_last_name(final String patient_last_name) {
		this.patient_last_name = patient_last_name;
	}

	public void setPatient_sex(final String patient_sex) {
		this.patient_sex = patient_sex;
	}

	public void setPatient_waiting_time(final Integer patient_waiting_time) {
		this.patient_waiting_time = patient_waiting_time;
	}

	public void setPatient_weight(final Double patient_weight) {
		this.patient_weight = patient_weight;
	}

	public void setStudy_date(final Date study_date) {
		this.study_date = study_date;
	}

	public void setStudy_datetime(final Timestamp study_datetime) {
		this.study_datetime = study_datetime;
	}

	public void setStudy_datetime_utc(final Timestamp study_datetime_utc) {
		this.study_datetime_utc = study_datetime_utc;
	}

	public void setStudy_end_date(final Timestamp study_end_date) {
		this.study_end_date = study_end_date;
	}

	public void setStudy_end_estimated(final Timestamp study_end_estimated) {
		this.study_end_estimated = study_end_estimated;
	}

	public void setStudy_end_mpps(final Timestamp study_end_mpps) {
		this.study_end_mpps = study_end_mpps;
	}

	public void setStudy_hour(final Integer study_hour) {
		this.study_hour = study_hour;
	}

	public void setTotal_number_of_exposures(final Integer total_number_of_exposures) {
		this.total_number_of_exposures = total_number_of_exposures;
	}

	public void setTotal_study_last_month(final Integer total_study_last_month) {
		this.total_study_last_month = total_study_last_month;
	}

	public void setWeek_number(final Integer week_number) {
		this.week_number = week_number;
	}
}
