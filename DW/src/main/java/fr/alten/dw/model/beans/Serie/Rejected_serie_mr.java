/**
 * 
 */
package fr.alten.dw.model.beans.Serie;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 *
 */
public class Rejected_serie_mr implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1805340618952102004L;

	
	
	private Long id;
	private Long old_internal_id;
	private Long referring_physician_key;
	private Long perfoming_physician_key;
	private Long institution_key;
	private Long patient_key;
	private Long reading_physician_key;
	private Long series_description_key;
	private Long requesting_physician_key;
	private int domain_key;
	private int facility_key;
	private Long serie_key;
	private Long operator_key;
	private Long protocol_key;
	private int study_id;
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
	private int original_serie_num;
	private int rebuild_serie_num;
	private String institution_name;
	private String performing_physician_name;
	private String referring_physician_last_name;
	private String referring_physician_first_name;
	private String patient_id;
	private String patient_sex;
	private double patient_weight;
	private Timestamp acquisition_date;
	private String anatomic_region;
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
	private int contrast_agent_present;
	private double number_of_phase_encoding_steps;
	private double flip_angle;
	private int number_of_images;
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
	private String operator_last_name;
	private String operator_first_name;
	private String mr_acquisition_type;
	private String manufacturer_name;
	private String ae_aet;
	private Long performed_procedure_step_end_time;
	private Timestamp performed_procedure_step_end_date;
	private String sequence_variant;
	private String transmit_coil_type;
	private double diffusion_b_value;
	private double diffusion_direction;
	private double field_of_view;
	private int acquisition_matrix_1st_number;
	private int acquisition_matrix_2nd_number;
	private double image_frequency;
	private double scan_coverage;
	private String synchro;
	private String patient_orientation;
	private String acceleration_annotation_flag;
	private String acceleration_method;
	private String pulse_sequence;
	private double patient_size;
	private String software_version;
	private String protocol_name;
	private Timestamp performed_procedure_step_start_date;
	private Long performed_procedure_step_start_time;
	private int diffusion_level1;
	private int diffusion_level2;
	private int diffusion_level3;
	private String receive_coil_type;
	private double acceleration_factor;
	private String position_reference_indicator;
	private String sdm_model;
	private Timestamp dt_last_update_dwh;
	private String contrast_bolus_route;
	private double display_field_of_view;
	private String performing_physician_last_name;
	private String performing_physician_first_name;
	private String requesting_physician_last_name;
	private String requesting_physician_first_name;
	private double contrast_bolus_volume;
	private double contrast_bolus_ingredient_concentration;
	private Timestamp contrast_bolus_start_time;
	private double start_slice_location;
	private double end_slice_location;
	private double voxel_size;
	private int instance_key;
	private Long study_key;

			
	public Rejected_serie_mr() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getOld_internal_id() {
		return old_internal_id;
	}


	public void setOld_internal_id(Long old_internal_id) {
		this.old_internal_id = old_internal_id;
	}


	public Long getReferring_physician_key() {
		return referring_physician_key;
	}


	public void setReferring_physician_key(Long referring_physician_key) {
		this.referring_physician_key = referring_physician_key;
	}


	public Long getPerfoming_physician_key() {
		return perfoming_physician_key;
	}


	public void setPerfoming_physician_key(Long perfoming_physician_key) {
		this.perfoming_physician_key = perfoming_physician_key;
	}


	public Long getInstitution_key() {
		return institution_key;
	}


	public void setInstitution_key(Long institution_key) {
		this.institution_key = institution_key;
	}


	public Long getPatient_key() {
		return patient_key;
	}


	public void setPatient_key(Long patient_key) {
		this.patient_key = patient_key;
	}


	public Long getReading_physician_key() {
		return reading_physician_key;
	}


	public void setReading_physician_key(Long reading_physician_key) {
		this.reading_physician_key = reading_physician_key;
	}


	public Long getSeries_description_key() {
		return series_description_key;
	}


	public void setSeries_description_key(Long series_description_key) {
		this.series_description_key = series_description_key;
	}


	public Long getRequesting_physician_key() {
		return requesting_physician_key;
	}


	public void setRequesting_physician_key(Long requesting_physician_key) {
		this.requesting_physician_key = requesting_physician_key;
	}


	public int getDomain_key() {
		return domain_key;
	}


	public void setDomain_key(int domain_key) {
		this.domain_key = domain_key;
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


	public Long getOperator_key() {
		return operator_key;
	}


	public void setOperator_key(Long operator_key) {
		this.operator_key = operator_key;
	}


	public Long getProtocol_key() {
		return protocol_key;
	}


	public void setProtocol_key(Long protocol_key) {
		this.protocol_key = protocol_key;
	}


	public int getStudy_id() {
		return study_id;
	}


	public void setStudy_id(int study_id) {
		this.study_id = study_id;
	}


	public String getAe_title() {
		return ae_title;
	}


	public void setAe_title(String ae_title) {
		this.ae_title = ae_title;
	}


	public String getStudy_instance_uid() {
		return study_instance_uid;
	}


	public void setStudy_instance_uid(String study_instance_uid) {
		this.study_instance_uid = study_instance_uid;
	}


	public String getAccession_number() {
		return accession_number;
	}


	public void setAccession_number(String accession_number) {
		this.accession_number = accession_number;
	}


	public Timestamp getStudy_date() {
		return study_date;
	}


	public void setStudy_date(Timestamp study_date) {
		this.study_date = study_date;
	}


	public Timestamp getAcquisition_time() {
		return acquisition_time;
	}


	public void setAcquisition_time(Timestamp acquisition_time) {
		this.acquisition_time = acquisition_time;
	}


	public Long getAcquisition_duration() {
		return acquisition_duration;
	}


	public void setAcquisition_duration(Long acquisition_duration) {
		this.acquisition_duration = acquisition_duration;
	}


	public String getStudy_description() {
		return study_description;
	}


	public void setStudy_description(String study_description) {
		this.study_description = study_description;
	}


	public String getSeries_description() {
		return series_description;
	}


	public void setSeries_description(String series_description) {
		this.series_description = series_description;
	}


	public String getCleaned_serie_desc() {
		return cleaned_serie_desc;
	}


	public void setCleaned_serie_desc(String cleaned_serie_desc) {
		this.cleaned_serie_desc = cleaned_serie_desc;
	}


	public String getStandardized_serie_desc() {
		return standardized_serie_desc;
	}


	public void setStandardized_serie_desc(String standardized_serie_desc) {
		this.standardized_serie_desc = standardized_serie_desc;
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


	public int getOriginal_serie_num() {
		return original_serie_num;
	}


	public void setOriginal_serie_num(int original_serie_num) {
		this.original_serie_num = original_serie_num;
	}


	public int getRebuild_serie_num() {
		return rebuild_serie_num;
	}


	public void setRebuild_serie_num(int rebuild_serie_num) {
		this.rebuild_serie_num = rebuild_serie_num;
	}


	public String getInstitution_name() {
		return institution_name;
	}


	public void setInstitution_name(String institution_name) {
		this.institution_name = institution_name;
	}


	public String getPerforming_physician_name() {
		return performing_physician_name;
	}


	public void setPerforming_physician_name(String performing_physician_name) {
		this.performing_physician_name = performing_physician_name;
	}


	public String getReferring_physician_last_name() {
		return referring_physician_last_name;
	}


	public void setReferring_physician_last_name(String referring_physician_last_name) {
		this.referring_physician_last_name = referring_physician_last_name;
	}


	public String getReferring_physician_first_name() {
		return referring_physician_first_name;
	}


	public void setReferring_physician_first_name(String referring_physician_first_name) {
		this.referring_physician_first_name = referring_physician_first_name;
	}


	public String getPatient_id() {
		return patient_id;
	}


	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}


	public String getPatient_sex() {
		return patient_sex;
	}


	public void setPatient_sex(String patient_sex) {
		this.patient_sex = patient_sex;
	}


	public double getPatient_weight() {
		return patient_weight;
	}


	public void setPatient_weight(double patient_weight) {
		this.patient_weight = patient_weight;
	}


	public Timestamp getAcquisition_date() {
		return acquisition_date;
	}


	public void setAcquisition_date(Timestamp acquisition_date) {
		this.acquisition_date = acquisition_date;
	}


	public String getAnatomic_region() {
		return anatomic_region;
	}


	public void setAnatomic_region(String anatomic_region) {
		this.anatomic_region = anatomic_region;
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


	public int getContrast_agent_present() {
		return contrast_agent_present;
	}


	public void setContrast_agent_present(int contrast_agent_present) {
		this.contrast_agent_present = contrast_agent_present;
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


	public int getNumber_of_images() {
		return number_of_images;
	}


	public void setNumber_of_images(int number_of_images) {
		this.number_of_images = number_of_images;
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


	public String getOperator_last_name() {
		return operator_last_name;
	}


	public void setOperator_last_name(String operator_last_name) {
		this.operator_last_name = operator_last_name;
	}


	public String getOperator_first_name() {
		return operator_first_name;
	}


	public void setOperator_first_name(String operator_first_name) {
		this.operator_first_name = operator_first_name;
	}


	public String getMr_acquisition_type() {
		return mr_acquisition_type;
	}


	public void setMr_acquisition_type(String mr_acquisition_type) {
		this.mr_acquisition_type = mr_acquisition_type;
	}


	public String getManufacturer_name() {
		return manufacturer_name;
	}


	public void setManufacturer_name(String manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}


	public String getAe_aet() {
		return ae_aet;
	}


	public void setAe_aet(String ae_aet) {
		this.ae_aet = ae_aet;
	}


	public Long getPerformed_procedure_step_end_time() {
		return performed_procedure_step_end_time;
	}


	public void setPerformed_procedure_step_end_time(Long performed_procedure_step_end_time) {
		this.performed_procedure_step_end_time = performed_procedure_step_end_time;
	}


	public Timestamp getPerformed_procedure_step_end_date() {
		return performed_procedure_step_end_date;
	}


	public void setPerformed_procedure_step_end_date(Timestamp performed_procedure_step_end_date) {
		this.performed_procedure_step_end_date = performed_procedure_step_end_date;
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


	public int getAcquisition_matrix_1st_number() {
		return acquisition_matrix_1st_number;
	}


	public void setAcquisition_matrix_1st_number(int acquisition_matrix_1st_number) {
		this.acquisition_matrix_1st_number = acquisition_matrix_1st_number;
	}


	public int getAcquisition_matrix_2nd_number() {
		return acquisition_matrix_2nd_number;
	}


	public void setAcquisition_matrix_2nd_number(int acquisition_matrix_2nd_number) {
		this.acquisition_matrix_2nd_number = acquisition_matrix_2nd_number;
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


	public double getPatient_size() {
		return patient_size;
	}


	public void setPatient_size(double patient_size) {
		this.patient_size = patient_size;
	}


	public String getSoftware_version() {
		return software_version;
	}


	public void setSoftware_version(String software_version) {
		this.software_version = software_version;
	}


	public String getProtocol_name() {
		return protocol_name;
	}


	public void setProtocol_name(String protocol_name) {
		this.protocol_name = protocol_name;
	}


	public Timestamp getPerformed_procedure_step_start_date() {
		return performed_procedure_step_start_date;
	}


	public void setPerformed_procedure_step_start_date(Timestamp performed_procedure_step_start_date) {
		this.performed_procedure_step_start_date = performed_procedure_step_start_date;
	}


	public Long getPerformed_procedure_step_start_time() {
		return performed_procedure_step_start_time;
	}


	public void setPerformed_procedure_step_start_time(Long performed_procedure_step_start_time) {
		this.performed_procedure_step_start_time = performed_procedure_step_start_time;
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


	public String getPosition_reference_indicator() {
		return position_reference_indicator;
	}


	public void setPosition_reference_indicator(String position_reference_indicator) {
		this.position_reference_indicator = position_reference_indicator;
	}


	public String getSdm_model() {
		return sdm_model;
	}


	public void setSdm_model(String sdm_model) {
		this.sdm_model = sdm_model;
	}


	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}


	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
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


	public String getPerforming_physician_last_name() {
		return performing_physician_last_name;
	}


	public void setPerforming_physician_last_name(String performing_physician_last_name) {
		this.performing_physician_last_name = performing_physician_last_name;
	}


	public String getPerforming_physician_first_name() {
		return performing_physician_first_name;
	}


	public void setPerforming_physician_first_name(String performing_physician_first_name) {
		this.performing_physician_first_name = performing_physician_first_name;
	}


	public String getRequesting_physician_last_name() {
		return requesting_physician_last_name;
	}


	public void setRequesting_physician_last_name(String requesting_physician_last_name) {
		this.requesting_physician_last_name = requesting_physician_last_name;
	}


	public String getRequesting_physician_first_name() {
		return requesting_physician_first_name;
	}


	public void setRequesting_physician_first_name(String requesting_physician_first_name) {
		this.requesting_physician_first_name = requesting_physician_first_name;
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


	public Timestamp getContrast_bolus_start_time() {
		return contrast_bolus_start_time;
	}


	public void setContrast_bolus_start_time(Timestamp contrast_bolus_start_time) {
		this.contrast_bolus_start_time = contrast_bolus_start_time;
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


	public double getVoxel_size() {
		return voxel_size;
	}


	public void setVoxel_size(double voxel_size) {
		this.voxel_size = voxel_size;
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
}
