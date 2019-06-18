/**
 * 
 */
package fr.alten.dw.model.beans.Serie;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 *
 */
public class Serie_rf implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6695008013128549150L;

	private Long id;
	private int instance_key;
	private double exposure_time;
	private double xray_tube_current_ua;
	private double kvp;
	private double dose_area_product;
	private Long protocol_key;
	private String protocol_name;
	private double image_dose;
	private double detector_arc_gain;
	private double film_speed_selection;
	private double deviation_index;
	private double compensated_detector_exposure;
	private double uncompensated_detector_exposure;
	private double median_anatomy_count_value;
	private Long shift_vector_for_pasting;
	private Long pasting_overlap;
	private double frame_rate;
	private double tube_to_detector_angle;
	private double ots_column_rotation_angle;
	private double start_height;
	private double end_height;
	private double sampling_factor;
	private double slice_interval;
	private Date content_date;
	private Time content_time;
	private Date acquisition_date;
	private Time acquisition_time;
	private double detector_temperature;
	private double detector_sensitivity;
	private double field_of_view_origin;
	private double field_of_view_rotation;
	private double imager_pixel_spacing;
	private double distance_source_to_patient;
	private double distance_source_to_detector;
	private double xray_tube_current_ma;
	private double exposure_in_mas;
	private double exposure_in_uas;
	private double image_dose_area_product;
	private double entrance_dose;
	private double filter_thickness_minimum;
	private double filter_thickness_maximum;
	private double focal_spot_size;
	private double tomo_layer_height;
	private double tomo_angle;
	private double detector_secondary_angle;
	private double detector_primary_angle;
	private double pixel_spacing;
	private double slice_thickness;
	private double slice_location;
	private int user_window_center;
	private int user_window_width;
	private int requested_detector_entrance_dose;
	private int image_number_for_pasting;
	private int sub_image_collimator_vertices;
	private int instance_number;
	private int series_rows;
	private int series_columns;
	private int bits_allocated;
	private int bits_stored;
	private int high_bit;
	private int rescale_intercept;
	private int rescale_slope;
	private int window_center;
	private int window_width;
	private int detector_element_physical_size;
	private int detector_element_spacing;
	private int tomo_time;
	private int number_of_tomosynthesis_source_images;
	private int samples_per_pixel;
	private Boolean collimator_rotation;
	private Boolean override_mode;
	private Boolean burned_in_annotation;
	private Boolean field_of_view_horizontal_flip;
	private Boolean detector_conditions_nominal_flag;
	private String series_modality;
	private String image_laterality;
	private String deviation_index_control_limits;
	private String filter_type;
	private String acquisition_type;
	private String acquisition_uid;
	private String detected_field_of_view;
	private String adjusted_field_of_view;
	private String key_stone_coordinates;
	private String focal_spot_positions;
	private String sweep_direction;
	private String receptor_type;
	private String presentation_intent_type;
	private String image_type;
	private String derivation_description;
	private String quality_control_image;
	private String lossy_image_compression;
	private String photometric_interpretation;
	private String pixel_representation;
	private String pixel_intensity_relationship;
	private String anatomic_region;
	private String rescale_type;
	private String presentation_lut_shape;
	private String acquisition_device_processing_description;
	private String acquisition_device_processing_code;
	private String voi_lut_descriptor;
	private String voi_lut_explanation;
	private String voi_lut_data;
	private String window_center_and_width_explanation;
	private String detector_type;
	private String detector_configuration;
	private String detector_id;
	private String detector_binning;
	private String field_of_view_shape;
	private String field_of_view_dimensions;
	private String detector_active_shape;
	private String detector_active_dimensions;
	private String collimator_shape;
	private String collimator_vertices;
	private String view_position;
	private String series_view;
	private String patient_orientation;
	private String patient_orientation_modifier;
	private String patient_ganrty_relationship;
	private String positioner_type;
	private String comments_on_radiation_dose;
	private String filter_material;
	private String exposure_control_mode;
	private String exposure_control_mode_description;
	private String series_grid;
	private String frame_of_reference_uid;
	private String position_reference_indicator;
	private String tomo_type;
	private String tomo_class;
	private String patient_size_string;
	private String series_instance_uid;
	private Long study_key;
	private String target_region_key;
	private int series_number;
	private Timestamp series_datetime;
	private String irradiation_event_uid;
	private String dosewatch_generated_uid;
	private Long series_description_key;
	private String series_description_name;
	private int facility_key;
	private String facility_description;
	private Timestamp dt_last_update_dwh;
	private String instance_name;
	private double exposure_index;
	private Timestamp series_end_datetime;
	private int series_duration;

			
	public Serie_rf() {
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


	public double getExposure_time() {
		return exposure_time;
	}


	public void setExposure_time(double exposure_time) {
		this.exposure_time = exposure_time;
	}


	public double getXray_tube_current_ua() {
		return xray_tube_current_ua;
	}


	public void setXray_tube_current_ua(double xray_tube_current_ua) {
		this.xray_tube_current_ua = xray_tube_current_ua;
	}


	public double getKvp() {
		return kvp;
	}


	public void setKvp(double kvp) {
		this.kvp = kvp;
	}


	public double getDose_area_product() {
		return dose_area_product;
	}


	public void setDose_area_product(double dose_area_product) {
		this.dose_area_product = dose_area_product;
	}


	public Long getProtocol_key() {
		return protocol_key;
	}


	public void setProtocol_key(Long protocol_key) {
		this.protocol_key = protocol_key;
	}


	public String getProtocol_name() {
		return protocol_name;
	}


	public void setProtocol_name(String protocol_name) {
		this.protocol_name = protocol_name;
	}


	public double getImage_dose() {
		return image_dose;
	}


	public void setImage_dose(double image_dose) {
		this.image_dose = image_dose;
	}


	public double getDetector_arc_gain() {
		return detector_arc_gain;
	}


	public void setDetector_arc_gain(double detector_arc_gain) {
		this.detector_arc_gain = detector_arc_gain;
	}


	public double getFilm_speed_selection() {
		return film_speed_selection;
	}


	public void setFilm_speed_selection(double film_speed_selection) {
		this.film_speed_selection = film_speed_selection;
	}


	public double getDeviation_index() {
		return deviation_index;
	}


	public void setDeviation_index(double deviation_index) {
		this.deviation_index = deviation_index;
	}


	public double getCompensated_detector_exposure() {
		return compensated_detector_exposure;
	}


	public void setCompensated_detector_exposure(double compensated_detector_exposure) {
		this.compensated_detector_exposure = compensated_detector_exposure;
	}


	public double getUncompensated_detector_exposure() {
		return uncompensated_detector_exposure;
	}


	public void setUncompensated_detector_exposure(double uncompensated_detector_exposure) {
		this.uncompensated_detector_exposure = uncompensated_detector_exposure;
	}


	public double getMedian_anatomy_count_value() {
		return median_anatomy_count_value;
	}


	public void setMedian_anatomy_count_value(double median_anatomy_count_value) {
		this.median_anatomy_count_value = median_anatomy_count_value;
	}


	public Long getShift_vector_for_pasting() {
		return shift_vector_for_pasting;
	}


	public void setShift_vector_for_pasting(Long shift_vector_for_pasting) {
		this.shift_vector_for_pasting = shift_vector_for_pasting;
	}


	public Long getPasting_overlap() {
		return pasting_overlap;
	}


	public void setPasting_overlap(Long pasting_overlap) {
		this.pasting_overlap = pasting_overlap;
	}


	public double getFrame_rate() {
		return frame_rate;
	}


	public void setFrame_rate(double frame_rate) {
		this.frame_rate = frame_rate;
	}


	public double getTube_to_detector_angle() {
		return tube_to_detector_angle;
	}


	public void setTube_to_detector_angle(double tube_to_detector_angle) {
		this.tube_to_detector_angle = tube_to_detector_angle;
	}


	public double getOts_column_rotation_angle() {
		return ots_column_rotation_angle;
	}


	public void setOts_column_rotation_angle(double ots_column_rotation_angle) {
		this.ots_column_rotation_angle = ots_column_rotation_angle;
	}


	public double getStart_height() {
		return start_height;
	}


	public void setStart_height(double start_height) {
		this.start_height = start_height;
	}


	public double getEnd_height() {
		return end_height;
	}


	public void setEnd_height(double end_height) {
		this.end_height = end_height;
	}


	public double getSampling_factor() {
		return sampling_factor;
	}


	public void setSampling_factor(double sampling_factor) {
		this.sampling_factor = sampling_factor;
	}


	public double getSlice_interval() {
		return slice_interval;
	}


	public void setSlice_interval(double slice_interval) {
		this.slice_interval = slice_interval;
	}


	public Date getContent_date() {
		return content_date;
	}


	public void setContent_date(Date content_date) {
		this.content_date = content_date;
	}


	public Time getContent_time() {
		return content_time;
	}


	public void setContent_time(Time content_time) {
		this.content_time = content_time;
	}


	public Date getAcquisition_date() {
		return acquisition_date;
	}


	public void setAcquisition_date(Date acquisition_date) {
		this.acquisition_date = acquisition_date;
	}


	public Time getAcquisition_time() {
		return acquisition_time;
	}


	public void setAcquisition_time(Time acquisition_time) {
		this.acquisition_time = acquisition_time;
	}


	public double getDetector_temperature() {
		return detector_temperature;
	}


	public void setDetector_temperature(double detector_temperature) {
		this.detector_temperature = detector_temperature;
	}


	public double getDetector_sensitivity() {
		return detector_sensitivity;
	}


	public void setDetector_sensitivity(double detector_sensitivity) {
		this.detector_sensitivity = detector_sensitivity;
	}


	public double getField_of_view_origin() {
		return field_of_view_origin;
	}


	public void setField_of_view_origin(double field_of_view_origin) {
		this.field_of_view_origin = field_of_view_origin;
	}


	public double getField_of_view_rotation() {
		return field_of_view_rotation;
	}


	public void setField_of_view_rotation(double field_of_view_rotation) {
		this.field_of_view_rotation = field_of_view_rotation;
	}


	public double getImager_pixel_spacing() {
		return imager_pixel_spacing;
	}


	public void setImager_pixel_spacing(double imager_pixel_spacing) {
		this.imager_pixel_spacing = imager_pixel_spacing;
	}


	public double getDistance_source_to_patient() {
		return distance_source_to_patient;
	}


	public void setDistance_source_to_patient(double distance_source_to_patient) {
		this.distance_source_to_patient = distance_source_to_patient;
	}


	public double getDistance_source_to_detector() {
		return distance_source_to_detector;
	}


	public void setDistance_source_to_detector(double distance_source_to_detector) {
		this.distance_source_to_detector = distance_source_to_detector;
	}


	public double getXray_tube_current_ma() {
		return xray_tube_current_ma;
	}


	public void setXray_tube_current_ma(double xray_tube_current_ma) {
		this.xray_tube_current_ma = xray_tube_current_ma;
	}


	public double getExposure_in_mas() {
		return exposure_in_mas;
	}


	public void setExposure_in_mas(double exposure_in_mas) {
		this.exposure_in_mas = exposure_in_mas;
	}


	public double getExposure_in_uas() {
		return exposure_in_uas;
	}


	public void setExposure_in_uas(double exposure_in_uas) {
		this.exposure_in_uas = exposure_in_uas;
	}


	public double getImage_dose_area_product() {
		return image_dose_area_product;
	}


	public void setImage_dose_area_product(double image_dose_area_product) {
		this.image_dose_area_product = image_dose_area_product;
	}


	public double getEntrance_dose() {
		return entrance_dose;
	}


	public void setEntrance_dose(double entrance_dose) {
		this.entrance_dose = entrance_dose;
	}


	public double getFilter_thickness_minimum() {
		return filter_thickness_minimum;
	}


	public void setFilter_thickness_minimum(double filter_thickness_minimum) {
		this.filter_thickness_minimum = filter_thickness_minimum;
	}


	public double getFilter_thickness_maximum() {
		return filter_thickness_maximum;
	}


	public void setFilter_thickness_maximum(double filter_thickness_maximum) {
		this.filter_thickness_maximum = filter_thickness_maximum;
	}


	public double getFocal_spot_size() {
		return focal_spot_size;
	}


	public void setFocal_spot_size(double focal_spot_size) {
		this.focal_spot_size = focal_spot_size;
	}


	public double getTomo_layer_height() {
		return tomo_layer_height;
	}


	public void setTomo_layer_height(double tomo_layer_height) {
		this.tomo_layer_height = tomo_layer_height;
	}


	public double getTomo_angle() {
		return tomo_angle;
	}


	public void setTomo_angle(double tomo_angle) {
		this.tomo_angle = tomo_angle;
	}


	public double getDetector_secondary_angle() {
		return detector_secondary_angle;
	}


	public void setDetector_secondary_angle(double detector_secondary_angle) {
		this.detector_secondary_angle = detector_secondary_angle;
	}


	public double getDetector_primary_angle() {
		return detector_primary_angle;
	}


	public void setDetector_primary_angle(double detector_primary_angle) {
		this.detector_primary_angle = detector_primary_angle;
	}


	public double getPixel_spacing() {
		return pixel_spacing;
	}


	public void setPixel_spacing(double pixel_spacing) {
		this.pixel_spacing = pixel_spacing;
	}


	public double getSlice_thickness() {
		return slice_thickness;
	}


	public void setSlice_thickness(double slice_thickness) {
		this.slice_thickness = slice_thickness;
	}


	public double getSlice_location() {
		return slice_location;
	}


	public void setSlice_location(double slice_location) {
		this.slice_location = slice_location;
	}


	public int getUser_window_center() {
		return user_window_center;
	}


	public void setUser_window_center(int user_window_center) {
		this.user_window_center = user_window_center;
	}


	public int getUser_window_width() {
		return user_window_width;
	}


	public void setUser_window_width(int user_window_width) {
		this.user_window_width = user_window_width;
	}


	public int getRequested_detector_entrance_dose() {
		return requested_detector_entrance_dose;
	}


	public void setRequested_detector_entrance_dose(int requested_detector_entrance_dose) {
		this.requested_detector_entrance_dose = requested_detector_entrance_dose;
	}


	public int getImage_number_for_pasting() {
		return image_number_for_pasting;
	}


	public void setImage_number_for_pasting(int image_number_for_pasting) {
		this.image_number_for_pasting = image_number_for_pasting;
	}


	public int getSub_image_collimator_vertices() {
		return sub_image_collimator_vertices;
	}


	public void setSub_image_collimator_vertices(int sub_image_collimator_vertices) {
		this.sub_image_collimator_vertices = sub_image_collimator_vertices;
	}


	public int getInstance_number() {
		return instance_number;
	}


	public void setInstance_number(int instance_number) {
		this.instance_number = instance_number;
	}


	public int getSeries_rows() {
		return series_rows;
	}


	public void setSeries_rows(int series_rows) {
		this.series_rows = series_rows;
	}


	public int getSeries_columns() {
		return series_columns;
	}


	public void setSeries_columns(int series_columns) {
		this.series_columns = series_columns;
	}


	public int getBits_allocated() {
		return bits_allocated;
	}


	public void setBits_allocated(int bits_allocated) {
		this.bits_allocated = bits_allocated;
	}


	public int getBits_stored() {
		return bits_stored;
	}


	public void setBits_stored(int bits_stored) {
		this.bits_stored = bits_stored;
	}


	public int getHigh_bit() {
		return high_bit;
	}


	public void setHigh_bit(int high_bit) {
		this.high_bit = high_bit;
	}


	public int getRescale_intercept() {
		return rescale_intercept;
	}


	public void setRescale_intercept(int rescale_intercept) {
		this.rescale_intercept = rescale_intercept;
	}


	public int getRescale_slope() {
		return rescale_slope;
	}


	public void setRescale_slope(int rescale_slope) {
		this.rescale_slope = rescale_slope;
	}


	public int getWindow_center() {
		return window_center;
	}


	public void setWindow_center(int window_center) {
		this.window_center = window_center;
	}


	public int getWindow_width() {
		return window_width;
	}


	public void setWindow_width(int window_width) {
		this.window_width = window_width;
	}


	public int getDetector_element_physical_size() {
		return detector_element_physical_size;
	}


	public void setDetector_element_physical_size(int detector_element_physical_size) {
		this.detector_element_physical_size = detector_element_physical_size;
	}


	public int getDetector_element_spacing() {
		return detector_element_spacing;
	}


	public void setDetector_element_spacing(int detector_element_spacing) {
		this.detector_element_spacing = detector_element_spacing;
	}


	public int getTomo_time() {
		return tomo_time;
	}


	public void setTomo_time(int tomo_time) {
		this.tomo_time = tomo_time;
	}


	public int getNumber_of_tomosynthesis_source_images() {
		return number_of_tomosynthesis_source_images;
	}


	public void setNumber_of_tomosynthesis_source_images(int number_of_tomosynthesis_source_images) {
		this.number_of_tomosynthesis_source_images = number_of_tomosynthesis_source_images;
	}


	public int getSamples_per_pixel() {
		return samples_per_pixel;
	}


	public void setSamples_per_pixel(int samples_per_pixel) {
		this.samples_per_pixel = samples_per_pixel;
	}


	public Boolean getCollimator_rotation() {
		return collimator_rotation;
	}


	public void setCollimator_rotation(Boolean collimator_rotation) {
		this.collimator_rotation = collimator_rotation;
	}


	public Boolean getOverride_mode() {
		return override_mode;
	}


	public void setOverride_mode(Boolean override_mode) {
		this.override_mode = override_mode;
	}


	public Boolean getBurned_in_annotation() {
		return burned_in_annotation;
	}


	public void setBurned_in_annotation(Boolean burned_in_annotation) {
		this.burned_in_annotation = burned_in_annotation;
	}


	public Boolean getField_of_view_horizontal_flip() {
		return field_of_view_horizontal_flip;
	}


	public void setField_of_view_horizontal_flip(Boolean field_of_view_horizontal_flip) {
		this.field_of_view_horizontal_flip = field_of_view_horizontal_flip;
	}


	public Boolean getDetector_conditions_nominal_flag() {
		return detector_conditions_nominal_flag;
	}


	public void setDetector_conditions_nominal_flag(Boolean detector_conditions_nominal_flag) {
		this.detector_conditions_nominal_flag = detector_conditions_nominal_flag;
	}


	public String getSeries_modality() {
		return series_modality;
	}


	public void setSeries_modality(String series_modality) {
		this.series_modality = series_modality;
	}


	public String getImage_laterality() {
		return image_laterality;
	}


	public void setImage_laterality(String image_laterality) {
		this.image_laterality = image_laterality;
	}


	public String getDeviation_index_control_limits() {
		return deviation_index_control_limits;
	}


	public void setDeviation_index_control_limits(String deviation_index_control_limits) {
		this.deviation_index_control_limits = deviation_index_control_limits;
	}


	public String getFilter_type() {
		return filter_type;
	}


	public void setFilter_type(String filter_type) {
		this.filter_type = filter_type;
	}


	public String getAcquisition_type() {
		return acquisition_type;
	}


	public void setAcquisition_type(String acquisition_type) {
		this.acquisition_type = acquisition_type;
	}


	public String getAcquisition_uid() {
		return acquisition_uid;
	}


	public void setAcquisition_uid(String acquisition_uid) {
		this.acquisition_uid = acquisition_uid;
	}


	public String getDetected_field_of_view() {
		return detected_field_of_view;
	}


	public void setDetected_field_of_view(String detected_field_of_view) {
		this.detected_field_of_view = detected_field_of_view;
	}


	public String getAdjusted_field_of_view() {
		return adjusted_field_of_view;
	}


	public void setAdjusted_field_of_view(String adjusted_field_of_view) {
		this.adjusted_field_of_view = adjusted_field_of_view;
	}


	public String getKey_stone_coordinates() {
		return key_stone_coordinates;
	}


	public void setKey_stone_coordinates(String key_stone_coordinates) {
		this.key_stone_coordinates = key_stone_coordinates;
	}


	public String getFocal_spot_positions() {
		return focal_spot_positions;
	}


	public void setFocal_spot_positions(String focal_spot_positions) {
		this.focal_spot_positions = focal_spot_positions;
	}


	public String getSweep_direction() {
		return sweep_direction;
	}


	public void setSweep_direction(String sweep_direction) {
		this.sweep_direction = sweep_direction;
	}


	public String getReceptor_type() {
		return receptor_type;
	}


	public void setReceptor_type(String receptor_type) {
		this.receptor_type = receptor_type;
	}


	public String getPresentation_intent_type() {
		return presentation_intent_type;
	}


	public void setPresentation_intent_type(String presentation_intent_type) {
		this.presentation_intent_type = presentation_intent_type;
	}


	public String getImage_type() {
		return image_type;
	}


	public void setImage_type(String image_type) {
		this.image_type = image_type;
	}


	public String getDerivation_description() {
		return derivation_description;
	}


	public void setDerivation_description(String derivation_description) {
		this.derivation_description = derivation_description;
	}


	public String getQuality_control_image() {
		return quality_control_image;
	}


	public void setQuality_control_image(String quality_control_image) {
		this.quality_control_image = quality_control_image;
	}


	public String getLossy_image_compression() {
		return lossy_image_compression;
	}


	public void setLossy_image_compression(String lossy_image_compression) {
		this.lossy_image_compression = lossy_image_compression;
	}


	public String getPhotometric_interpretation() {
		return photometric_interpretation;
	}


	public void setPhotometric_interpretation(String photometric_interpretation) {
		this.photometric_interpretation = photometric_interpretation;
	}


	public String getPixel_representation() {
		return pixel_representation;
	}


	public void setPixel_representation(String pixel_representation) {
		this.pixel_representation = pixel_representation;
	}


	public String getPixel_intensity_relationship() {
		return pixel_intensity_relationship;
	}


	public void setPixel_intensity_relationship(String pixel_intensity_relationship) {
		this.pixel_intensity_relationship = pixel_intensity_relationship;
	}


	public String getAnatomic_region() {
		return anatomic_region;
	}


	public void setAnatomic_region(String anatomic_region) {
		this.anatomic_region = anatomic_region;
	}


	public String getRescale_type() {
		return rescale_type;
	}


	public void setRescale_type(String rescale_type) {
		this.rescale_type = rescale_type;
	}


	public String getPresentation_lut_shape() {
		return presentation_lut_shape;
	}


	public void setPresentation_lut_shape(String presentation_lut_shape) {
		this.presentation_lut_shape = presentation_lut_shape;
	}


	public String getAcquisition_device_processing_description() {
		return acquisition_device_processing_description;
	}


	public void setAcquisition_device_processing_description(String acquisition_device_processing_description) {
		this.acquisition_device_processing_description = acquisition_device_processing_description;
	}


	public String getAcquisition_device_processing_code() {
		return acquisition_device_processing_code;
	}


	public void setAcquisition_device_processing_code(String acquisition_device_processing_code) {
		this.acquisition_device_processing_code = acquisition_device_processing_code;
	}


	public String getVoi_lut_descriptor() {
		return voi_lut_descriptor;
	}


	public void setVoi_lut_descriptor(String voi_lut_descriptor) {
		this.voi_lut_descriptor = voi_lut_descriptor;
	}


	public String getVoi_lut_explanation() {
		return voi_lut_explanation;
	}


	public void setVoi_lut_explanation(String voi_lut_explanation) {
		this.voi_lut_explanation = voi_lut_explanation;
	}


	public String getVoi_lut_data() {
		return voi_lut_data;
	}


	public void setVoi_lut_data(String voi_lut_data) {
		this.voi_lut_data = voi_lut_data;
	}


	public String getWindow_center_and_width_explanation() {
		return window_center_and_width_explanation;
	}


	public void setWindow_center_and_width_explanation(String window_center_and_width_explanation) {
		this.window_center_and_width_explanation = window_center_and_width_explanation;
	}


	public String getDetector_type() {
		return detector_type;
	}


	public void setDetector_type(String detector_type) {
		this.detector_type = detector_type;
	}


	public String getDetector_configuration() {
		return detector_configuration;
	}


	public void setDetector_configuration(String detector_configuration) {
		this.detector_configuration = detector_configuration;
	}


	public String getDetector_id() {
		return detector_id;
	}


	public void setDetector_id(String detector_id) {
		this.detector_id = detector_id;
	}


	public String getDetector_binning() {
		return detector_binning;
	}


	public void setDetector_binning(String detector_binning) {
		this.detector_binning = detector_binning;
	}


	public String getField_of_view_shape() {
		return field_of_view_shape;
	}


	public void setField_of_view_shape(String field_of_view_shape) {
		this.field_of_view_shape = field_of_view_shape;
	}


	public String getField_of_view_dimensions() {
		return field_of_view_dimensions;
	}


	public void setField_of_view_dimensions(String field_of_view_dimensions) {
		this.field_of_view_dimensions = field_of_view_dimensions;
	}


	public String getDetector_active_shape() {
		return detector_active_shape;
	}


	public void setDetector_active_shape(String detector_active_shape) {
		this.detector_active_shape = detector_active_shape;
	}


	public String getDetector_active_dimensions() {
		return detector_active_dimensions;
	}


	public void setDetector_active_dimensions(String detector_active_dimensions) {
		this.detector_active_dimensions = detector_active_dimensions;
	}


	public String getCollimator_shape() {
		return collimator_shape;
	}


	public void setCollimator_shape(String collimator_shape) {
		this.collimator_shape = collimator_shape;
	}


	public String getCollimator_vertices() {
		return collimator_vertices;
	}


	public void setCollimator_vertices(String collimator_vertices) {
		this.collimator_vertices = collimator_vertices;
	}


	public String getView_position() {
		return view_position;
	}


	public void setView_position(String view_position) {
		this.view_position = view_position;
	}


	public String getSeries_view() {
		return series_view;
	}


	public void setSeries_view(String series_view) {
		this.series_view = series_view;
	}


	public String getPatient_orientation() {
		return patient_orientation;
	}


	public void setPatient_orientation(String patient_orientation) {
		this.patient_orientation = patient_orientation;
	}


	public String getPatient_orientation_modifier() {
		return patient_orientation_modifier;
	}


	public void setPatient_orientation_modifier(String patient_orientation_modifier) {
		this.patient_orientation_modifier = patient_orientation_modifier;
	}


	public String getPatient_ganrty_relationship() {
		return patient_ganrty_relationship;
	}


	public void setPatient_ganrty_relationship(String patient_ganrty_relationship) {
		this.patient_ganrty_relationship = patient_ganrty_relationship;
	}


	public String getPositioner_type() {
		return positioner_type;
	}


	public void setPositioner_type(String positioner_type) {
		this.positioner_type = positioner_type;
	}


	public String getComments_on_radiation_dose() {
		return comments_on_radiation_dose;
	}


	public void setComments_on_radiation_dose(String comments_on_radiation_dose) {
		this.comments_on_radiation_dose = comments_on_radiation_dose;
	}


	public String getFilter_material() {
		return filter_material;
	}


	public void setFilter_material(String filter_material) {
		this.filter_material = filter_material;
	}


	public String getExposure_control_mode() {
		return exposure_control_mode;
	}


	public void setExposure_control_mode(String exposure_control_mode) {
		this.exposure_control_mode = exposure_control_mode;
	}


	public String getExposure_control_mode_description() {
		return exposure_control_mode_description;
	}


	public void setExposure_control_mode_description(String exposure_control_mode_description) {
		this.exposure_control_mode_description = exposure_control_mode_description;
	}


	public String getSeries_grid() {
		return series_grid;
	}


	public void setSeries_grid(String series_grid) {
		this.series_grid = series_grid;
	}


	public String getFrame_of_reference_uid() {
		return frame_of_reference_uid;
	}


	public void setFrame_of_reference_uid(String frame_of_reference_uid) {
		this.frame_of_reference_uid = frame_of_reference_uid;
	}


	public String getPosition_reference_indicator() {
		return position_reference_indicator;
	}


	public void setPosition_reference_indicator(String position_reference_indicator) {
		this.position_reference_indicator = position_reference_indicator;
	}


	public String getTomo_type() {
		return tomo_type;
	}


	public void setTomo_type(String tomo_type) {
		this.tomo_type = tomo_type;
	}


	public String getTomo_class() {
		return tomo_class;
	}


	public void setTomo_class(String tomo_class) {
		this.tomo_class = tomo_class;
	}


	public String getPatient_size_string() {
		return patient_size_string;
	}


	public void setPatient_size_string(String patient_size_string) {
		this.patient_size_string = patient_size_string;
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


	public String getIrradiation_event_uid() {
		return irradiation_event_uid;
	}


	public void setIrradiation_event_uid(String irradiation_event_uid) {
		this.irradiation_event_uid = irradiation_event_uid;
	}


	public String getDosewatch_generated_uid() {
		return dosewatch_generated_uid;
	}


	public void setDosewatch_generated_uid(String dosewatch_generated_uid) {
		this.dosewatch_generated_uid = dosewatch_generated_uid;
	}


	public Long getSeries_description_key() {
		return series_description_key;
	}


	public void setSeries_description_key(Long series_description_key) {
		this.series_description_key = series_description_key;
	}


	public String getSeries_description_name() {
		return series_description_name;
	}


	public void setSeries_description_name(String series_description_name) {
		this.series_description_name = series_description_name;
	}


	public int getFacility_key() {
		return facility_key;
	}


	public void setFacility_key(int facility_key) {
		this.facility_key = facility_key;
	}


	public String getFacility_description() {
		return facility_description;
	}


	public void setFacility_description(String facility_description) {
		this.facility_description = facility_description;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}


	public String getInstance_name() {
		return instance_name;
	}


	public void setInstance_name(String instance_name) {
		this.instance_name = instance_name;
	}


	public double getExposure_index() {
		return exposure_index;
	}


	public void setExposure_index(double exposure_index) {
		this.exposure_index = exposure_index;
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
