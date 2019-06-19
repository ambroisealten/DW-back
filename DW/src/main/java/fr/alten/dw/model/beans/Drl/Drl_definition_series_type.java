/**
 * 
 */
package fr.alten.dw.model.beans.Drl;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 */

public class Drl_definition_series_type implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3727494014363636093L;

	
	
	private int instance_key;
	private int id;
	private String exam_name;
	private String type;
	private int facility_key;
	private String modality;
	private int age_min;
	private int age_max;
	private double weight_min;
	private double weight_max;
	private double height_min;
	private double height_max;
	private double body_part_thickness_min;
	private double body_part_thickness_max;
	private double ct_series_ctdi;
	private double ct_series_dlp;
	private double ct_study_dlp;
	private double xa_dap;
	private int xa_fluoro_time;
	private double xa_air_kerma;
	private double mg_series_od;
	private double mg_study_od;
	private double rf_series_dap;
	private double rf_series_ed;
	private double rf_study_dap;
	private double rf_study_ed;
	private Timestamp dt_last_update_dwh;
	private double alert_factor;
	
	public Drl_definition_series_type() {
		super();
	}

}
