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
@Table(name = "dwh_log")
public class Log implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -2789610530310529869L;
	@Id
	@Column(name = "id")
	private Long id;
	private Integer instance_key;
	private Timestamp log_date;
	private Long patient_key;
	private Long raised_alert_key;
	private Long raised_drl_alert_key;
	private Long raised_lexicon_alert_key;
	private Long physical_patient_key;
	private Timestamp dt_last_update_dwh;
	private Integer ae_key;
	private String severity;
	private String type;
	private String serphydose_user_key;
	private String study_key;
	private String message;
	private Integer facility_key;
	private String device_type;
	private String aet;
	private String ae_name;
	private String patient_id;
	private Integer domain_key;
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

	public Integer getAe_key() {
		return this.ae_key;
	}

	public String getAe_name() {
		return this.ae_name;
	}

	public String getAet() {
		return this.aet;
	}

	public String getDevice_type() {
		return this.device_type;
	}

	public Integer getDomain_key() {
		return this.domain_key;
	}

	public Timestamp getDt_last_update_dwh() {
		return this.dt_last_update_dwh;
	}

	public Integer getFacility_key() {
		return this.facility_key;
	}

	public Long getId() {
		return this.id;
	}

	public Integer getInstance_key() {
		return this.instance_key;
	}

	public Timestamp getLog_date() {
		return this.log_date;
	}

	public String getMessage() {
		return this.message;
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

	public Long getPatient_key() {
		return this.patient_key;
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

	public Long getRaised_alert_key() {
		return this.raised_alert_key;
	}

	public Long getRaised_drl_alert_key() {
		return this.raised_drl_alert_key;
	}

	public Long getRaised_lexicon_alert_key() {
		return this.raised_lexicon_alert_key;
	}

	public String getSerphydose_user_key() {
		return this.serphydose_user_key;
	}

	public String getSeverity() {
		return this.severity;
	}

	public String getStudy_key() {
		return this.study_key;
	}

	public String getType() {
		return this.type;
	}

	public String getUser_first_name() {
		return this.user_first_name;
	}

	public String getUser_last_name() {
		return this.user_last_name;
	}

	public String getUser_name() {
		return this.user_name;
	}

	public String getUser_type() {
		return this.user_type;
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

	public void setDevice_type(final String device_type) {
		this.device_type = device_type;
	}

	public void setDomain_key(final Integer domain_key) {
		this.domain_key = domain_key;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setFacility_key(final Integer facility_key) {
		this.facility_key = facility_key;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setLog_date(final Timestamp log_date) {
		this.log_date = log_date;
	}

	public void setMessage(final String message) {
		this.message = message;
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

	public void setPatient_key(final Long patient_key) {
		this.patient_key = patient_key;
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

	public void setRaised_alert_key(final Long raised_alert_key) {
		this.raised_alert_key = raised_alert_key;
	}

	public void setRaised_drl_alert_key(final Long raised_drl_alert_key) {
		this.raised_drl_alert_key = raised_drl_alert_key;
	}

	public void setRaised_lexicon_alert_key(final Long raised_lexicon_alert_key) {
		this.raised_lexicon_alert_key = raised_lexicon_alert_key;
	}

	public void setSerphydose_user_key(final String serphydose_user_key) {
		this.serphydose_user_key = serphydose_user_key;
	}

	public void setSeverity(final String severity) {
		this.severity = severity;
	}

	public void setStudy_key(final String study_key) {
		this.study_key = study_key;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public void setUser_first_name(final String user_first_name) {
		this.user_first_name = user_first_name;
	}

	public void setUser_last_name(final String user_last_name) {
		this.user_last_name = user_last_name;
	}

	public void setUser_name(final String user_name) {
		this.user_name = user_name;
	}

	public void setUser_type(final String user_type) {
		this.user_type = user_type;
	}
}
