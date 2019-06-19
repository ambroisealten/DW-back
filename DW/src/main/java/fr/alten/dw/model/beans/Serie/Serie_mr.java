/**
 * 
 */
package fr.alten.dw.model.beans.Serie;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 *
 */
public class Serie_mr  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2907097250197188547L;
	
	
	private Long id;
	private Long series_description_key;
	private int facility_key;
	private Long serie_key;
	private Long protocol_key;
	private int study_id_calculated;
	private Time acquisition_time;
	private Long acquisition_duration;
	private String scan_options;
	private String image_type;
	private int series_number;
	private int rebuild_serie_num;
	private String target_region;
	private String contrast_bolus_agent;
	private double repetition_time;
	private double percent_sampling;
	private double percent_phase_field_of_view;
	private double slice_thickness;
	private String image_nucleus;
	private double inversion_time;
	private double echo_time;
	private double echo_train_length;
	private double echo_numbers;
	private double number_of_excitation;
	private String receive_coil_name;
	private double spacing_between_slices;
	private double pixel_bandwidth;
	private double sar;
	private String transmit_coil_name;
	private String pulse_sequence_name;
	private String scanning_sequence;
	private double d_bd_t;
	private double number_of_phase_encoding_steps;
	private double flip_angle;
	private int image_number;
	private String patient_position;
	private String frame_of_reference_uid;
	private int samples_per_pixel;
	private String photometric_interpretation;
	private int series_rows;
	private int series_columns;
	private int bits_allocated;
	private int bits_stored;
	private int high_bit;
	private String pixel_representation;
	private int window_width;
	private int window_center;
	private String mr_acquisition_type;
	private String sequence_variant;
	private String transmit_coil_type;
	private double diffusion_b_value;
	private double diffusion_direction;
	private double field_of_view;
	private int acquisition_matrix_first_number;
	private int acquisition_matrix_second_number;
	private double image_frequency;
	private double scan_coverage;
	private String synchro;
	private String patient_orientation;
	private String acceleration_annotation_flag;
	private String acceleration_method;
	private String pulse_sequence;
	private String protocol_name;
	private int diffusion_level1;
	private int diffusion_level2;
	private int diffusion_level3;
	private String receive_coil_type;
	private double acceleration_factor;
	private String sdm_model;
	private int set_loc;
	private int set_cal;
	private String cleaned_protocol_name;
	private String cleaned_series_description;
	private int set_propeller;
	private String contrast_bolus_route;
	private double display_field_of_view;
	private double contrast_bolus_volume;
	private double contrast_bolus_ingredient_concentration;
	private Time contrast_bolus_start_time;
	private String standardized_serie_desc_detected;
	private String standardized_serie_desc_calculated;
	private String acquisition_plan_detected;
	private String acquisition_plan_calculated;
	private String acquisition_plan;
	private String series_standard_coil_name;
	private String standardized_serie_desc;
	private double start_slice_location;
	private double end_slice_location;
	private int contrast_bolus_agent_use_detected;
	private double voxel_size;
	private Long unique_study_id_per_ae;
	private String cleaned_study_id;
	private Time cleaned_series_start_time;
	private Time cleaned_series_end_time;
	private String miscellaneous_calculated;
	private String mode_detected;
	private String mode_calculated;
	private String mode;
	private String weighting_detected;
	private String weighting_calculated;
	private String weighting;
	private String set_3d_detected;
	private String set_3d_calculated;
	private String set_3d;
	private String temp_unique_study_id;
	private int instance_key;
	private Long study_key;
	private Timestamp acquisition_datetime;
	private String acquisition_matrix;
	private String additional_asset_data;
	private String asset_r_factors;
	private Timestamp first_image_datetime;
	private Timestamp last_image_datetime;
	private String series_instance_uid;
	private String target_region_key;
	private Timestamp series_datetime;
	private String irradiation_event_uid;
	private String dosewatch_generated_uid;
	private String series_description_name;
	private String facility_description;
	private int id_group;
	private String group_name;
	private int id_division;
	private String division_name;
	private Timestamp dt_last_update_dwh;
	
	public Serie_mr() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSeries_description_key() {
		return series_description_key;
	}

	public void setSeries_description_key(Long series_description_key) {
		this.series_description_key = series_description_key;
	}

	public int getFacility_key() {
		return facility_key;
	}

	public void setFacility_key(int facility_key) {
		this.facility_key = facility_key;
	}

	public Long getSerie_key() {
		return serie_key;
	}

	public void setSerie_key(Long serie_key) {
		this.serie_key = serie_key;
	}

	public Long getProtocol_key() {
		return protocol_key;
	}

	public void setProtocol_key(Long protocol_key) {
		this.protocol_key = protocol_key;
	}

	public int getStudy_id_calculated() {
		return study_id_calculated;
	}

	public void setStudy_id_calculated(int study_id_calculated) {
		this.study_id_calculated = study_id_calculated;
	}

	public Time getAcquisition_time() {
		return acquisition_time;
	}

	public void setAcquisition_time(Time acquisition_time) {
		this.acquisition_time = acquisition_time;
	}

	public Long getAcquisition_duration() {
		return acquisition_duration;
	}

	public void setAcquisition_duration(Long acquisition_duration) {
		this.acquisition_duration = acquisition_duration;
	}

	public String getScan_options() {
		return scan_options;
	}

	public void setScan_options(String scan_options) {
		this.scan_options = scan_options;
	}

	public String getImage_type() {
		return image_type;
	}

	public void setImage_type(String image_type) {
		this.image_type = image_type;
	}

	public int getSeries_number() {
		return series_number;
	}

	public void setSeries_number(int series_number) {
		this.series_number = series_number;
	}

	public int getRebuild_serie_num() {
		return rebuild_serie_num;
	}

	public void setRebuild_serie_num(int rebuild_serie_num) {
		this.rebuild_serie_num = rebuild_serie_num;
	}

	public String getTarget_region() {
		return target_region;
	}

	public void setTarget_region(String target_region) {
		this.target_region = target_region;
	}

	public String getContrast_bolus_agent() {
		return contrast_bolus_agent;
	}

	public void setContrast_bolus_agent(String contrast_bolus_agent) {
		this.contrast_bolus_agent = contrast_bolus_agent;
	}

	public double getRepetition_time() {
		return repetition_time;
	}

	public void setRepetition_time(double repetition_time) {
		this.repetition_time = repetition_time;
	}

	public double getPercent_sampling() {
		return percent_sampling;
	}

	public void setPercent_sampling(double percent_sampling) {
		this.percent_sampling = percent_sampling;
	}

	public double getPercent_phase_field_of_view() {
		return percent_phase_field_of_view;
	}

	public void setPercent_phase_field_of_view(double percent_phase_field_of_view) {
		this.percent_phase_field_of_view = percent_phase_field_of_view;
	}

	public double getSlice_thickness() {
		return slice_thickness;
	}

	public void setSlice_thickness(double slice_thickness) {
		this.slice_thickness = slice_thickness;
	}

	public String getImage_nucleus() {
		return image_nucleus;
	}

	public void setImage_nucleus(String image_nucleus) {
		this.image_nucleus = image_nucleus;
	}

	public double getInversion_time() {
		return inversion_time;
	}

	public void setInversion_time(double inversion_time) {
		this.inversion_time = inversion_time;
	}

	public double getEcho_time() {
		return echo_time;
	}

	public void setEcho_time(double echo_time) {
		this.echo_time = echo_time;
	}

	public double getEcho_train_length() {
		return echo_train_length;
	}

	public void setEcho_train_length(double echo_train_length) {
		this.echo_train_length = echo_train_length;
	}

	public double getEcho_numbers() {
		return echo_numbers;
	}

	public void setEcho_numbers(double echo_numbers) {
		this.echo_numbers = echo_numbers;
	}

	public double getNumber_of_excitation() {
		return number_of_excitation;
	}

	public void setNumber_of_excitation(double number_of_excitation) {
		this.number_of_excitation = number_of_excitation;
	}

	public String getReceive_coil_name() {
		return receive_coil_name;
	}

	public void setReceive_coil_name(String receive_coil_name) {
		this.receive_coil_name = receive_coil_name;
	}

	public double getSpacing_between_slices() {
		return spacing_between_slices;
	}

	public void setSpacing_between_slices(double spacing_between_slices) {
		this.spacing_between_slices = spacing_between_slices;
	}

	public double getPixel_bandwidth() {
		return pixel_bandwidth;
	}

	public void setPixel_bandwidth(double pixel_bandwidth) {
		this.pixel_bandwidth = pixel_bandwidth;
	}

	public double getSar() {
		return sar;
	}

	public void setSar(double sar) {
		this.sar = sar;
	}

	public String getTransmit_coil_name() {
		return transmit_coil_name;
	}

	public void setTransmit_coil_name(String transmit_coil_name) {
		this.transmit_coil_name = transmit_coil_name;
	}

	public String getPulse_sequence_name() {
		return pulse_sequence_name;
	}

	public void setPulse_sequence_name(String pulse_sequence_name) {
		this.pulse_sequence_name = pulse_sequence_name;
	}

	public String getScanning_sequence() {
		return scanning_sequence;
	}

	public void setScanning_sequence(String scanning_sequence) {
		this.scanning_sequence = scanning_sequence;
	}

	public double getD_bd_t() {
		return d_bd_t;
	}

	public void setD_bd_t(double d_bd_t) {
		this.d_bd_t = d_bd_t;
	}

	public double getNumber_of_phase_encoding_steps() {
		return number_of_phase_encoding_steps;
	}

	public void setNumber_of_phase_encoding_steps(double number_of_phase_encoding_steps) {
		this.number_of_phase_encoding_steps = number_of_phase_encoding_steps;
	}

	public double getFlip_angle() {
		return flip_angle;
	}

	public void setFlip_angle(double flip_angle) {
		this.flip_angle = flip_angle;
	}

	public int getImage_number() {
		return image_number;
	}

	public void setImage_number(int image_number) {
		this.image_number = image_number;
	}

	public String getPatient_position() {
		return patient_position;
	}

	public void setPatient_position(String patient_position) {
		this.patient_position = patient_position;
	}

	public String getFrame_of_reference_uid() {
		return frame_of_reference_uid;
	}

	public void setFrame_of_reference_uid(String frame_of_reference_uid) {
		this.frame_of_reference_uid = frame_of_reference_uid;
	}

	public int getSamples_per_pixel() {
		return samples_per_pixel;
	}

	public void setSamples_per_pixel(int samples_per_pixel) {
		this.samples_per_pixel = samples_per_pixel;
	}

	public String getPhotometric_interpretation() {
		return photometric_interpretation;
	}

	public void setPhotometric_interpretation(String photometric_interpretation) {
		this.photometric_interpretation = photometric_interpretation;
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

	public String getPixel_representation() {
		return pixel_representation;
	}

	public void setPixel_representation(String pixel_representation) {
		this.pixel_representation = pixel_representation;
	}

	public int getWindow_width() {
		return window_width;
	}

	public void setWindow_width(int window_width) {
		this.window_width = window_width;
	}

	public int getWindow_center() {
		return window_center;
	}

	public void setWindow_center(int window_center) {
		this.window_center = window_center;
	}

	public String getMr_acquisition_type() {
		return mr_acquisition_type;
	}

	public void setMr_acquisition_type(String mr_acquisition_type) {
		this.mr_acquisition_type = mr_acquisition_type;
	}

	public String getSequence_variant() {
		return sequence_variant;
	}

	public void setSequence_variant(String sequence_variant) {
		this.sequence_variant = sequence_variant;
	}

	public String getTransmit_coil_type() {
		return transmit_coil_type;
	}

	public void setTransmit_coil_type(String transmit_coil_type) {
		this.transmit_coil_type = transmit_coil_type;
	}

	public double getDiffusion_b_value() {
		return diffusion_b_value;
	}

	public void setDiffusion_b_value(double diffusion_b_value) {
		this.diffusion_b_value = diffusion_b_value;
	}

	public double getDiffusion_direction() {
		return diffusion_direction;
	}

	public void setDiffusion_direction(double diffusion_direction) {
		this.diffusion_direction = diffusion_direction;
	}

	public double getField_of_view() {
		return field_of_view;
	}

	public void setField_of_view(double field_of_view) {
		this.field_of_view = field_of_view;
	}

	public int getAcquisition_matrix_first_number() {
		return acquisition_matrix_first_number;
	}

	public void setAcquisition_matrix_first_number(int acquisition_matrix_first_number) {
		this.acquisition_matrix_first_number = acquisition_matrix_first_number;
	}

	public int getAcquisition_matrix_second_number() {
		return acquisition_matrix_second_number;
	}

	public void setAcquisition_matrix_second_number(int acquisition_matrix_second_number) {
		this.acquisition_matrix_second_number = acquisition_matrix_second_number;
	}

	public double getImage_frequency() {
		return image_frequency;
	}

	public void setImage_frequency(double image_frequency) {
		this.image_frequency = image_frequency;
	}

	public double getScan_coverage() {
		return scan_coverage;
	}

	public void setScan_coverage(double scan_coverage) {
		this.scan_coverage = scan_coverage;
	}

	public String getSynchro() {
		return synchro;
	}

	public void setSynchro(String synchro) {
		this.synchro = synchro;
	}

	public String getPatient_orientation() {
		return patient_orientation;
	}

	public void setPatient_orientation(String patient_orientation) {
		this.patient_orientation = patient_orientation;
	}

	public String getAcceleration_annotation_flag() {
		return acceleration_annotation_flag;
	}

	public void setAcceleration_annotation_flag(String acceleration_annotation_flag) {
		this.acceleration_annotation_flag = acceleration_annotation_flag;
	}

	public String getAcceleration_method() {
		return acceleration_method;
	}

	public void setAcceleration_method(String acceleration_method) {
		this.acceleration_method = acceleration_method;
	}

	public String getPulse_sequence() {
		return pulse_sequence;
	}

	public void setPulse_sequence(String pulse_sequence) {
		this.pulse_sequence = pulse_sequence;
	}

	public String getProtocol_name() {
		return protocol_name;
	}

	public void setProtocol_name(String protocol_name) {
		this.protocol_name = protocol_name;
	}

	public int getDiffusion_level1() {
		return diffusion_level1;
	}

	public void setDiffusion_level1(int diffusion_level1) {
		this.diffusion_level1 = diffusion_level1;
	}

	public int getDiffusion_level2() {
		return diffusion_level2;
	}

	public void setDiffusion_level2(int diffusion_level2) {
		this.diffusion_level2 = diffusion_level2;
	}

	public int getDiffusion_level3() {
		return diffusion_level3;
	}

	public void setDiffusion_level3(int diffusion_level3) {
		this.diffusion_level3 = diffusion_level3;
	}

	public String getReceive_coil_type() {
		return receive_coil_type;
	}

	public void setReceive_coil_type(String receive_coil_type) {
		this.receive_coil_type = receive_coil_type;
	}

	public double getAcceleration_factor() {
		return acceleration_factor;
	}

	public void setAcceleration_factor(double acceleration_factor) {
		this.acceleration_factor = acceleration_factor;
	}

	public String getSdm_model() {
		return sdm_model;
	}

	public void setSdm_model(String sdm_model) {
		this.sdm_model = sdm_model;
	}

	public int getSet_loc() {
		return set_loc;
	}

	public void setSet_loc(int set_loc) {
		this.set_loc = set_loc;
	}

	public int getSet_cal() {
		return set_cal;
	}

	public void setSet_cal(int set_cal) {
		this.set_cal = set_cal;
	}

	public String getCleaned_protocol_name() {
		return cleaned_protocol_name;
	}

	public void setCleaned_protocol_name(String cleaned_protocol_name) {
		this.cleaned_protocol_name = cleaned_protocol_name;
	}

	public String getCleaned_series_description() {
		return cleaned_series_description;
	}

	public void setCleaned_series_description(String cleaned_series_description) {
		this.cleaned_series_description = cleaned_series_description;
	}

	public int getSet_propeller() {
		return set_propeller;
	}

	public void setSet_propeller(int set_propeller) {
		this.set_propeller = set_propeller;
	}

	public String getContrast_bolus_route() {
		return contrast_bolus_route;
	}

	public void setContrast_bolus_route(String contrast_bolus_route) {
		this.contrast_bolus_route = contrast_bolus_route;
	}

	public double getDisplay_field_of_view() {
		return display_field_of_view;
	}

	public void setDisplay_field_of_view(double display_field_of_view) {
		this.display_field_of_view = display_field_of_view;
	}

	public double getContrast_bolus_volume() {
		return contrast_bolus_volume;
	}

	public void setContrast_bolus_volume(double contrast_bolus_volume) {
		this.contrast_bolus_volume = contrast_bolus_volume;
	}

	public double getContrast_bolus_ingredient_concentration() {
		return contrast_bolus_ingredient_concentration;
	}

	public void setContrast_bolus_ingredient_concentration(double contrast_bolus_ingredient_concentration) {
		this.contrast_bolus_ingredient_concentration = contrast_bolus_ingredient_concentration;
	}

	public Time getContrast_bolus_start_time() {
		return contrast_bolus_start_time;
	}

	public void setContrast_bolus_start_time(Time contrast_bolus_start_time) {
		this.contrast_bolus_start_time = contrast_bolus_start_time;
	}

	public String getStandardized_serie_desc_detected() {
		return standardized_serie_desc_detected;
	}

	public void setStandardized_serie_desc_detected(String standardized_serie_desc_detected) {
		this.standardized_serie_desc_detected = standardized_serie_desc_detected;
	}

	public String getStandardized_serie_desc_calculated() {
		return standardized_serie_desc_calculated;
	}

	public void setStandardized_serie_desc_calculated(String standardized_serie_desc_calculated) {
		this.standardized_serie_desc_calculated = standardized_serie_desc_calculated;
	}

	public String getAcquisition_plan_detected() {
		return acquisition_plan_detected;
	}

	public void setAcquisition_plan_detected(String acquisition_plan_detected) {
		this.acquisition_plan_detected = acquisition_plan_detected;
	}

	public String getAcquisition_plan_calculated() {
		return acquisition_plan_calculated;
	}

	public void setAcquisition_plan_calculated(String acquisition_plan_calculated) {
		this.acquisition_plan_calculated = acquisition_plan_calculated;
	}

	public String getAcquisition_plan() {
		return acquisition_plan;
	}

	public void setAcquisition_plan(String acquisition_plan) {
		this.acquisition_plan = acquisition_plan;
	}

	public String getSeries_standard_coil_name() {
		return series_standard_coil_name;
	}

	public void setSeries_standard_coil_name(String series_standard_coil_name) {
		this.series_standard_coil_name = series_standard_coil_name;
	}

	public String getStandardized_serie_desc() {
		return standardized_serie_desc;
	}

	public void setStandardized_serie_desc(String standardized_serie_desc) {
		this.standardized_serie_desc = standardized_serie_desc;
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

	public int getContrast_bolus_agent_use_detected() {
		return contrast_bolus_agent_use_detected;
	}

	public void setContrast_bolus_agent_use_detected(int contrast_bolus_agent_use_detected) {
		this.contrast_bolus_agent_use_detected = contrast_bolus_agent_use_detected;
	}

	public double getVoxel_size() {
		return voxel_size;
	}

	public void setVoxel_size(double voxel_size) {
		this.voxel_size = voxel_size;
	}

	public Long getUnique_study_id_per_ae() {
		return unique_study_id_per_ae;
	}

	public void setUnique_study_id_per_ae(Long unique_study_id_per_ae) {
		this.unique_study_id_per_ae = unique_study_id_per_ae;
	}

	public String getCleaned_study_id() {
		return cleaned_study_id;
	}

	public void setCleaned_study_id(String cleaned_study_id) {
		this.cleaned_study_id = cleaned_study_id;
	}

	public Time getCleaned_series_start_time() {
		return cleaned_series_start_time;
	}

	public void setCleaned_series_start_time(Time cleaned_series_start_time) {
		this.cleaned_series_start_time = cleaned_series_start_time;
	}

	public Time getCleaned_series_end_time() {
		return cleaned_series_end_time;
	}

	public void setCleaned_series_end_time(Time cleaned_series_end_time) {
		this.cleaned_series_end_time = cleaned_series_end_time;
	}

	public String getMiscellaneous_calculated() {
		return miscellaneous_calculated;
	}

	public void setMiscellaneous_calculated(String miscellaneous_calculated) {
		this.miscellaneous_calculated = miscellaneous_calculated;
	}

	public String getMode_detected() {
		return mode_detected;
	}

	public void setMode_detected(String mode_detected) {
		this.mode_detected = mode_detected;
	}

	public String getMode_calculated() {
		return mode_calculated;
	}

	public void setMode_calculated(String mode_calculated) {
		this.mode_calculated = mode_calculated;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getWeighting_detected() {
		return weighting_detected;
	}

	public void setWeighting_detected(String weighting_detected) {
		this.weighting_detected = weighting_detected;
	}

	public String getWeighting_calculated() {
		return weighting_calculated;
	}

	public void setWeighting_calculated(String weighting_calculated) {
		this.weighting_calculated = weighting_calculated;
	}

	public String getWeighting() {
		return weighting;
	}

	public void setWeighting(String weighting) {
		this.weighting = weighting;
	}

	public String getSet_3d_detected() {
		return set_3d_detected;
	}

	public void setSet_3d_detected(String set_3d_detected) {
		this.set_3d_detected = set_3d_detected;
	}

	public String getSet_3d_calculated() {
		return set_3d_calculated;
	}

	public void setSet_3d_calculated(String set_3d_calculated) {
		this.set_3d_calculated = set_3d_calculated;
	}

	public String getSet_3d() {
		return set_3d;
	}

	public void setSet_3d(String set_3d) {
		this.set_3d = set_3d;
	}

	public String getTemp_unique_study_id() {
		return temp_unique_study_id;
	}

	public void setTemp_unique_study_id(String temp_unique_study_id) {
		this.temp_unique_study_id = temp_unique_study_id;
	}

	public int getInstance_key() {
		return instance_key;
	}

	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
	}

	public Long getStudy_key() {
		return study_key;
	}

	public void setStudy_key(Long study_key) {
		this.study_key = study_key;
	}

	public Timestamp getAcquisition_datetime() {
		return acquisition_datetime;
	}

	public void setAcquisition_datetime(Timestamp acquisition_datetime) {
		this.acquisition_datetime = acquisition_datetime;
	}

	public String getAcquisition_matrix() {
		return acquisition_matrix;
	}

	public void setAcquisition_matrix(String acquisition_matrix) {
		this.acquisition_matrix = acquisition_matrix;
	}

	public String getAdditional_asset_data() {
		return additional_asset_data;
	}

	public void setAdditional_asset_data(String additional_asset_data) {
		this.additional_asset_data = additional_asset_data;
	}

	public String getAsset_r_factors() {
		return asset_r_factors;
	}

	public void setAsset_r_factors(String asset_r_factors) {
		this.asset_r_factors = asset_r_factors;
	}

	public Timestamp getFirst_image_datetime() {
		return first_image_datetime;
	}

	public void setFirst_image_datetime(Timestamp first_image_datetime) {
		this.first_image_datetime = first_image_datetime;
	}

	public Timestamp getLast_image_datetime() {
		return last_image_datetime;
	}

	public void setLast_image_datetime(Timestamp last_image_datetime) {
		this.last_image_datetime = last_image_datetime;
	}

	public String getSeries_instance_uid() {
		return series_instance_uid;
	}

	public void setSeries_instance_uid(String series_instance_uid) {
		this.series_instance_uid = series_instance_uid;
	}

	public String getTarget_region_key() {
		return target_region_key;
	}

	public void setTarget_region_key(String target_region_key) {
		this.target_region_key = target_region_key;
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

	public String getSeries_description_name() {
		return series_description_name;
	}

	public void setSeries_description_name(String series_description_name) {
		this.series_description_name = series_description_name;
	}

	public String getFacility_description() {
		return facility_description;
	}

	public void setFacility_description(String facility_description) {
		this.facility_description = facility_description;
	}

	public int getId_group() {
		return id_group;
	}

	public void setId_group(int id_group) {
		this.id_group = id_group;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public int getId_division() {
		return id_division;
	}

	public void setId_division(int id_division) {
		this.id_division = id_division;
	}

	public String getDivision_name() {
		return division_name;
	}

	public void setDivision_name(String division_name) {
		this.division_name = division_name;
	}

	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}

	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}
}
