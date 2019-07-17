/**
 *
 */
package fr.alten.dw.model.beans.Drl;

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
@Table(name = "dwh_drl_mapping_std_study_desc")
public class Drl_mapping_std_study_desc implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -7116173335716041624L;
	@Id
	@Column(name = "drl_definition_key")
	private Integer drl_definition_key;
	private Integer instance_key;
	private Long standard_study_description_key;
	private String standard_study_description_name;
	private String standard_study_description_modality;
	private Timestamp dt_last_update_dwh;

	public Drl_mapping_std_study_desc() {
		super();
	}

	public Integer getDrl_definition_key() {
		return this.drl_definition_key;
	}

	public Timestamp getDt_last_update_dwh() {
		return this.dt_last_update_dwh;
	}

	public Integer getInstance_key() {
		return this.instance_key;
	}

	public Long getStandard_study_description_key() {
		return this.standard_study_description_key;
	}

	public String getStandard_study_description_modality() {
		return this.standard_study_description_modality;
	}

	public String getStandard_study_description_name() {
		return this.standard_study_description_name;
	}

	public void setDrl_definition_key(final Integer drl_definition_key) {
		this.drl_definition_key = drl_definition_key;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setStandard_study_description_key(final Long standard_study_description_key) {
		this.standard_study_description_key = standard_study_description_key;
	}

	public void setStandard_study_description_modality(final String standard_study_description_modality) {
		this.standard_study_description_modality = standard_study_description_modality;
	}

	public void setStandard_study_description_name(final String standard_study_description_name) {
		this.standard_study_description_name = standard_study_description_name;
	}

}
