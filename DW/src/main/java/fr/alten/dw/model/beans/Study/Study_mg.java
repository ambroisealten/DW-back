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
@Table(name = "dwh_study_mg")
public class Study_mg implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 913185984430981042L;

	@Id
	@Column(name = "id")
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
	private String hour_interval;
	private Integer exam_duration_sched;
	private Integer exam_prep_time_before;
	private Integer exam_prep_time_after;
	private Integer patient_appointment_delay;
	private Integer patient_waiting_time;
	private Integer exam_duration;
	private Integer time_slot;
	private String patient_age_range;
	private Double average_breast_thickness;
	private String protocol_name;

	public Study_mg() {
		super();
	}

	public Double getAccumulated_average_glandular_dose_both() {
		return this.accumulated_average_glandular_dose_both;
	}

	public Double getAccumulated_average_glandular_dose_left() {
		return this.accumulated_average_glandular_dose_left;
	}

	public Double getAccumulated_average_glandular_dose_right() {
		return this.accumulated_average_glandular_dose_right;
	}

	public Double getAccumulated_entrance_dose_both() {
		return this.accumulated_entrance_dose_both;
	}

	public Double getAccumulated_entrance_dose_left() {
		return this.accumulated_entrance_dose_left;
	}

	public Double getAccumulated_entrance_dose_right() {
		return this.accumulated_entrance_dose_right;
	}

	public Integer getAlert_cumulative_count() {
		return this.alert_cumulative_count;
	}

	public Integer getAlert_drl_count() {
		return this.alert_drl_count;
	}

	public Date getAlert_reviewed_date_initial() {
		return this.alert_reviewed_date_initial;
	}

	public Date getAlert_reviewed_date_last() {
		return this.alert_reviewed_date_last;
	}

	public Integer getAlert_series_count() {
		return this.alert_series_count;
	}

	public Integer getAlert_series_lexicon_count() {
		return this.alert_series_lexicon_count;
	}

	public Integer getAlert_study_count() {
		return this.alert_study_count;
	}

	public Integer getAlert_study_lexicon_count() {
		return this.alert_study_lexicon_count;
	}

	public Integer getAlert_study_protocol_count() {
		return this.alert_study_protocol_count;
	}

	public Double getAverage_breast_thickness() {
		return this.average_breast_thickness;
	}

	public Boolean getBreast_implant_present_both() {
		return this.breast_implant_present_both;
	}

	public Boolean getBreast_implant_present_left() {
		return this.breast_implant_present_left;
	}

	public Boolean getBreast_implant_present_right() {
		return this.breast_implant_present_right;
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

	public String getHour_interval() {
		return this.hour_interval;
	}

	public Long getId() {
		return this.id;
	}

	public Integer getImages_rejected() {
		return this.images_rejected;
	}

	public Integer getInstance_key() {
		return this.instance_key;
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

	public String getProtocol_name() {
		return this.protocol_name;
	}

	public Boolean getStudy_comment_difficult_procedure() {
		return this.study_comment_difficult_procedure;
	}

	public Boolean getStudy_comment_patient_weight() {
		return this.study_comment_patient_weight;
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

	public Integer getStudy_hour() {
		return this.study_hour;
	}

	public String getStudy_id() {
		return this.study_id;
	}

	public Integer getTime_slot() {
		return this.time_slot;
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

	public void setAccumulated_average_glandular_dose_both(final Double accumulated_average_glandular_dose_both) {
		this.accumulated_average_glandular_dose_both = accumulated_average_glandular_dose_both;
	}

	public void setAccumulated_average_glandular_dose_left(final Double accumulated_average_glandular_dose_left) {
		this.accumulated_average_glandular_dose_left = accumulated_average_glandular_dose_left;
	}

	public void setAccumulated_average_glandular_dose_right(final Double accumulated_average_glandular_dose_right) {
		this.accumulated_average_glandular_dose_right = accumulated_average_glandular_dose_right;
	}

	public void setAccumulated_entrance_dose_both(final Double accumulated_entrance_dose_both) {
		this.accumulated_entrance_dose_both = accumulated_entrance_dose_both;
	}

	public void setAccumulated_entrance_dose_left(final Double accumulated_entrance_dose_left) {
		this.accumulated_entrance_dose_left = accumulated_entrance_dose_left;
	}

	public void setAccumulated_entrance_dose_right(final Double accumulated_entrance_dose_right) {
		this.accumulated_entrance_dose_right = accumulated_entrance_dose_right;
	}

	public void setAlert_cumulative_count(final Integer alert_cumulative_count) {
		this.alert_cumulative_count = alert_cumulative_count;
	}

	public void setAlert_drl_count(final Integer alert_drl_count) {
		this.alert_drl_count = alert_drl_count;
	}

	public void setAlert_reviewed_date_initial(final Date alert_reviewed_date_initial) {
		this.alert_reviewed_date_initial = alert_reviewed_date_initial;
	}

	public void setAlert_reviewed_date_last(final Date alert_reviewed_date_last) {
		this.alert_reviewed_date_last = alert_reviewed_date_last;
	}

	public void setAlert_series_count(final Integer alert_series_count) {
		this.alert_series_count = alert_series_count;
	}

	public void setAlert_series_lexicon_count(final Integer alert_series_lexicon_count) {
		this.alert_series_lexicon_count = alert_series_lexicon_count;
	}

	public void setAlert_study_count(final Integer alert_study_count) {
		this.alert_study_count = alert_study_count;
	}

	public void setAlert_study_lexicon_count(final Integer alert_study_lexicon_count) {
		this.alert_study_lexicon_count = alert_study_lexicon_count;
	}

	public void setAlert_study_protocol_count(final Integer alert_study_protocol_count) {
		this.alert_study_protocol_count = alert_study_protocol_count;
	}

	public void setAverage_breast_thickness(final Double average_breast_thickness) {
		this.average_breast_thickness = average_breast_thickness;
	}

	public void setBreast_implant_present_both(final Boolean breast_implant_present_both) {
		this.breast_implant_present_both = breast_implant_present_both;
	}

	public void setBreast_implant_present_left(final Boolean breast_implant_present_left) {
		this.breast_implant_present_left = breast_implant_present_left;
	}

	public void setBreast_implant_present_right(final Boolean breast_implant_present_right) {
		this.breast_implant_present_right = breast_implant_present_right;
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

	public void setHour_interval(final String hour_interval) {
		this.hour_interval = hour_interval;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setImages_rejected(final Integer images_rejected) {
		this.images_rejected = images_rejected;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
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

	public void setProtocol_name(final String protocol_name) {
		this.protocol_name = protocol_name;
	}

	public void setStudy_comment_difficult_procedure(final Boolean study_comment_difficult_procedure) {
		this.study_comment_difficult_procedure = study_comment_difficult_procedure;
	}

	public void setStudy_comment_patient_weight(final Boolean study_comment_patient_weight) {
		this.study_comment_patient_weight = study_comment_patient_weight;
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

	public void setStudy_hour(final Integer study_hour) {
		this.study_hour = study_hour;
	}

	public void setStudy_id(final String study_id) {
		this.study_id = study_id;
	}

	public void setTime_slot(final Integer time_slot) {
		this.time_slot = time_slot;
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
