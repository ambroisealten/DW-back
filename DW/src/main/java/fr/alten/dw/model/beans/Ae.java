/**
 * 
 */
package fr.alten.dw.model.beans;

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
@Table(name="ae")
public class Ae implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5513883269016376307L;

	
	private int instance_key;
	@Id
	@Column(name="id")
	private int id;
	private double ap_left_level;
	private double ap_right_level;
	private double lat_left_level;
	private double lat_right_level;
	private double table_level;
	private double enhance_contrast;
	private double ap_distortion;
	private double lat_distortion;
	private double min_contrast_value;
	private double max_contrast_value;
	private Long dicom_over_the_web_connection_key;
	private Long device_key;
	private Long ae_table_key;
	private double patient_head_position_x;
	private double patient_head_position_z;
	private double table_attenuation_factor;
	private int checksum;
	private int license_key;
	private int department_key;
	private int sdm_key;
	private int translator_key;
	private int image_translator_key;
	private int port;
	private int facility_key;
	private int innova_log_ftp_connection_key;
	private int ct_log_sftp_connection_key;
	private int ris_ae_key;
	private int headrest_thickness;
	private int median_filter_radius;
	private int space_btw_table_headrest;
	private int table_thickness;
	private int table_thickness_min;
	private int secondary_translator_key;
	private int secondary_image_translator_key;
	private int tertiary_translator_key;
	private int tertiary_image_translator_key;
	private int domain_key;
	private int screenshot_translator_key;
	private Timestamp dt_created;
	private Timestamp dt_updated;
	private Timestamp dt_deleted;
	private int dmwl_query_frequency_in_min;
	private int modality_worklist_translator_key;
	private Timestamp dt_last_query_to_ris;
	private int qr_advanced_operation_delay;
	private Timestamp dt_last_update_dwh;
	private Boolean deleted;
	private Boolean modality_worklist_enabled;
	private Boolean default_translator_overridden;
	private Boolean ivrle_ts_forced;
	private Boolean mpps_series_duplicate_removal;
	private Boolean peak_skin_dose_enabled;
	private int query_retrieve_capable;
	private String device_type;
	private String ip;
	private String software_version;
	private String performed_ae_title;
	private String station_name;
	private String aet;
	private String data_type;
	private String retrieve_ae_title;
	private String ignored_sr_numbers;
	private String name;
	private String secondary_data_type;
	private String tertiary_data_type;
	private String timezone;
	private String modality_worklist_datatype;
	private String alternate_aet;

	
	public Ae() {
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


	public double getAp_left_level() {
		return ap_left_level;
	}


	public void setAp_left_level(double ap_left_level) {
		this.ap_left_level = ap_left_level;
	}


	public double getAp_right_level() {
		return ap_right_level;
	}


	public void setAp_right_level(double ap_right_level) {
		this.ap_right_level = ap_right_level;
	}


	public double getLat_left_level() {
		return lat_left_level;
	}


	public void setLat_left_level(double lat_left_level) {
		this.lat_left_level = lat_left_level;
	}


	public double getLat_right_level() {
		return lat_right_level;
	}


	public void setLat_right_level(double lat_right_level) {
		this.lat_right_level = lat_right_level;
	}


	public double getTable_level() {
		return table_level;
	}


	public void setTable_level(double table_level) {
		this.table_level = table_level;
	}


	public double getEnhance_contrast() {
		return enhance_contrast;
	}


	public void setEnhance_contrast(double enhance_contrast) {
		this.enhance_contrast = enhance_contrast;
	}


	public double getAp_distortion() {
		return ap_distortion;
	}


	public void setAp_distortion(double ap_distortion) {
		this.ap_distortion = ap_distortion;
	}


	public double getLat_distortion() {
		return lat_distortion;
	}


	public void setLat_distortion(double lat_distortion) {
		this.lat_distortion = lat_distortion;
	}


	public double getMin_contrast_value() {
		return min_contrast_value;
	}


	public void setMin_contrast_value(double min_contrast_value) {
		this.min_contrast_value = min_contrast_value;
	}


	public double getMax_contrast_value() {
		return max_contrast_value;
	}


	public void setMax_contrast_value(double max_contrast_value) {
		this.max_contrast_value = max_contrast_value;
	}


	public Long getDicom_over_the_web_connection_key() {
		return dicom_over_the_web_connection_key;
	}


	public void setDicom_over_the_web_connection_key(Long dicom_over_the_web_connection_key) {
		this.dicom_over_the_web_connection_key = dicom_over_the_web_connection_key;
	}


	public Long getDevice_key() {
		return device_key;
	}


	public void setDevice_key(Long device_key) {
		this.device_key = device_key;
	}


	public Long getAe_table_key() {
		return ae_table_key;
	}


	public void setAe_table_key(Long ae_table_key) {
		this.ae_table_key = ae_table_key;
	}


	public double getPatient_head_position_x() {
		return patient_head_position_x;
	}


	public void setPatient_head_position_x(double patient_head_position_x) {
		this.patient_head_position_x = patient_head_position_x;
	}


	public double getPatient_head_position_z() {
		return patient_head_position_z;
	}


	public void setPatient_head_position_z(double patient_head_position_z) {
		this.patient_head_position_z = patient_head_position_z;
	}


	public double getTable_attenuation_factor() {
		return table_attenuation_factor;
	}


	public void setTable_attenuation_factor(double table_attenuation_factor) {
		this.table_attenuation_factor = table_attenuation_factor;
	}


	public int getChecksum() {
		return checksum;
	}


	public void setChecksum(int checksum) {
		this.checksum = checksum;
	}


	public int getLicense_key() {
		return license_key;
	}


	public void setLicense_key(int license_key) {
		this.license_key = license_key;
	}


	public int getDepartment_key() {
		return department_key;
	}


	public void setDepartment_key(int department_key) {
		this.department_key = department_key;
	}


	public int getSdm_key() {
		return sdm_key;
	}


	public void setSdm_key(int sdm_key) {
		this.sdm_key = sdm_key;
	}


	public int getTranslator_key() {
		return translator_key;
	}


	public void setTranslator_key(int translator_key) {
		this.translator_key = translator_key;
	}


	public int getImage_translator_key() {
		return image_translator_key;
	}


	public void setImage_translator_key(int image_translator_key) {
		this.image_translator_key = image_translator_key;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}


	public int getFacility_key() {
		return facility_key;
	}


	public void setFacility_key(int facility_key) {
		this.facility_key = facility_key;
	}


	public int getInnova_log_ftp_connection_key() {
		return innova_log_ftp_connection_key;
	}


	public void setInnova_log_ftp_connection_key(int innova_log_ftp_connection_key) {
		this.innova_log_ftp_connection_key = innova_log_ftp_connection_key;
	}


	public int getCt_log_sftp_connection_key() {
		return ct_log_sftp_connection_key;
	}


	public void setCt_log_sftp_connection_key(int ct_log_sftp_connection_key) {
		this.ct_log_sftp_connection_key = ct_log_sftp_connection_key;
	}


	public int getRis_ae_key() {
		return ris_ae_key;
	}


	public void setRis_ae_key(int ris_ae_key) {
		this.ris_ae_key = ris_ae_key;
	}


	public int getHeadrest_thickness() {
		return headrest_thickness;
	}


	public void setHeadrest_thickness(int headrest_thickness) {
		this.headrest_thickness = headrest_thickness;
	}


	public int getMedian_filter_radius() {
		return median_filter_radius;
	}


	public void setMedian_filter_radius(int median_filter_radius) {
		this.median_filter_radius = median_filter_radius;
	}


	public int getSpace_btw_table_headrest() {
		return space_btw_table_headrest;
	}


	public void setSpace_btw_table_headrest(int space_btw_table_headrest) {
		this.space_btw_table_headrest = space_btw_table_headrest;
	}


	public int getTable_thickness() {
		return table_thickness;
	}


	public void setTable_thickness(int table_thickness) {
		this.table_thickness = table_thickness;
	}


	public int getTable_thickness_min() {
		return table_thickness_min;
	}


	public void setTable_thickness_min(int table_thickness_min) {
		this.table_thickness_min = table_thickness_min;
	}


	public int getSecondary_translator_key() {
		return secondary_translator_key;
	}


	public void setSecondary_translator_key(int secondary_translator_key) {
		this.secondary_translator_key = secondary_translator_key;
	}


	public int getSecondary_image_translator_key() {
		return secondary_image_translator_key;
	}


	public void setSecondary_image_translator_key(int secondary_image_translator_key) {
		this.secondary_image_translator_key = secondary_image_translator_key;
	}


	public int getTertiary_translator_key() {
		return tertiary_translator_key;
	}


	public void setTertiary_translator_key(int tertiary_translator_key) {
		this.tertiary_translator_key = tertiary_translator_key;
	}


	public int getTertiary_image_translator_key() {
		return tertiary_image_translator_key;
	}


	public void setTertiary_image_translator_key(int tertiary_image_translator_key) {
		this.tertiary_image_translator_key = tertiary_image_translator_key;
	}


	public int getDomain_key() {
		return domain_key;
	}


	public void setDomain_key(int domain_key) {
		this.domain_key = domain_key;
	}


	public int getScreenshot_translator_key() {
		return screenshot_translator_key;
	}


	public void setScreenshot_translator_key(int screenshot_translator_key) {
		this.screenshot_translator_key = screenshot_translator_key;
	}


	public Timestamp getDt_created() {
		return dt_created;
	}


	public void setDt_created(Timestamp dt_created) {
		this.dt_created = dt_created;
	}


	public Timestamp getDt_updated() {
		return dt_updated;
	}


	public void setDt_updated(Timestamp dt_updated) {
		this.dt_updated = dt_updated;
	}


	public Timestamp getDt_deleted() {
		return dt_deleted;
	}


	public void setDt_deleted(Timestamp dt_deleted) {
		this.dt_deleted = dt_deleted;
	}


	public int getDmwl_query_frequency_in_min() {
		return dmwl_query_frequency_in_min;
	}


	public void setDmwl_query_frequency_in_min(int dmwl_query_frequency_in_min) {
		this.dmwl_query_frequency_in_min = dmwl_query_frequency_in_min;
	}


	public int getModality_worklist_translator_key() {
		return modality_worklist_translator_key;
	}


	public void setModality_worklist_translator_key(int modality_worklist_translator_key) {
		this.modality_worklist_translator_key = modality_worklist_translator_key;
	}


	public Timestamp getDt_last_query_to_ris() {
		return dt_last_query_to_ris;
	}


	public void setDt_last_query_to_ris(Timestamp dt_last_query_to_ris) {
		this.dt_last_query_to_ris = dt_last_query_to_ris;
	}


	public int getQr_advanced_operation_delay() {
		return qr_advanced_operation_delay;
	}


	public void setQr_advanced_operation_delay(int qr_advanced_operation_delay) {
		this.qr_advanced_operation_delay = qr_advanced_operation_delay;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}


	public Boolean getDeleted() {
		return deleted;
	}


	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}


	public Boolean getModality_worklist_enabled() {
		return modality_worklist_enabled;
	}


	public void setModality_worklist_enabled(Boolean modality_worklist_enabled) {
		this.modality_worklist_enabled = modality_worklist_enabled;
	}


	public Boolean getDefault_translator_overridden() {
		return default_translator_overridden;
	}


	public void setDefault_translator_overridden(Boolean default_translator_overridden) {
		this.default_translator_overridden = default_translator_overridden;
	}


	public Boolean getIvrle_ts_forced() {
		return ivrle_ts_forced;
	}


	public void setIvrle_ts_forced(Boolean ivrle_ts_forced) {
		this.ivrle_ts_forced = ivrle_ts_forced;
	}


	public Boolean getMpps_series_duplicate_removal() {
		return mpps_series_duplicate_removal;
	}


	public void setMpps_series_duplicate_removal(Boolean mpps_series_duplicate_removal) {
		this.mpps_series_duplicate_removal = mpps_series_duplicate_removal;
	}


	public Boolean getPeak_skin_dose_enabled() {
		return peak_skin_dose_enabled;
	}


	public void setPeak_skin_dose_enabled(Boolean peak_skin_dose_enabled) {
		this.peak_skin_dose_enabled = peak_skin_dose_enabled;
	}


	public int getQuery_retrieve_capable() {
		return query_retrieve_capable;
	}


	public void setQuery_retrieve_capable(int query_retrieve_capable) {
		this.query_retrieve_capable = query_retrieve_capable;
	}


	public String getDevice_type() {
		return device_type;
	}


	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	public String getSoftware_version() {
		return software_version;
	}


	public void setSoftware_version(String software_version) {
		this.software_version = software_version;
	}


	public String getPerformed_ae_title() {
		return performed_ae_title;
	}


	public void setPerformed_ae_title(String performed_ae_title) {
		this.performed_ae_title = performed_ae_title;
	}


	public String getStation_name() {
		return station_name;
	}


	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}


	public String getAet() {
		return aet;
	}


	public void setAet(String aet) {
		this.aet = aet;
	}


	public String getData_type() {
		return data_type;
	}


	public void setData_type(String data_type) {
		this.data_type = data_type;
	}


	public String getRetrieve_ae_title() {
		return retrieve_ae_title;
	}


	public void setRetrieve_ae_title(String retrieve_ae_title) {
		this.retrieve_ae_title = retrieve_ae_title;
	}


	public String getIgnored_sr_numbers() {
		return ignored_sr_numbers;
	}


	public void setIgnored_sr_numbers(String ignored_sr_numbers) {
		this.ignored_sr_numbers = ignored_sr_numbers;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSecondary_data_type() {
		return secondary_data_type;
	}


	public void setSecondary_data_type(String secondary_data_type) {
		this.secondary_data_type = secondary_data_type;
	}


	public String getTertiary_data_type() {
		return tertiary_data_type;
	}


	public void setTertiary_data_type(String tertiary_data_type) {
		this.tertiary_data_type = tertiary_data_type;
	}


	public String getTimezone() {
		return timezone;
	}


	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}


	public String getModality_worklist_datatype() {
		return modality_worklist_datatype;
	}


	public void setModality_worklist_datatype(String modality_worklist_datatype) {
		this.modality_worklist_datatype = modality_worklist_datatype;
	}


	public String getAlternate_aet() {
		return alternate_aet;
	}


	public void setAlternate_aet(String alternate_aet) {
		this.alternate_aet = alternate_aet;
	}
}
