/**
 *
 */
package fr.alten.dw.model.beans.Study;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
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
@Table(name = "dwh_study_mr")
public class Study_mr implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -3789233219931556803L;

	@Id
	@Column(name = "id")
	private Long id;
	private String study_instance_uid;
	private String patient_id;
	private Date study_date;
	private Double total_duration;
	private Timestamp study_start_timestamp;
	private Timestamp study_end_estimated;
	private String body_region;
	private String contrast_enhancement;
	private String anatomic_focus;
	private String modality_modifier;
	private String radlex_long_name;
	private String radlex_short_name;
	private Time bench_p25_duration;
	private Time bench_p50_duration;
	private Time bench_p75_duration;
	private Time target_duration;
	private Integer exam_duration_sched;
	private Integer exam_prep_time_before;
	private Integer exam_prep_time_after;
	private Timestamp study_start_calculated;
	private Double patient_height;
	private String study_id;
	private Integer study_id_calculated;
	private Double patient_weight;
	private Timestamp study_datetime;
	private Timestamp study_datetime_utc;
	private String modality;
	private Long patient_key;
	private String patient_last_name;
	private String patient_sex;
	private Timestamp patient_birth_date;
	private String patient_first_name;
	private String nature_of_exam;
	private Double patient_age;
	private Integer total_study_last_month;
	private Integer total_number_of_exposures;
	private Integer week_number;
	private Integer day_number;
	private Integer study_hour;
	private String hour_interval;
	private Integer patient_appointment_delay;
	private Integer patient_waiting_time;
	private Integer exam_duration;
	private Boolean contrast_bolus_agent_use_detected;
	private String patient_age_range;
	private Timestamp study_end_date;
	private String medical_alerts;
	private String allergies;
	private String protocol_name;

	public Study_mr() {
		super();
	}

	public String getAllergies() {
		return this.allergies;
	}

	public String getAnatomic_focus() {
		return this.anatomic_focus;
	}

	public Time getBench_p25_duration() {
		return this.bench_p25_duration;
	}

	public Time getBench_p50_duration() {
		return this.bench_p50_duration;
	}

	public Time getBench_p75_duration() {
		return this.bench_p75_duration;
	}

	public String getBody_region() {
		return this.body_region;
	}

	public Boolean getContrast_bolus_agent_use_detected() {
		return this.contrast_bolus_agent_use_detected;
	}

	public String getContrast_enhancement() {
		return this.contrast_enhancement;
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

	public String getMedical_alerts() {
		return this.medical_alerts;
	}

	public String getModality() {
		return this.modality;
	}

	public String getModality_modifier() {
		return this.modality_modifier;
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

	public Long getPatient_key() {
		return this.patient_key;
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

	public String getProtocol_name() {
		return this.protocol_name;
	}

	public String getRadlex_long_name() {
		return this.radlex_long_name;
	}

	public String getRadlex_short_name() {
		return this.radlex_short_name;
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

	public Integer getStudy_hour() {
		return this.study_hour;
	}

	public String getStudy_id() {
		return this.study_id;
	}

	public Integer getStudy_id_calculated() {
		return this.study_id_calculated;
	}

	public String getStudy_instance_uid() {
		return this.study_instance_uid;
	}

	public Timestamp getStudy_start_calculated() {
		return this.study_start_calculated;
	}

	public Timestamp getStudy_start_timestamp() {
		return this.study_start_timestamp;
	}

	public Time getTarget_duration() {
		return this.target_duration;
	}

	public Double getTotal_duration() {
		return this.total_duration;
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

	public void setAllergies(final String allergies) {
		this.allergies = allergies;
	}

	public void setAnatomic_focus(final String anatomic_focus) {
		this.anatomic_focus = anatomic_focus;
	}

	public void setBench_p25_duration(final Time bench_p25_duration) {
		this.bench_p25_duration = bench_p25_duration;
	}

	public void setBench_p50_duration(final Time bench_p50_duration) {
		this.bench_p50_duration = bench_p50_duration;
	}

	public void setBench_p75_duration(final Time bench_p75_duration) {
		this.bench_p75_duration = bench_p75_duration;
	}

	public void setBody_region(final String body_region) {
		this.body_region = body_region;
	}

	public void setContrast_bolus_agent_use_detected(final Boolean contrast_bolus_agent_use_detected) {
		this.contrast_bolus_agent_use_detected = contrast_bolus_agent_use_detected;
	}

	public void setContrast_enhancement(final String contrast_enhancement) {
		this.contrast_enhancement = contrast_enhancement;
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

	public void setMedical_alerts(final String medical_alerts) {
		this.medical_alerts = medical_alerts;
	}

	public void setModality(final String modality) {
		this.modality = modality;
	}

	public void setModality_modifier(final String modality_modifier) {
		this.modality_modifier = modality_modifier;
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

	public void setPatient_key(final Long patient_key) {
		this.patient_key = patient_key;
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

	public void setProtocol_name(final String protocol_name) {
		this.protocol_name = protocol_name;
	}

	public void setRadlex_long_name(final String radlex_long_name) {
		this.radlex_long_name = radlex_long_name;
	}

	public void setRadlex_short_name(final String radlex_short_name) {
		this.radlex_short_name = radlex_short_name;
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

	public void setStudy_hour(final Integer study_hour) {
		this.study_hour = study_hour;
	}

	public void setStudy_id(final String study_id) {
		this.study_id = study_id;
	}

	public void setStudy_id_calculated(final Integer study_id_calculated) {
		this.study_id_calculated = study_id_calculated;
	}

	public void setStudy_instance_uid(final String study_instance_uid) {
		this.study_instance_uid = study_instance_uid;
	}

	public void setStudy_start_calculated(final Timestamp study_start_calculated) {
		this.study_start_calculated = study_start_calculated;
	}

	public void setStudy_start_timestamp(final Timestamp study_start_timestamp) {
		this.study_start_timestamp = study_start_timestamp;
	}

	public void setTarget_duration(final Time target_duration) {
		this.target_duration = target_duration;
	}

	public void setTotal_duration(final Double total_duration) {
		this.total_duration = total_duration;
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
