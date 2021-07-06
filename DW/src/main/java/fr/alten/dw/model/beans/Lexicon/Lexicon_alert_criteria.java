/**
 *
 */
package fr.alten.dw.model.beans.Lexicon;

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
@Table(name = "dwh_lexicon_alert_criteria")
public class Lexicon_alert_criteria implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -7186314300030828590L;
	private Integer instance_key;
	@Id
	@Column(name = "id")
	private Integer id;
	private Integer facility_key;
	private Double limit_value_low;
	private Double limit_value_high;
	private String criteria_name;
	private String criteria_class;
	private String criteria_value;
	private Timestamp dt_last_update_dwh;

	public Lexicon_alert_criteria() {
		super();
	}

	public String getCriteria_class() {
		return this.criteria_class;
	}

	public String getCriteria_name() {
		return this.criteria_name;
	}

	public String getCriteria_value() {
		return this.criteria_value;
	}

	public Timestamp getDt_last_update_dwh() {
		return this.dt_last_update_dwh;
	}

	public Integer getFacility_key() {
		return this.facility_key;
	}

	public Integer getId() {
		return this.id;
	}

	public Integer getInstance_key() {
		return this.instance_key;
	}

	public Double getLimit_value_high() {
		return this.limit_value_high;
	}

	public Double getLimit_value_low() {
		return this.limit_value_low;
	}

	public void setCriteria_class(final String criteria_class) {
		this.criteria_class = criteria_class;
	}

	public void setCriteria_name(final String criteria_name) {
		this.criteria_name = criteria_name;
	}

	public void setCriteria_value(final String criteria_value) {
		this.criteria_value = criteria_value;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setFacility_key(final Integer facility_key) {
		this.facility_key = facility_key;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setLimit_value_high(final Double limit_value_high) {
		this.limit_value_high = limit_value_high;
	}

	public void setLimit_value_low(final Double limit_value_low) {
		this.limit_value_low = limit_value_low;
	}

}
