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
@Table(name = "dwh_serie_ct")
public class Serie_ct implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -1858104086918462160L;
	@Id
	@Column(name = "id")
	private Long id;
	private Integer instance_key;
	private String series_instance_uid;
	private Long study_key;
	private String target_region_key;
	private Integer series_number;
	private Timestamp series_datetime;
	private String protocol_name;
	private Double nominal_single_collimation_width;
	private Double exposure_time_per_rotation;
	private String iterative_recon_level;
	private Double ctdi_vol_mean;
	private Double table_feed_per_rotation;
	private Double maximum_xray_tube_current;
	private String ctdiw_phantom_type;
	private Integer number_of_xray_sources;
	private Double nominal_total_collimation_width;
	private Double dose_length_product;
	private Double xray_tube_voltage;
	private Double pitch_factor;
	private Double scanning_length;
	private Double duration_of_xray_on;
	private Double gantry_period;
	private Integer acquisition_number;
	private Double distance_source_to_detector;
	private Integer generator_power;
	private Double reconstruction_diameter;
	private Double distance_source_to_patient;
	private Double focal_spot_size;
	private Double gantry_detector_tilt;
	private Double slice_thickness;
	private Double spacing_between_slices;
	private String convolution_kernel;
	private Double data_collection_diameter;
	private Double number_of_macro_rows_in_detector;
	private Integer ten_times_noise_standard_deviation;
	private Integer number_of_images;
	private Double table_height;
	private String filter_type;
	private Integer scan_fov_type;
	private String rotation_direction;
	private Double start_slice_location;
	private Double end_slice_location;
	private Double exposure;
	private String pixel_spacing;
	private Double dose_length_product_ssde;
	private Long protocol_key;
	private String patient_position;
	private Double heart_rate;
	private String patient_orientation;
	private Double isocenter_delta_x;
	private Double isocenter_delta_y;
	private Double patient_width_max;
	private Double patient_thickness_max;
	private Double effective_diameter;
	private String patient_id;
	private String instance_name;
	private Double patient_height;
	private String study_id;
	private Timestamp study_datetime;
	private Integer domain_key;
	private String nature_of_exam;
	private Double patient_age;
	private Long patient_key;
	private String series_type;
	private Double dose_length_product_estimated;
	private Double median_age_per_protocol;
	private Timestamp series_end_datetime;
	private Integer series_duration;

	public Serie_ct() {
		super();
	}

	public Integer getAcquisition_number() {
		return this.acquisition_number;
	}

	public String getConvolution_kernel() {
		return this.convolution_kernel;
	}

	public Double getCtdi_vol_mean() {
		return this.ctdi_vol_mean;
	}

	public String getCtdiw_phantom_type() {
		return this.ctdiw_phantom_type;
	}

	public Double getData_collection_diameter() {
		return this.data_collection_diameter;
	}

	public Double getDistance_source_to_detector() {
		return this.distance_source_to_detector;
	}

	public Double getDistance_source_to_patient() {
		return this.distance_source_to_patient;
	}

	public Integer getDomain_key() {
		return this.domain_key;
	}

	public Double getDose_length_product() {
		return this.dose_length_product;
	}

	public Double getDose_length_product_estimated() {
		return this.dose_length_product_estimated;
	}

	public Double getDose_length_product_ssde() {
		return this.dose_length_product_ssde;
	}

	public Double getDuration_of_xray_on() {
		return this.duration_of_xray_on;
	}

	public Double getEffective_diameter() {
		return this.effective_diameter;
	}

	public Double getEnd_slice_location() {
		return this.end_slice_location;
	}

	public Double getExposure() {
		return this.exposure;
	}

	public Double getExposure_time_per_rotation() {
		return this.exposure_time_per_rotation;
	}

	public String getFilter_type() {
		return this.filter_type;
	}

	public Double getFocal_spot_size() {
		return this.focal_spot_size;
	}

	public Double getGantry_detector_tilt() {
		return this.gantry_detector_tilt;
	}

	public Double getGantry_period() {
		return this.gantry_period;
	}

	public Integer getGenerator_power() {
		return this.generator_power;
	}

	public Double getHeart_rate() {
		return this.heart_rate;
	}

	public Long getId() {
		return this.id;
	}

	public Integer getInstance_key() {
		return this.instance_key;
	}

	public String getInstance_name() {
		return this.instance_name;
	}

	public Double getIsocenter_delta_x() {
		return this.isocenter_delta_x;
	}

	public Double getIsocenter_delta_y() {
		return this.isocenter_delta_y;
	}

	public String getIterative_recon_level() {
		return this.iterative_recon_level;
	}

	public Double getMaximum_xray_tube_current() {
		return this.maximum_xray_tube_current;
	}

	public Double getMedian_age_per_protocol() {
		return this.median_age_per_protocol;
	}

	public String getNature_of_exam() {
		return this.nature_of_exam;
	}

	public Double getNominal_single_collimation_width() {
		return this.nominal_single_collimation_width;
	}

	public Double getNominal_total_collimation_width() {
		return this.nominal_total_collimation_width;
	}

	public Integer getNumber_of_images() {
		return this.number_of_images;
	}

	public Double getNumber_of_macro_rows_in_detector() {
		return this.number_of_macro_rows_in_detector;
	}

	public Integer getNumber_of_xray_sources() {
		return this.number_of_xray_sources;
	}

	public Double getPatient_age() {
		return this.patient_age;
	}

	public Double getPatient_height() {
		return this.patient_height;
	}

	public String getPatient_id() {
		return this.patient_id;
	}

	public Long getPatient_key() {
		return this.patient_key;
	}

	public String getPatient_orientation() {
		return this.patient_orientation;
	}

	public String getPatient_position() {
		return this.patient_position;
	}

	public Double getPatient_thickness_max() {
		return this.patient_thickness_max;
	}

	public Double getPatient_width_max() {
		return this.patient_width_max;
	}

	public Double getPitch_factor() {
		return this.pitch_factor;
	}

	public String getPixel_spacing() {
		return this.pixel_spacing;
	}

	public Long getProtocol_key() {
		return this.protocol_key;
	}

	public String getProtocol_name() {
		return this.protocol_name;
	}

	public Double getReconstruction_diameter() {
		return this.reconstruction_diameter;
	}

	public String getRotation_direction() {
		return this.rotation_direction;
	}

	public Integer getScan_fov_type() {
		return this.scan_fov_type;
	}

	public Double getScanning_length() {
		return this.scanning_length;
	}

	public Timestamp getSeries_datetime() {
		return this.series_datetime;
	}

	public Integer getSeries_duration() {
		return this.series_duration;
	}

	public Timestamp getSeries_end_datetime() {
		return this.series_end_datetime;
	}

	public String getSeries_instance_uid() {
		return this.series_instance_uid;
	}

	public Integer getSeries_number() {
		return this.series_number;
	}

	public String getSeries_type() {
		return this.series_type;
	}

	public Double getSlice_thickness() {
		return this.slice_thickness;
	}

	public Double getSpacing_between_slices() {
		return this.spacing_between_slices;
	}

	public Double getStart_slice_location() {
		return this.start_slice_location;
	}

	public Timestamp getStudy_datetime() {
		return this.study_datetime;
	}

	public String getStudy_id() {
		return this.study_id;
	}

	public Long getStudy_key() {
		return this.study_key;
	}

	public Double getTable_feed_per_rotation() {
		return this.table_feed_per_rotation;
	}

	public Double getTable_height() {
		return this.table_height;
	}

	public String getTarget_region_key() {
		return this.target_region_key;
	}

	public Integer getTen_times_noise_standard_deviation() {
		return this.ten_times_noise_standard_deviation;
	}

	public Double getXray_tube_voltage() {
		return this.xray_tube_voltage;
	}

	public void setAcquisition_number(final Integer acquisition_number) {
		this.acquisition_number = acquisition_number;
	}

	public void setConvolution_kernel(final String convolution_kernel) {
		this.convolution_kernel = convolution_kernel;
	}

	public void setCtdi_vol_mean(final Double ctdi_vol_mean) {
		this.ctdi_vol_mean = ctdi_vol_mean;
	}

	public void setCtdiw_phantom_type(final String ctdiw_phantom_type) {
		this.ctdiw_phantom_type = ctdiw_phantom_type;
	}

	public void setData_collection_diameter(final Double data_collection_diameter) {
		this.data_collection_diameter = data_collection_diameter;
	}

	public void setDistance_source_to_detector(final Double distance_source_to_detector) {
		this.distance_source_to_detector = distance_source_to_detector;
	}

	public void setDistance_source_to_patient(final Double distance_source_to_patient) {
		this.distance_source_to_patient = distance_source_to_patient;
	}

	public void setDomain_key(final Integer domain_key) {
		this.domain_key = domain_key;
	}

	public void setDose_length_product(final Double dose_length_product) {
		this.dose_length_product = dose_length_product;
	}

	public void setDose_length_product_estimated(final Double dose_length_product_estimated) {
		this.dose_length_product_estimated = dose_length_product_estimated;
	}

	public void setDose_length_product_ssde(final Double dose_length_product_ssde) {
		this.dose_length_product_ssde = dose_length_product_ssde;
	}

	public void setDuration_of_xray_on(final Double duration_of_xray_on) {
		this.duration_of_xray_on = duration_of_xray_on;
	}

	public void setEffective_diameter(final Double effective_diameter) {
		this.effective_diameter = effective_diameter;
	}

	public void setEnd_slice_location(final Double end_slice_location) {
		this.end_slice_location = end_slice_location;
	}

	public void setExposure(final Double exposure) {
		this.exposure = exposure;
	}

	public void setExposure_time_per_rotation(final Double exposure_time_per_rotation) {
		this.exposure_time_per_rotation = exposure_time_per_rotation;
	}

	public void setFilter_type(final String filter_type) {
		this.filter_type = filter_type;
	}

	public void setFocal_spot_size(final Double focal_spot_size) {
		this.focal_spot_size = focal_spot_size;
	}

	public void setGantry_detector_tilt(final Double gantry_detector_tilt) {
		this.gantry_detector_tilt = gantry_detector_tilt;
	}

	public void setGantry_period(final Double gantry_period) {
		this.gantry_period = gantry_period;
	}

	public void setGenerator_power(final Integer generator_power) {
		this.generator_power = generator_power;
	}

	public void setHeart_rate(final Double heart_rate) {
		this.heart_rate = heart_rate;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setInstance_name(final String instance_name) {
		this.instance_name = instance_name;
	}

	public void setIsocenter_delta_x(final Double isocenter_delta_x) {
		this.isocenter_delta_x = isocenter_delta_x;
	}

	public void setIsocenter_delta_y(final Double isocenter_delta_y) {
		this.isocenter_delta_y = isocenter_delta_y;
	}

	public void setIterative_recon_level(final String iterative_recon_level) {
		this.iterative_recon_level = iterative_recon_level;
	}

	public void setMaximum_xray_tube_current(final Double maximum_xray_tube_current) {
		this.maximum_xray_tube_current = maximum_xray_tube_current;
	}

	public void setMedian_age_per_protocol(final Double median_age_per_protocol) {
		this.median_age_per_protocol = median_age_per_protocol;
	}

	public void setNature_of_exam(final String nature_of_exam) {
		this.nature_of_exam = nature_of_exam;
	}

	public void setNominal_single_collimation_width(final Double nominal_single_collimation_width) {
		this.nominal_single_collimation_width = nominal_single_collimation_width;
	}

	public void setNominal_total_collimation_width(final Double nominal_total_collimation_width) {
		this.nominal_total_collimation_width = nominal_total_collimation_width;
	}

	public void setNumber_of_images(final Integer number_of_images) {
		this.number_of_images = number_of_images;
	}

	public void setNumber_of_macro_rows_in_detector(final Double number_of_macro_rows_in_detector) {
		this.number_of_macro_rows_in_detector = number_of_macro_rows_in_detector;
	}

	public void setNumber_of_xray_sources(final Integer number_of_xray_sources) {
		this.number_of_xray_sources = number_of_xray_sources;
	}

	public void setPatient_age(final Double patient_age) {
		this.patient_age = patient_age;
	}

	public void setPatient_height(final Double patient_height) {
		this.patient_height = patient_height;
	}

	public void setPatient_id(final String patient_id) {
		this.patient_id = patient_id;
	}

	public void setPatient_key(final Long patient_key) {
		this.patient_key = patient_key;
	}

	public void setPatient_orientation(final String patient_orientation) {
		this.patient_orientation = patient_orientation;
	}

	public void setPatient_position(final String patient_position) {
		this.patient_position = patient_position;
	}

	public void setPatient_thickness_max(final Double patient_thickness_max) {
		this.patient_thickness_max = patient_thickness_max;
	}

	public void setPatient_width_max(final Double patient_width_max) {
		this.patient_width_max = patient_width_max;
	}

	public void setPitch_factor(final Double pitch_factor) {
		this.pitch_factor = pitch_factor;
	}

	public void setPixel_spacing(final String pixel_spacing) {
		this.pixel_spacing = pixel_spacing;
	}

	public void setProtocol_key(final Long protocol_key) {
		this.protocol_key = protocol_key;
	}

	public void setProtocol_name(final String protocol_name) {
		this.protocol_name = protocol_name;
	}

	public void setReconstruction_diameter(final Double reconstruction_diameter) {
		this.reconstruction_diameter = reconstruction_diameter;
	}

	public void setRotation_direction(final String rotation_direction) {
		this.rotation_direction = rotation_direction;
	}

	public void setScan_fov_type(final Integer scan_fov_type) {
		this.scan_fov_type = scan_fov_type;
	}

	public void setScanning_length(final Double scanning_length) {
		this.scanning_length = scanning_length;
	}

	public void setSeries_datetime(final Timestamp series_datetime) {
		this.series_datetime = series_datetime;
	}

	public void setSeries_duration(final Integer series_duration) {
		this.series_duration = series_duration;
	}

	public void setSeries_end_datetime(final Timestamp series_end_datetime) {
		this.series_end_datetime = series_end_datetime;
	}

	public void setSeries_instance_uid(final String series_instance_uid) {
		this.series_instance_uid = series_instance_uid;
	}

	public void setSeries_number(final Integer series_number) {
		this.series_number = series_number;
	}

	public void setSeries_type(final String series_type) {
		this.series_type = series_type;
	}

	public void setSlice_thickness(final Double slice_thickness) {
		this.slice_thickness = slice_thickness;
	}

	public void setSpacing_between_slices(final Double spacing_between_slices) {
		this.spacing_between_slices = spacing_between_slices;
	}

	public void setStart_slice_location(final Double start_slice_location) {
		this.start_slice_location = start_slice_location;
	}

	public void setStudy_datetime(final Timestamp study_datetime) {
		this.study_datetime = study_datetime;
	}

	public void setStudy_id(final String study_id) {
		this.study_id = study_id;
	}

	public void setStudy_key(final Long study_key) {
		this.study_key = study_key;
	}

	public void setTable_feed_per_rotation(final Double table_feed_per_rotation) {
		this.table_feed_per_rotation = table_feed_per_rotation;
	}

	public void setTable_height(final Double table_height) {
		this.table_height = table_height;
	}

	public void setTarget_region_key(final String target_region_key) {
		this.target_region_key = target_region_key;
	}

	public void setTen_times_noise_standard_deviation(final Integer ten_times_noise_standard_deviation) {
		this.ten_times_noise_standard_deviation = ten_times_noise_standard_deviation;
	}

	public void setXray_tube_voltage(final Double xray_tube_voltage) {
		this.xray_tube_voltage = xray_tube_voltage;
	}

}
