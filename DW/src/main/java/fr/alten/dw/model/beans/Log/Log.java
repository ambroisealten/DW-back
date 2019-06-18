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
public class Log implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -22131190841446825L;

	
	private Long id;
	private int instance_key;
	private Timestamp log_date;
	private Long patient_key;
	private Long raised_alert_key;
	private Long raised_drl_alert_key;
	private Long raised_lexicon_alert_key;
	private Long physical_patient_key;
	private Timestamp dt_last_update_dwh;
	private int ae_key;
	private String severity;
	private String type;
	private String serphydose_user_key;
	private String study_key;
	private String message;
	private int facility_key;
	private String device_type;
	private String aet;
	private String ae_name;
	private String patient_id;
	private int domain_key;
	private String patient_last_name;
	private String patient_sex;
	private Timestamp patient_birth_date;
	private String patient_first_name;
	private String user_name;
	private String user_first_name;
	private String user_last_name;
	private String user_type;

			
	public Log() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getInstance_key() {
		return instance_key;
	}


	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
	}


	public Timestamp getLog_date() {
		return log_date;
	}


	public void setLog_date(Timestamp log_date) {
		this.log_date = log_date;
	}


	public Long getPatient_key() {
		return patient_key;
	}


	public void setPatient_key(Long patient_key) {
		this.patient_key = patient_key;
	}


	public Long getRaised_alert_key() {
		return raised_alert_key;
	}


	public void setRaised_alert_key(Long raised_alert_key) {
		this.raised_alert_key = raised_alert_key;
	}


	public Long getRaised_drl_alert_key() {
		return raised_drl_alert_key;
	}


	public void setRaised_drl_alert_key(Long raised_drl_alert_key) {
		this.raised_drl_alert_key = raised_drl_alert_key;
	}


	public Long getRaised_lexicon_alert_key() {
		return raised_lexicon_alert_key;
	}


	public void setRaised_lexicon_alert_key(Long raised_lexicon_alert_key) {
		this.raised_lexicon_alert_key = raised_lexicon_alert_key;
	}


	public Long getPhysical_patient_key() {
		return physical_patient_key;
	}


	public void setPhysical_patient_key(Long physical_patient_key) {
		this.physical_patient_key = physical_patient_key;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}


	public int getAe_key() {
		return ae_key;
	}


	public void setAe_key(int ae_key) {
		this.ae_key = ae_key;
	}


	public String getSeverity() {
		return severity;
	}


	public void setSeverity(String severity) {
		this.severity = severity;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSerphydose_user_key() {
		return serphydose_user_key;
	}


	public void setSerphydose_user_key(String serphydose_user_key) {
		this.serphydose_user_key = serphydose_user_key;
	}


	public String getStudy_key() {
		return study_key;
	}


	public void setStudy_key(String study_key) {
		this.study_key = study_key;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
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


	public String getPatient_id() {
		return patient_id;
	}


	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}


	public int getDomain_key() {
		return domain_key;
	}


	public void setDomain_key(int domain_key) {
		this.domain_key = domain_key;
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


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getUser_first_name() {
		return user_first_name;
	}


	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}


	public String getUser_last_name() {
		return user_last_name;
	}


	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}


	public String getUser_type() {
		return user_type;
	}


	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
}
