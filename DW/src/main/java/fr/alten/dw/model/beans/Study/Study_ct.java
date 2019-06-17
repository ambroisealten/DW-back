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
public class Study_ct implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -353994855681333968L;

	@Id
	private transient ObjectId _id;

	private int instance_key;
	private String instance_name;
	private String study_instance_uid;
	private double patient_height;
	private String study_id;
	private Boolean study_comment_difficult_procedure;
	private Boolean study_comment_patient_weight;
	private double patient_weight;
	private Date study_datetime;
	private Date study_datetime_utc;
	private String modality;
	private Long patient_key;
	private String modality_performed_procedure_step_uid;
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
	private Date patient_birth_date;
	private double patient_age;
	private String patient_first_name;
	private Date start_of_xray_irradiation;
	private Date end_of_xray_irradiation;
	private double dose_length_product_total;
	private double dose_length_product_ssde;
	private int total_number_of_irradiation_events;
	private String nature_of_exam;
	private Boolean alert_triggered_series_dlp_level_1;
	private Boolean alert_triggered_series_ctdivol_level_1;
	private Boolean alert_triggered_study_dlp_level_1;
	private Boolean alert_triggered_series_dlp_level_2;
	private Boolean alert_triggered_series_ctdi_level_2;
	private Boolean alert_triggered_study_dlp_level_2;
	private int total_study_last_month;
	private Date study_date;
	private Date study_end_date;
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
	private Boolean contrast_bolus_agent_use_detected;
	private int images_rejected;

	
	public Study_ct() {
		super();
	}


	public int getInstance_key() {
		return instance_key;
	}


	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
	}


	public String getInstance_name() {
		return instance_name;
	}


	public void setInstance_name(String instance_name) {
		this.instance_name = instance_name;
	}


	public String getStudy_instance_uid() {
		return study_instance_uid;
	}


	public void setStudy_instance_uid(String study_instance_uid) {
		this.study_instance_uid = study_instance_uid;
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


	public Date getStudy_datetime() {
		return study_datetime;
	}


	public void setStudy_datetime(Date study_datetime) {
		this.study_datetime = study_datetime;
	}


	public Date getStudy_datetime_utc() {
		return study_datetime_utc;
	}


	public void setStudy_datetime_utc(Date study_datetime_utc) {
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


	public String getModality_performed_procedure_step_uid() {
		return modality_performed_procedure_step_uid;
	}


	public void setModality_performed_procedure_step_uid(String modality_performed_procedure_step_uid) {
		this.modality_performed_procedure_step_uid = modality_performed_procedure_step_uid;
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


	public Date getPatient_birth_date() {
		return patient_birth_date;
	}


	public void setPatient_birth_date(Date patient_birth_date) {
		this.patient_birth_date = patient_birth_date;
	}


	public double getPatient_age() {
		return patient_age;
	}


	public void setPatient_age(double patient_age) {
		this.patient_age = patient_age;
	}


	public String getPatient_first_name() {
		return patient_first_name;
	}


	public void setPatient_first_name(String patient_first_name) {
		this.patient_first_name = patient_first_name;
	}


	public Date getStart_of_xray_irradiation() {
		return start_of_xray_irradiation;
	}


	public void setStart_of_xray_irradiation(Date start_of_xray_irradiation) {
		this.start_of_xray_irradiation = start_of_xray_irradiation;
	}


	public Date getEnd_of_xray_irradiation() {
		return end_of_xray_irradiation;
	}


	public void setEnd_of_xray_irradiation(Date end_of_xray_irradiation) {
		this.end_of_xray_irradiation = end_of_xray_irradiation;
	}


	public double getDose_length_product_total() {
		return dose_length_product_total;
	}


	public void setDose_length_product_total(double dose_length_product_total) {
		this.dose_length_product_total = dose_length_product_total;
	}


	public double getDose_length_product_ssde() {
		return dose_length_product_ssde;
	}


	public void setDose_length_product_ssde(double dose_length_product_ssde) {
		this.dose_length_product_ssde = dose_length_product_ssde;
	}


	public int getTotal_number_of_irradiation_events() {
		return total_number_of_irradiation_events;
	}


	public void setTotal_number_of_irradiation_events(int total_number_of_irradiation_events) {
		this.total_number_of_irradiation_events = total_number_of_irradiation_events;
	}


	public String getNature_of_exam() {
		return nature_of_exam;
	}


	public void setNature_of_exam(String nature_of_exam) {
		this.nature_of_exam = nature_of_exam;
	}


	public Boolean getAlert_triggered_series_dlp_level_1() {
		return alert_triggered_series_dlp_level_1;
	}


	public void setAlert_triggered_series_dlp_level_1(Boolean alert_triggered_series_dlp_level_1) {
		this.alert_triggered_series_dlp_level_1 = alert_triggered_series_dlp_level_1;
	}


	public Boolean getAlert_triggered_series_ctdivol_level_1() {
		return alert_triggered_series_ctdivol_level_1;
	}


	public void setAlert_triggered_series_ctdivol_level_1(Boolean alert_triggered_series_ctdivol_level_1) {
		this.alert_triggered_series_ctdivol_level_1 = alert_triggered_series_ctdivol_level_1;
	}


	public Boolean getAlert_triggered_study_dlp_level_1() {
		return alert_triggered_study_dlp_level_1;
	}


	public void setAlert_triggered_study_dlp_level_1(Boolean alert_triggered_study_dlp_level_1) {
		this.alert_triggered_study_dlp_level_1 = alert_triggered_study_dlp_level_1;
	}


	public Boolean getAlert_triggered_series_dlp_level_2() {
		return alert_triggered_series_dlp_level_2;
	}


	public void setAlert_triggered_series_dlp_level_2(Boolean alert_triggered_series_dlp_level_2) {
		this.alert_triggered_series_dlp_level_2 = alert_triggered_series_dlp_level_2;
	}


	public Boolean getAlert_triggered_series_ctdi_level_2() {
		return alert_triggered_series_ctdi_level_2;
	}


	public void setAlert_triggered_series_ctdi_level_2(Boolean alert_triggered_series_ctdi_level_2) {
		this.alert_triggered_series_ctdi_level_2 = alert_triggered_series_ctdi_level_2;
	}


	public Boolean getAlert_triggered_study_dlp_level_2() {
		return alert_triggered_study_dlp_level_2;
	}


	public void setAlert_triggered_study_dlp_level_2(Boolean alert_triggered_study_dlp_level_2) {
		this.alert_triggered_study_dlp_level_2 = alert_triggered_study_dlp_level_2;
	}


	public int getTotal_study_last_month() {
		return total_study_last_month;
	}


	public void setTotal_study_last_month(int total_study_last_month) {
		this.total_study_last_month = total_study_last_month;
	}


	public Date getStudy_date() {
		return study_date;
	}


	public void setStudy_date(Date study_date) {
		this.study_date = study_date;
	}


	public Date getStudy_end_date() {
		return study_end_date;
	}


	public void setStudy_end_date(Date study_end_date) {
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


	public Boolean getContrast_bolus_agent_use_detected() {
		return contrast_bolus_agent_use_detected;
	}


	public void setContrast_bolus_agent_use_detected(Boolean contrast_bolus_agent_use_detected) {
		this.contrast_bolus_agent_use_detected = contrast_bolus_agent_use_detected;
	}


	public int getImages_rejected() {
		return images_rejected;
	}


	public void setImages_rejected(int images_rejected) {
		this.images_rejected = images_rejected;
	}
	
}
