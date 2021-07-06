
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
@Table(name = "dwh_drl_definition_series_type ")
public class Drl_definition_series_type implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -5575308636870801119L;
	@Id
	@Column(name = "drl_definition_key")
	private Integer drl_definition_key;
	private Integer instance_key;
	private Long series_type_key;
	private String series_type;
	private String series_type_modality;
	private Timestamp dt_last_update_dwh;

	public Drl_definition_series_type() {
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

	public String getSeries_type() {
		return this.series_type;
	}

	public Long getSeries_type_key() {
		return this.series_type_key;
	}

	public String getSeries_type_modality() {
		return this.series_type_modality;
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

	public void setSeries_type(final String series_type) {
		this.series_type = series_type;
	}

	public void setSeries_type_key(final Long series_type_key) {
		this.series_type_key = series_type_key;
	}

	public void setSeries_type_modality(final String series_type_modality) {
		this.series_type_modality = series_type_modality;
	}

}
