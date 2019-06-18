/**
 * 
 */
package fr.alten.dw.model.beans.Log;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 */
public class Log_message implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4633416135234406710L;


	private int id;
	private int instance_key;
	private String log_type;
	private Timestamp log_date;
	private String patient_id;
	private String ssde_calculation_status;
	private String message_type;
	private String forward_status;
	private String message_status;
	private String study_instance_uid;
	private int number_of_images;
	private String message_command;
	private String sop_instance_uid;
	private String sop_class_uid;
	private String study_status;
	private int parent_key;
	private int sequence;
	private Timestamp file_date;
	private String serie_instance_uid;
	private String message_status_sl;
	private String message_status_dw;
	private String message_error;
	private String message_segment;
	private String message_identity;
	private String error_code;
	private String error_label;
	private String database_command;
	private String marital_status;
	private String study_id;
	private String study_code;
	private Timestamp dt_updated;
	private Timestamp dt_checked;
	private Timestamp dt_first_event;
	private int number_of_exams;
	private int ae_key;
	private int facility_key;
	private String device_type;
	private String aet;
	private String ae_name;
	private int domain_key;
	private Long physical_patient_key;
	private String patient_first_name;
	private String patient_last_name;
	private String patient_sex;
	private Timestamp patient_birth_date;
	private Timestamp dt_last_update_dwh;

	
	public Log_message() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getInstance_key() {
		return instance_key;
	}


	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
	}


	public String getLog_type() {
		return log_type;
	}


	public void setLog_type(String log_type) {
		this.log_type = log_type;
	}


	public Timestamp getLog_date() {
		return log_date;
	}


	public void setLog_date(Timestamp log_date) {
		this.log_date = log_date;
	}


	public String getPatient_id() {
		return patient_id;
	}


	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}


	public String getSsde_calculation_status() {
		return ssde_calculation_status;
	}


	public void setSsde_calculation_status(String ssde_calculation_status) {
		this.ssde_calculation_status = ssde_calculation_status;
	}


	public String getMessage_type() {
		return message_type;
	}


	public void setMessage_type(String message_type) {
		this.message_type = message_type;
	}


	public String getForward_status() {
		return forward_status;
	}


	public void setForward_status(String forward_status) {
		this.forward_status = forward_status;
	}


	public String getMessage_status() {
		return message_status;
	}


	public void setMessage_status(String message_status) {
		this.message_status = message_status;
	}


	public String getStudy_instance_uid() {
		return study_instance_uid;
	}


	public void setStudy_instance_uid(String study_instance_uid) {
		this.study_instance_uid = study_instance_uid;
	}


	public int getNumber_of_images() {
		return number_of_images;
	}


	public void setNumber_of_images(int number_of_images) {
		this.number_of_images = number_of_images;
	}


	public String getMessage_command() {
		return message_command;
	}


	public void setMessage_command(String message_command) {
		this.message_command = message_command;
	}


	public String getSop_instance_uid() {
		return sop_instance_uid;
	}


	public void setSop_instance_uid(String sop_instance_uid) {
		this.sop_instance_uid = sop_instance_uid;
	}


	public String getSop_class_uid() {
		return sop_class_uid;
	}


	public void setSop_class_uid(String sop_class_uid) {
		this.sop_class_uid = sop_class_uid;
	}


	public String getStudy_status() {
		return study_status;
	}


	public void setStudy_status(String study_status) {
		this.study_status = study_status;
	}


	public int getParent_key() {
		return parent_key;
	}


	public void setParent_key(int parent_key) {
		this.parent_key = parent_key;
	}


	public int getSequence() {
		return sequence;
	}


	public void setSequence(int sequence) {
		this.sequence = sequence;
	}


	public Timestamp getFile_date() {
		return file_date;
	}


	public void setFile_date(Timestamp file_date) {
		this.file_date = file_date;
	}


	public String getSerie_instance_uid() {
		return serie_instance_uid;
	}


	public void setSerie_instance_uid(String serie_instance_uid) {
		this.serie_instance_uid = serie_instance_uid;
	}


	public String getMessage_status_sl() {
		return message_status_sl;
	}


	public void setMessage_status_sl(String message_status_sl) {
		this.message_status_sl = message_status_sl;
	}


	public String getMessage_status_dw() {
		return message_status_dw;
	}


	public void setMessage_status_dw(String message_status_dw) {
		this.message_status_dw = message_status_dw;
	}


	public String getMessage_error() {
		return message_error;
	}


	public void setMessage_error(String message_error) {
		this.message_error = message_error;
	}


	public String getMessage_segment() {
		return message_segment;
	}


	public void setMessage_segment(String message_segment) {
		this.message_segment = message_segment;
	}


	public String getMessage_identity() {
		return message_identity;
	}


	public void setMessage_identity(String message_identity) {
		this.message_identity = message_identity;
	}


	public String getError_code() {
		return error_code;
	}


	public void setError_code(String error_code) {
		this.error_code = error_code;
	}


	public String getError_label() {
		return error_label;
	}


	public void setError_label(String error_label) {
		this.error_label = error_label;
	}


	public String getDatabase_command() {
		return database_command;
	}


	public void setDatabase_command(String database_command) {
		this.database_command = database_command;
	}


	public String getMarital_status() {
		return marital_status;
	}


	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}


	public String getStudy_id() {
		return study_id;
	}


	public void setStudy_id(String study_id) {
		this.study_id = study_id;
	}


	public String getStudy_code() {
		return study_code;
	}


	public void setStudy_code(String study_code) {
		this.study_code = study_code;
	}


	public Timestamp getDt_updated() {
		return dt_updated;
	}


	public void setDt_updated(Timestamp dt_updated) {
		this.dt_updated = dt_updated;
	}


	public Timestamp getDt_checked() {
		return dt_checked;
	}


	public void setDt_checked(Timestamp dt_checked) {
		this.dt_checked = dt_checked;
	}


	public Timestamp getDt_first_event() {
		return dt_first_event;
	}


	public void setDt_first_event(Timestamp dt_first_event) {
		this.dt_first_event = dt_first_event;
	}


	public int getNumber_of_exams() {
		return number_of_exams;
	}


	public void setNumber_of_exams(int number_of_exams) {
		this.number_of_exams = number_of_exams;
	}


	public int getAe_key() {
		return ae_key;
	}


	public void setAe_key(int ae_key) {
		this.ae_key = ae_key;
	}


	public int getFacility_key() {
		return facility_key;
	}


	public void setFacility_key(int facility_key) {
		this.facility_key = facility_key;
	}


	public String getDevice_type() {
		return device_type;
	}


	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}


	public String getAet() {
		return aet;
	}


	public void setAet(String aet) {
		this.aet = aet;
	}


	public String getAe_name() {
		return ae_name;
	}


	public void setAe_name(String ae_name) {
		this.ae_name = ae_name;
	}


	public int getDomain_key() {
		return domain_key;
	}


	public void setDomain_key(int domain_key) {
		this.domain_key = domain_key;
	}


	public Long getPhysical_patient_key() {
		return physical_patient_key;
	}


	public void setPhysical_patient_key(Long physical_patient_key) {
		this.physical_patient_key = physical_patient_key;
	}


	public String getPatient_first_name() {
		return patient_first_name;
	}


	public void setPatient_first_name(String patient_first_name) {
		this.patient_first_name = patient_first_name;
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


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
	
	
}
