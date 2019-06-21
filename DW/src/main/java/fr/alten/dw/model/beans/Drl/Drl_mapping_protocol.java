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
@Table(name = "dwh_drl_mapping_protocol")
public class Drl_mapping_protocol implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -940381350281072106L;
	@Id
	@Column(name = "drl_definition_key")
	private Integer drl_definition_key;
	private Integer instance_key;
	private Long protocol_key;
	private String protocol_name;
	private String protocol_modality;
	private Timestamp dt_last_update_dwh;

	public Drl_mapping_protocol() {
		super();
	}

	public Integer getDrl_definition_key() {
		return drl_definition_key;
	}

	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}

	public Integer getInstance_key() {
		return instance_key;
	}

	public Long getProtocol_key() {
		return protocol_key;
	}

	public String getProtocol_modality() {
		return protocol_modality;
	}

	public String getProtocol_name() {
		return protocol_name;
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

	public void setProtocol_key(final Long protocol_key) {
		this.protocol_key = protocol_key;
	}

	public void setProtocol_modality(final String protocol_modality) {
		this.protocol_modality = protocol_modality;
	}

	public void setProtocol_name(final String protocol_name) {
		this.protocol_name = protocol_name;
	}

}
