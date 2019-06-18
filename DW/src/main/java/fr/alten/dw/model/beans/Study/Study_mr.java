/**
 * 
 */
package fr.alten.dw.model.beans.Study;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 *
 */
public class Study_mr implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3789233219931556803L;

	@Id
	private transient ObjectId _id;

	private Long id;
	private String study_instance_uid;
	private String patient_id;
	private Date study_date;
	private double total_duration;
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
	private int exam_duration_sched;
	private int exam_prep_time_before;
	private int exam_prep_time_after;
	private Timestamp study_start_calculated;
	private double patient_height;
	private String study_id;
	private int study_id_calculated;
	private double patient_weight;
	private Timestamp study_datetime;
	private Timestamp study_datetime_utc;
	private String modality;
	private Long patient_key;
	private String patient_last_name;
	private String patient_sex;
	private Timestamp patient_birth_date;
	private String patient_first_name;
	private String nature_of_exam;
	private double patient_age;
	private int total_study_last_month;
	private int total_number_of_exposures;
	private int week_number;
	private int day_number;
	private int study_hour;
	private String hour_interval;
	private int patient_appointment_delay;
	private int patient_waiting_time;
	private int exam_duration;
	private Boolean contrast_bolus_agent_use_detected;
	private String patient_age_range;
	private Timestamp study_end_date;
	private String medical_alerts;
	private String allergies;
	private String protocol_name;
			
    public Study_mr() {
        super();
    }

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getStudy_instance_uid() {
		return study_instance_uid;
	}

	public void setStudy_instance_uid(String study_instance_uid) {
		this.study_instance_uid = study_instance_uid;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

	public Date getStudy_date() {
		return study_date;
	}

	public void setStudy_date(Date study_date) {
		this.study_date = study_date;
	}

	public double getTotal_duration() {
		return total_duration;
	}

	public void setTotal_duration(double total_duration) {
		this.total_duration = total_duration;
	}

	public Timestamp getStudy_start_timestamp() {
		return study_start_timestamp;
	}

	public void setStudy_start_timestamp(Timestamp study_start_timestamp) {
		this.study_start_timestamp = study_start_timestamp;
	}

	public Timestamp getStudy_end_estimated() {
		return study_end_estimated;
	}

	public void setStudy_end_estimated(Timestamp study_end_estimated) {
		this.study_end_estimated = study_end_estimated;
	}

	public String getBody_region() {
		return body_region;
	}

	public void setBody_region(String body_region) {
		this.body_region = body_region;
	}

	public String getContrast_enhancement() {
		return contrast_enhancement;
	}

	public void setContrast_enhancement(String contrast_enhancement) {
		this.contrast_enhancement = contrast_enhancement;
	}

	public String getAnatomic_focus() {
		return anatomic_focus;
	}

	public void setAnatomic_focus(String anatomic_focus) {
		this.anatomic_focus = anatomic_focus;
	}

	public String getModality_modifier() {
		return modality_modifier;
	}

	public void setModality_modifier(String modality_modifier) {
		this.modality_modifier = modality_modifier;
	}

	public String getRadlex_long_name() {
		return radlex_long_name;
	}

	public void setRadlex_long_name(String radlex_long_name) {
		this.radlex_long_name = radlex_long_name;
	}

	public String getRadlex_short_name() {
		return radlex_short_name;
	}

	public void setRadlex_short_name(String radlex_short_name) {
		this.radlex_short_name = radlex_short_name;
	}

	public Time getBench_p25_duration() {
		return bench_p25_duration;
	}

	public void setBench_p25_duration(Time bench_p25_duration) {
		this.bench_p25_duration = bench_p25_duration;
	}

	public Time getBench_p50_duration() {
		return bench_p50_duration;
	}

	public void setBench_p50_duration(Time bench_p50_duration) {
		this.bench_p50_duration = bench_p50_duration;
	}

	public Time getBench_p75_duration() {
		return bench_p75_duration;
	}

	public void setBench_p75_duration(Time bench_p75_duration) {
		this.bench_p75_duration = bench_p75_duration;
	}

	public Time getTarget_duration() {
		return target_duration;
	}

	public void setTarget_duration(Time target_duration) {
		this.target_duration = target_duration;
	}

	public int getExam_duration_sched() {
		return exam_duration_sched;
	}

	public void setExam_duration_sched(int exam_duration_sched) {
		this.exam_duration_sched = exam_duration_sched;
	}

	public int getExam_prep_time_before() {
		return exam_prep_time_before;
	}

	public void setExam_prep_time_before(int exam_prep_time_before) {
		this.exam_prep_time_before = exam_prep_time_before;
	}

	public int getExam_prep_time_after() {
		return exam_prep_time_after;
	}

	public void setExam_prep_time_after(int exam_prep_time_after) {
		this.exam_prep_time_after = exam_prep_time_after;
	}

	public Timestamp getStudy_start_calculated() {
		return study_start_calculated;
	}

	public void setStudy_start_calculated(Timestamp study_start_calculated) {
		this.study_start_calculated = study_start_calculated;
	}

	public double getPatient_height() {
		return patient_height;
	}

	public void setPatient_height(double patient_height) {
		this.patient_height = patient_height;
	}

	public String getStudy_id() {
		return study_id;
	}

	public void setStudy_id(String study_id) {
		this.study_id = study_id;
	}

	public int getStudy_id_calculated() {
		return study_id_calculated;
	}

	public void setStudy_id_calculated(int study_id_calculated) {
		this.study_id_calculated = study_id_calculated;
	}

	public double getPatient_weight() {
		return patient_weight;
	}

	public void setPatient_weight(double patient_weight) {
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

	public Long getPatient_key() {
		return patient_key;
	}

	public void setPatient_key(Long patient_key) {
		this.patient_key = patient_key;
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

	public double getPatient_age() {
		return patient_age;
	}

	public void setPatient_age(double patient_age) {
		this.patient_age = patient_age;
	}

	public int getTotal_study_last_month() {
		return total_study_last_month;
	}

	public void setTotal_study_last_month(int total_study_last_month) {
		this.total_study_last_month = total_study_last_month;
	}

	public int getTotal_number_of_exposures() {
		return total_number_of_exposures;
	}

	public void setTotal_number_of_exposures(int total_number_of_exposures) {
		this.total_number_of_exposures = total_number_of_exposures;
	}

	public int getWeek_number() {
		return week_number;
	}

	public void setWeek_number(int week_number) {
		this.week_number = week_number;
	}

	public int getDay_number() {
		return day_number;
	}

	public void setDay_number(int day_number) {
		this.day_number = day_number;
	}

	public int getStudy_hour() {
		return study_hour;
	}

	public void setStudy_hour(int study_hour) {
		this.study_hour = study_hour;
	}

	public String getHour_interval() {
		return hour_interval;
	}

	public void setHour_interval(String hour_interval) {
		this.hour_interval = hour_interval;
	}

	public int getPatient_appointment_delay() {
		return patient_appointment_delay;
	}

	public void setPatient_appointment_delay(int patient_appointment_delay) {
		this.patient_appointment_delay = patient_appointment_delay;
	}

	public int getPatient_waiting_time() {
		return patient_waiting_time;
	}

	public void setPatient_waiting_time(int patient_waiting_time) {
		this.patient_waiting_time = patient_waiting_time;
	}

	public int getExam_duration() {
		return exam_duration;
	}

	public void setExam_duration(int exam_duration) {
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

	public Timestamp getStudy_end_date() {
		return study_end_date;
	}

	public void setStudy_end_date(Timestamp study_end_date) {
		this.study_end_date = study_end_date;
	}

	public String getMedical_alerts() {
		return medical_alerts;
	}

	public void setMedical_alerts(String medical_alerts) {
		this.medical_alerts = medical_alerts;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getProtocol_name() {
		return protocol_name;
	}

	public void setProtocol_name(String protocol_name) {
		this.protocol_name = protocol_name;
	}
}
