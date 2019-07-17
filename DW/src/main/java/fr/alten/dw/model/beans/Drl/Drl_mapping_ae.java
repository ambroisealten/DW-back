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
@Table(name = "dwh_drl_mapping_ae")
public class Drl_mapping_ae implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -9209706517655536150L;
	@Id
	@Column(name = "drl_definition_key")
	private Integer drl_definition_key;
	private Integer instance_key;
	private Long ae_key;
	private String aet;
	private Timestamp dt_last_update_dwh;

	public Drl_mapping_ae() {
		super();
	}

	public Long getAe_key() {
		return this.ae_key;
	}

	public String getAet() {
		return this.aet;
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

	public void setAe_key(final Long ae_key) {
		this.ae_key = ae_key;
	}

	public void setAet(final String aet) {
		this.aet = aet;
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

}
