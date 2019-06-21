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
@Table(name="dwh_study")
public class Study implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2572382951123092563L;

	@Id
	@Column(name="id")
	private Long id;
	private Integer instance_key = 0;
	private String instance_name;
	private Double patient_height;
	private String study_id;
	private Byte study_comment_difficult_procedure;
	private Double patient_weight;
	private Date study_datetime;
	private String patient_id;
	private String patient_last_name;
	private String patient_sex;
	private Date patient_birth_date;
	private String patient_first_name;
	private String nature_of_exam;
	private Double patient_age;
	private Date study_date;
	private Date study_end_date;
	private Integer week_number;
	private Integer day_number;
	private Integer study_hour;
	private String hour_interval;
	private Integer exam_duration_sched;
	private Integer exam_prep_time_before;
	private Integer exam_prep_time_after;
	private Integer exam_duration;
	private String contrast_enhancement;
	private Integer number_series;
	private Timestamp study_end_estimated;
	private Timestamp study_start_estimated;
	private Integer total_number_of_exposures;
	private String patient_age_range;
	private Integer alert_date_diff;
	private Integer exam_total_duration; 											

	
	public Study() {
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


	public String getStudy_id() {
		return study_id;
	}


	public void setStudy_id(String study_id) {
		this.study_id = study_id;
	}


	public Byte getStudy_comment_difficult_procedure() {
		return study_comment_difficult_procedure;
	}


	public void setStudy_comment_difficult_procedure(Byte study_comment_difficult_procedure) {
		this.study_comment_difficult_procedure = study_comment_difficult_procedure;
	}


	public Double getPatient_weight() {
		return patient_weight;
	}


	public void setPatient_weight(Double patient_weight) {
		this.patient_weight = patient_weight;
	}


	public Date getStudy_datetime() {
		return study_datetime;
	}


	public void setStudy_datetime(Date study_datetime) {
		this.study_datetime = study_datetime;
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


	public Integer getExam_duration() {
		return exam_duration;
	}


	public void setExam_duration(Integer exam_duration) {
		this.exam_duration = exam_duration;
	}


	public String getContrast_enhancement() {
		return contrast_enhancement;
	}


	public void setContrast_enhancement(String contrast_enhancement) {
		this.contrast_enhancement = contrast_enhancement;
	}


	public Integer getNumber_series() {
		return number_series;
	}


	public void setNumber_series(Integer number_series) {
		this.number_series = number_series;
	}


	public Timestamp getStudy_end_estimated() {
		return study_end_estimated;
	}


	public void setStudy_end_estimated(Timestamp study_end_estimated) {
		this.study_end_estimated = study_end_estimated;
	}


	public Timestamp getStudy_start_estimated() {
		return study_start_estimated;
	}


	public void setStudy_start_estimated(Timestamp study_start_estimated) {
		this.study_start_estimated = study_start_estimated;
	}


	public Integer getTotal_number_of_exposures() {
		return total_number_of_exposures;
	}


	public void setTotal_number_of_exposures(Integer total_number_of_exposures) {
		this.total_number_of_exposures = total_number_of_exposures;
	}


	public String getPatient_age_range() {
		return patient_age_range;
	}


	public void setPatient_age_range(String patient_age_range) {
		this.patient_age_range = patient_age_range;
	}


	public Integer getAlert_date_diff() {
		return alert_date_diff;
	}


	public void setAlert_date_diff(Integer alert_date_diff) {
		this.alert_date_diff = alert_date_diff;
	}


	public Integer getExam_total_duration() {
		return exam_total_duration;
	}


	public void setExam_total_duration(Integer exam_total_duration) {
		this.exam_total_duration = exam_total_duration;
	}
}