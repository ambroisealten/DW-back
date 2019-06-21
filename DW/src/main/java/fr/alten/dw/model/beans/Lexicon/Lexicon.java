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
@Table(name = "dwh_lexicon")
public class Lexicon implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 8445427379613648232L;
	@Id
	@Column(name = "id")
	private Long id;
	private Integer instance_key;
	private Integer facility_key;
	private String dtype;
	private String field1;
	private String field2;
	private Timestamp dt_last_update_dwh;

	public Lexicon() {
		super();
	}

	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}

	public String getDtype() {
		return dtype;
	}

	public Integer getFacility_key() {
		return facility_key;
	}

	public String getField1() {
		return field1;
	}

	public String getField2() {
		return field2;
	}

	public Long getId() {
		return id;
	}

	public Integer getInstance_key() {
		return instance_key;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setDtype(final String dtype) {
		this.dtype = dtype;
	}

	public void setFacility_key(final Integer facility_key) {
		this.facility_key = facility_key;
	}

	public void setField1(final String field1) {
		this.field1 = field1;
	}

	public void setField2(final String field2) {
		this.field2 = field2;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}
}
