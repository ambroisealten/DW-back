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
@Table(name = "dwh_rejected_serie_mr")
public class Rejected_serie_mr implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -8298655717645411274L;
	@Id
	@Column(name = "id")
	private Long id;
	private Long old_Integerernal_id;
	private Long referring_physician_key;
	private Long perfoming_physician_key;
	private Long institution_key;
	private Long patient_key;
	private Long reading_physician_key;
	private Long series_description_key;
	private Long requesting_physician_key;
	private Integer domain_key;
	private Integer facility_key;
	private Long serie_key;
	private Long operator_key;
	private Long protocol_key;
	private Integer study_id;
	private String ae_title;
	private String study_instance_uid;
	private String accession_number;
	private Timestamp study_date;
	private Timestamp acquisition_time;
	private Long acquisition_duration;
	private String study_description;
	private String series_description;
	private String cleaned_serie_desc;
	private String standardized_serie_desc;
	private String scan_options;
	private String image_type;
	private Integer original_serie_num;
	private Integer rebuild_serie_num;
	private String institution_name;
	private String performing_physician_name;
	private String referring_physician_last_name;
	private String referring_physician_first_name;
	private String patient_id;
	private String patient_sex;
	private Double patient_weight;
	private Timestamp acquisition_date;
	private String anatomic_region;
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
	private Integer contrast_agent_present;
	private Double number_of_phase_encoding_steps;
	private Double flip_angle;
	private Integer number_of_images;
	private String patient_position;
	private String frame_of_reference_uid;
	private Integer samples_per_pixel;
	private String photometric_Integererpretation;
	private Integer series_rows;
	private Integer series_columns;
	private Integer bits_allocated;
	private Integer bits_stored;
	private Integer high_bit;
	private String pixel_representation;
	private Integer window_width;
	private Integer window_center;
	private String operator_last_name;
	private String operator_first_name;
	private String mr_acquisition_type;
	private String manufacturer_name;
	private String ae_aet;
	private Long performed_procedure_step_end_time;
	private Timestamp performed_procedure_step_end_date;
	private String sequence_variant;
	private String transmit_coil_type;
	private Double diffusion_b_value;
	private Double diffusion_direction;
	private Double field_of_view;
	private Integer acquisition_matrix_1st_number;
	private Integer acquisition_matrix_2nd_number;
	private Double image_frequency;
	private Double scan_coverage;
	private String synchro;
	private String patient_orientation;
	private String acceleration_annotation_flag;
	private String acceleration_method;
	private String pulse_sequence;
	private Double patient_size;
	private String software_version;
	private String protocol_name;
	private Timestamp performed_procedure_step_start_date;
	private Long performed_procedure_step_start_time;
	private Integer diffusion_level1;
	private Integer diffusion_level2;
	private Integer diffusion_level3;
	private String receive_coil_type;
	private Double acceleration_factor;
	private String position_reference_indicator;
	private String sdm_model;
	private Timestamp dt_last_update_dwh;
	private String contrast_bolus_route;
	private Double display_field_of_view;
	private String performing_physician_last_name;
	private String performing_physician_first_name;
	private String requesting_physician_last_name;
	private String requesting_physician_first_name;
	private Double contrast_bolus_volume;
	private Double contrast_bolus_ingredient_concentration;
	private Timestamp contrast_bolus_start_time;
	private Double start_slice_location;
	private Double end_slice_location;
	private Double voxel_size;
	private Integer instance_key;
	private Long study_key;

	public Rejected_serie_mr() {
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

	public String getAccession_number() {
		return this.accession_number;
	}

	public Timestamp getAcquisition_date() {
		return this.acquisition_date;
	}

	public Long getAcquisition_duration() {
		return this.acquisition_duration;
	}

	public Integer getAcquisition_matrix_1st_number() {
		return this.acquisition_matrix_1st_number;
	}

	public Integer getAcquisition_matrix_2nd_number() {
		return this.acquisition_matrix_2nd_number;
	}

	public Timestamp getAcquisition_time() {
		return this.acquisition_time;
	}

	public String getAe_aet() {
		return this.ae_aet;
	}

	public String getAe_title() {
		return this.ae_title;
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

	public String getCleaned_serie_desc() {
		return this.cleaned_serie_desc;
	}

	public Integer getContrast_agent_present() {
		return this.contrast_agent_present;
	}

	public String getContrast_bolus_agent() {
		return this.contrast_bolus_agent;
	}

	public Double getContrast_bolus_ingredient_concentration() {
		return this.contrast_bolus_ingredient_concentration;
	}

	public String getContrast_bolus_route() {
		return this.contrast_bolus_route;
	}

	public Timestamp getContrast_bolus_start_time() {
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

	public Integer getDomain_key() {
		return this.domain_key;
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

	public Integer getFacility_key() {
		return this.facility_key;
	}

	public Double getField_of_view() {
		return this.field_of_view;
	}

	public Double getFlip_angle() {
		return this.flip_angle;
	}

	public String getFrame_of_reference_uid() {
		return this.frame_of_reference_uid;
	}

	public Integer getHigh_bit() {
		return this.high_bit;
	}

	public Long getId() {
		return this.id;
	}

	public Double getImage_frequency() {
		return this.image_frequency;
	}

	public String getImage_nucleus() {
		return this.image_nucleus;
	}

	public String getImage_type() {
		return this.image_type;
	}

	public Integer getInstance_key() {
		return this.instance_key;
	}

	public Long getInstitution_key() {
		return this.institution_key;
	}

	public String getInstitution_name() {
		return this.institution_name;
	}

	public Double getInversion_time() {
		return this.inversion_time;
	}

	public String getManufacturer_name() {
		return this.manufacturer_name;
	}

	public String getMr_acquisition_type() {
		return this.mr_acquisition_type;
	}

	public Double getNumber_of_excitation() {
		return this.number_of_excitation;
	}

	public Integer getNumber_of_images() {
		return this.number_of_images;
	}

	public Double getNumber_of_phase_encoding_steps() {
		return this.number_of_phase_encoding_steps;
	}

	public Long getOld_Integerernal_id() {
		return this.old_Integerernal_id;
	}

	public String getOperator_first_name() {
		return this.operator_first_name;
	}

	public Long getOperator_key() {
		return this.operator_key;
	}

	public String getOperator_last_name() {
		return this.operator_last_name;
	}

	public Integer getOriginal_serie_num() {
		return this.original_serie_num;
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

	public String getPatient_sex() {
		return this.patient_sex;
	}

	public Double getPatient_size() {
		return this.patient_size;
	}

	public Double getPatient_weight() {
		return this.patient_weight;
	}

	public Double getPercent_phase_field_of_view() {
		return this.percent_phase_field_of_view;
	}

	public Double getPercent_sampling() {
		return this.percent_sampling;
	}

	public Long getPerfoming_physician_key() {
		return this.perfoming_physician_key;
	}

	public Timestamp getPerformed_procedure_step_end_date() {
		return this.performed_procedure_step_end_date;
	}

	public Long getPerformed_procedure_step_end_time() {
		return this.performed_procedure_step_end_time;
	}

	public Timestamp getPerformed_procedure_step_start_date() {
		return this.performed_procedure_step_start_date;
	}

	public Long getPerformed_procedure_step_start_time() {
		return this.performed_procedure_step_start_time;
	}

	public String getPerforming_physician_first_name() {
		return this.performing_physician_first_name;
	}

	public String getPerforming_physician_last_name() {
		return this.performing_physician_last_name;
	}

	public String getPerforming_physician_name() {
		return this.performing_physician_name;
	}

	public String getPhotometric_Integererpretation() {
		return this.photometric_Integererpretation;
	}

	public Double getPixel_bandwidth() {
		return this.pixel_bandwidth;
	}

	public String getPixel_representation() {
		return this.pixel_representation;
	}

	public String getPosition_reference_indicator() {
		return this.position_reference_indicator;
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

	public Long getReading_physician_key() {
		return this.reading_physician_key;
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

	public String getReferring_physician_first_name() {
		return this.referring_physician_first_name;
	}

	public Long getReferring_physician_key() {
		return this.referring_physician_key;
	}

	public String getReferring_physician_last_name() {
		return this.referring_physician_last_name;
	}

	public Double getRepetition_time() {
		return this.repetition_time;
	}

	public String getRequesting_physician_first_name() {
		return this.requesting_physician_first_name;
	}

	public Long getRequesting_physician_key() {
		return this.requesting_physician_key;
	}

	public String getRequesting_physician_last_name() {
		return this.requesting_physician_last_name;
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

	public String getSeries_description() {
		return this.series_description;
	}

	public Long getSeries_description_key() {
		return this.series_description_key;
	}

	public Integer getSeries_rows() {
		return this.series_rows;
	}

	public Double getSlice_thickness() {
		return this.slice_thickness;
	}

	public String getSoftware_version() {
		return this.software_version;
	}

	public Double getSpacing_between_slices() {
		return this.spacing_between_slices;
	}

	public String getStandardized_serie_desc() {
		return this.standardized_serie_desc;
	}

	public Double getStart_slice_location() {
		return this.start_slice_location;
	}

	public Timestamp getStudy_date() {
		return this.study_date;
	}

	public String getStudy_description() {
		return this.study_description;
	}

	public Integer getStudy_id() {
		return this.study_id;
	}

	public String getStudy_instance_uid() {
		return this.study_instance_uid;
	}

	public Long getStudy_key() {
		return this.study_key;
	}

	public String getSynchro() {
		return this.synchro;
	}

	public String getTransmit_coil_name() {
		return this.transmit_coil_name;
	}

	public String getTransmit_coil_type() {
		return this.transmit_coil_type;
	}

	public Double getVoxel_size() {
		return this.voxel_size;
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

	public void setAccession_number(final String accession_number) {
		this.accession_number = accession_number;
	}

	public void setAcquisition_date(final Timestamp acquisition_date) {
		this.acquisition_date = acquisition_date;
	}

	public void setAcquisition_duration(final Long acquisition_duration) {
		this.acquisition_duration = acquisition_duration;
	}

	public void setAcquisition_matrix_1st_number(final Integer acquisition_matrix_1st_number) {
		this.acquisition_matrix_1st_number = acquisition_matrix_1st_number;
	}

	public void setAcquisition_matrix_2nd_number(final Integer acquisition_matrix_2nd_number) {
		this.acquisition_matrix_2nd_number = acquisition_matrix_2nd_number;
	}

	public void setAcquisition_time(final Timestamp acquisition_time) {
		this.acquisition_time = acquisition_time;
	}

	public void setAe_aet(final String ae_aet) {
		this.ae_aet = ae_aet;
	}

	public void setAe_title(final String ae_title) {
		this.ae_title = ae_title;
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

	public void setCleaned_serie_desc(final String cleaned_serie_desc) {
		this.cleaned_serie_desc = cleaned_serie_desc;
	}

	public void setContrast_agent_present(final Integer contrast_agent_present) {
		this.contrast_agent_present = contrast_agent_present;
	}

	public void setContrast_bolus_agent(final String contrast_bolus_agent) {
		this.contrast_bolus_agent = contrast_bolus_agent;
	}

	public void setContrast_bolus_ingredient_concentration(final Double contrast_bolus_ingredient_concentration) {
		this.contrast_bolus_ingredient_concentration = contrast_bolus_ingredient_concentration;
	}

	public void setContrast_bolus_route(final String contrast_bolus_route) {
		this.contrast_bolus_route = contrast_bolus_route;
	}

	public void setContrast_bolus_start_time(final Timestamp contrast_bolus_start_time) {
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

	public void setDomain_key(final Integer domain_key) {
		this.domain_key = domain_key;
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

	public void setFacility_key(final Integer facility_key) {
		this.facility_key = facility_key;
	}

	public void setField_of_view(final Double field_of_view) {
		this.field_of_view = field_of_view;
	}

	public void setFlip_angle(final Double flip_angle) {
		this.flip_angle = flip_angle;
	}

	public void setFrame_of_reference_uid(final String frame_of_reference_uid) {
		this.frame_of_reference_uid = frame_of_reference_uid;
	}

	public void setHigh_bit(final Integer high_bit) {
		this.high_bit = high_bit;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setImage_frequency(final Double image_frequency) {
		this.image_frequency = image_frequency;
	}

	public void setImage_nucleus(final String image_nucleus) {
		this.image_nucleus = image_nucleus;
	}

	public void setImage_type(final String image_type) {
		this.image_type = image_type;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setInstitution_key(final Long institution_key) {
		this.institution_key = institution_key;
	}

	public void setInstitution_name(final String institution_name) {
		this.institution_name = institution_name;
	}

	public void setInversion_time(final Double inversion_time) {
		this.inversion_time = inversion_time;
	}

	public void setManufacturer_name(final String manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}

	public void setMr_acquisition_type(final String mr_acquisition_type) {
		this.mr_acquisition_type = mr_acquisition_type;
	}

	public void setNumber_of_excitation(final Double number_of_excitation) {
		this.number_of_excitation = number_of_excitation;
	}

	public void setNumber_of_images(final Integer number_of_images) {
		this.number_of_images = number_of_images;
	}

	public void setNumber_of_phase_encoding_steps(final Double number_of_phase_encoding_steps) {
		this.number_of_phase_encoding_steps = number_of_phase_encoding_steps;
	}

	public void setOld_Integerernal_id(final Long old_Integerernal_id) {
		this.old_Integerernal_id = old_Integerernal_id;
	}

	public void setOperator_first_name(final String operator_first_name) {
		this.operator_first_name = operator_first_name;
	}

	public void setOperator_key(final Long operator_key) {
		this.operator_key = operator_key;
	}

	public void setOperator_last_name(final String operator_last_name) {
		this.operator_last_name = operator_last_name;
	}

	public void setOriginal_serie_num(final Integer original_serie_num) {
		this.original_serie_num = original_serie_num;
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

	public void setPatient_sex(final String patient_sex) {
		this.patient_sex = patient_sex;
	}

	public void setPatient_size(final Double patient_size) {
		this.patient_size = patient_size;
	}

	public void setPatient_weight(final Double patient_weight) {
		this.patient_weight = patient_weight;
	}

	public void setPercent_phase_field_of_view(final Double percent_phase_field_of_view) {
		this.percent_phase_field_of_view = percent_phase_field_of_view;
	}

	public void setPercent_sampling(final Double percent_sampling) {
		this.percent_sampling = percent_sampling;
	}

	public void setPerfoming_physician_key(final Long perfoming_physician_key) {
		this.perfoming_physician_key = perfoming_physician_key;
	}

	public void setPerformed_procedure_step_end_date(final Timestamp performed_procedure_step_end_date) {
		this.performed_procedure_step_end_date = performed_procedure_step_end_date;
	}

	public void setPerformed_procedure_step_end_time(final Long performed_procedure_step_end_time) {
		this.performed_procedure_step_end_time = performed_procedure_step_end_time;
	}

	public void setPerformed_procedure_step_start_date(final Timestamp performed_procedure_step_start_date) {
		this.performed_procedure_step_start_date = performed_procedure_step_start_date;
	}

	public void setPerformed_procedure_step_start_time(final Long performed_procedure_step_start_time) {
		this.performed_procedure_step_start_time = performed_procedure_step_start_time;
	}

	public void setPerforming_physician_first_name(final String performing_physician_first_name) {
		this.performing_physician_first_name = performing_physician_first_name;
	}

	public void setPerforming_physician_last_name(final String performing_physician_last_name) {
		this.performing_physician_last_name = performing_physician_last_name;
	}

	public void setPerforming_physician_name(final String performing_physician_name) {
		this.performing_physician_name = performing_physician_name;
	}

	public void setPhotometric_Integererpretation(final String photometric_Integererpretation) {
		this.photometric_Integererpretation = photometric_Integererpretation;
	}

	public void setPixel_bandwidth(final Double pixel_bandwidth) {
		this.pixel_bandwidth = pixel_bandwidth;
	}

	public void setPixel_representation(final String pixel_representation) {
		this.pixel_representation = pixel_representation;
	}

	public void setPosition_reference_indicator(final String position_reference_indicator) {
		this.position_reference_indicator = position_reference_indicator;
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

	public void setReading_physician_key(final Long reading_physician_key) {
		this.reading_physician_key = reading_physician_key;
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

	public void setReferring_physician_first_name(final String referring_physician_first_name) {
		this.referring_physician_first_name = referring_physician_first_name;
	}

	public void setReferring_physician_key(final Long referring_physician_key) {
		this.referring_physician_key = referring_physician_key;
	}

	public void setReferring_physician_last_name(final String referring_physician_last_name) {
		this.referring_physician_last_name = referring_physician_last_name;
	}

	public void setRepetition_time(final Double repetition_time) {
		this.repetition_time = repetition_time;
	}

	public void setRequesting_physician_first_name(final String requesting_physician_first_name) {
		this.requesting_physician_first_name = requesting_physician_first_name;
	}

	public void setRequesting_physician_key(final Long requesting_physician_key) {
		this.requesting_physician_key = requesting_physician_key;
	}

	public void setRequesting_physician_last_name(final String requesting_physician_last_name) {
		this.requesting_physician_last_name = requesting_physician_last_name;
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

	public void setSeries_description(final String series_description) {
		this.series_description = series_description;
	}

	public void setSeries_description_key(final Long series_description_key) {
		this.series_description_key = series_description_key;
	}

	public void setSeries_rows(final Integer series_rows) {
		this.series_rows = series_rows;
	}

	public void setSlice_thickness(final Double slice_thickness) {
		this.slice_thickness = slice_thickness;
	}

	public void setSoftware_version(final String software_version) {
		this.software_version = software_version;
	}

	public void setSpacing_between_slices(final Double spacing_between_slices) {
		this.spacing_between_slices = spacing_between_slices;
	}

	public void setStandardized_serie_desc(final String standardized_serie_desc) {
		this.standardized_serie_desc = standardized_serie_desc;
	}

	public void setStart_slice_location(final Double start_slice_location) {
		this.start_slice_location = start_slice_location;
	}

	public void setStudy_date(final Timestamp study_date) {
		this.study_date = study_date;
	}

	public void setStudy_description(final String study_description) {
		this.study_description = study_description;
	}

	public void setStudy_id(final Integer study_id) {
		this.study_id = study_id;
	}

	public void setStudy_instance_uid(final String study_instance_uid) {
		this.study_instance_uid = study_instance_uid;
	}

	public void setStudy_key(final Long study_key) {
		this.study_key = study_key;
	}

	public void setSynchro(final String synchro) {
		this.synchro = synchro;
	}

	public void setTransmit_coil_name(final String transmit_coil_name) {
		this.transmit_coil_name = transmit_coil_name;
	}

	public void setTransmit_coil_type(final String transmit_coil_type) {
		this.transmit_coil_type = transmit_coil_type;
	}

	public void setVoxel_size(final Double voxel_size) {
		this.voxel_size = voxel_size;
	}

	public void setWindow_center(final Integer window_center) {
		this.window_center = window_center;
	}

	public void setWindow_width(final Integer window_width) {
		this.window_width = window_width;
	}
}
