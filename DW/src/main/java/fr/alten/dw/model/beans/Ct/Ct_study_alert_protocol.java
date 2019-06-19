/**
 * 
 */
package fr.alten.dw.model.beans.Ct;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 */
public class Ct_study_alert_protocol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8652939664891133868L;


	private BIGINT id;
	private INT instance_key;
	private INT facility_key;
	private DOUBLE tnie_lvl_2;
	private DOUBLE dlp_lvl_1;
	private DOUBLE tnie_lvl_1;
	private DOUBLE dlp_lvl_2;
	private VARCHAR protocol;
	private DATETIME dt_last_update_dwh;
	
	public Ct_study_alert_protocol() {
		super();
	}
}
