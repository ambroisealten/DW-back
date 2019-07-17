/**
 *
 */
package fr.alten.dw.model.beans.Serie;

import java.io.Serializable;
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
@Table(name = "dwh_serie_mr")
public class Serie_mr implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 8560340890025402397L;
	@Id
	@Column(name = "id")
	private Long id;
	private Long series_description_key;
	private Integer facility_key;
	private Long serie_key;
	private Long protocol_key;
	private Integer study_id_calculated;
	private Time acquisition_time;
	private Long acquisition_duration;
	private String scan_options;
	private String image_type;
	private Integer series_number;
	private Integer rebuild_serie_num;
	private String target_region;
	private String contrast_bolus_agent;
	private Double repetition_time;
	private Double percent_sampling;
	private Double percent_phase_field_of_view;
	private Double slice_thickness;
	private String image_nucleus;
	private Double inversion_time;
	private Double echo_time;
	private Double echo_train_length;
	private Double echo_numbers;
	private Double number_of_excitation;
	private String receive_coil_name;
	private Double spacing_between_slices;
	private Double pixel_bandwidth;
	private Double sar;
	private String transmit_coil_name;
	private String pulse_sequence_name;
	private String scanning_sequence;
	private Double d_bd_t;
	private Double number_of_phase_encoding_steps;
	private Double flip_angle;
	private Integer image_number;
	private String patient_position;
	private String frame_of_reference_uid;
	private Integer samples_per_pixel;
	private String photometric_interpretation;
	private Integer series_rows;
	private Integer series_columns;
	private Integer bits_allocated;
	private Integer bits_stored;
	private Integer high_bit;
	private String pixel_representation;
	private Integer window_width;
	private Integer window_center;
	private String mr_acquisition_type;
	private String sequence_variant;
	private String transmit_coil_type;
	private Double diffusion_b_value;
	private Double diffusion_direction;
	private Double field_of_view;
	private Integer acquisition_matrix_first_number;
	private Integer acquisition_matrix_second_number;
	private Double image_frequency;
	private Double scan_coverage;
	private String synchro;
	private String patient_orientation;
	private String acceleration_annotation_flag;
	private String acceleration_method;
	private String pulse_sequence;
	private String protocol_name;
	private Integer diffusion_level1;
	private Integer diffusion_level2;
	private Integer diffusion_level3;
	private String receive_coil_type;
	private Double acceleration_factor;
	private String sdm_model;
	private Integer set_loc;
	private Integer set_cal;
	private String cleaned_protocol_name;
	private String cleaned_series_description;
	private Integer set_propeller;
	private String contrast_bolus_route;
	private Double display_field_of_view;
	private Double contrast_bolus_volume;
	private Double contrast_bolus_ingredient_concentration;
	private Time contrast_bolus_start_time;
	private String standardized_serie_desc_detected;
	private String standardized_serie_desc_calculated;
	private String acquisition_plan_detected;
	private String acquisition_plan_calculated;
	private String acquisition_plan;
	private String series_standard_coil_name;
	private String standardized_serie_desc;
	private Double start_slice_location;
	private Double end_slice_location;
	private Integer contrast_bolus_agent_use_detected;
	private Double voxel_size;
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
	private Integer instance_key;
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
	private Integer id_group;
	private String group_name;
	private Integer id_division;
	private String division_name;
	private Timestamp dt_last_update_dwh;

	public Serie_mr() {
		super();
	}

	public String getAcceleration_annotation_flag() {
		return this.acceleration_annotation_flag;
	}

	public Double getAcceleration_factor() {
		return this.acceleration_factor;
	}

	public String getAcceleration_method() {
		return this.acceleration_method;
	}

	public Timestamp getAcquisition_datetime() {
		return this.acquisition_datetime;
	}

	public Long getAcquisition_duration() {
		return this.acquisition_duration;
	}

	public String getAcquisition_matrix() {
		return this.acquisition_matrix;
	}

	public Integer getAcquisition_matrix_first_number() {
		return this.acquisition_matrix_first_number;
	}

	public Integer getAcquisition_matrix_second_number() {
		return this.acquisition_matrix_second_number;
	}

	public String getAcquisition_plan() {
		return this.acquisition_plan;
	}

	public String getAcquisition_plan_calculated() {
		return this.acquisition_plan_calculated;
	}

	public String getAcquisition_plan_detected() {
		return this.acquisition_plan_detected;
	}

	public Time getAcquisition_time() {
		return this.acquisition_time;
	}

	public String getAdditional_asset_data() {
		return this.additional_asset_data;
	}

	public String getAsset_r_factors() {
		return this.asset_r_factors;
	}

	public Integer getBits_allocated() {
		return this.bits_allocated;
	}

	public Integer getBits_stored() {
		return this.bits_stored;
	}

	public String getCleaned_protocol_name() {
		return this.cleaned_protocol_name;
	}

	public String getCleaned_series_description() {
		return this.cleaned_series_description;
	}

	public Time getCleaned_series_end_time() {
		return this.cleaned_series_end_time;
	}

	public Time getCleaned_series_start_time() {
		return this.cleaned_series_start_time;
	}

	public String getCleaned_study_id() {
		return this.cleaned_study_id;
	}

	public String getContrast_bolus_agent() {
		return this.contrast_bolus_agent;
	}

	public Integer getContrast_bolus_agent_use_detected() {
		return this.contrast_bolus_agent_use_detected;
	}

	public Double getContrast_bolus_ingredient_concentration() {
		return this.contrast_bolus_ingredient_concentration;
	}

	public String getContrast_bolus_route() {
		return this.contrast_bolus_route;
	}

	public Time getContrast_bolus_start_time() {
		return this.contrast_bolus_start_time;
	}

	public Double getContrast_bolus_volume() {
		return this.contrast_bolus_volume;
	}

	public Double getD_bd_t() {
		return this.d_bd_t;
	}

	public Double getDiffusion_b_value() {
		return this.diffusion_b_value;
	}

	public Double getDiffusion_direction() {
		return this.diffusion_direction;
	}

	public Integer getDiffusion_level1() {
		return this.diffusion_level1;
	}

	public Integer getDiffusion_level2() {
		return this.diffusion_level2;
	}

	public Integer getDiffusion_level3() {
		return this.diffusion_level3;
	}

	public Double getDisplay_field_of_view() {
		return this.display_field_of_view;
	}

	public String getDivision_name() {
		return this.division_name;
	}

	public String getDosewatch_generated_uid() {
		return this.dosewatch_generated_uid;
	}

	public Timestamp getDt_last_update_dwh() {
		return this.dt_last_update_dwh;
	}

	public Double getEcho_numbers() {
		return this.echo_numbers;
	}

	public Double getEcho_time() {
		return this.echo_time;
	}

	public Double getEcho_train_length() {
		return this.echo_train_length;
	}

	public Double getEnd_slice_location() {
		return this.end_slice_location;
	}

	public String getFacility_description() {
		return this.facility_description;
	}

	public Integer getFacility_key() {
		return this.facility_key;
	}

	public Double getField_of_view() {
		return this.field_of_view;
	}

	public Timestamp getFirst_image_datetime() {
		return this.first_image_datetime;
	}

	public Double getFlip_angle() {
		return this.flip_angle;
	}

	public String getFrame_of_reference_uid() {
		return this.frame_of_reference_uid;
	}

	public String getGroup_name() {
		return this.group_name;
	}

	public Integer getHigh_bit() {
		return this.high_bit;
	}

	public Long getId() {
		return this.id;
	}

	public Integer getId_division() {
		return this.id_division;
	}

	public Integer getId_group() {
		return this.id_group;
	}

	public Double getImage_frequency() {
		return this.image_frequency;
	}

	public String getImage_nucleus() {
		return this.image_nucleus;
	}

	public Integer getImage_number() {
		return this.image_number;
	}

	public String getImage_type() {
		return this.image_type;
	}

	public Integer getInstance_key() {
		return this.instance_key;
	}

	public Double getInversion_time() {
		return this.inversion_time;
	}

	public String getIrradiation_event_uid() {
		return this.irradiation_event_uid;
	}

	public Timestamp getLast_image_datetime() {
		return this.last_image_datetime;
	}

	public String getMiscellaneous_calculated() {
		return this.miscellaneous_calculated;
	}

	public String getMode() {
		return this.mode;
	}

	public String getMode_calculated() {
		return this.mode_calculated;
	}

	public String getMode_detected() {
		return this.mode_detected;
	}

	public String getMr_acquisition_type() {
		return this.mr_acquisition_type;
	}

	public Double getNumber_of_excitation() {
		return this.number_of_excitation;
	}

	public Double getNumber_of_phase_encoding_steps() {
		return this.number_of_phase_encoding_steps;
	}

	public String getPatient_orientation() {
		return this.patient_orientation;
	}

	public String getPatient_position() {
		return this.patient_position;
	}

	public Double getPercent_phase_field_of_view() {
		return this.percent_phase_field_of_view;
	}

	public Double getPercent_sampling() {
		return this.percent_sampling;
	}

	public String getphotometric_interpretation() {
		return this.photometric_interpretation;
	}

	public Double getPixel_bandwidth() {
		return this.pixel_bandwidth;
	}

	public String getPixel_representation() {
		return this.pixel_representation;
	}

	public Long getProtocol_key() {
		return this.protocol_key;
	}

	public String getProtocol_name() {
		return this.protocol_name;
	}

	public String getPulse_sequence() {
		return this.pulse_sequence;
	}

	public String getPulse_sequence_name() {
		return this.pulse_sequence_name;
	}

	public Integer getRebuild_serie_num() {
		return this.rebuild_serie_num;
	}

	public String getReceive_coil_name() {
		return this.receive_coil_name;
	}

	public String getReceive_coil_type() {
		return this.receive_coil_type;
	}

	public Double getRepetition_time() {
		return this.repetition_time;
	}

	public Integer getSamples_per_pixel() {
		return this.samples_per_pixel;
	}

	public Double getSar() {
		return this.sar;
	}

	public Double getScan_coverage() {
		return this.scan_coverage;
	}

	public String getScan_options() {
		return this.scan_options;
	}

	public String getScanning_sequence() {
		return this.scanning_sequence;
	}

	public String getSdm_model() {
		return this.sdm_model;
	}

	public String getSequence_variant() {
		return this.sequence_variant;
	}

	public Long getSerie_key() {
		return this.serie_key;
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

	public String getSeries_instance_uid() {
		return this.series_instance_uid;
	}

	public Integer getSeries_number() {
		return this.series_number;
	}

	public Integer getSeries_rows() {
		return this.series_rows;
	}

	public String getSeries_standard_coil_name() {
		return this.series_standard_coil_name;
	}

	public String getSet_3d() {
		return this.set_3d;
	}

	public String getSet_3d_calculated() {
		return this.set_3d_calculated;
	}

	public String getSet_3d_detected() {
		return this.set_3d_detected;
	}

	public Integer getSet_cal() {
		return this.set_cal;
	}

	public Integer getSet_loc() {
		return this.set_loc;
	}

	public Integer getSet_propeller() {
		return this.set_propeller;
	}

	public Double getSlice_thickness() {
		return this.slice_thickness;
	}

	public Double getSpacing_between_slices() {
		return this.spacing_between_slices;
	}

	public String getStandardized_serie_desc() {
		return this.standardized_serie_desc;
	}

	public String getStandardized_serie_desc_calculated() {
		return this.standardized_serie_desc_calculated;
	}

	public String getStandardized_serie_desc_detected() {
		return this.standardized_serie_desc_detected;
	}

	public Double getStart_slice_location() {
		return this.start_slice_location;
	}

	public Integer getStudy_id_calculated() {
		return this.study_id_calculated;
	}

	public Long getStudy_key() {
		return this.study_key;
	}

	public String getSynchro() {
		return this.synchro;
	}

	public String getTarget_region() {
		return this.target_region;
	}

	public String getTarget_region_key() {
		return this.target_region_key;
	}

	public String getTemp_unique_study_id() {
		return this.temp_unique_study_id;
	}

	public String getTransmit_coil_name() {
		return this.transmit_coil_name;
	}

	public String getTransmit_coil_type() {
		return this.transmit_coil_type;
	}

	public Long getUnique_study_id_per_ae() {
		return this.unique_study_id_per_ae;
	}

	public Double getVoxel_size() {
		return this.voxel_size;
	}

	public String getWeighting() {
		return this.weighting;
	}

	public String getWeighting_calculated() {
		return this.weighting_calculated;
	}

	public String getWeighting_detected() {
		return this.weighting_detected;
	}

	public Integer getWindow_center() {
		return this.window_center;
	}

	public Integer getWindow_width() {
		return this.window_width;
	}

	public void setAcceleration_annotation_flag(final String acceleration_annotation_flag) {
		this.acceleration_annotation_flag = acceleration_annotation_flag;
	}

	public void setAcceleration_factor(final Double acceleration_factor) {
		this.acceleration_factor = acceleration_factor;
	}

	public void setAcceleration_method(final String acceleration_method) {
		this.acceleration_method = acceleration_method;
	}

	public void setAcquisition_datetime(final Timestamp acquisition_datetime) {
		this.acquisition_datetime = acquisition_datetime;
	}

	public void setAcquisition_duration(final Long acquisition_duration) {
		this.acquisition_duration = acquisition_duration;
	}

	public void setAcquisition_matrix(final String acquisition_matrix) {
		this.acquisition_matrix = acquisition_matrix;
	}

	public void setAcquisition_matrix_first_number(final Integer acquisition_matrix_first_number) {
		this.acquisition_matrix_first_number = acquisition_matrix_first_number;
	}

	public void setAcquisition_matrix_second_number(final Integer acquisition_matrix_second_number) {
		this.acquisition_matrix_second_number = acquisition_matrix_second_number;
	}

	public void setAcquisition_plan(final String acquisition_plan) {
		this.acquisition_plan = acquisition_plan;
	}

	public void setAcquisition_plan_calculated(final String acquisition_plan_calculated) {
		this.acquisition_plan_calculated = acquisition_plan_calculated;
	}

	public void setAcquisition_plan_detected(final String acquisition_plan_detected) {
		this.acquisition_plan_detected = acquisition_plan_detected;
	}

	public void setAcquisition_time(final Time acquisition_time) {
		this.acquisition_time = acquisition_time;
	}

	public void setAdditional_asset_data(final String additional_asset_data) {
		this.additional_asset_data = additional_asset_data;
	}

	public void setAsset_r_factors(final String asset_r_factors) {
		this.asset_r_factors = asset_r_factors;
	}

	public void setBits_allocated(final Integer bits_allocated) {
		this.bits_allocated = bits_allocated;
	}

	public void setBits_stored(final Integer bits_stored) {
		this.bits_stored = bits_stored;
	}

	public void setCleaned_protocol_name(final String cleaned_protocol_name) {
		this.cleaned_protocol_name = cleaned_protocol_name;
	}

	public void setCleaned_series_description(final String cleaned_series_description) {
		this.cleaned_series_description = cleaned_series_description;
	}

	public void setCleaned_series_end_time(final Time cleaned_series_end_time) {
		this.cleaned_series_end_time = cleaned_series_end_time;
	}

	public void setCleaned_series_start_time(final Time cleaned_series_start_time) {
		this.cleaned_series_start_time = cleaned_series_start_time;
	}

	public void setCleaned_study_id(final String cleaned_study_id) {
		this.cleaned_study_id = cleaned_study_id;
	}

	public void setContrast_bolus_agent(final String contrast_bolus_agent) {
		this.contrast_bolus_agent = contrast_bolus_agent;
	}

	public void setContrast_bolus_agent_use_detected(final Integer contrast_bolus_agent_use_detected) {
		this.contrast_bolus_agent_use_detected = contrast_bolus_agent_use_detected;
	}

	public void setContrast_bolus_ingredient_concentration(final Double contrast_bolus_ingredient_concentration) {
		this.contrast_bolus_ingredient_concentration = contrast_bolus_ingredient_concentration;
	}

	public void setContrast_bolus_route(final String contrast_bolus_route) {
		this.contrast_bolus_route = contrast_bolus_route;
	}

	public void setContrast_bolus_start_time(final Time contrast_bolus_start_time) {
		this.contrast_bolus_start_time = contrast_bolus_start_time;
	}

	public void setContrast_bolus_volume(final Double contrast_bolus_volume) {
		this.contrast_bolus_volume = contrast_bolus_volume;
	}

	public void setD_bd_t(final Double d_bd_t) {
		this.d_bd_t = d_bd_t;
	}

	public void setDiffusion_b_value(final Double diffusion_b_value) {
		this.diffusion_b_value = diffusion_b_value;
	}

	public void setDiffusion_direction(final Double diffusion_direction) {
		this.diffusion_direction = diffusion_direction;
	}

	public void setDiffusion_level1(final Integer diffusion_level1) {
		this.diffusion_level1 = diffusion_level1;
	}

	public void setDiffusion_level2(final Integer diffusion_level2) {
		this.diffusion_level2 = diffusion_level2;
	}

	public void setDiffusion_level3(final Integer diffusion_level3) {
		this.diffusion_level3 = diffusion_level3;
	}

	public void setDisplay_field_of_view(final Double display_field_of_view) {
		this.display_field_of_view = display_field_of_view;
	}

	public void setDivision_name(final String division_name) {
		this.division_name = division_name;
	}

	public void setDosewatch_generated_uid(final String dosewatch_generated_uid) {
		this.dosewatch_generated_uid = dosewatch_generated_uid;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setEcho_numbers(final Double echo_numbers) {
		this.echo_numbers = echo_numbers;
	}

	public void setEcho_time(final Double echo_time) {
		this.echo_time = echo_time;
	}

	public void setEcho_train_length(final Double echo_train_length) {
		this.echo_train_length = echo_train_length;
	}

	public void setEnd_slice_location(final Double end_slice_location) {
		this.end_slice_location = end_slice_location;
	}

	public void setFacility_description(final String facility_description) {
		this.facility_description = facility_description;
	}

	public void setFacility_key(final Integer facility_key) {
		this.facility_key = facility_key;
	}

	public void setField_of_view(final Double field_of_view) {
		this.field_of_view = field_of_view;
	}

	public void setFirst_image_datetime(final Timestamp first_image_datetime) {
		this.first_image_datetime = first_image_datetime;
	}

	public void setFlip_angle(final Double flip_angle) {
		this.flip_angle = flip_angle;
	}

	public void setFrame_of_reference_uid(final String frame_of_reference_uid) {
		this.frame_of_reference_uid = frame_of_reference_uid;
	}

	public void setGroup_name(final String group_name) {
		this.group_name = group_name;
	}

	public void setHigh_bit(final Integer high_bit) {
		this.high_bit = high_bit;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setId_division(final Integer id_division) {
		this.id_division = id_division;
	}

	public void setId_group(final Integer id_group) {
		this.id_group = id_group;
	}

	public void setImage_frequency(final Double image_frequency) {
		this.image_frequency = image_frequency;
	}

	public void setImage_nucleus(final String image_nucleus) {
		this.image_nucleus = image_nucleus;
	}

	public void setImage_number(final Integer image_number) {
		this.image_number = image_number;
	}

	public void setImage_type(final String image_type) {
		this.image_type = image_type;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setInversion_time(final Double inversion_time) {
		this.inversion_time = inversion_time;
	}

	public void setIrradiation_event_uid(final String irradiation_event_uid) {
		this.irradiation_event_uid = irradiation_event_uid;
	}

	public void setLast_image_datetime(final Timestamp last_image_datetime) {
		this.last_image_datetime = last_image_datetime;
	}

	public void setMiscellaneous_calculated(final String miscellaneous_calculated) {
		this.miscellaneous_calculated = miscellaneous_calculated;
	}

	public void setMode(final String mode) {
		this.mode = mode;
	}

	public void setMode_calculated(final String mode_calculated) {
		this.mode_calculated = mode_calculated;
	}

	public void setMode_detected(final String mode_detected) {
		this.mode_detected = mode_detected;
	}

	public void setMr_acquisition_type(final String mr_acquisition_type) {
		this.mr_acquisition_type = mr_acquisition_type;
	}

	public void setNumber_of_excitation(final Double number_of_excitation) {
		this.number_of_excitation = number_of_excitation;
	}

	public void setNumber_of_phase_encoding_steps(final Double number_of_phase_encoding_steps) {
		this.number_of_phase_encoding_steps = number_of_phase_encoding_steps;
	}

	public void setPatient_orientation(final String patient_orientation) {
		this.patient_orientation = patient_orientation;
	}

	public void setPatient_position(final String patient_position) {
		this.patient_position = patient_position;
	}

	public void setPercent_phase_field_of_view(final Double percent_phase_field_of_view) {
		this.percent_phase_field_of_view = percent_phase_field_of_view;
	}

	public void setPercent_sampling(final Double percent_sampling) {
		this.percent_sampling = percent_sampling;
	}

	public void setphotometric_interpretation(final String photometric_interpretation) {
		this.photometric_interpretation = photometric_interpretation;
	}

	public void setPixel_bandwidth(final Double pixel_bandwidth) {
		this.pixel_bandwidth = pixel_bandwidth;
	}

	public void setPixel_representation(final String pixel_representation) {
		this.pixel_representation = pixel_representation;
	}

	public void setProtocol_key(final Long protocol_key) {
		this.protocol_key = protocol_key;
	}

	public void setProtocol_name(final String protocol_name) {
		this.protocol_name = protocol_name;
	}

	public void setPulse_sequence(final String pulse_sequence) {
		this.pulse_sequence = pulse_sequence;
	}

	public void setPulse_sequence_name(final String pulse_sequence_name) {
		this.pulse_sequence_name = pulse_sequence_name;
	}

	public void setRebuild_serie_num(final Integer rebuild_serie_num) {
		this.rebuild_serie_num = rebuild_serie_num;
	}

	public void setReceive_coil_name(final String receive_coil_name) {
		this.receive_coil_name = receive_coil_name;
	}

	public void setReceive_coil_type(final String receive_coil_type) {
		this.receive_coil_type = receive_coil_type;
	}

	public void setRepetition_time(final Double repetition_time) {
		this.repetition_time = repetition_time;
	}

	public void setSamples_per_pixel(final Integer samples_per_pixel) {
		this.samples_per_pixel = samples_per_pixel;
	}

	public void setSar(final Double sar) {
		this.sar = sar;
	}

	public void setScan_coverage(final Double scan_coverage) {
		this.scan_coverage = scan_coverage;
	}

	public void setScan_options(final String scan_options) {
		this.scan_options = scan_options;
	}

	public void setScanning_sequence(final String scanning_sequence) {
		this.scanning_sequence = scanning_sequence;
	}

	public void setSdm_model(final String sdm_model) {
		this.sdm_model = sdm_model;
	}

	public void setSequence_variant(final String sequence_variant) {
		this.sequence_variant = sequence_variant;
	}

	public void setSerie_key(final Long serie_key) {
		this.serie_key = serie_key;
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

	public void setSeries_instance_uid(final String series_instance_uid) {
		this.series_instance_uid = series_instance_uid;
	}

	public void setSeries_number(final Integer series_number) {
		this.series_number = series_number;
	}

	public void setSeries_rows(final Integer series_rows) {
		this.series_rows = series_rows;
	}

	public void setSeries_standard_coil_name(final String series_standard_coil_name) {
		this.series_standard_coil_name = series_standard_coil_name;
	}

	public void setSet_3d(final String set_3d) {
		this.set_3d = set_3d;
	}

	public void setSet_3d_calculated(final String set_3d_calculated) {
		this.set_3d_calculated = set_3d_calculated;
	}

	public void setSet_3d_detected(final String set_3d_detected) {
		this.set_3d_detected = set_3d_detected;
	}

	public void setSet_cal(final Integer set_cal) {
		this.set_cal = set_cal;
	}

	public void setSet_loc(final Integer set_loc) {
		this.set_loc = set_loc;
	}

	public void setSet_propeller(final Integer set_propeller) {
		this.set_propeller = set_propeller;
	}

	public void setSlice_thickness(final Double slice_thickness) {
		this.slice_thickness = slice_thickness;
	}

	public void setSpacing_between_slices(final Double spacing_between_slices) {
		this.spacing_between_slices = spacing_between_slices;
	}

	public void setStandardized_serie_desc(final String standardized_serie_desc) {
		this.standardized_serie_desc = standardized_serie_desc;
	}

	public void setStandardized_serie_desc_calculated(final String standardized_serie_desc_calculated) {
		this.standardized_serie_desc_calculated = standardized_serie_desc_calculated;
	}

	public void setStandardized_serie_desc_detected(final String standardized_serie_desc_detected) {
		this.standardized_serie_desc_detected = standardized_serie_desc_detected;
	}

	public void setStart_slice_location(final Double start_slice_location) {
		this.start_slice_location = start_slice_location;
	}

	public void setStudy_id_calculated(final Integer study_id_calculated) {
		this.study_id_calculated = study_id_calculated;
	}

	public void setStudy_key(final Long study_key) {
		this.study_key = study_key;
	}

	public void setSynchro(final String synchro) {
		this.synchro = synchro;
	}

	public void setTarget_region(final String target_region) {
		this.target_region = target_region;
	}

	public void setTarget_region_key(final String target_region_key) {
		this.target_region_key = target_region_key;
	}

	public void setTemp_unique_study_id(final String temp_unique_study_id) {
		this.temp_unique_study_id = temp_unique_study_id;
	}

	public void setTransmit_coil_name(final String transmit_coil_name) {
		this.transmit_coil_name = transmit_coil_name;
	}

	public void setTransmit_coil_type(final String transmit_coil_type) {
		this.transmit_coil_type = transmit_coil_type;
	}

	public void setUnique_study_id_per_ae(final Long unique_study_id_per_ae) {
		this.unique_study_id_per_ae = unique_study_id_per_ae;
	}

	public void setVoxel_size(final Double voxel_size) {
		this.voxel_size = voxel_size;
	}

	public void setWeighting(final String weighting) {
		this.weighting = weighting;
	}

	public void setWeighting_calculated(final String weighting_calculated) {
		this.weighting_calculated = weighting_calculated;
	}

	public void setWeighting_detected(final String weighting_detected) {
		this.weighting_detected = weighting_detected;
	}

	public void setWindow_center(final Integer window_center) {
		this.window_center = window_center;
	}

	public void setWindow_width(final Integer window_width) {
		this.window_width = window_width;
	}
}
