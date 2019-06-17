/**
 * 
 */
package fr.alten.dw.model.beans.Study;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 *
 */
public class Study_mg implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 913185984430981042L;

	@Id
	private transient ObjectId _id;

	private int instance_key;
	private int total_number_of_exposures;
	private double accumulated_average_glandular_dose_left;
	private double accumulated_average_glandular_dose_right;
	private double accumulated_average_glandular_dose_both;
	private double accumulated_entrance_dose_left;
	private double accumulated_entrance_dose_right;
	private double accumulated_entrance_dose_both;
	private Boolean breast_implant_present_left;
	private Boolean breast_implant_present_right;
	private Boolean breast_implant_present_both;
	private double patient_height;
	private String study_id;
	private Boolean study_comment_difficult_procedure;
	private Boolean study_comment_patient_weight;
	private double patient_weight;
	private Timestamp study_datetime;
	private Timestamp study_datetime_utc;
	private int alert_cumulative_count;
	private int alert_series_count;
	private int alert_study_count;
	private int alert_study_protocol_count;
	private int alert_study_lexicon_count;
	private int alert_series_lexicon_count;
	private int alert_drl_count;
	private String patient_id;
	private String patient_last_name;
	private String patient_sex;
	private Timestamp patient_birth_date;
	private String patient_first_name;
	private String nature_of_exam;
	private double patient_age;
	private int images_rejected;
	private int total_study_last_month;
	private Date alert_reviewed_date_initial;
	private Date alert_reviewed_date_last;
	private Date study_date;
	private Timestamp study_end_date;
	private int week_number;
	private int day_number;
	private int study_hour;
	private String hour_interval;
	private int exam_duration_sched;
	private int exam_prep_time_before;
	private int exam_prep_time_after;
	private int patient_appointment_delay;
	private int patient_waiting_time;
	private int exam_duration;
	private int time_slot;
	private String patient_age_range;
	private double average_breast_thickness;
	private String protocol_name;
	
	
	public Study_mg() {
		super();
	}


	public int getInstance_key() {
		return instance_key;
	}


	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
	}


	public int getTotal_number_of_exposures() {
		return total_number_of_exposures;
	}


	public void setTotal_number_of_exposures(int total_number_of_exposures) {
		this.total_number_of_exposures = total_number_of_exposures;
	}


	public double getAccumulated_average_glandular_dose_left() {
		return accumulated_average_glandular_dose_left;
	}


	public void setAccumulated_average_glandular_dose_left(double accumulated_average_glandular_dose_left) {
		this.accumulated_average_glandular_dose_left = accumulated_average_glandular_dose_left;
	}


	public double getAccumulated_average_glandular_dose_right() {
		return accumulated_average_glandular_dose_right;
	}


	public void setAccumulated_average_glandular_dose_right(double accumulated_average_glandular_dose_right) {
		this.accumulated_average_glandular_dose_right = accumulated_average_glandular_dose_right;
	}


	public double getAccumulated_average_glandular_dose_both() {
		return accumulated_average_glandular_dose_both;
	}


	public void setAccumulated_average_glandular_dose_both(double accumulated_average_glandular_dose_both) {
		this.accumulated_average_glandular_dose_both = accumulated_average_glandular_dose_both;
	}


	public double getAccumulated_entrance_dose_left() {
		return accumulated_entrance_dose_left;
	}


	public void setAccumulated_entrance_dose_left(double accumulated_entrance_dose_left) {
		this.accumulated_entrance_dose_left = accumulated_entrance_dose_left;
	}


	public double getAccumulated_entrance_dose_right() {
		return accumulated_entrance_dose_right;
	}


	public void setAccumulated_entrance_dose_right(double accumulated_entrance_dose_right) {
		this.accumulated_entrance_dose_right = accumulated_entrance_dose_right;
	}


	public double getAccumulated_entrance_dose_both() {
		return accumulated_entrance_dose_both;
	}


	public void setAccumulated_entrance_dose_both(double accumulated_entrance_dose_both) {
		this.accumulated_entrance_dose_both = accumulated_entrance_dose_both;
	}


	public Boolean getBreast_implant_present_left() {
		return breast_implant_present_left;
	}


	public void setBreast_implant_present_left(Boolean breast_implant_present_left) {
		this.breast_implant_present_left = breast_implant_present_left;
	}


	public Boolean getBreast_implant_present_right() {
		return breast_implant_present_right;
	}


	public void setBreast_implant_present_right(Boolean breast_implant_present_right) {
		this.breast_implant_present_right = breast_implant_present_right;
	}


	public Boolean getBreast_implant_present_both() {
		return breast_implant_present_both;
	}


	public void setBreast_implant_present_both(Boolean breast_implant_present_both) {
		this.breast_implant_present_both = breast_implant_present_both;
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


	public Boolean getStudy_comment_difficult_procedure() {
		return study_comment_difficult_procedure;
	}


	public void setStudy_comment_difficult_procedure(Boolean study_comment_difficult_procedure) {
		this.study_comment_difficult_procedure = study_comment_difficult_procedure;
	}


	public Boolean getStudy_comment_patient_weight() {
		return study_comment_patient_weight;
	}


	public void setStudy_comment_patient_weight(Boolean study_comment_patient_weight) {
		this.study_comment_patient_weight = study_comment_patient_weight;
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


	public int getAlert_cumulative_count() {
		return alert_cumulative_count;
	}


	public void setAlert_cumulative_count(int alert_cumulative_count) {
		this.alert_cumulative_count = alert_cumulative_count;
	}


	public int getAlert_series_count() {
		return alert_series_count;
	}


	public void setAlert_series_count(int alert_series_count) {
		this.alert_series_count = alert_series_count;
	}


	public int getAlert_study_count() {
		return alert_study_count;
	}


	public void setAlert_study_count(int alert_study_count) {
		this.alert_study_count = alert_study_count;
	}


	public int getAlert_study_protocol_count() {
		return alert_study_protocol_count;
	}


	public void setAlert_study_protocol_count(int alert_study_protocol_count) {
		this.alert_study_protocol_count = alert_study_protocol_count;
	}


	public int getAlert_study_lexicon_count() {
		return alert_study_lexicon_count;
	}


	public void setAlert_study_lexicon_count(int alert_study_lexicon_count) {
		this.alert_study_lexicon_count = alert_study_lexicon_count;
	}


	public int getAlert_series_lexicon_count() {
		return alert_series_lexicon_count;
	}


	public void setAlert_series_lexicon_count(int alert_series_lexicon_count) {
		this.alert_series_lexicon_count = alert_series_lexicon_count;
	}


	public int getAlert_drl_count() {
		return alert_drl_count;
	}


	public void setAlert_drl_count(int alert_drl_count) {
		this.alert_drl_count = alert_drl_count;
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


	public double getPatient_age() {
		return patient_age;
	}


	public void setPatient_age(double patient_age) {
		this.patient_age = patient_age;
	}


	public int getImages_rejected() {
		return images_rejected;
	}


	public void setImages_rejected(int images_rejected) {
		this.images_rejected = images_rejected;
	}


	public int getTotal_study_last_month() {
		return total_study_last_month;
	}


	public void setTotal_study_last_month(int total_study_last_month) {
		this.total_study_last_month = total_study_last_month;
	}


	public Date getAlert_reviewed_date_initial() {
		return alert_reviewed_date_initial;
	}


	public void setAlert_reviewed_date_initial(Date alert_reviewed_date_initial) {
		this.alert_reviewed_date_initial = alert_reviewed_date_initial;
	}


	public Date getAlert_reviewed_date_last() {
		return alert_reviewed_date_last;
	}


	public void setAlert_reviewed_date_last(Date alert_reviewed_date_last) {
		this.alert_reviewed_date_last = alert_reviewed_date_last;
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


	public int getTime_slot() {
		return time_slot;
	}


	public void setTime_slot(int time_slot) {
		this.time_slot = time_slot;
	}


	public String getPatient_age_range() {
		return patient_age_range;
	}


	public void setPatient_age_range(String patient_age_range) {
		this.patient_age_range = patient_age_range;
	}


	public double getAverage_breast_thickness() {
		return average_breast_thickness;
	}


	public void setAverage_breast_thickness(double average_breast_thickness) {
		this.average_breast_thickness = average_breast_thickness;
	}


	public String getProtocol_name() {
		return protocol_name;
	}


	public void setProtocol_name(String protocol_name) {
		this.protocol_name = protocol_name;
	}
}
