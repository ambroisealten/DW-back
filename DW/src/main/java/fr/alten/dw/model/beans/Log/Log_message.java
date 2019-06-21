/**
 *
 */
package fr.alten.dw.model.beans.Log;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Thomas Decamp
 */
@Entity
@Table(name = "dwh_log_message")
public class Log_message implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 124353101457447396L;
	@Id
	@Column(name = "id")
	private Integer id;
	private Integer instance_key;
	private String log_type;
	private Timestamp log_date;
	private String patient_id;
	private String ssde_calculation_status;
	private String message_type;
	private String forward_status;
	private String message_status;
	private String study_instance_uid;
	private Integer number_of_images;
	private String message_command;
	private String sop_instance_uid;
	private String sop_class_uid;
	private String study_status;
	private Integer parent_key;
	private Integer sequence;
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
	private Integer number_of_exams;
	private Integer ae_key;
	private Integer facility_key;
	private String device_type;
	private String aet;
	private String ae_name;
	private Integer domain_key;
	private Long physical_patient_key;
	private String patient_first_name;
	private String patient_last_name;
	private String patient_sex;
	private Timestamp patient_birth_date;
	private Timestamp dt_last_update_dwh;

	public Log_message() {
		super();
	}

	public Integer getAe_key() {
		return this.ae_key;
	}

	public String getAe_name() {
		return this.ae_name;
	}

	public String getAet() {
		return this.aet;
	}

	public String getDatabase_command() {
		return this.database_command;
	}

	public String getDevice_type() {
		return this.device_type;
	}

	public Integer getDomain_key() {
		return this.domain_key;
	}

	public Timestamp getDt_checked() {
		return this.dt_checked;
	}

	public Timestamp getDt_first_event() {
		return this.dt_first_event;
	}

	public Timestamp getDt_last_update_dwh() {
		return this.dt_last_update_dwh;
	}

	public Timestamp getDt_updated() {
		return this.dt_updated;
	}

	public String getError_code() {
		return this.error_code;
	}

	public String getError_label() {
		return this.error_label;
	}

	public Integer getFacility_key() {
		return this.facility_key;
	}

	public Timestamp getFile_date() {
		return this.file_date;
	}

	public String getForward_status() {
		return this.forward_status;
	}

	public Integer getId() {
		return this.id;
	}

	public Integer getInstance_key() {
		return this.instance_key;
	}

	public Timestamp getLog_date() {
		return this.log_date;
	}

	public String getLog_type() {
		return this.log_type;
	}

	public String getMarital_status() {
		return this.marital_status;
	}

	public String getMessage_command() {
		return this.message_command;
	}

	public String getMessage_error() {
		return this.message_error;
	}

	public String getMessage_identity() {
		return this.message_identity;
	}

	public String getMessage_segment() {
		return this.message_segment;
	}

	public String getMessage_status() {
		return this.message_status;
	}

	public String getMessage_status_dw() {
		return this.message_status_dw;
	}

	public String getMessage_status_sl() {
		return this.message_status_sl;
	}

	public String getMessage_type() {
		return this.message_type;
	}

	public Integer getNumber_of_exams() {
		return this.number_of_exams;
	}

	public Integer getNumber_of_images() {
		return this.number_of_images;
	}

	public Integer getParent_key() {
		return this.parent_key;
	}

	public Timestamp getPatient_birth_date() {
		return this.patient_birth_date;
	}

	public String getPatient_first_name() {
		return this.patient_first_name;
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

	public Long getPhysical_patient_key() {
		return this.physical_patient_key;
	}

	public Integer getSequence() {
		return this.sequence;
	}

	public String getSerie_instance_uid() {
		return this.serie_instance_uid;
	}

	public String getSop_class_uid() {
		return this.sop_class_uid;
	}

	public String getSop_instance_uid() {
		return this.sop_instance_uid;
	}

	public String getSsde_calculation_status() {
		return this.ssde_calculation_status;
	}

	public String getStudy_code() {
		return this.study_code;
	}

	public String getStudy_id() {
		return this.study_id;
	}

	public String getStudy_instance_uid() {
		return this.study_instance_uid;
	}

	public String getStudy_status() {
		return this.study_status;
	}

	public void setAe_key(final Integer ae_key) {
		this.ae_key = ae_key;
	}

	public void setAe_name(final String ae_name) {
		this.ae_name = ae_name;
	}

	public void setAet(final String aet) {
		this.aet = aet;
	}

	public void setDatabase_command(final String database_command) {
		this.database_command = database_command;
	}

	public void setDevice_type(final String device_type) {
		this.device_type = device_type;
	}

	public void setDomain_key(final Integer domain_key) {
		this.domain_key = domain_key;
	}

	public void setDt_checked(final Timestamp dt_checked) {
		this.dt_checked = dt_checked;
	}

	public void setDt_first_event(final Timestamp dt_first_event) {
		this.dt_first_event = dt_first_event;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setDt_updated(final Timestamp dt_updated) {
		this.dt_updated = dt_updated;
	}

	public void setError_code(final String error_code) {
		this.error_code = error_code;
	}

	public void setError_label(final String error_label) {
		this.error_label = error_label;
	}

	public void setFacility_key(final Integer facility_key) {
		this.facility_key = facility_key;
	}

	public void setFile_date(final Timestamp file_date) {
		this.file_date = file_date;
	}

	public void setForward_status(final String forward_status) {
		this.forward_status = forward_status;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setLog_date(final Timestamp log_date) {
		this.log_date = log_date;
	}

	public void setLog_type(final String log_type) {
		this.log_type = log_type;
	}

	public void setMarital_status(final String marital_status) {
		this.marital_status = marital_status;
	}

	public void setMessage_command(final String message_command) {
		this.message_command = message_command;
	}

	public void setMessage_error(final String message_error) {
		this.message_error = message_error;
	}

	public void setMessage_identity(final String message_identity) {
		this.message_identity = message_identity;
	}

	public void setMessage_segment(final String message_segment) {
		this.message_segment = message_segment;
	}

	public void setMessage_status(final String message_status) {
		this.message_status = message_status;
	}

	public void setMessage_status_dw(final String message_status_dw) {
		this.message_status_dw = message_status_dw;
	}

	public void setMessage_status_sl(final String message_status_sl) {
		this.message_status_sl = message_status_sl;
	}

	public void setMessage_type(final String message_type) {
		this.message_type = message_type;
	}

	public void setNumber_of_exams(final Integer number_of_exams) {
		this.number_of_exams = number_of_exams;
	}

	public void setNumber_of_images(final Integer number_of_images) {
		this.number_of_images = number_of_images;
	}

	public void setParent_key(final Integer parent_key) {
		this.parent_key = parent_key;
	}

	public void setPatient_birth_date(final Timestamp patient_birth_date) {
		this.patient_birth_date = patient_birth_date;
	}

	public void setPatient_first_name(final String patient_first_name) {
		this.patient_first_name = patient_first_name;
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

	public void setPhysical_patient_key(final Long physical_patient_key) {
		this.physical_patient_key = physical_patient_key;
	}

	public void setSequence(final Integer sequence) {
		this.sequence = sequence;
	}

	public void setSerie_instance_uid(final String serie_instance_uid) {
		this.serie_instance_uid = serie_instance_uid;
	}

	public void setSop_class_uid(final String sop_class_uid) {
		this.sop_class_uid = sop_class_uid;
	}

	public void setSop_instance_uid(final String sop_instance_uid) {
		this.sop_instance_uid = sop_instance_uid;
	}

	public void setSsde_calculation_status(final String ssde_calculation_status) {
		this.ssde_calculation_status = ssde_calculation_status;
	}

	public void setStudy_code(final String study_code) {
		this.study_code = study_code;
	}

	public void setStudy_id(final String study_id) {
		this.study_id = study_id;
	}

	public void setStudy_instance_uid(final String study_instance_uid) {
		this.study_instance_uid = study_instance_uid;
	}

	public void setStudy_status(final String study_status) {
		this.study_status = study_status;
	}

}
