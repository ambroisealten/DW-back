/**
 * 
 */
package fr.alten.dw.model.beans.Serie;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 *
 */
public class Serie_range implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7013418949365086439L;


	private Long id;
	private int instance_key;
	private int range_key;
	private String range_value;
	private Timestamp dt_last_update_dwh;
	private int range_order_key;

	
	public Serie_range() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getInstance_key() {
		return instance_key;
	}


	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
	}


	public int getRange_key() {
		return range_key;
	}


	public void setRange_key(int range_key) {
		this.range_key = range_key;
	}


	public String getRange_value() {
		return range_value;
	}


	public void setRange_value(String range_value) {
		this.range_value = range_value;
	}


	public int getRange_order_key() {
		return range_order_key;
	}


	public void setRange_order_key(int range_order_key) {
		this.range_order_key = range_order_key;
	}
	
}
