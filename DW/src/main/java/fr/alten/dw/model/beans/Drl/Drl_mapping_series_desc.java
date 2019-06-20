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
@Table(name="dwh_drl_mapping_series_desc")
public class Drl_mapping_series_desc implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -4874794447116088106L;


	@Id
	@Column(name="id")
	private Integer drl_definition_key;
	private Integer instance_key;
	private Long series_desc_key;
	private String series_desc_name;
	private String series_desc_modality;
	private Timestamp dt_last_update_dwh;


	public Drl_mapping_series_desc() {
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


	public Long getSeries_desc_key() {
		return series_desc_key;
	}


	public String getSeries_desc_modality() {
		return series_desc_modality;
	}


	public String getSeries_desc_name() {
		return series_desc_name;
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


	public void setSeries_desc_key(final Long series_desc_key) {
		this.series_desc_key = series_desc_key;
	}


	public void setSeries_desc_modality(final String series_desc_modality) {
		this.series_desc_modality = series_desc_modality;
	}


	public void setSeries_desc_name(final String series_desc_name) {
		this.series_desc_name = series_desc_name;
	}


}
