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

import fr.alten.dw.model.beans.Data;

/**
 * 
 * @author Thomas Decamp
 */
@Entity
@Table(name="dwh_lexicon")
public class Lexicon extends Data implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -310434008802129054L;

	@Id
	@Column(name="id")
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


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getInstance_key() {
		return instance_key;
	}


	public void setInstance_key(Integer instance_key) {
		this.instance_key = instance_key;
	}


	public Integer getFacility_key() {
		return facility_key;
	}


	public void setFacility_key(Integer facility_key) {
		this.facility_key = facility_key;
	}


	public String getDtype() {
		return dtype;
	}


	public void setDtype(String dtype) {
		this.dtype = dtype;
	}


	public String getField1() {
		return field1;
	}


	public void setField1(String field1) {
		this.field1 = field1;
	}


	public String getField2() {
		return field2;
	}


	public void setField2(String field2) {
		this.field2 = field2;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
}
