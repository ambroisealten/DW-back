/**
 * 
 */
package fr.alten.dw.model.beans.Lexicon;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 */
public class Lexicon_alert_criteria implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7021684555622374775L;


	private int instance_key;
	private int id;
	private int facility_key;
	private double limit_value_low;
	private double limit_value_high;
	private String criteria_name;
	private String criteria_class;
	private String criteria_value;
	private Timestamp dt_last_update_dwh;

	
	public Lexicon_alert_criteria() {
		super();
	}


	public int getInstance_key() {
		return instance_key;
	}


	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getFacility_key() {
		return facility_key;
	}


	public void setFacility_key(int facility_key) {
		this.facility_key = facility_key;
	}


	public double getLimit_value_low() {
		return limit_value_low;
	}


	public void setLimit_value_low(double limit_value_low) {
		this.limit_value_low = limit_value_low;
	}


	public double getLimit_value_high() {
		return limit_value_high;
	}


	public void setLimit_value_high(double limit_value_high) {
		this.limit_value_high = limit_value_high;
	}


	public String getCriteria_name() {
		return criteria_name;
	}


	public void setCriteria_name(String criteria_name) {
		this.criteria_name = criteria_name;
	}


	public String getCriteria_class() {
		return criteria_class;
	}


	public void setCriteria_class(String criteria_class) {
		this.criteria_class = criteria_class;
	}


	public String getCriteria_value() {
		return criteria_value;
	}


	public void setCriteria_value(String criteria_value) {
		this.criteria_value = criteria_value;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
	
}
