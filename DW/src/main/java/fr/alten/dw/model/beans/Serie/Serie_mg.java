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
public class Serie_mg implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5779224045486052567L;

	

	private Long id;
	private int instance_key;
	private String breast_imaging_procedure_modifier_code;
	private String breast_imaging_procedure_modifier_description;
	private Date acquisition_date;
	private Time acquisition_time;
	private String irradiation_event_label;
	private String label_type;
	private String irradiation_event_type;
	private String acquisition_protocol;
	private String anatomical_structure;
	private String laterality;
	private String image_view;
	private String image_view_modifier;
	private String projection_eponymous_name;
	private String patient_table_relationship;
	private String patient_orientation;
	private String patient_orientation_modifier;
	private String target_region;
	private double radiological_thickness;
	private double half_value_layer;
	private double entrance_exposure_at_rp;
	private String reference_point_definition;
	private String breast_composition;
	private String comment;
	private double average_glandular_dose;
	private double average_glandular_dose_left;
	private double average_glandular_dose_right;
	private int pulse_width;
	private double irradiation_duration;
	private int kvp;
	private double x_ray_tube_current;
	private double average_x_ray_tube_current;
	private double exposure_time;
	private double exposure;
	private double focal_spot_size;
	private String anode_target_material;
	private String x_ray_filter_type;
	private String x_ray_filter_material;
	private double x_ray_filter_thickness_minimum;
	private double x_ray_filter_thickness_maximum;
	private double collimated_field_area;
	private double collimated_field_height;
	private double collimated_field_width;
	private String x_ray_grid;
	private double positioner_primary_angle;
	private double positioner_secondary_angle;
	private double positioner_primary_end_angle;
	private double positioner_secondary_end_angle;
	private double column_angulation;
	private double compression_thickness;
	private double distance_source_to_reference_point;
	private double distance_source_to_isocenter;
	private double distance_source_to_detector;
	private double distance_source_to_table_plane;
	private double percent_fibroglandular_tissue;
	private double distance_source_to_patient;
	private String field_of_view_shape;
	private String field_of_view_dimensions;
	private double field_of_view_origin;
	private double field_of_view_rotation;
	private Boolean field_of_view_horizontal_flip;
	private double body_part_thickness;
	private double compression_force;
	private double relative_x_ray_exposure;
	private String positioner_type;
	private String exposure_control_mode;
	private String exposure_control_mode_description;
	private double distance_source_to_entrance;
	private String clinical_view;
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
	private double magnification_factor;
	private Long protocol_key;
	private String protocol_name;
	private int image_number;
	private double average_glandular_dose_p75_protocol;
	private String image_type;
	private Timestamp series_end_datetime;
	private int series_duration;
	private int total_number_of_images;
	
	
	public Serie_mg() {
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


	public String getBreast_imaging_procedure_modifier_code() {
		return breast_imaging_procedure_modifier_code;
	}


	public void setBreast_imaging_procedure_modifier_code(String breast_imaging_procedure_modifier_code) {
		this.breast_imaging_procedure_modifier_code = breast_imaging_procedure_modifier_code;
	}


	public String getBreast_imaging_procedure_modifier_description() {
		return breast_imaging_procedure_modifier_description;
	}


	public void setBreast_imaging_procedure_modifier_description(String breast_imaging_procedure_modifier_description) {
		this.breast_imaging_procedure_modifier_description = breast_imaging_procedure_modifier_description;
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


	public String getIrradiation_event_label() {
		return irradiation_event_label;
	}


	public void setIrradiation_event_label(String irradiation_event_label) {
		this.irradiation_event_label = irradiation_event_label;
	}


	public String getLabel_type() {
		return label_type;
	}


	public void setLabel_type(String label_type) {
		this.label_type = label_type;
	}


	public String getIrradiation_event_type() {
		return irradiation_event_type;
	}


	public void setIrradiation_event_type(String irradiation_event_type) {
		this.irradiation_event_type = irradiation_event_type;
	}


	public String getAcquisition_protocol() {
		return acquisition_protocol;
	}


	public void setAcquisition_protocol(String acquisition_protocol) {
		this.acquisition_protocol = acquisition_protocol;
	}


	public String getAnatomical_structure() {
		return anatomical_structure;
	}


	public void setAnatomical_structure(String anatomical_structure) {
		this.anatomical_structure = anatomical_structure;
	}


	public String getLaterality() {
		return laterality;
	}


	public void setLaterality(String laterality) {
		this.laterality = laterality;
	}


	public String getImage_view() {
		return image_view;
	}


	public void setImage_view(String image_view) {
		this.image_view = image_view;
	}


	public String getImage_view_modifier() {
		return image_view_modifier;
	}


	public void setImage_view_modifier(String image_view_modifier) {
		this.image_view_modifier = image_view_modifier;
	}


	public String getProjection_eponymous_name() {
		return projection_eponymous_name;
	}


	public void setProjection_eponymous_name(String projection_eponymous_name) {
		this.projection_eponymous_name = projection_eponymous_name;
	}


	public String getPatient_table_relationship() {
		return patient_table_relationship;
	}


	public void setPatient_table_relationship(String patient_table_relationship) {
		this.patient_table_relationship = patient_table_relationship;
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


	public String getTarget_region() {
		return target_region;
	}


	public void setTarget_region(String target_region) {
		this.target_region = target_region;
	}


	public double getRadiological_thickness() {
		return radiological_thickness;
	}


	public void setRadiological_thickness(double radiological_thickness) {
		this.radiological_thickness = radiological_thickness;
	}


	public double getHalf_value_layer() {
		return half_value_layer;
	}


	public void setHalf_value_layer(double half_value_layer) {
		this.half_value_layer = half_value_layer;
	}


	public double getEntrance_exposure_at_rp() {
		return entrance_exposure_at_rp;
	}


	public void setEntrance_exposure_at_rp(double entrance_exposure_at_rp) {
		this.entrance_exposure_at_rp = entrance_exposure_at_rp;
	}


	public String getReference_point_definition() {
		return reference_point_definition;
	}


	public void setReference_point_definition(String reference_point_definition) {
		this.reference_point_definition = reference_point_definition;
	}


	public String getBreast_composition() {
		return breast_composition;
	}


	public void setBreast_composition(String breast_composition) {
		this.breast_composition = breast_composition;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public double getAverage_glandular_dose() {
		return average_glandular_dose;
	}


	public void setAverage_glandular_dose(double average_glandular_dose) {
		this.average_glandular_dose = average_glandular_dose;
	}


	public double getAverage_glandular_dose_left() {
		return average_glandular_dose_left;
	}


	public void setAverage_glandular_dose_left(double average_glandular_dose_left) {
		this.average_glandular_dose_left = average_glandular_dose_left;
	}


	public double getAverage_glandular_dose_right() {
		return average_glandular_dose_right;
	}


	public void setAverage_glandular_dose_right(double average_glandular_dose_right) {
		this.average_glandular_dose_right = average_glandular_dose_right;
	}


	public int getPulse_width() {
		return pulse_width;
	}


	public void setPulse_width(int pulse_width) {
		this.pulse_width = pulse_width;
	}


	public double getIrradiation_duration() {
		return irradiation_duration;
	}


	public void setIrradiation_duration(double irradiation_duration) {
		this.irradiation_duration = irradiation_duration;
	}


	public int getKvp() {
		return kvp;
	}


	public void setKvp(int kvp) {
		this.kvp = kvp;
	}


	public double getX_ray_tube_current() {
		return x_ray_tube_current;
	}


	public void setX_ray_tube_current(double x_ray_tube_current) {
		this.x_ray_tube_current = x_ray_tube_current;
	}


	public double getAverage_x_ray_tube_current() {
		return average_x_ray_tube_current;
	}


	public void setAverage_x_ray_tube_current(double average_x_ray_tube_current) {
		this.average_x_ray_tube_current = average_x_ray_tube_current;
	}


	public double getExposure_time() {
		return exposure_time;
	}


	public void setExposure_time(double exposure_time) {
		this.exposure_time = exposure_time;
	}


	public double getExposure() {
		return exposure;
	}


	public void setExposure(double exposure) {
		this.exposure = exposure;
	}


	public double getFocal_spot_size() {
		return focal_spot_size;
	}


	public void setFocal_spot_size(double focal_spot_size) {
		this.focal_spot_size = focal_spot_size;
	}


	public String getAnode_target_material() {
		return anode_target_material;
	}


	public void setAnode_target_material(String anode_target_material) {
		this.anode_target_material = anode_target_material;
	}


	public String getX_ray_filter_type() {
		return x_ray_filter_type;
	}


	public void setX_ray_filter_type(String x_ray_filter_type) {
		this.x_ray_filter_type = x_ray_filter_type;
	}


	public String getX_ray_filter_material() {
		return x_ray_filter_material;
	}


	public void setX_ray_filter_material(String x_ray_filter_material) {
		this.x_ray_filter_material = x_ray_filter_material;
	}


	public double getX_ray_filter_thickness_minimum() {
		return x_ray_filter_thickness_minimum;
	}


	public void setX_ray_filter_thickness_minimum(double x_ray_filter_thickness_minimum) {
		this.x_ray_filter_thickness_minimum = x_ray_filter_thickness_minimum;
	}


	public double getX_ray_filter_thickness_maximum() {
		return x_ray_filter_thickness_maximum;
	}


	public void setX_ray_filter_thickness_maximum(double x_ray_filter_thickness_maximum) {
		this.x_ray_filter_thickness_maximum = x_ray_filter_thickness_maximum;
	}


	public double getCollimated_field_area() {
		return collimated_field_area;
	}


	public void setCollimated_field_area(double collimated_field_area) {
		this.collimated_field_area = collimated_field_area;
	}


	public double getCollimated_field_height() {
		return collimated_field_height;
	}


	public void setCollimated_field_height(double collimated_field_height) {
		this.collimated_field_height = collimated_field_height;
	}


	public double getCollimated_field_width() {
		return collimated_field_width;
	}


	public void setCollimated_field_width(double collimated_field_width) {
		this.collimated_field_width = collimated_field_width;
	}


	public String getX_ray_grid() {
		return x_ray_grid;
	}


	public void setX_ray_grid(String x_ray_grid) {
		this.x_ray_grid = x_ray_grid;
	}


	public double getPositioner_primary_angle() {
		return positioner_primary_angle;
	}


	public void setPositioner_primary_angle(double positioner_primary_angle) {
		this.positioner_primary_angle = positioner_primary_angle;
	}


	public double getPositioner_secondary_angle() {
		return positioner_secondary_angle;
	}


	public void setPositioner_secondary_angle(double positioner_secondary_angle) {
		this.positioner_secondary_angle = positioner_secondary_angle;
	}


	public double getPositioner_primary_end_angle() {
		return positioner_primary_end_angle;
	}


	public void setPositioner_primary_end_angle(double positioner_primary_end_angle) {
		this.positioner_primary_end_angle = positioner_primary_end_angle;
	}


	public double getPositioner_secondary_end_angle() {
		return positioner_secondary_end_angle;
	}


	public void setPositioner_secondary_end_angle(double positioner_secondary_end_angle) {
		this.positioner_secondary_end_angle = positioner_secondary_end_angle;
	}


	public double getColumn_angulation() {
		return column_angulation;
	}


	public void setColumn_angulation(double column_angulation) {
		this.column_angulation = column_angulation;
	}


	public double getCompression_thickness() {
		return compression_thickness;
	}


	public void setCompression_thickness(double compression_thickness) {
		this.compression_thickness = compression_thickness;
	}


	public double getDistance_source_to_reference_point() {
		return distance_source_to_reference_point;
	}


	public void setDistance_source_to_reference_point(double distance_source_to_reference_point) {
		this.distance_source_to_reference_point = distance_source_to_reference_point;
	}


	public double getDistance_source_to_isocenter() {
		return distance_source_to_isocenter;
	}


	public void setDistance_source_to_isocenter(double distance_source_to_isocenter) {
		this.distance_source_to_isocenter = distance_source_to_isocenter;
	}


	public double getDistance_source_to_detector() {
		return distance_source_to_detector;
	}


	public void setDistance_source_to_detector(double distance_source_to_detector) {
		this.distance_source_to_detector = distance_source_to_detector;
	}


	public double getDistance_source_to_table_plane() {
		return distance_source_to_table_plane;
	}


	public void setDistance_source_to_table_plane(double distance_source_to_table_plane) {
		this.distance_source_to_table_plane = distance_source_to_table_plane;
	}


	public double getPercent_fibroglandular_tissue() {
		return percent_fibroglandular_tissue;
	}


	public void setPercent_fibroglandular_tissue(double percent_fibroglandular_tissue) {
		this.percent_fibroglandular_tissue = percent_fibroglandular_tissue;
	}


	public double getDistance_source_to_patient() {
		return distance_source_to_patient;
	}


	public void setDistance_source_to_patient(double distance_source_to_patient) {
		this.distance_source_to_patient = distance_source_to_patient;
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


	public Boolean getField_of_view_horizontal_flip() {
		return field_of_view_horizontal_flip;
	}


	public void setField_of_view_horizontal_flip(Boolean field_of_view_horizontal_flip) {
		this.field_of_view_horizontal_flip = field_of_view_horizontal_flip;
	}


	public double getBody_part_thickness() {
		return body_part_thickness;
	}


	public void setBody_part_thickness(double body_part_thickness) {
		this.body_part_thickness = body_part_thickness;
	}


	public double getCompression_force() {
		return compression_force;
	}


	public void setCompression_force(double compression_force) {
		this.compression_force = compression_force;
	}


	public double getRelative_x_ray_exposure() {
		return relative_x_ray_exposure;
	}


	public void setRelative_x_ray_exposure(double relative_x_ray_exposure) {
		this.relative_x_ray_exposure = relative_x_ray_exposure;
	}


	public String getPositioner_type() {
		return positioner_type;
	}


	public void setPositioner_type(String positioner_type) {
		this.positioner_type = positioner_type;
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


	public double getDistance_source_to_entrance() {
		return distance_source_to_entrance;
	}


	public void setDistance_source_to_entrance(double distance_source_to_entrance) {
		this.distance_source_to_entrance = distance_source_to_entrance;
	}


	public String getClinical_view() {
		return clinical_view;
	}


	public void setClinical_view(String clinical_view) {
		this.clinical_view = clinical_view;
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


	public double getMagnification_factor() {
		return magnification_factor;
	}


	public void setMagnification_factor(double magnification_factor) {
		this.magnification_factor = magnification_factor;
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


	public int getImage_number() {
		return image_number;
	}


	public void setImage_number(int image_number) {
		this.image_number = image_number;
	}


	public double getAverage_glandular_dose_p75_protocol() {
		return average_glandular_dose_p75_protocol;
	}


	public void setAverage_glandular_dose_p75_protocol(double average_glandular_dose_p75_protocol) {
		this.average_glandular_dose_p75_protocol = average_glandular_dose_p75_protocol;
	}


	public String getImage_type() {
		return image_type;
	}


	public void setImage_type(String image_type) {
		this.image_type = image_type;
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


	public int getTotal_number_of_images() {
		return total_number_of_images;
	}


	public void setTotal_number_of_images(int total_number_of_images) {
		this.total_number_of_images = total_number_of_images;
	}
}
