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
@Table(name="dwh_study_mg")
public class Study_mg implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 913185984430981042L;

	@Id
	@Column(name="id")
	private Long id;
	private Integer instance_key;
	private Integer total_number_of_exposures;
	private Double accumulated_average_glandular_dose_left;
	private Double accumulated_average_glandular_dose_right;
	private Double accumulated_average_glandular_dose_both;
	private Double accumulated_entrance_dose_left;
	private Double accumulated_entrance_dose_right;
	private Double accumulated_entrance_dose_both;
	private Boolean breast_implant_present_left;
	private Boolean breast_implant_present_right;
	private Boolean breast_implant_present_both;
	private Double patient_height;
	private String study_id;
	private Boolean study_comment_difficult_procedure;
	private Boolean study_comment_patient_weight;
	private Double patient_weight;
	private Timestamp study_datetime;
	private Timestamp study_datetime_utc;
	private Integer alert_cumulative_count;
	private Integer alert_series_count;
	private Integer alert_study_count;
	private Integer alert_study_protocol_count;
	private Integer alert_study_lexicon_count;
	private Integer alert_series_lexicon_count;
	private Integer alert_drl_count;
	private String patient_id;
	private String patient_last_name;
	private String patient_sex;
	private Timestamp patient_birth_date;
	private String patient_first_name;
	private String nature_of_exam;
	private Double patient_age;
	private Integer images_rejected;
	private Integer total_study_last_month;
	private Date alert_reviewed_date_initial;
	private Date alert_reviewed_date_last;
	private Date study_date;
	private Timestamp study_end_date;
	private Integer week_number;
	private Integer day_number;
	private Integer study_hour;
	private String hour_Integererval;
	private Integer exam_duration_sched;
	private Integer exam_prep_time_before;
	private Integer exam_prep_time_after;
	private Integer patient_appoIntegerment_delay;
	private Integer patient_waiting_time;
	private Integer exam_duration;
	private Integer time_slot;
	private String patient_age_range;
	private Double average_breast_thickness;
	private String protocol_name;
	
	
	public Study_mg() {
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


	public Integer getTotal_number_of_exposures() {
		return total_number_of_exposures;
	}


	public void setTotal_number_of_exposures(Integer total_number_of_exposures) {
		this.total_number_of_exposures = total_number_of_exposures;
	}


	public Double getAccumulated_average_glandular_dose_left() {
		return accumulated_average_glandular_dose_left;
	}


	public void setAccumulated_average_glandular_dose_left(Double accumulated_average_glandular_dose_left) {
		this.accumulated_average_glandular_dose_left = accumulated_average_glandular_dose_left;
	}


	public Double getAccumulated_average_glandular_dose_right() {
		return accumulated_average_glandular_dose_right;
	}


	public void setAccumulated_average_glandular_dose_right(Double accumulated_average_glandular_dose_right) {
		this.accumulated_average_glandular_dose_right = accumulated_average_glandular_dose_right;
	}


	public Double getAccumulated_average_glandular_dose_both() {
		return accumulated_average_glandular_dose_both;
	}


	public void setAccumulated_average_glandular_dose_both(Double accumulated_average_glandular_dose_both) {
		this.accumulated_average_glandular_dose_both = accumulated_average_glandular_dose_both;
	}


	public Double getAccumulated_entrance_dose_left() {
		return accumulated_entrance_dose_left;
	}


	public void setAccumulated_entrance_dose_left(Double accumulated_entrance_dose_left) {
		this.accumulated_entrance_dose_left = accumulated_entrance_dose_left;
	}


	public Double getAccumulated_entrance_dose_right() {
		return accumulated_entrance_dose_right;
	}


	public void setAccumulated_entrance_dose_right(Double accumulated_entrance_dose_right) {
		this.accumulated_entrance_dose_right = accumulated_entrance_dose_right;
	}


	public Double getAccumulated_entrance_dose_both() {
		return accumulated_entrance_dose_both;
	}


	public void setAccumulated_entrance_dose_both(Double accumulated_entrance_dose_both) {
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


	public Double getPatient_height() {
		return patient_height;
	}


	public void setPatient_height(Double patient_height) {
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


	public Integer getAlert_cumulative_count() {
		return alert_cumulative_count;
	}


	public void setAlert_cumulative_count(Integer alert_cumulative_count) {
		this.alert_cumulative_count = alert_cumulative_count;
	}


	public Integer getAlert_series_count() {
		return alert_series_count;
	}


	public void setAlert_series_count(Integer alert_series_count) {
		this.alert_series_count = alert_series_count;
	}


	public Integer getAlert_study_count() {
		return alert_study_count;
	}


	public void setAlert_study_count(Integer alert_study_count) {
		this.alert_study_count = alert_study_count;
	}


	public Integer getAlert_study_protocol_count() {
		return alert_study_protocol_count;
	}


	public void setAlert_study_protocol_count(Integer alert_study_protocol_count) {
		this.alert_study_protocol_count = alert_study_protocol_count;
	}


	public Integer getAlert_study_lexicon_count() {
		return alert_study_lexicon_count;
	}


	public void setAlert_study_lexicon_count(Integer alert_study_lexicon_count) {
		this.alert_study_lexicon_count = alert_study_lexicon_count;
	}


	public Integer getAlert_series_lexicon_count() {
		return alert_series_lexicon_count;
	}


	public void setAlert_series_lexicon_count(Integer alert_series_lexicon_count) {
		this.alert_series_lexicon_count = alert_series_lexicon_count;
	}


	public Integer getAlert_drl_count() {
		return alert_drl_count;
	}


	public void setAlert_drl_count(Integer alert_drl_count) {
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


	public Double getPatient_age() {
		return patient_age;
	}


	public void setPatient_age(Double patient_age) {
		this.patient_age = patient_age;
	}


	public Integer getImages_rejected() {
		return images_rejected;
	}


	public void setImages_rejected(Integer images_rejected) {
		this.images_rejected = images_rejected;
	}


	public Integer getTotal_study_last_month() {
		return total_study_last_month;
	}


	public void setTotal_study_last_month(Integer total_study_last_month) {
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
		return hour_Integererval;
	}


	public void setHour_Integererval(String hour_Integererval) {
		this.hour_Integererval = hour_Integererval;
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
		return patient_appoIntegerment_delay;
	}


	public void setPatient_appoIntegerment_delay(Integer patient_appoIntegerment_delay) {
		this.patient_appoIntegerment_delay = patient_appoIntegerment_delay;
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


	public Integer getTime_slot() {
		return time_slot;
	}


	public void setTime_slot(Integer time_slot) {
		this.time_slot = time_slot;
	}


	public String getPatient_age_range() {
		return patient_age_range;
	}


	public void setPatient_age_range(String patient_age_range) {
		this.patient_age_range = patient_age_range;
	}


	public Double getAverage_breast_thickness() {
		return average_breast_thickness;
	}


	public void setAverage_breast_thickness(Double average_breast_thickness) {
		this.average_breast_thickness = average_breast_thickness;
	}


	public String getProtocol_name() {
		return protocol_name;
	}


	public void setProtocol_name(String protocol_name) {
		this.protocol_name = protocol_name;
	}
}
