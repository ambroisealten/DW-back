/**
 * 
 */
package fr.alten.dw.model.beans.Study;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import org.springframework.data.annotation.Id;

import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 *
 */
public class Study_range implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8295177929748648932L;

	
	private Long id;
	private int instance_key;
	private int range_key;
	private String range_value;
	private Timestamp dt_last_update_dwh;
	private int range_order_key;
				
    public Study_range() {
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
	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}
	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
	public int getRange_order_key() {
		return range_order_key;
	}
	public void setRange_order_key(int range_order_key) {
		this.range_order_key = range_order_key;
	}

}
