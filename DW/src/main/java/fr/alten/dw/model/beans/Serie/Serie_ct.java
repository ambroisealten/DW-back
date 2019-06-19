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
public class Serie_ct implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3035171998982995619L;

	

	private Long id;
	private int instance_key;
	private String series_instance_uid;
	private Long study_key;
	private String target_region_key;
	private int series_number;
	private Timestamp series_datetime;
	private String protocol_name;
	private double nominal_single_collimation_width;
	private double exposure_time_per_rotation;
	private String iterative_recon_level;
	private double ctdi_vol_mean;
	private double table_feed_per_rotation;
	private double maximum_xray_tube_current;
	private String ctdiw_phantom_type;
	private int number_of_xray_sources;
	private double nominal_total_collimation_width;
	private double dose_length_product;
	private double xray_tube_voltage;
	private double pitch_factor;
	private double scanning_length;
	private double duration_of_xray_on;
	private double gantry_period;
	private int acquisition_number;
	private double distance_source_to_detector;
	private int generator_power;
	private double reconstruction_diameter;
	private double distance_source_to_patient;
	private double focal_spot_size;
	private double gantry_detector_tilt;
	private double slice_thickness;
	private double spacing_between_slices;
	private String convolution_kernel;
	private double data_collection_diameter;
	private double number_of_macro_rows_in_detector;
	private int ten_times_noise_standard_deviation;
	private int number_of_images;
	private double table_height;
	private String filter_type;
	private int scan_fov_type;
	private String rotation_direction;
	private double start_slice_location;
	private double end_slice_location;
	private double exposure;
	private String pixel_spacing;
	private double dose_length_product_ssde;
	private Long protocol_key;
	private String patient_position;
	private double heart_rate;
	private String patient_orientation;
	private double isocenter_delta_x;
	private double isocenter_delta_y;
	private double patient_width_max;
	private double patient_thickness_max;
	private double effective_diameter;
	private String patient_id;
	private String instance_name;
	private double patient_height;
	private String study_id;
	private Timestamp study_datetime;
	private int domain_key;
	private String nature_of_exam;
	private double patient_age;
	private Long patient_key;
	private String series_type;
	private double dose_length_product_estimated;
	private double median_age_per_protocol;
	private Timestamp series_end_datetime;
	private int series_duration;
	
	
	public Serie_ct() {
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


	public String getSeries_instance_uid() {
		return series_instance_uid;
	}


	public void setSeries_instance_uid(String series_instance_uid) {
		this.series_instance_uid = series_instance_uid;
	}


	public Long getStudy_key() {
		return study_key;
	}


	public void setStudy_key(Long study_key) {
		this.study_key = study_key;
	}


	public String getTarget_region_key() {
		return target_region_key;
	}


	public void setTarget_region_key(String target_region_key) {
		this.target_region_key = target_region_key;
	}


	public int getSeries_number() {
		return series_number;
	}


	public void setSeries_number(int series_number) {
		this.series_number = series_number;
	}


	public Timestamp getSeries_datetime() {
		return series_datetime;
	}


	public void setSeries_datetime(Timestamp series_datetime) {
		this.series_datetime = series_datetime;
	}


	public String getProtocol_name() {
		return protocol_name;
	}


	public void setProtocol_name(String protocol_name) {
		this.protocol_name = protocol_name;
	}


	public double getNominal_single_collimation_width() {
		return nominal_single_collimation_width;
	}


	public void setNominal_single_collimation_width(double nominal_single_collimation_width) {
		this.nominal_single_collimation_width = nominal_single_collimation_width;
	}


	public double getExposure_time_per_rotation() {
		return exposure_time_per_rotation;
	}


	public void setExposure_time_per_rotation(double exposure_time_per_rotation) {
		this.exposure_time_per_rotation = exposure_time_per_rotation;
	}


	public String getIterative_recon_level() {
		return iterative_recon_level;
	}


	public void setIterative_recon_level(String iterative_recon_level) {
		this.iterative_recon_level = iterative_recon_level;
	}


	public double getCtdi_vol_mean() {
		return ctdi_vol_mean;
	}


	public void setCtdi_vol_mean(double ctdi_vol_mean) {
		this.ctdi_vol_mean = ctdi_vol_mean;
	}


	public double getTable_feed_per_rotation() {
		return table_feed_per_rotation;
	}


	public void setTable_feed_per_rotation(double table_feed_per_rotation) {
		this.table_feed_per_rotation = table_feed_per_rotation;
	}


	public double getMaximum_xray_tube_current() {
		return maximum_xray_tube_current;
	}


	public void setMaximum_xray_tube_current(double maximum_xray_tube_current) {
		this.maximum_xray_tube_current = maximum_xray_tube_current;
	}


	public String getCtdiw_phantom_type() {
		return ctdiw_phantom_type;
	}


	public void setCtdiw_phantom_type(String ctdiw_phantom_type) {
		this.ctdiw_phantom_type = ctdiw_phantom_type;
	}


	public int getNumber_of_xray_sources() {
		return number_of_xray_sources;
	}


	public void setNumber_of_xray_sources(int number_of_xray_sources) {
		this.number_of_xray_sources = number_of_xray_sources;
	}


	public double getNominal_total_collimation_width() {
		return nominal_total_collimation_width;
	}


	public void setNominal_total_collimation_width(double nominal_total_collimation_width) {
		this.nominal_total_collimation_width = nominal_total_collimation_width;
	}


	public double getDose_length_product() {
		return dose_length_product;
	}


	public void setDose_length_product(double dose_length_product) {
		this.dose_length_product = dose_length_product;
	}


	public double getXray_tube_voltage() {
		return xray_tube_voltage;
	}


	public void setXray_tube_voltage(double xray_tube_voltage) {
		this.xray_tube_voltage = xray_tube_voltage;
	}


	public double getPitch_factor() {
		return pitch_factor;
	}


	public void setPitch_factor(double pitch_factor) {
		this.pitch_factor = pitch_factor;
	}


	public double getScanning_length() {
		return scanning_length;
	}


	public void setScanning_length(double scanning_length) {
		this.scanning_length = scanning_length;
	}


	public double getDuration_of_xray_on() {
		return duration_of_xray_on;
	}


	public void setDuration_of_xray_on(double duration_of_xray_on) {
		this.duration_of_xray_on = duration_of_xray_on;
	}


	public double getGantry_period() {
		return gantry_period;
	}


	public void setGantry_period(double gantry_period) {
		this.gantry_period = gantry_period;
	}


	public int getAcquisition_number() {
		return acquisition_number;
	}


	public void setAcquisition_number(int acquisition_number) {
		this.acquisition_number = acquisition_number;
	}


	public double getDistance_source_to_detector() {
		return distance_source_to_detector;
	}


	public void setDistance_source_to_detector(double distance_source_to_detector) {
		this.distance_source_to_detector = distance_source_to_detector;
	}


	public int getGenerator_power() {
		return generator_power;
	}


	public void setGenerator_power(int generator_power) {
		this.generator_power = generator_power;
	}


	public double getReconstruction_diameter() {
		return reconstruction_diameter;
	}


	public void setReconstruction_diameter(double reconstruction_diameter) {
		this.reconstruction_diameter = reconstruction_diameter;
	}


	public double getDistance_source_to_patient() {
		return distance_source_to_patient;
	}


	public void setDistance_source_to_patient(double distance_source_to_patient) {
		this.distance_source_to_patient = distance_source_to_patient;
	}


	public double getFocal_spot_size() {
		return focal_spot_size;
	}


	public void setFocal_spot_size(double focal_spot_size) {
		this.focal_spot_size = focal_spot_size;
	}


	public double getGantry_detector_tilt() {
		return gantry_detector_tilt;
	}


	public void setGantry_detector_tilt(double gantry_detector_tilt) {
		this.gantry_detector_tilt = gantry_detector_tilt;
	}


	public double getSlice_thickness() {
		return slice_thickness;
	}


	public void setSlice_thickness(double slice_thickness) {
		this.slice_thickness = slice_thickness;
	}


	public double getSpacing_between_slices() {
		return spacing_between_slices;
	}


	public void setSpacing_between_slices(double spacing_between_slices) {
		this.spacing_between_slices = spacing_between_slices;
	}


	public String getConvolution_kernel() {
		return convolution_kernel;
	}


	public void setConvolution_kernel(String convolution_kernel) {
		this.convolution_kernel = convolution_kernel;
	}


	public double getData_collection_diameter() {
		return data_collection_diameter;
	}


	public void setData_collection_diameter(double data_collection_diameter) {
		this.data_collection_diameter = data_collection_diameter;
	}


	public double getNumber_of_macro_rows_in_detector() {
		return number_of_macro_rows_in_detector;
	}


	public void setNumber_of_macro_rows_in_detector(double number_of_macro_rows_in_detector) {
		this.number_of_macro_rows_in_detector = number_of_macro_rows_in_detector;
	}


	public int getTen_times_noise_standard_deviation() {
		return ten_times_noise_standard_deviation;
	}


	public void setTen_times_noise_standard_deviation(int ten_times_noise_standard_deviation) {
		this.ten_times_noise_standard_deviation = ten_times_noise_standard_deviation;
	}


	public int getNumber_of_images() {
		return number_of_images;
	}


	public void setNumber_of_images(int number_of_images) {
		this.number_of_images = number_of_images;
	}


	public double getTable_height() {
		return table_height;
	}


	public void setTable_height(double table_height) {
		this.table_height = table_height;
	}


	public String getFilter_type() {
		return filter_type;
	}


	public void setFilter_type(String filter_type) {
		this.filter_type = filter_type;
	}


	public int getScan_fov_type() {
		return scan_fov_type;
	}


	public void setScan_fov_type(int scan_fov_type) {
		this.scan_fov_type = scan_fov_type;
	}


	public String getRotation_direction() {
		return rotation_direction;
	}


	public void setRotation_direction(String rotation_direction) {
		this.rotation_direction = rotation_direction;
	}


	public double getStart_slice_location() {
		return start_slice_location;
	}


	public void setStart_slice_location(double start_slice_location) {
		this.start_slice_location = start_slice_location;
	}


	public double getEnd_slice_location() {
		return end_slice_location;
	}


	public void setEnd_slice_location(double end_slice_location) {
		this.end_slice_location = end_slice_location;
	}


	public double getExposure() {
		return exposure;
	}


	public void setExposure(double exposure) {
		this.exposure = exposure;
	}


	public String getPixel_spacing() {
		return pixel_spacing;
	}


	public void setPixel_spacing(String pixel_spacing) {
		this.pixel_spacing = pixel_spacing;
	}


	public double getDose_length_product_ssde() {
		return dose_length_product_ssde;
	}


	public void setDose_length_product_ssde(double dose_length_product_ssde) {
		this.dose_length_product_ssde = dose_length_product_ssde;
	}


	public Long getProtocol_key() {
		return protocol_key;
	}


	public void setProtocol_key(Long protocol_key) {
		this.protocol_key = protocol_key;
	}


	public String getPatient_position() {
		return patient_position;
	}


	public void setPatient_position(String patient_position) {
		this.patient_position = patient_position;
	}


	public double getHeart_rate() {
		return heart_rate;
	}


	public void setHeart_rate(double heart_rate) {
		this.heart_rate = heart_rate;
	}


	public String getPatient_orientation() {
		return patient_orientation;
	}


	public void setPatient_orientation(String patient_orientation) {
		this.patient_orientation = patient_orientation;
	}


	public double getIsocenter_delta_x() {
		return isocenter_delta_x;
	}


	public void setIsocenter_delta_x(double isocenter_delta_x) {
		this.isocenter_delta_x = isocenter_delta_x;
	}


	public double getIsocenter_delta_y() {
		return isocenter_delta_y;
	}


	public void setIsocenter_delta_y(double isocenter_delta_y) {
		this.isocenter_delta_y = isocenter_delta_y;
	}


	public double getPatient_width_max() {
		return patient_width_max;
	}


	public void setPatient_width_max(double patient_width_max) {
		this.patient_width_max = patient_width_max;
	}


	public double getPatient_thickness_max() {
		return patient_thickness_max;
	}


	public void setPatient_thickness_max(double patient_thickness_max) {
		this.patient_thickness_max = patient_thickness_max;
	}


	public double getEffective_diameter() {
		return effective_diameter;
	}


	public void setEffective_diameter(double effective_diameter) {
		this.effective_diameter = effective_diameter;
	}


	public String getPatient_id() {
		return patient_id;
	}


	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}


	public String getInstance_name() {
		return instance_name;
	}


	public void setInstance_name(String instance_name) {
		this.instance_name = instance_name;
	}


	public double getPatient_height() {
		return patient_height;
	}


	public void setPatient_height(double patient_height) {
		this.patient_height = patient_height;
	}


	public String getStudy_id() {
		return study_id;
	}


	public void setStudy_id(String study_id) {
		this.study_id = study_id;
	}


	public Timestamp getStudy_datetime() {
		return study_datetime;
	}


	public void setStudy_datetime(Timestamp study_datetime) {
		this.study_datetime = study_datetime;
	}


	public int getDomain_key() {
		return domain_key;
	}


	public void setDomain_key(int domain_key) {
		this.domain_key = domain_key;
	}


	public String getNature_of_exam() {
		return nature_of_exam;
	}


	public void setNature_of_exam(String nature_of_exam) {
		this.nature_of_exam = nature_of_exam;
	}


	public double getPatient_age() {
		return patient_age;
	}


	public void setPatient_age(double patient_age) {
		this.patient_age = patient_age;
	}


	public Long getPatient_key() {
		return patient_key;
	}


	public void setPatient_key(Long patient_key) {
		this.patient_key = patient_key;
	}


	public String getSeries_type() {
		return series_type;
	}


	public void setSeries_type(String series_type) {
		this.series_type = series_type;
	}


	public double getDose_length_product_estimated() {
		return dose_length_product_estimated;
	}


	public void setDose_length_product_estimated(double dose_length_product_estimated) {
		this.dose_length_product_estimated = dose_length_product_estimated;
	}


	public double getMedian_age_per_protocol() {
		return median_age_per_protocol;
	}


	public void setMedian_age_per_protocol(double median_age_per_protocol) {
		this.median_age_per_protocol = median_age_per_protocol;
	}


	public Timestamp getSeries_end_datetime() {
		return series_end_datetime;
	}


	public void setSeries_end_datetime(Timestamp series_end_datetime) {
		this.series_end_datetime = series_end_datetime;
	}


	public int getSeries_duration() {
		return series_duration;
	}


	public void setSeries_duration(int series_duration) {
		this.series_duration = series_duration;
	}
	
	
}
