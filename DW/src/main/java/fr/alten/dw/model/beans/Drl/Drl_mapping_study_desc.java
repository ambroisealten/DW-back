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
@Table(name = "dwh_drl_mapping_study_desc")
public class Drl_mapping_study_desc implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 2271280057886148697L;
	@Id
	@Column(name = "drl_definition_key")
	private Integer drl_definition_key;
	private Integer instance_key;
	private Long study_description_key;
	private String study_description_name;
	private String study_description_modality;
	private Timestamp dt_last_update_dwh;

	public Drl_mapping_study_desc() {
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

	public Long getStudy_description_key() {
		return this.study_description_key;
	}

	public String getStudy_description_modality() {
		return this.study_description_modality;
	}

	public String getStudy_description_name() {
		return this.study_description_name;
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

	public void setStudy_description_key(final Long study_description_key) {
		this.study_description_key = study_description_key;
	}

	public void setStudy_description_modality(final String study_description_modality) {
		this.study_description_modality = study_description_modality;
	}

	public void setStudy_description_name(final String study_description_name) {
		this.study_description_name = study_description_name;
	}

}
