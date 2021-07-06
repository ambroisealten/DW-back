/**
 *
 */
package fr.alten.dw.model.beans.Serie;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Thomas Decamp
 *
 */
@Entity
@Table(name = "dwh_serie_range")
public class Serie_range implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 4422944333192658771L;
	@Id
	@Column(name = "id")
	private Long id;
	private Integer instance_key;
	private Integer range_key;
	private String range_value;
	private Timestamp dt_last_update_dwh;
	private Integer range_order_key;

	public Serie_range() {
		super();
	}

	public Timestamp getDt_last_update_dwh() {
		return this.dt_last_update_dwh;
	}

	public Long getId() {
		return this.id;
	}

	public Integer getInstance_key() {
		return this.instance_key;
	}

	public Integer getRange_key() {
		return this.range_key;
	}

	public Integer getRange_order_key() {
		return this.range_order_key;
	}

	public String getRange_value() {
		return this.range_value;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setRange_key(final Integer range_key) {
		this.range_key = range_key;
	}

	public void setRange_order_key(final Integer range_order_key) {
		this.range_order_key = range_order_key;
	}

	public void setRange_value(final String range_value) {
		this.range_value = range_value;
	}

}
