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
@Table(name = "dwh_ae")
public class Ae implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 5513883269016376307L;

	private Integer instance_key;
	@Id
	@Column(name = "id")
	private Long id;
	private Double ap_left_level;
	private Double ap_right_level;
	private Double lat_left_level;
	private Double lat_right_level;
	private Double table_level;
	private Double enhance_contrast;
	private Double ap_distortion;
	private Double lat_distortion;
	private Double min_contrast_value;
	private Double max_contrast_value;
	private Long dicom_over_the_web_connection_key;
	private Long device_key;
	private Long ae_table_key;
	private Double patient_head_position_x;
	private Double patient_head_position_z;
	private Double table_attenuation_factor;
	private Integer checksum;
	private Integer license_key;
	private Integer department_key;
	private Integer sdm_key;
	private Integer translator_key;
	private Integer image_translator_key;
	private Integer port;
	private Integer facility_key;
	private Integer innova_log_ftp_connection_key;
	private Integer ct_log_sftp_connection_key;
	private Integer ris_ae_key;
	private Integer headrest_thickness;
	private Integer median_filter_radius;
	private Integer space_btw_table_headrest;
	private Integer table_thickness;
	private Integer table_thickness_min;
	private Integer secondary_translator_key;
	private Integer secondary_image_translator_key;
	private Integer tertiary_translator_key;
	private Integer tertiary_image_translator_key;
	private Integer domain_key;
	private Integer screenshot_translator_key;
	private Timestamp dt_created;
	private Timestamp dt_updated;
	private Timestamp dt_deleted;
	private Integer dmwl_query_frequency_in_min;
	private Integer modality_worklist_translator_key;
	private Timestamp dt_last_query_to_ris;
	private Integer qr_advanced_operation_delay;
	private Timestamp dt_last_update_dwh;
	private Boolean deleted;
	private Boolean modality_worklist_enabled;
	private Boolean default_translator_overridden;
	private Boolean ivrle_ts_forced;
	private Boolean mpps_series_duplicate_removal;
	private Boolean peak_skin_dose_enabled;
	private Integer query_retrieve_capable;
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

	public Long getAe_table_key() {
		return this.ae_table_key;
	}

	public String getAet() {
		return this.aet;
	}

	public String getAlternate_aet() {
		return this.alternate_aet;
	}

	public Double getAp_distortion() {
		return this.ap_distortion;
	}

	public Double getAp_left_level() {
		return this.ap_left_level;
	}

	public Double getAp_right_level() {
		return this.ap_right_level;
	}

	public Integer getChecksum() {
		return this.checksum;
	}

	public Integer getCt_log_sftp_connection_key() {
		return this.ct_log_sftp_connection_key;
	}

	public String getData_type() {
		return this.data_type;
	}

	public Boolean getDefault_translator_overridden() {
		return this.default_translator_overridden;
	}

	public Boolean getDeleted() {
		return this.deleted;
	}

	public Integer getDepartment_key() {
		return this.department_key;
	}

	public Long getDevice_key() {
		return this.device_key;
	}

	public String getDevice_type() {
		return this.device_type;
	}

	public Long getDicom_over_the_web_connection_key() {
		return this.dicom_over_the_web_connection_key;
	}

	public Integer getDmwl_query_frequency_in_min() {
		return this.dmwl_query_frequency_in_min;
	}

	public Integer getDomain_key() {
		return this.domain_key;
	}

	public Timestamp getDt_created() {
		return this.dt_created;
	}

	public Timestamp getDt_deleted() {
		return this.dt_deleted;
	}

	public Timestamp getDt_last_query_to_ris() {
		return this.dt_last_query_to_ris;
	}

	public Timestamp getDt_last_update_dwh() {
		return this.dt_last_update_dwh;
	}

	public Timestamp getDt_updated() {
		return this.dt_updated;
	}

	public Double getEnhance_contrast() {
		return this.enhance_contrast;
	}

	public Integer getFacility_key() {
		return this.facility_key;
	}

	public Integer getHeadrest_thickness() {
		return this.headrest_thickness;
	}

	public Long getId() {
		return this.id;
	}

	public String getIgnored_sr_numbers() {
		return this.ignored_sr_numbers;
	}

	public Integer getImage_translator_key() {
		return this.image_translator_key;
	}

	public Integer getInnova_log_ftp_connection_key() {
		return this.innova_log_ftp_connection_key;
	}

	public Integer getInstance_key() {
		return this.instance_key;
	}

	public String getIp() {
		return this.ip;
	}

	public Boolean getIvrle_ts_forced() {
		return this.ivrle_ts_forced;
	}

	public Double getLat_distortion() {
		return this.lat_distortion;
	}

	public Double getLat_left_level() {
		return this.lat_left_level;
	}

	public Double getLat_right_level() {
		return this.lat_right_level;
	}

	public Integer getLicense_key() {
		return this.license_key;
	}

	public Double getMax_contrast_value() {
		return this.max_contrast_value;
	}

	public Integer getMedian_filter_radius() {
		return this.median_filter_radius;
	}

	public Double getMin_contrast_value() {
		return this.min_contrast_value;
	}

	public String getModality_worklist_datatype() {
		return this.modality_worklist_datatype;
	}

	public Boolean getModality_worklist_enabled() {
		return this.modality_worklist_enabled;
	}

	public Integer getModality_worklist_translator_key() {
		return this.modality_worklist_translator_key;
	}

	public Boolean getMpps_series_duplicate_removal() {
		return this.mpps_series_duplicate_removal;
	}

	public String getName() {
		return this.name;
	}

	public Double getPatient_head_position_x() {
		return this.patient_head_position_x;
	}

	public Double getPatient_head_position_z() {
		return this.patient_head_position_z;
	}

	public Boolean getPeak_skin_dose_enabled() {
		return this.peak_skin_dose_enabled;
	}

	public String getPerformed_ae_title() {
		return this.performed_ae_title;
	}

	public Integer getPort() {
		return this.port;
	}

	public Integer getQr_advanced_operation_delay() {
		return this.qr_advanced_operation_delay;
	}

	public Integer getQuery_retrieve_capable() {
		return this.query_retrieve_capable;
	}

	public String getRetrieve_ae_title() {
		return this.retrieve_ae_title;
	}

	public Integer getRis_ae_key() {
		return this.ris_ae_key;
	}

	public Integer getScreenshot_translator_key() {
		return this.screenshot_translator_key;
	}

	public Integer getSdm_key() {
		return this.sdm_key;
	}

	public String getSecondary_data_type() {
		return this.secondary_data_type;
	}

	public Integer getSecondary_image_translator_key() {
		return this.secondary_image_translator_key;
	}

	public Integer getSecondary_translator_key() {
		return this.secondary_translator_key;
	}

	public String getSoftware_version() {
		return this.software_version;
	}

	public Integer getSpace_btw_table_headrest() {
		return this.space_btw_table_headrest;
	}

	public String getStation_name() {
		return this.station_name;
	}

	public Double getTable_attenuation_factor() {
		return this.table_attenuation_factor;
	}

	public Double getTable_level() {
		return this.table_level;
	}

	public Integer getTable_thickness() {
		return this.table_thickness;
	}

	public Integer getTable_thickness_min() {
		return this.table_thickness_min;
	}

	public String getTertiary_data_type() {
		return this.tertiary_data_type;
	}

	public Integer getTertiary_image_translator_key() {
		return this.tertiary_image_translator_key;
	}

	public Integer getTertiary_translator_key() {
		return this.tertiary_translator_key;
	}

	public String getTimezone() {
		return this.timezone;
	}

	public Integer getTranslator_key() {
		return this.translator_key;
	}

	public void setAe_table_key(final Long ae_table_key) {
		this.ae_table_key = ae_table_key;
	}

	public void setAet(final String aet) {
		this.aet = aet;
	}

	public void setAlternate_aet(final String alternate_aet) {
		this.alternate_aet = alternate_aet;
	}

	public void setAp_distortion(final Double ap_distortion) {
		this.ap_distortion = ap_distortion;
	}

	public void setAp_left_level(final Double ap_left_level) {
		this.ap_left_level = ap_left_level;
	}

	public void setAp_right_level(final Double ap_right_level) {
		this.ap_right_level = ap_right_level;
	}

	public void setChecksum(final Integer checksum) {
		this.checksum = checksum;
	}

	public void setCt_log_sftp_connection_key(final Integer ct_log_sftp_connection_key) {
		this.ct_log_sftp_connection_key = ct_log_sftp_connection_key;
	}

	public void setData_type(final String data_type) {
		this.data_type = data_type;
	}

	public void setDefault_translator_overridden(final Boolean default_translator_overridden) {
		this.default_translator_overridden = default_translator_overridden;
	}

	public void setDeleted(final Boolean deleted) {
		this.deleted = deleted;
	}

	public void setDepartment_key(final Integer department_key) {
		this.department_key = department_key;
	}

	public void setDevice_key(final Long device_key) {
		this.device_key = device_key;
	}

	public void setDevice_type(final String device_type) {
		this.device_type = device_type;
	}

	public void setDicom_over_the_web_connection_key(final Long dicom_over_the_web_connection_key) {
		this.dicom_over_the_web_connection_key = dicom_over_the_web_connection_key;
	}

	public void setDmwl_query_frequency_in_min(final Integer dmwl_query_frequency_in_min) {
		this.dmwl_query_frequency_in_min = dmwl_query_frequency_in_min;
	}

	public void setDomain_key(final Integer domain_key) {
		this.domain_key = domain_key;
	}

	public void setDt_created(final Timestamp dt_created) {
		this.dt_created = dt_created;
	}

	public void setDt_deleted(final Timestamp dt_deleted) {
		this.dt_deleted = dt_deleted;
	}

	public void setDt_last_query_to_ris(final Timestamp dt_last_query_to_ris) {
		this.dt_last_query_to_ris = dt_last_query_to_ris;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setDt_updated(final Timestamp dt_updated) {
		this.dt_updated = dt_updated;
	}

	public void setEnhance_contrast(final Double enhance_contrast) {
		this.enhance_contrast = enhance_contrast;
	}

	public void setFacility_key(final Integer facility_key) {
		this.facility_key = facility_key;
	}

	public void setHeadrest_thickness(final Integer headrest_thickness) {
		this.headrest_thickness = headrest_thickness;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setIgnored_sr_numbers(final String ignored_sr_numbers) {
		this.ignored_sr_numbers = ignored_sr_numbers;
	}

	public void setImage_translator_key(final Integer image_translator_key) {
		this.image_translator_key = image_translator_key;
	}

	public void setInnova_log_ftp_connection_key(final Integer innova_log_ftp_connection_key) {
		this.innova_log_ftp_connection_key = innova_log_ftp_connection_key;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setIp(final String ip) {
		this.ip = ip;
	}

	public void setIvrle_ts_forced(final Boolean ivrle_ts_forced) {
		this.ivrle_ts_forced = ivrle_ts_forced;
	}

	public void setLat_distortion(final Double lat_distortion) {
		this.lat_distortion = lat_distortion;
	}

	public void setLat_left_level(final Double lat_left_level) {
		this.lat_left_level = lat_left_level;
	}

	public void setLat_right_level(final Double lat_right_level) {
		this.lat_right_level = lat_right_level;
	}

	public void setLicense_key(final Integer license_key) {
		this.license_key = license_key;
	}

	public void setMax_contrast_value(final Double max_contrast_value) {
		this.max_contrast_value = max_contrast_value;
	}

	public void setMedian_filter_radius(final Integer median_filter_radius) {
		this.median_filter_radius = median_filter_radius;
	}

	public void setMin_contrast_value(final Double min_contrast_value) {
		this.min_contrast_value = min_contrast_value;
	}

	public void setModality_worklist_datatype(final String modality_worklist_datatype) {
		this.modality_worklist_datatype = modality_worklist_datatype;
	}

	public void setModality_worklist_enabled(final Boolean modality_worklist_enabled) {
		this.modality_worklist_enabled = modality_worklist_enabled;
	}

	public void setModality_worklist_translator_key(final Integer modality_worklist_translator_key) {
		this.modality_worklist_translator_key = modality_worklist_translator_key;
	}

	public void setMpps_series_duplicate_removal(final Boolean mpps_series_duplicate_removal) {
		this.mpps_series_duplicate_removal = mpps_series_duplicate_removal;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setPatient_head_position_x(final Double patient_head_position_x) {
		this.patient_head_position_x = patient_head_position_x;
	}

	public void setPatient_head_position_z(final Double patient_head_position_z) {
		this.patient_head_position_z = patient_head_position_z;
	}

	public void setPeak_skin_dose_enabled(final Boolean peak_skin_dose_enabled) {
		this.peak_skin_dose_enabled = peak_skin_dose_enabled;
	}

	public void setPerformed_ae_title(final String performed_ae_title) {
		this.performed_ae_title = performed_ae_title;
	}

	public void setPort(final Integer port) {
		this.port = port;
	}

	public void setQr_advanced_operation_delay(final Integer qr_advanced_operation_delay) {
		this.qr_advanced_operation_delay = qr_advanced_operation_delay;
	}

	public void setQuery_retrieve_capable(final Integer query_retrieve_capable) {
		this.query_retrieve_capable = query_retrieve_capable;
	}

	public void setRetrieve_ae_title(final String retrieve_ae_title) {
		this.retrieve_ae_title = retrieve_ae_title;
	}

	public void setRis_ae_key(final Integer ris_ae_key) {
		this.ris_ae_key = ris_ae_key;
	}

	public void setScreenshot_translator_key(final Integer screenshot_translator_key) {
		this.screenshot_translator_key = screenshot_translator_key;
	}

	public void setSdm_key(final Integer sdm_key) {
		this.sdm_key = sdm_key;
	}

	public void setSecondary_data_type(final String secondary_data_type) {
		this.secondary_data_type = secondary_data_type;
	}

	public void setSecondary_image_translator_key(final Integer secondary_image_translator_key) {
		this.secondary_image_translator_key = secondary_image_translator_key;
	}

	public void setSecondary_translator_key(final Integer secondary_translator_key) {
		this.secondary_translator_key = secondary_translator_key;
	}

	public void setSoftware_version(final String software_version) {
		this.software_version = software_version;
	}

	public void setSpace_btw_table_headrest(final Integer space_btw_table_headrest) {
		this.space_btw_table_headrest = space_btw_table_headrest;
	}

	public void setStation_name(final String station_name) {
		this.station_name = station_name;
	}

	public void setTable_attenuation_factor(final Double table_attenuation_factor) {
		this.table_attenuation_factor = table_attenuation_factor;
	}

	public void setTable_level(final Double table_level) {
		this.table_level = table_level;
	}

	public void setTable_thickness(final Integer table_thickness) {
		this.table_thickness = table_thickness;
	}

	public void setTable_thickness_min(final Integer table_thickness_min) {
		this.table_thickness_min = table_thickness_min;
	}

	public void setTertiary_data_type(final String tertiary_data_type) {
		this.tertiary_data_type = tertiary_data_type;
	}

	public void setTertiary_image_translator_key(final Integer tertiary_image_translator_key) {
		this.tertiary_image_translator_key = tertiary_image_translator_key;
	}

	public void setTertiary_translator_key(final Integer tertiary_translator_key) {
		this.tertiary_translator_key = tertiary_translator_key;
	}

	public void setTimezone(final String timezone) {
		this.timezone = timezone;
	}

	public void setTranslator_key(final Integer translator_key) {
		this.translator_key = translator_key;
	}
}
