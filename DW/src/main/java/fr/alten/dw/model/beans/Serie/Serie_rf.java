/**
 *
 */
package fr.alten.dw.model.beans.Serie;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
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
@Table(name = "dwh_serie_rf")
public class Serie_rf implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -4817399598326620661L;
	@Id
	@Column(name = "id")
	private Long id;
	private Integer instance_key;
	private Double exposure_time;
	private Double xray_tube_current_ua;
	private Double kvp;
	private Double dose_area_product;
	private Long protocol_key;
	private String protocol_name;
	private Double image_dose;
	private Double detector_arc_gain;
	private Double film_speed_selection;
	private Double deviation_index;
	private Double compensated_detector_exposure;
	private Double uncompensated_detector_exposure;
	private Double median_anatomy_count_value;
	private Long shift_vector_for_pasting;
	private Long pasting_overlap;
	private Double frame_rate;
	private Double tube_to_detector_angle;
	private Double ots_column_rotation_angle;
	private Double start_height;
	private Double end_height;
	private Double sampling_factor;
	private Double slice_interval;
	private Date content_date;
	private Time content_time;
	private Date acquisition_date;
	private Time acquisition_time;
	private Double detector_temperature;
	private Double detector_sensitivity;
	private Double field_of_view_origin;
	private Double field_of_view_rotation;
	private Double imager_pixel_spacing;
	private Double distance_source_to_patient;
	private Double distance_source_to_detector;
	private Double xray_tube_current_ma;
	private Double exposure_in_mas;
	private Double exposure_in_uas;
	private Double image_dose_area_product;
	private Double entrance_dose;
	private Double filter_thickness_minimum;
	private Double filter_thickness_maximum;
	private Double focal_spot_size;
	private Double tomo_layer_height;
	private Double tomo_angle;
	private Double detector_secondary_angle;
	private Double detector_primary_angle;
	private Double pixel_spacing;
	private Double slice_thickness;
	private Double slice_location;
	private Integer user_window_center;
	private Integer user_window_width;
	private Integer requested_detector_entrance_dose;
	private Integer image_number_for_pasting;
	private Integer sub_image_collimator_vertices;
	private Integer instance_number;
	private Integer series_rows;
	private Integer series_columns;
	private Integer bits_allocated;
	private Integer bits_stored;
	private Integer high_bit;
	private Integer rescale_intercept;
	private Integer rescale_slope;
	private Integer window_center;
	private Integer window_width;
	private Integer detector_element_physical_size;
	private Integer detector_element_spacing;
	private Integer tomo_time;
	private Integer number_of_tomosynthesis_source_images;
	private Integer samples_per_pixel;
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
	private Integer series_number;
	private Timestamp series_datetime;
	private String irradiation_event_uid;
	private String dosewatch_generated_uid;
	private Long series_description_key;
	private String series_description_name;
	private Integer facility_key;
	private String facility_description;
	private Timestamp dt_last_update_dwh;
	private String instance_name;
	private Double exposure_index;
	private Timestamp series_end_datetime;
	private Integer series_duration;

	public Serie_rf() {
		super();
	}

	public Date getAcquisition_date() {
		return this.acquisition_date;
	}

	public String getAcquisition_device_processing_code() {
		return this.acquisition_device_processing_code;
	}

	public String getAcquisition_device_processing_description() {
		return this.acquisition_device_processing_description;
	}

	public Time getAcquisition_time() {
		return this.acquisition_time;
	}

	public String getAcquisition_type() {
		return this.acquisition_type;
	}

	public String getAcquisition_uid() {
		return this.acquisition_uid;
	}

	public String getAdjusted_field_of_view() {
		return this.adjusted_field_of_view;
	}

	public String getAnatomic_region() {
		return this.anatomic_region;
	}

	public Integer getBits_allocated() {
		return this.bits_allocated;
	}

	public Integer getBits_stored() {
		return this.bits_stored;
	}

	public Boolean getBurned_in_annotation() {
		return this.burned_in_annotation;
	}

	public Boolean getCollimator_rotation() {
		return this.collimator_rotation;
	}

	public String getCollimator_shape() {
		return this.collimator_shape;
	}

	public String getCollimator_vertices() {
		return this.collimator_vertices;
	}

	public String getComments_on_radiation_dose() {
		return this.comments_on_radiation_dose;
	}

	public Double getCompensated_detector_exposure() {
		return this.compensated_detector_exposure;
	}

	public Date getContent_date() {
		return this.content_date;
	}

	public Time getContent_time() {
		return this.content_time;
	}

	public String getDerivation_description() {
		return this.derivation_description;
	}

	public String getDetected_field_of_view() {
		return this.detected_field_of_view;
	}

	public String getDetector_active_dimensions() {
		return this.detector_active_dimensions;
	}

	public String getDetector_active_shape() {
		return this.detector_active_shape;
	}

	public Double getDetector_arc_gain() {
		return this.detector_arc_gain;
	}

	public String getDetector_binning() {
		return this.detector_binning;
	}

	public Boolean getDetector_conditions_nominal_flag() {
		return this.detector_conditions_nominal_flag;
	}

	public String getDetector_configuration() {
		return this.detector_configuration;
	}

	public Integer getDetector_element_physical_size() {
		return this.detector_element_physical_size;
	}

	public Integer getDetector_element_spacing() {
		return this.detector_element_spacing;
	}

	public String getDetector_id() {
		return this.detector_id;
	}

	public Double getDetector_primary_angle() {
		return this.detector_primary_angle;
	}

	public Double getDetector_secondary_angle() {
		return this.detector_secondary_angle;
	}

	public Double getDetector_sensitivity() {
		return this.detector_sensitivity;
	}

	public Double getDetector_temperature() {
		return this.detector_temperature;
	}

	public String getDetector_type() {
		return this.detector_type;
	}

	public Double getDeviation_index() {
		return this.deviation_index;
	}

	public String getDeviation_index_control_limits() {
		return this.deviation_index_control_limits;
	}

	public Double getDistance_source_to_detector() {
		return this.distance_source_to_detector;
	}

	public Double getDistance_source_to_patient() {
		return this.distance_source_to_patient;
	}

	public Double getDose_area_product() {
		return this.dose_area_product;
	}

	public String getDosewatch_generated_uid() {
		return this.dosewatch_generated_uid;
	}

	public Timestamp getDt_last_update_dwh() {
		return this.dt_last_update_dwh;
	}

	public Double getEnd_height() {
		return this.end_height;
	}

	public Double getEntrance_dose() {
		return this.entrance_dose;
	}

	public String getExposure_control_mode() {
		return this.exposure_control_mode;
	}

	public String getExposure_control_mode_description() {
		return this.exposure_control_mode_description;
	}

	public Double getExposure_in_mas() {
		return this.exposure_in_mas;
	}

	public Double getExposure_in_uas() {
		return this.exposure_in_uas;
	}

	public Double getExposure_index() {
		return this.exposure_index;
	}

	public Double getExposure_time() {
		return this.exposure_time;
	}

	public String getFacility_description() {
		return this.facility_description;
	}

	public Integer getFacility_key() {
		return this.facility_key;
	}

	public String getField_of_view_dimensions() {
		return this.field_of_view_dimensions;
	}

	public Boolean getField_of_view_horizontal_flip() {
		return this.field_of_view_horizontal_flip;
	}

	public Double getField_of_view_origin() {
		return this.field_of_view_origin;
	}

	public Double getField_of_view_rotation() {
		return this.field_of_view_rotation;
	}

	public String getField_of_view_shape() {
		return this.field_of_view_shape;
	}

	public Double getFilm_speed_selection() {
		return this.film_speed_selection;
	}

	public String getFilter_material() {
		return this.filter_material;
	}

	public Double getFilter_thickness_maximum() {
		return this.filter_thickness_maximum;
	}

	public Double getFilter_thickness_minimum() {
		return this.filter_thickness_minimum;
	}

	public String getFilter_type() {
		return this.filter_type;
	}

	public String getFocal_spot_positions() {
		return this.focal_spot_positions;
	}

	public Double getFocal_spot_size() {
		return this.focal_spot_size;
	}

	public String getFrame_of_reference_uid() {
		return this.frame_of_reference_uid;
	}

	public Double getFrame_rate() {
		return this.frame_rate;
	}

	public Integer getHigh_bit() {
		return this.high_bit;
	}

	public Long getId() {
		return this.id;
	}

	public Double getImage_dose() {
		return this.image_dose;
	}

	public Double getImage_dose_area_product() {
		return this.image_dose_area_product;
	}

	public String getImage_laterality() {
		return this.image_laterality;
	}

	public Integer getImage_number_for_pasting() {
		return this.image_number_for_pasting;
	}

	public String getImage_type() {
		return this.image_type;
	}

	public Double getImager_pixel_spacing() {
		return this.imager_pixel_spacing;
	}

	public Integer getInstance_key() {
		return this.instance_key;
	}

	public String getInstance_name() {
		return this.instance_name;
	}

	public Integer getInstance_number() {
		return this.instance_number;
	}

	public String getIrradiation_event_uid() {
		return this.irradiation_event_uid;
	}

	public String getKey_stone_coordinates() {
		return this.key_stone_coordinates;
	}

	public Double getKvp() {
		return this.kvp;
	}

	public String getLossy_image_compression() {
		return this.lossy_image_compression;
	}

	public Double getMedian_anatomy_count_value() {
		return this.median_anatomy_count_value;
	}

	public Integer getNumber_of_tomosynthesis_source_images() {
		return this.number_of_tomosynthesis_source_images;
	}

	public Double getOts_column_rotation_angle() {
		return this.ots_column_rotation_angle;
	}

	public Boolean getOverride_mode() {
		return this.override_mode;
	}

	public Long getPasting_overlap() {
		return this.pasting_overlap;
	}

	public String getPatient_ganrty_relationship() {
		return this.patient_ganrty_relationship;
	}

	public String getPatient_orientation() {
		return this.patient_orientation;
	}

	public String getPatient_orientation_modifier() {
		return this.patient_orientation_modifier;
	}

	public String getPatient_size_string() {
		return this.patient_size_string;
	}

	public String getPhotometric_interpretation() {
		return this.photometric_interpretation;
	}

	public String getpixel_intensity_relationship() {
		return this.pixel_intensity_relationship;
	}

	public String getPixel_representation() {
		return this.pixel_representation;
	}

	public Double getPixel_spacing() {
		return this.pixel_spacing;
	}

	public String getPosition_reference_indicator() {
		return this.position_reference_indicator;
	}

	public String getPositioner_type() {
		return this.positioner_type;
	}

	public String getpresentation_intent_type() {
		return this.presentation_intent_type;
	}

	public String getPresentation_lut_shape() {
		return this.presentation_lut_shape;
	}

	public Long getProtocol_key() {
		return this.protocol_key;
	}

	public String getProtocol_name() {
		return this.protocol_name;
	}

	public String getQuality_control_image() {
		return this.quality_control_image;
	}

	public String getReceptor_type() {
		return this.receptor_type;
	}

	public Integer getRequested_detector_entrance_dose() {
		return this.requested_detector_entrance_dose;
	}

	public Integer getrescale_intercept() {
		return this.rescale_intercept;
	}

	public Integer getRescale_slope() {
		return this.rescale_slope;
	}

	public String getRescale_type() {
		return this.rescale_type;
	}

	public Integer getSamples_per_pixel() {
		return this.samples_per_pixel;
	}

	public Double getSampling_factor() {
		return this.sampling_factor;
	}

	public Integer getSeries_columns() {
		return this.series_columns;
	}

	public Timestamp getSeries_datetime() {
		return this.series_datetime;
	}

	public Long getSeries_description_key() {
		return this.series_description_key;
	}

	public String getSeries_description_name() {
		return this.series_description_name;
	}

	public Integer getSeries_duration() {
		return this.series_duration;
	}

	public Timestamp getSeries_end_datetime() {
		return this.series_end_datetime;
	}

	public String getSeries_grid() {
		return this.series_grid;
	}

	public String getSeries_instance_uid() {
		return this.series_instance_uid;
	}

	public String getSeries_modality() {
		return this.series_modality;
	}

	public Integer getSeries_number() {
		return this.series_number;
	}

	public Integer getSeries_rows() {
		return this.series_rows;
	}

	public String getSeries_view() {
		return this.series_view;
	}

	public Long getShift_vector_for_pasting() {
		return this.shift_vector_for_pasting;
	}

	public Double getslice_interval() {
		return this.slice_interval;
	}

	public Double getSlice_location() {
		return this.slice_location;
	}

	public Double getSlice_thickness() {
		return this.slice_thickness;
	}

	public Double getStart_height() {
		return this.start_height;
	}

	public Long getStudy_key() {
		return this.study_key;
	}

	public Integer getSub_image_collimator_vertices() {
		return this.sub_image_collimator_vertices;
	}

	public String getSweep_direction() {
		return this.sweep_direction;
	}

	public String getTarget_region_key() {
		return this.target_region_key;
	}

	public Double getTomo_angle() {
		return this.tomo_angle;
	}

	public String getTomo_class() {
		return this.tomo_class;
	}

	public Double getTomo_layer_height() {
		return this.tomo_layer_height;
	}

	public Integer getTomo_time() {
		return this.tomo_time;
	}

	public String getTomo_type() {
		return this.tomo_type;
	}

	public Double getTube_to_detector_angle() {
		return this.tube_to_detector_angle;
	}

	public Double getUncompensated_detector_exposure() {
		return this.uncompensated_detector_exposure;
	}

	public Integer getUser_window_center() {
		return this.user_window_center;
	}

	public Integer getUser_window_width() {
		return this.user_window_width;
	}

	public String getView_position() {
		return this.view_position;
	}

	public String getVoi_lut_data() {
		return this.voi_lut_data;
	}

	public String getVoi_lut_descriptor() {
		return this.voi_lut_descriptor;
	}

	public String getVoi_lut_explanation() {
		return this.voi_lut_explanation;
	}

	public Integer getWindow_center() {
		return this.window_center;
	}

	public String getWindow_center_and_width_explanation() {
		return this.window_center_and_width_explanation;
	}

	public Integer getWindow_width() {
		return this.window_width;
	}

	public Double getXray_tube_current_ma() {
		return this.xray_tube_current_ma;
	}

	public Double getXray_tube_current_ua() {
		return this.xray_tube_current_ua;
	}

	public void setAcquisition_date(final Date acquisition_date) {
		this.acquisition_date = acquisition_date;
	}

	public void setAcquisition_device_processing_code(final String acquisition_device_processing_code) {
		this.acquisition_device_processing_code = acquisition_device_processing_code;
	}

	public void setAcquisition_device_processing_description(final String acquisition_device_processing_description) {
		this.acquisition_device_processing_description = acquisition_device_processing_description;
	}

	public void setAcquisition_time(final Time acquisition_time) {
		this.acquisition_time = acquisition_time;
	}

	public void setAcquisition_type(final String acquisition_type) {
		this.acquisition_type = acquisition_type;
	}

	public void setAcquisition_uid(final String acquisition_uid) {
		this.acquisition_uid = acquisition_uid;
	}

	public void setAdjusted_field_of_view(final String adjusted_field_of_view) {
		this.adjusted_field_of_view = adjusted_field_of_view;
	}

	public void setAnatomic_region(final String anatomic_region) {
		this.anatomic_region = anatomic_region;
	}

	public void setBits_allocated(final Integer bits_allocated) {
		this.bits_allocated = bits_allocated;
	}

	public void setBits_stored(final Integer bits_stored) {
		this.bits_stored = bits_stored;
	}

	public void setBurned_in_annotation(final Boolean burned_in_annotation) {
		this.burned_in_annotation = burned_in_annotation;
	}

	public void setCollimator_rotation(final Boolean collimator_rotation) {
		this.collimator_rotation = collimator_rotation;
	}

	public void setCollimator_shape(final String collimator_shape) {
		this.collimator_shape = collimator_shape;
	}

	public void setCollimator_vertices(final String collimator_vertices) {
		this.collimator_vertices = collimator_vertices;
	}

	public void setComments_on_radiation_dose(final String comments_on_radiation_dose) {
		this.comments_on_radiation_dose = comments_on_radiation_dose;
	}

	public void setCompensated_detector_exposure(final Double compensated_detector_exposure) {
		this.compensated_detector_exposure = compensated_detector_exposure;
	}

	public void setContent_date(final Date content_date) {
		this.content_date = content_date;
	}

	public void setContent_time(final Time content_time) {
		this.content_time = content_time;
	}

	public void setDerivation_description(final String derivation_description) {
		this.derivation_description = derivation_description;
	}

	public void setDetected_field_of_view(final String detected_field_of_view) {
		this.detected_field_of_view = detected_field_of_view;
	}

	public void setDetector_active_dimensions(final String detector_active_dimensions) {
		this.detector_active_dimensions = detector_active_dimensions;
	}

	public void setDetector_active_shape(final String detector_active_shape) {
		this.detector_active_shape = detector_active_shape;
	}

	public void setDetector_arc_gain(final Double detector_arc_gain) {
		this.detector_arc_gain = detector_arc_gain;
	}

	public void setDetector_binning(final String detector_binning) {
		this.detector_binning = detector_binning;
	}

	public void setDetector_conditions_nominal_flag(final Boolean detector_conditions_nominal_flag) {
		this.detector_conditions_nominal_flag = detector_conditions_nominal_flag;
	}

	public void setDetector_configuration(final String detector_configuration) {
		this.detector_configuration = detector_configuration;
	}

	public void setDetector_element_physical_size(final Integer detector_element_physical_size) {
		this.detector_element_physical_size = detector_element_physical_size;
	}

	public void setDetector_element_spacing(final Integer detector_element_spacing) {
		this.detector_element_spacing = detector_element_spacing;
	}

	public void setDetector_id(final String detector_id) {
		this.detector_id = detector_id;
	}

	public void setDetector_primary_angle(final Double detector_primary_angle) {
		this.detector_primary_angle = detector_primary_angle;
	}

	public void setDetector_secondary_angle(final Double detector_secondary_angle) {
		this.detector_secondary_angle = detector_secondary_angle;
	}

	public void setDetector_sensitivity(final Double detector_sensitivity) {
		this.detector_sensitivity = detector_sensitivity;
	}

	public void setDetector_temperature(final Double detector_temperature) {
		this.detector_temperature = detector_temperature;
	}

	public void setDetector_type(final String detector_type) {
		this.detector_type = detector_type;
	}

	public void setDeviation_index(final Double deviation_index) {
		this.deviation_index = deviation_index;
	}

	public void setDeviation_index_control_limits(final String deviation_index_control_limits) {
		this.deviation_index_control_limits = deviation_index_control_limits;
	}

	public void setDistance_source_to_detector(final Double distance_source_to_detector) {
		this.distance_source_to_detector = distance_source_to_detector;
	}

	public void setDistance_source_to_patient(final Double distance_source_to_patient) {
		this.distance_source_to_patient = distance_source_to_patient;
	}

	public void setDose_area_product(final Double dose_area_product) {
		this.dose_area_product = dose_area_product;
	}

	public void setDosewatch_generated_uid(final String dosewatch_generated_uid) {
		this.dosewatch_generated_uid = dosewatch_generated_uid;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setEnd_height(final Double end_height) {
		this.end_height = end_height;
	}

	public void setEntrance_dose(final Double entrance_dose) {
		this.entrance_dose = entrance_dose;
	}

	public void setExposure_control_mode(final String exposure_control_mode) {
		this.exposure_control_mode = exposure_control_mode;
	}

	public void setExposure_control_mode_description(final String exposure_control_mode_description) {
		this.exposure_control_mode_description = exposure_control_mode_description;
	}

	public void setExposure_in_mas(final Double exposure_in_mas) {
		this.exposure_in_mas = exposure_in_mas;
	}

	public void setExposure_in_uas(final Double exposure_in_uas) {
		this.exposure_in_uas = exposure_in_uas;
	}

	public void setExposure_index(final Double exposure_index) {
		this.exposure_index = exposure_index;
	}

	public void setExposure_time(final Double exposure_time) {
		this.exposure_time = exposure_time;
	}

	public void setFacility_description(final String facility_description) {
		this.facility_description = facility_description;
	}

	public void setFacility_key(final Integer facility_key) {
		this.facility_key = facility_key;
	}

	public void setField_of_view_dimensions(final String field_of_view_dimensions) {
		this.field_of_view_dimensions = field_of_view_dimensions;
	}

	public void setField_of_view_horizontal_flip(final Boolean field_of_view_horizontal_flip) {
		this.field_of_view_horizontal_flip = field_of_view_horizontal_flip;
	}

	public void setField_of_view_origin(final Double field_of_view_origin) {
		this.field_of_view_origin = field_of_view_origin;
	}

	public void setField_of_view_rotation(final Double field_of_view_rotation) {
		this.field_of_view_rotation = field_of_view_rotation;
	}

	public void setField_of_view_shape(final String field_of_view_shape) {
		this.field_of_view_shape = field_of_view_shape;
	}

	public void setFilm_speed_selection(final Double film_speed_selection) {
		this.film_speed_selection = film_speed_selection;
	}

	public void setFilter_material(final String filter_material) {
		this.filter_material = filter_material;
	}

	public void setFilter_thickness_maximum(final Double filter_thickness_maximum) {
		this.filter_thickness_maximum = filter_thickness_maximum;
	}

	public void setFilter_thickness_minimum(final Double filter_thickness_minimum) {
		this.filter_thickness_minimum = filter_thickness_minimum;
	}

	public void setFilter_type(final String filter_type) {
		this.filter_type = filter_type;
	}

	public void setFocal_spot_positions(final String focal_spot_positions) {
		this.focal_spot_positions = focal_spot_positions;
	}

	public void setFocal_spot_size(final Double focal_spot_size) {
		this.focal_spot_size = focal_spot_size;
	}

	public void setFrame_of_reference_uid(final String frame_of_reference_uid) {
		this.frame_of_reference_uid = frame_of_reference_uid;
	}

	public void setFrame_rate(final Double frame_rate) {
		this.frame_rate = frame_rate;
	}

	public void setHigh_bit(final Integer high_bit) {
		this.high_bit = high_bit;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setImage_dose(final Double image_dose) {
		this.image_dose = image_dose;
	}

	public void setImage_dose_area_product(final Double image_dose_area_product) {
		this.image_dose_area_product = image_dose_area_product;
	}

	public void setImage_laterality(final String image_laterality) {
		this.image_laterality = image_laterality;
	}

	public void setImage_number_for_pasting(final Integer image_number_for_pasting) {
		this.image_number_for_pasting = image_number_for_pasting;
	}

	public void setImage_type(final String image_type) {
		this.image_type = image_type;
	}

	public void setImager_pixel_spacing(final Double imager_pixel_spacing) {
		this.imager_pixel_spacing = imager_pixel_spacing;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setInstance_name(final String instance_name) {
		this.instance_name = instance_name;
	}

	public void setInstance_number(final Integer instance_number) {
		this.instance_number = instance_number;
	}

	public void setIrradiation_event_uid(final String irradiation_event_uid) {
		this.irradiation_event_uid = irradiation_event_uid;
	}

	public void setKey_stone_coordinates(final String key_stone_coordinates) {
		this.key_stone_coordinates = key_stone_coordinates;
	}

	public void setKvp(final Double kvp) {
		this.kvp = kvp;
	}

	public void setLossy_image_compression(final String lossy_image_compression) {
		this.lossy_image_compression = lossy_image_compression;
	}

	public void setMedian_anatomy_count_value(final Double median_anatomy_count_value) {
		this.median_anatomy_count_value = median_anatomy_count_value;
	}

	public void setNumber_of_tomosynthesis_source_images(final Integer number_of_tomosynthesis_source_images) {
		this.number_of_tomosynthesis_source_images = number_of_tomosynthesis_source_images;
	}

	public void setOts_column_rotation_angle(final Double ots_column_rotation_angle) {
		this.ots_column_rotation_angle = ots_column_rotation_angle;
	}

	public void setOverride_mode(final Boolean override_mode) {
		this.override_mode = override_mode;
	}

	public void setPasting_overlap(final Long pasting_overlap) {
		this.pasting_overlap = pasting_overlap;
	}

	public void setPatient_ganrty_relationship(final String patient_ganrty_relationship) {
		this.patient_ganrty_relationship = patient_ganrty_relationship;
	}

	public void setPatient_orientation(final String patient_orientation) {
		this.patient_orientation = patient_orientation;
	}

	public void setPatient_orientation_modifier(final String patient_orientation_modifier) {
		this.patient_orientation_modifier = patient_orientation_modifier;
	}

	public void setPatient_size_string(final String patient_size_string) {
		this.patient_size_string = patient_size_string;
	}

	public void setPhotometric_interpretation(final String photometric_interpretation) {
		this.photometric_interpretation = photometric_interpretation;
	}

	public void setpixel_intensity_relationship(final String pixel_intensity_relationship) {
		this.pixel_intensity_relationship = pixel_intensity_relationship;
	}

	public void setPixel_representation(final String pixel_representation) {
		this.pixel_representation = pixel_representation;
	}

	public void setPixel_spacing(final Double pixel_spacing) {
		this.pixel_spacing = pixel_spacing;
	}

	public void setPosition_reference_indicator(final String position_reference_indicator) {
		this.position_reference_indicator = position_reference_indicator;
	}

	public void setPositioner_type(final String positioner_type) {
		this.positioner_type = positioner_type;
	}

	public void setpresentation_intent_type(final String presentation_intent_type) {
		this.presentation_intent_type = presentation_intent_type;
	}

	public void setPresentation_lut_shape(final String presentation_lut_shape) {
		this.presentation_lut_shape = presentation_lut_shape;
	}

	public void setProtocol_key(final Long protocol_key) {
		this.protocol_key = protocol_key;
	}

	public void setProtocol_name(final String protocol_name) {
		this.protocol_name = protocol_name;
	}

	public void setQuality_control_image(final String quality_control_image) {
		this.quality_control_image = quality_control_image;
	}

	public void setReceptor_type(final String receptor_type) {
		this.receptor_type = receptor_type;
	}

	public void setRequested_detector_entrance_dose(final Integer requested_detector_entrance_dose) {
		this.requested_detector_entrance_dose = requested_detector_entrance_dose;
	}

	public void setrescale_intercept(final Integer rescale_intercept) {
		this.rescale_intercept = rescale_intercept;
	}

	public void setRescale_slope(final Integer rescale_slope) {
		this.rescale_slope = rescale_slope;
	}

	public void setRescale_type(final String rescale_type) {
		this.rescale_type = rescale_type;
	}

	public void setSamples_per_pixel(final Integer samples_per_pixel) {
		this.samples_per_pixel = samples_per_pixel;
	}

	public void setSampling_factor(final Double sampling_factor) {
		this.sampling_factor = sampling_factor;
	}

	public void setSeries_columns(final Integer series_columns) {
		this.series_columns = series_columns;
	}

	public void setSeries_datetime(final Timestamp series_datetime) {
		this.series_datetime = series_datetime;
	}

	public void setSeries_description_key(final Long series_description_key) {
		this.series_description_key = series_description_key;
	}

	public void setSeries_description_name(final String series_description_name) {
		this.series_description_name = series_description_name;
	}

	public void setSeries_duration(final Integer series_duration) {
		this.series_duration = series_duration;
	}

	public void setSeries_end_datetime(final Timestamp series_end_datetime) {
		this.series_end_datetime = series_end_datetime;
	}

	public void setSeries_grid(final String series_grid) {
		this.series_grid = series_grid;
	}

	public void setSeries_instance_uid(final String series_instance_uid) {
		this.series_instance_uid = series_instance_uid;
	}

	public void setSeries_modality(final String series_modality) {
		this.series_modality = series_modality;
	}

	public void setSeries_number(final Integer series_number) {
		this.series_number = series_number;
	}

	public void setSeries_rows(final Integer series_rows) {
		this.series_rows = series_rows;
	}

	public void setSeries_view(final String series_view) {
		this.series_view = series_view;
	}

	public void setShift_vector_for_pasting(final Long shift_vector_for_pasting) {
		this.shift_vector_for_pasting = shift_vector_for_pasting;
	}

	public void setslice_interval(final Double slice_interval) {
		this.slice_interval = slice_interval;
	}

	public void setSlice_location(final Double slice_location) {
		this.slice_location = slice_location;
	}

	public void setSlice_thickness(final Double slice_thickness) {
		this.slice_thickness = slice_thickness;
	}

	public void setStart_height(final Double start_height) {
		this.start_height = start_height;
	}

	public void setStudy_key(final Long study_key) {
		this.study_key = study_key;
	}

	public void setSub_image_collimator_vertices(final Integer sub_image_collimator_vertices) {
		this.sub_image_collimator_vertices = sub_image_collimator_vertices;
	}

	public void setSweep_direction(final String sweep_direction) {
		this.sweep_direction = sweep_direction;
	}

	public void setTarget_region_key(final String target_region_key) {
		this.target_region_key = target_region_key;
	}

	public void setTomo_angle(final Double tomo_angle) {
		this.tomo_angle = tomo_angle;
	}

	public void setTomo_class(final String tomo_class) {
		this.tomo_class = tomo_class;
	}

	public void setTomo_layer_height(final Double tomo_layer_height) {
		this.tomo_layer_height = tomo_layer_height;
	}

	public void setTomo_time(final Integer tomo_time) {
		this.tomo_time = tomo_time;
	}

	public void setTomo_type(final String tomo_type) {
		this.tomo_type = tomo_type;
	}

	public void setTube_to_detector_angle(final Double tube_to_detector_angle) {
		this.tube_to_detector_angle = tube_to_detector_angle;
	}

	public void setUncompensated_detector_exposure(final Double uncompensated_detector_exposure) {
		this.uncompensated_detector_exposure = uncompensated_detector_exposure;
	}

	public void setUser_window_center(final Integer user_window_center) {
		this.user_window_center = user_window_center;
	}

	public void setUser_window_width(final Integer user_window_width) {
		this.user_window_width = user_window_width;
	}

	public void setView_position(final String view_position) {
		this.view_position = view_position;
	}

	public void setVoi_lut_data(final String voi_lut_data) {
		this.voi_lut_data = voi_lut_data;
	}

	public void setVoi_lut_descriptor(final String voi_lut_descriptor) {
		this.voi_lut_descriptor = voi_lut_descriptor;
	}

	public void setVoi_lut_explanation(final String voi_lut_explanation) {
		this.voi_lut_explanation = voi_lut_explanation;
	}

	public void setWindow_center(final Integer window_center) {
		this.window_center = window_center;
	}

	public void setWindow_center_and_width_explanation(final String window_center_and_width_explanation) {
		this.window_center_and_width_explanation = window_center_and_width_explanation;
	}

	public void setWindow_width(final Integer window_width) {
		this.window_width = window_width;
	}

	public void setXray_tube_current_ma(final Double xray_tube_current_ma) {
		this.xray_tube_current_ma = xray_tube_current_ma;
	}

	public void setXray_tube_current_ua(final Double xray_tube_current_ua) {
		this.xray_tube_current_ua = xray_tube_current_ua;
	}
}
