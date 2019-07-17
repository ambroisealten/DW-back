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
@Table(name = "dwh_study_xa")
public class Study_xa implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -6464636260943917578L;

	@Id
	@Column(name = "id")
	private Long id;
	private Integer instance_key;
	private String instance_name;
	private Double patient_height;
	private String study_id;
	private Boolean study_comment_difficult_procedure;
	private Boolean study_comment_patient_weight;
	private Double patient_weight;
	private Timestamp study_datetime;
	private Timestamp study_datetime_utc;
	private String modality;
	private Integer alert_cumulative_count;
	private Integer alert_series_count;
	private Integer alert_study_count;
	private Integer alert_study_protocol_count;
	private Integer alert_series_lexicon_count;
	private Integer alert_study_lexicon_count;
	private Integer alert_drl_count;
	private String patient_id;
	private String patient_last_name;
	private String patient_sex;
	private Timestamp patient_birth_date;
	private Double patient_age;
	private String patient_first_name;
	private Timestamp study_end_datetime;
	private Double fluoro_dose_area_product_total;
	private String source_of_dose_information;
	private String nature_of_exam;
	private String alert_type;
	private Integer alert_triggered_study_dap_level_1;
	private Integer alert_triggered_study_dap_level_2;
	private Integer alert_triggered_study_ed_level_1;
	private Integer alert_triggered_study_ed_level_2;
	private Integer total_number_of_radio_frames;
	private Double total_time_of_fluoroscopy;
	private Integer total_number_of_exposures;
	private Integer total_study_last_month;
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
	private String patient_age_range;

	public Study_xa() {
		super();
	}

	public Integer getAlert_cumulative_count() {
		return this.alert_cumulative_count;
	}

	public Integer getAlert_drl_count() {
		return this.alert_drl_count;
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

	public Integer getAlert_triggered_study_dap_level_1() {
		return this.alert_triggered_study_dap_level_1;
	}

	public Integer getAlert_triggered_study_dap_level_2() {
		return this.alert_triggered_study_dap_level_2;
	}

	public Integer getAlert_triggered_study_ed_level_1() {
		return this.alert_triggered_study_ed_level_1;
	}

	public Integer getAlert_triggered_study_ed_level_2() {
		return this.alert_triggered_study_ed_level_2;
	}

	public String getAlert_type() {
		return this.alert_type;
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

	public Double getFluoro_dose_area_product_total() {
		return this.fluoro_dose_area_product_total;
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

	public String getSource_of_dose_information() {
		return this.source_of_dose_information;
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

	public Timestamp getStudy_end_datetime() {
		return this.study_end_datetime;
	}

	public Integer getStudy_hour() {
		return this.study_hour;
	}

	public String getStudy_id() {
		return this.study_id;
	}

	public Integer getTotal_number_of_exposures() {
		return this.total_number_of_exposures;
	}

	public Integer getTotal_number_of_radio_frames() {
		return this.total_number_of_radio_frames;
	}

	public Integer getTotal_study_last_month() {
		return this.total_study_last_month;
	}

	public Double getTotal_time_of_fluoroscopy() {
		return this.total_time_of_fluoroscopy;
	}

	public Integer getWeek_number() {
		return this.week_number;
	}

	public void setAlert_cumulative_count(final Integer alert_cumulative_count) {
		this.alert_cumulative_count = alert_cumulative_count;
	}

	public void setAlert_drl_count(final Integer alert_drl_count) {
		this.alert_drl_count = alert_drl_count;
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

	public void setAlert_triggered_study_dap_level_1(final Integer alert_triggered_study_dap_level_1) {
		this.alert_triggered_study_dap_level_1 = alert_triggered_study_dap_level_1;
	}

	public void setAlert_triggered_study_dap_level_2(final Integer alert_triggered_study_dap_level_2) {
		this.alert_triggered_study_dap_level_2 = alert_triggered_study_dap_level_2;
	}

	public void setAlert_triggered_study_ed_level_1(final Integer alert_triggered_study_ed_level_1) {
		this.alert_triggered_study_ed_level_1 = alert_triggered_study_ed_level_1;
	}

	public void setAlert_triggered_study_ed_level_2(final Integer alert_triggered_study_ed_level_2) {
		this.alert_triggered_study_ed_level_2 = alert_triggered_study_ed_level_2;
	}

	public void setAlert_type(final String alert_type) {
		this.alert_type = alert_type;
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

	public void setFluoro_dose_area_product_total(final Double fluoro_dose_area_product_total) {
		this.fluoro_dose_area_product_total = fluoro_dose_area_product_total;
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

	public void setSource_of_dose_information(final String source_of_dose_information) {
		this.source_of_dose_information = source_of_dose_information;
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

	public void setStudy_end_datetime(final Timestamp study_end_datetime) {
		this.study_end_datetime = study_end_datetime;
	}

	public void setStudy_hour(final Integer study_hour) {
		this.study_hour = study_hour;
	}

	public void setStudy_id(final String study_id) {
		this.study_id = study_id;
	}

	public void setTotal_number_of_exposures(final Integer total_number_of_exposures) {
		this.total_number_of_exposures = total_number_of_exposures;
	}

	public void setTotal_number_of_radio_frames(final Integer total_number_of_radio_frames) {
		this.total_number_of_radio_frames = total_number_of_radio_frames;
	}

	public void setTotal_study_last_month(final Integer total_study_last_month) {
		this.total_study_last_month = total_study_last_month;
	}

	public void setTotal_time_of_fluoroscopy(final Double total_time_of_fluoroscopy) {
		this.total_time_of_fluoroscopy = total_time_of_fluoroscopy;
	}

	public void setWeek_number(final Integer week_number) {
		this.week_number = week_number;
	}
}
