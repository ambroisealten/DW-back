/**
 * 
 */
package fr.alten.dw.model.beans;

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
public class Study implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2572382951123092563L;

	@Id
	private transient ObjectId _id;

	private int instance_key = 0;
	private string instance_name;
	private int id_group;
	private string group_name;
	private int id_division;
	private string division_name;
	private string study_instance_uid = "";
	private string study_comments;
	private byte alert_reviewed;
	private string sop_class_uid;
	private double patient_height;
	private string study_id;
	private byte study_comment_difficult_procedure;
	private string device_software_version;
	private byte study_comment_patient_weight;
	private double patient_weight;
	private Date study_datetime;
	private Date study_datetime_utc;
	private string accession_number;
	private string modality;
	private int ae_key;
	private long referring_physician_key;
	private long performing_physician_key;
	private long institution_key;
	private long patient_key;
	private long reading_physician_key;
	private long operator_key;
	private long requesting_physician_key;
	private long sd_key;
	private long old_sd_key;
	private long ssd_key;
	private long original_sd_key;
	private string detail_display_type;
	private string study_sop_instance_uid;
	private string modality_performed_procedure_step_uid;
	private string dosewatch_generated_uid;
	private int alert_cumulative_count;
	private int alert_cumulative_count_reviewed;
	private int alert_series_count;
	private int alert_series_count_reviewed;
	private int alert_study_count;
	private int alert_study_count_reviewed;
	private int alert_study_protocol_count;
	private int alert_study_protocol_count_reviewed;
	private int alert_study_lexicon_count;
	private int alert_study_lexicon_count_reviewed;
	private int alert_series_lexicon_count;
	private int alert_series_lexicon_count_reviewed;
	private int alert_drl_count;
	private int alert_drl_count_reviewed;
	private int alert_cumulative_count_unreviewed;
	private string clinical_history;
	private long parent_study_key;
	private long administering_technologist_key;
	private string patient_id;
	private long physical_patient_key;
	private int domain_key;
	private string patient_last_name;
	private string patient_sex;
	private Date patient_birth_date;
	private string patient_first_name;
	private string aet;
	private string institution_name;
	private string institution_department_name;
	private string facility_description;
	private string study_description_name;
	private long study_description_alias_of;
	private Date dt_last_update_dwh;
	private string nature_of_exam;
	private int facility_key;
	private string old_study_description;
	private string referring_physician_last_name;
	private string referring_physician_first_name;
	private string requesting_physician_last_name;
	private string requesting_physician_first_name;
	private string performing_physician_last_name;
	private string performing_physician_first_name;
	private string operator_last_name;
	private string operator_first_name;
	private string standard_study_description;
	private string patient_bmi;
	private string iqvote;
	private string ae_name;
	private string ae_device_groups;
	private string manufacturer_name;
	private string sdm_model;
	private string performed_ae_title;
	private double patient_age;
	private int total_study_last_month;
	private Date alert_reviewed_date_initial;
	private Date alert_reviewed_date_last;
	private string alert_reviewed_username_initial;
	private string alert_reviewed_username_last;
	private byte comment_provided;
	private Date study_date;
	private Date study_end_date;
	private int week_number;
	private Date first_day_of_week;
	private Date last_day_of_week;
	private string week_sort;
	private int day_number;
	private string day_name;
	private int study_hour;
	private string hour_interval;
	private int exam_duration_sched;
	private int exam_prep_time_before;
	private int exam_prep_time_after;
	private int patient_appointment_delay;
	private int patient_waiting_time;
	private int exam_duration;
	private int time_slot;
	private string referring_physician_full_name;
	private string referring_known_unknown;
	private string operator_full_name;
	private string operator_known_unknown;
	private string contrast_enhancement;
	private string indications;
	private int number_series;
	private Timestamp study_end_estimated;
	private Timestamp study_start_estimated;
	private string system_id;
	private int total_number_of_exposures;
	private string mpps_description;
	private string mpps_id;
	private string mpps_type;
	private Timestamp mpps_start_datetime;
	private Date study_end_mpps;
	private string patient_age_range;
	private int study_reopen_id = 1;
	private boolean had_threshold_setting;
	private short multi_alert_type = 0;
	private string reading_physician_first_name;
	private string reading_physician_last_name;
	private int alert_date_diff;
	private int exam_total_duration; 											

	
	public Study() {
		super();
	}
	
	
	public int getInstance_key() {
		return instance_key;
	}


	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
	}


	public string getInstance_name() {
		return instance_name;
	}


	public void setInstance_name(string instance_name) {
		this.instance_name = instance_name;
	}


	public int getId_group() {
		return id_group;
	}


	public void setId_group(int id_group) {
		this.id_group = id_group;
	}


	public string getGroup_name() {
		return group_name;
	}


	public void setGroup_name(string group_name) {
		this.group_name = group_name;
	}


	public int getId_division() {
		return id_division;
	}


	public void setId_division(int id_division) {
		this.id_division = id_division;
	}


	public string getDivision_name() {
		return division_name;
	}


	public void setDivision_name(string division_name) {
		this.division_name = division_name;
	}


	public string getStudy_instance_uid() {
		return study_instance_uid;
	}


	public void setStudy_instance_uid(string study_instance_uid) {
		this.study_instance_uid = study_instance_uid;
	}


	public string getStudy_comments() {
		return study_comments;
	}


	public void setStudy_comments(string study_comments) {
		this.study_comments = study_comments;
	}


	public byte getAlert_reviewed() {
		return alert_reviewed;
	}


	public void setAlert_reviewed(byte alert_reviewed) {
		this.alert_reviewed = alert_reviewed;
	}


	public string getSop_class_uid() {
		return sop_class_uid;
	}


	public void setSop_class_uid(string sop_class_uid) {
		this.sop_class_uid = sop_class_uid;
	}


	public double getPatient_height() {
		return patient_height;
	}


	public void setPatient_height(double patient_height) {
		this.patient_height = patient_height;
	}


	public string getStudy_id() {
		return study_id;
	}


	public void setStudy_id(string study_id) {
		this.study_id = study_id;
	}


	public byte getStudy_comment_difficult_procedure() {
		return study_comment_difficult_procedure;
	}


	public void setStudy_comment_difficult_procedure(byte study_comment_difficult_procedure) {
		this.study_comment_difficult_procedure = study_comment_difficult_procedure;
	}


	public string getDevice_software_version() {
		return device_software_version;
	}


	public void setDevice_software_version(string device_software_version) {
		this.device_software_version = device_software_version;
	}


	public byte getStudy_comment_patient_weight() {
		return study_comment_patient_weight;
	}


	public void setStudy_comment_patient_weight(byte study_comment_patient_weight) {
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


	public string getAccession_number() {
		return accession_number;
	}


	public void setAccession_number(string accession_number) {
		this.accession_number = accession_number;
	}


	public string getModality() {
		return modality;
	}


	public void setModality(string modality) {
		this.modality = modality;
	}


	public int getAe_key() {
		return ae_key;
	}


	public void setAe_key(int ae_key) {
		this.ae_key = ae_key;
	}


	public long getReferring_physician_key() {
		return referring_physician_key;
	}


	public void setReferring_physician_key(long referring_physician_key) {
		this.referring_physician_key = referring_physician_key;
	}


	public long getPerforming_physician_key() {
		return performing_physician_key;
	}


	public void setPerforming_physician_key(long performing_physician_key) {
		this.performing_physician_key = performing_physician_key;
	}


	public long getInstitution_key() {
		return institution_key;
	}


	public void setInstitution_key(long institution_key) {
		this.institution_key = institution_key;
	}


	public long getPatient_key() {
		return patient_key;
	}


	public void setPatient_key(long patient_key) {
		this.patient_key = patient_key;
	}


	public long getReading_physician_key() {
		return reading_physician_key;
	}


	public void setReading_physician_key(long reading_physician_key) {
		this.reading_physician_key = reading_physician_key;
	}


	public long getOperator_key() {
		return operator_key;
	}


	public void setOperator_key(long operator_key) {
		this.operator_key = operator_key;
	}


	public long getRequesting_physician_key() {
		return requesting_physician_key;
	}


	public void setRequesting_physician_key(long requesting_physician_key) {
		this.requesting_physician_key = requesting_physician_key;
	}


	public long getSd_key() {
		return sd_key;
	}


	public void setSd_key(long sd_key) {
		this.sd_key = sd_key;
	}


	public long getOld_sd_key() {
		return old_sd_key;
	}


	public void setOld_sd_key(long old_sd_key) {
		this.old_sd_key = old_sd_key;
	}


	public long getSsd_key() {
		return ssd_key;
	}


	public void setSsd_key(long ssd_key) {
		this.ssd_key = ssd_key;
	}


	public long getOriginal_sd_key() {
		return original_sd_key;
	}


	public void setOriginal_sd_key(long original_sd_key) {
		this.original_sd_key = original_sd_key;
	}


	public string getDetail_display_type() {
		return detail_display_type;
	}


	public void setDetail_display_type(string detail_display_type) {
		this.detail_display_type = detail_display_type;
	}


	public string getStudy_sop_instance_uid() {
		return study_sop_instance_uid;
	}


	public void setStudy_sop_instance_uid(string study_sop_instance_uid) {
		this.study_sop_instance_uid = study_sop_instance_uid;
	}


	public string getModality_performed_procedure_step_uid() {
		return modality_performed_procedure_step_uid;
	}


	public void setModality_performed_procedure_step_uid(string modality_performed_procedure_step_uid) {
		this.modality_performed_procedure_step_uid = modality_performed_procedure_step_uid;
	}


	public string getDosewatch_generated_uid() {
		return dosewatch_generated_uid;
	}


	public void setDosewatch_generated_uid(string dosewatch_generated_uid) {
		this.dosewatch_generated_uid = dosewatch_generated_uid;
	}


	public int getAlert_cumulative_count() {
		return alert_cumulative_count;
	}


	public void setAlert_cumulative_count(int alert_cumulative_count) {
		this.alert_cumulative_count = alert_cumulative_count;
	}


	public int getAlert_cumulative_count_reviewed() {
		return alert_cumulative_count_reviewed;
	}


	public void setAlert_cumulative_count_reviewed(int alert_cumulative_count_reviewed) {
		this.alert_cumulative_count_reviewed = alert_cumulative_count_reviewed;
	}


	public int getAlert_series_count() {
		return alert_series_count;
	}


	public void setAlert_series_count(int alert_series_count) {
		this.alert_series_count = alert_series_count;
	}


	public int getAlert_series_count_reviewed() {
		return alert_series_count_reviewed;
	}


	public void setAlert_series_count_reviewed(int alert_series_count_reviewed) {
		this.alert_series_count_reviewed = alert_series_count_reviewed;
	}


	public int getAlert_study_count() {
		return alert_study_count;
	}


	public void setAlert_study_count(int alert_study_count) {
		this.alert_study_count = alert_study_count;
	}


	public int getAlert_study_count_reviewed() {
		return alert_study_count_reviewed;
	}


	public void setAlert_study_count_reviewed(int alert_study_count_reviewed) {
		this.alert_study_count_reviewed = alert_study_count_reviewed;
	}


	public int getAlert_study_protocol_count() {
		return alert_study_protocol_count;
	}


	public void setAlert_study_protocol_count(int alert_study_protocol_count) {
		this.alert_study_protocol_count = alert_study_protocol_count;
	}


	public int getAlert_study_protocol_count_reviewed() {
		return alert_study_protocol_count_reviewed;
	}


	public void setAlert_study_protocol_count_reviewed(int alert_study_protocol_count_reviewed) {
		this.alert_study_protocol_count_reviewed = alert_study_protocol_count_reviewed;
	}


	public int getAlert_study_lexicon_count() {
		return alert_study_lexicon_count;
	}


	public void setAlert_study_lexicon_count(int alert_study_lexicon_count) {
		this.alert_study_lexicon_count = alert_study_lexicon_count;
	}


	public int getAlert_study_lexicon_count_reviewed() {
		return alert_study_lexicon_count_reviewed;
	}


	public void setAlert_study_lexicon_count_reviewed(int alert_study_lexicon_count_reviewed) {
		this.alert_study_lexicon_count_reviewed = alert_study_lexicon_count_reviewed;
	}


	public int getAlert_series_lexicon_count() {
		return alert_series_lexicon_count;
	}


	public void setAlert_series_lexicon_count(int alert_series_lexicon_count) {
		this.alert_series_lexicon_count = alert_series_lexicon_count;
	}


	public int getAlert_series_lexicon_count_reviewed() {
		return alert_series_lexicon_count_reviewed;
	}


	public void setAlert_series_lexicon_count_reviewed(int alert_series_lexicon_count_reviewed) {
		this.alert_series_lexicon_count_reviewed = alert_series_lexicon_count_reviewed;
	}


	public int getAlert_drl_count() {
		return alert_drl_count;
	}


	public void setAlert_drl_count(int alert_drl_count) {
		this.alert_drl_count = alert_drl_count;
	}


	public int getAlert_drl_count_reviewed() {
		return alert_drl_count_reviewed;
	}


	public void setAlert_drl_count_reviewed(int alert_drl_count_reviewed) {
		this.alert_drl_count_reviewed = alert_drl_count_reviewed;
	}


	public int getAlert_cumulative_count_unreviewed() {
		return alert_cumulative_count_unreviewed;
	}


	public void setAlert_cumulative_count_unreviewed(int alert_cumulative_count_unreviewed) {
		this.alert_cumulative_count_unreviewed = alert_cumulative_count_unreviewed;
	}


	public string getClinical_history() {
		return clinical_history;
	}


	public void setClinical_history(string clinical_history) {
		this.clinical_history = clinical_history;
	}


	public long getParent_study_key() {
		return parent_study_key;
	}


	public void setParent_study_key(long parent_study_key) {
		this.parent_study_key = parent_study_key;
	}


	public long getAdministering_technologist_key() {
		return administering_technologist_key;
	}


	public void setAdministering_technologist_key(long administering_technologist_key) {
		this.administering_technologist_key = administering_technologist_key;
	}


	public string getPatient_id() {
		return patient_id;
	}


	public void setPatient_id(string patient_id) {
		this.patient_id = patient_id;
	}


	public long getPhysical_patient_key() {
		return physical_patient_key;
	}


	public void setPhysical_patient_key(long physical_patient_key) {
		this.physical_patient_key = physical_patient_key;
	}


	public int getDomain_key() {
		return domain_key;
	}


	public void setDomain_key(int domain_key) {
		this.domain_key = domain_key;
	}


	public string getPatient_last_name() {
		return patient_last_name;
	}


	public void setPatient_last_name(string patient_last_name) {
		this.patient_last_name = patient_last_name;
	}


	public string getPatient_sex() {
		return patient_sex;
	}


	public void setPatient_sex(string patient_sex) {
		this.patient_sex = patient_sex;
	}


	public Date getPatient_birth_date() {
		return patient_birth_date;
	}


	public void setPatient_birth_date(Date patient_birth_date) {
		this.patient_birth_date = patient_birth_date;
	}


	public string getPatient_first_name() {
		return patient_first_name;
	}


	public void setPatient_first_name(string patient_first_name) {
		this.patient_first_name = patient_first_name;
	}


	public string getAet() {
		return aet;
	}


	public void setAet(string aet) {
		this.aet = aet;
	}


	public string getInstitution_name() {
		return institution_name;
	}


	public void setInstitution_name(string institution_name) {
		this.institution_name = institution_name;
	}


	public string getInstitution_department_name() {
		return institution_department_name;
	}


	public void setInstitution_department_name(string institution_department_name) {
		this.institution_department_name = institution_department_name;
	}


	public string getFacility_description() {
		return facility_description;
	}


	public void setFacility_description(string facility_description) {
		this.facility_description = facility_description;
	}


	public string getStudy_description_name() {
		return study_description_name;
	}


	public void setStudy_description_name(string study_description_name) {
		this.study_description_name = study_description_name;
	}


	public long getStudy_description_alias_of() {
		return study_description_alias_of;
	}


	public void setStudy_description_alias_of(long study_description_alias_of) {
		this.study_description_alias_of = study_description_alias_of;
	}


	public Date getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Date dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}


	public string getNature_of_exam() {
		return nature_of_exam;
	}


	public void setNature_of_exam(string nature_of_exam) {
		this.nature_of_exam = nature_of_exam;
	}


	public int getFacility_key() {
		return facility_key;
	}


	public void setFacility_key(int facility_key) {
		this.facility_key = facility_key;
	}


	public string getOld_study_description() {
		return old_study_description;
	}


	public void setOld_study_description(string old_study_description) {
		this.old_study_description = old_study_description;
	}


	public string getReferring_physician_last_name() {
		return referring_physician_last_name;
	}


	public void setReferring_physician_last_name(string referring_physician_last_name) {
		this.referring_physician_last_name = referring_physician_last_name;
	}


	public string getReferring_physician_first_name() {
		return referring_physician_first_name;
	}


	public void setReferring_physician_first_name(string referring_physician_first_name) {
		this.referring_physician_first_name = referring_physician_first_name;
	}


	public string getRequesting_physician_last_name() {
		return requesting_physician_last_name;
	}


	public void setRequesting_physician_last_name(string requesting_physician_last_name) {
		this.requesting_physician_last_name = requesting_physician_last_name;
	}


	public string getRequesting_physician_first_name() {
		return requesting_physician_first_name;
	}


	public void setRequesting_physician_first_name(string requesting_physician_first_name) {
		this.requesting_physician_first_name = requesting_physician_first_name;
	}


	public string getPerforming_physician_last_name() {
		return performing_physician_last_name;
	}


	public void setPerforming_physician_last_name(string performing_physician_last_name) {
		this.performing_physician_last_name = performing_physician_last_name;
	}


	public string getPerforming_physician_first_name() {
		return performing_physician_first_name;
	}


	public void setPerforming_physician_first_name(string performing_physician_first_name) {
		this.performing_physician_first_name = performing_physician_first_name;
	}


	public string getOperator_last_name() {
		return operator_last_name;
	}


	public void setOperator_last_name(string operator_last_name) {
		this.operator_last_name = operator_last_name;
	}


	public string getOperator_first_name() {
		return operator_first_name;
	}


	public void setOperator_first_name(string operator_first_name) {
		this.operator_first_name = operator_first_name;
	}


	public string getStandard_study_description() {
		return standard_study_description;
	}


	public void setStandard_study_description(string standard_study_description) {
		this.standard_study_description = standard_study_description;
	}


	public string getPatient_bmi() {
		return patient_bmi;
	}


	public void setPatient_bmi(string patient_bmi) {
		this.patient_bmi = patient_bmi;
	}


	public string getIqvote() {
		return iqvote;
	}


	public void setIqvote(string iqvote) {
		this.iqvote = iqvote;
	}


	public string getAe_name() {
		return ae_name;
	}


	public void setAe_name(string ae_name) {
		this.ae_name = ae_name;
	}


	public string getAe_device_groups() {
		return ae_device_groups;
	}


	public void setAe_device_groups(string ae_device_groups) {
		this.ae_device_groups = ae_device_groups;
	}


	public string getManufacturer_name() {
		return manufacturer_name;
	}


	public void setManufacturer_name(string manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}


	public string getSdm_model() {
		return sdm_model;
	}


	public void setSdm_model(string sdm_model) {
		this.sdm_model = sdm_model;
	}


	public string getPerformed_ae_title() {
		return performed_ae_title;
	}


	public void setPerformed_ae_title(string performed_ae_title) {
		this.performed_ae_title = performed_ae_title;
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


	public string getAlert_reviewed_username_initial() {
		return alert_reviewed_username_initial;
	}


	public void setAlert_reviewed_username_initial(string alert_reviewed_username_initial) {
		this.alert_reviewed_username_initial = alert_reviewed_username_initial;
	}


	public string getAlert_reviewed_username_last() {
		return alert_reviewed_username_last;
	}


	public void setAlert_reviewed_username_last(string alert_reviewed_username_last) {
		this.alert_reviewed_username_last = alert_reviewed_username_last;
	}


	public byte getComment_provided() {
		return comment_provided;
	}


	public void setComment_provided(byte comment_provided) {
		this.comment_provided = comment_provided;
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


	public Date getFirst_day_of_week() {
		return first_day_of_week;
	}


	public void setFirst_day_of_week(Date first_day_of_week) {
		this.first_day_of_week = first_day_of_week;
	}


	public Date getLast_day_of_week() {
		return last_day_of_week;
	}


	public void setLast_day_of_week(Date last_day_of_week) {
		this.last_day_of_week = last_day_of_week;
	}


	public string getWeek_sort() {
		return week_sort;
	}


	public void setWeek_sort(string week_sort) {
		this.week_sort = week_sort;
	}


	public int getDay_number() {
		return day_number;
	}


	public void setDay_number(int day_number) {
		this.day_number = day_number;
	}


	public string getDay_name() {
		return day_name;
	}


	public void setDay_name(string day_name) {
		this.day_name = day_name;
	}


	public int getStudy_hour() {
		return study_hour;
	}


	public void setStudy_hour(int study_hour) {
		this.study_hour = study_hour;
	}


	public string getHour_interval() {
		return hour_interval;
	}


	public void setHour_interval(string hour_interval) {
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


	public string getReferring_physician_full_name() {
		return referring_physician_full_name;
	}


	public void setReferring_physician_full_name(string referring_physician_full_name) {
		this.referring_physician_full_name = referring_physician_full_name;
	}


	public string getReferring_known_unknown() {
		return referring_known_unknown;
	}


	public void setReferring_known_unknown(string referring_known_unknown) {
		this.referring_known_unknown = referring_known_unknown;
	}


	public string getOperator_full_name() {
		return operator_full_name;
	}


	public void setOperator_full_name(string operator_full_name) {
		this.operator_full_name = operator_full_name;
	}


	public string getOperator_known_unknown() {
		return operator_known_unknown;
	}


	public void setOperator_known_unknown(string operator_known_unknown) {
		this.operator_known_unknown = operator_known_unknown;
	}


	public string getContrast_enhancement() {
		return contrast_enhancement;
	}


	public void setContrast_enhancement(string contrast_enhancement) {
		this.contrast_enhancement = contrast_enhancement;
	}


	public string getIndications() {
		return indications;
	}


	public void setIndications(string indications) {
		this.indications = indications;
	}


	public int getNumber_series() {
		return number_series;
	}


	public void setNumber_series(int number_series) {
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


	public string getSystem_id() {
		return system_id;
	}


	public void setSystem_id(string system_id) {
		this.system_id = system_id;
	}


	public int getTotal_number_of_exposures() {
		return total_number_of_exposures;
	}


	public void setTotal_number_of_exposures(int total_number_of_exposures) {
		this.total_number_of_exposures = total_number_of_exposures;
	}


	public string getMpps_description() {
		return mpps_description;
	}


	public void setMpps_description(string mpps_description) {
		this.mpps_description = mpps_description;
	}


	public string getMpps_id() {
		return mpps_id;
	}


	public void setMpps_id(string mpps_id) {
		this.mpps_id = mpps_id;
	}


	public string getMpps_type() {
		return mpps_type;
	}


	public void setMpps_type(string mpps_type) {
		this.mpps_type = mpps_type;
	}


	public Timestamp getMpps_start_datetime() {
		return mpps_start_datetime;
	}


	public void setMpps_start_datetime(Timestamp mpps_start_datetime) {
		this.mpps_start_datetime = mpps_start_datetime;
	}


	public Date getStudy_end_mpps() {
		return study_end_mpps;
	}


	public void setStudy_end_mpps(Date study_end_mpps) {
		this.study_end_mpps = study_end_mpps;
	}


	public string getPatient_age_range() {
		return patient_age_range;
	}


	public void setPatient_age_range(string patient_age_range) {
		this.patient_age_range = patient_age_range;
	}


	public int getStudy_reopen_id() {
		return study_reopen_id;
	}


	public void setStudy_reopen_id(int study_reopen_id) {
		this.study_reopen_id = study_reopen_id;
	}


	public boolean isHad_threshold_setting() {
		return had_threshold_setting;
	}


	public void setHad_threshold_setting(boolean had_threshold_setting) {
		this.had_threshold_setting = had_threshold_setting;
	}


	public short getMulti_alert_type() {
		return multi_alert_type;
	}


	public void setMulti_alert_type(short multi_alert_type) {
		this.multi_alert_type = multi_alert_type;
	}


	public string getReading_physician_first_name() {
		return reading_physician_first_name;
	}


	public void setReading_physician_first_name(string reading_physician_first_name) {
		this.reading_physician_first_name = reading_physician_first_name;
	}


	public string getReading_physician_last_name() {
		return reading_physician_last_name;
	}


	public void setReading_physician_last_name(string reading_physician_last_name) {
		this.reading_physician_last_name = reading_physician_last_name;
	}


	public int getAlert_date_diff() {
		return alert_date_diff;
	}


	public void setAlert_date_diff(int alert_date_diff) {
		this.alert_date_diff = alert_date_diff;
	}


	public int getExam_total_duration() {
		return exam_total_duration;
	}


	public void setExam_total_duration(int exam_total_duration) {
		this.exam_total_duration = exam_total_duration;
	}
	
}