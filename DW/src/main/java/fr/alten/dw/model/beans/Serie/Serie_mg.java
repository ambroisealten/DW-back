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
@Table(name = "dwh_serie_mg")
public class Serie_mg implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 2826756104048472444L;
	@Id
	@Column(name = "id")
	private Long id;
	private Integer instance_key;
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
	private Double radiological_thickness;
	private Double half_value_layer;
	private Double entrance_exposure_at_rp;
	private String reference_point_definition;
	private String breast_composition;
	private String comment;
	private Double average_glandular_dose;
	private Double average_glandular_dose_left;
	private Double average_glandular_dose_right;
	private Integer pulse_width;
	private Double irradiation_duration;
	private Integer kvp;
	private Double x_ray_tube_current;
	private Double average_x_ray_tube_current;
	private Double exposure_time;
	private Double exposure;
	private Double focal_spot_size;
	private String anode_target_material;
	private String x_ray_filter_type;
	private String x_ray_filter_material;
	private Double x_ray_filter_thickness_minimum;
	private Double x_ray_filter_thickness_maximum;
	private Double collimated_field_area;
	private Double collimated_field_height;
	private Double collimated_field_width;
	private String x_ray_grid;
	private Double positioner_primary_angle;
	private Double positioner_secondary_angle;
	private Double positioner_primary_end_angle;
	private Double positioner_secondary_end_angle;
	private Double column_angulation;
	private Double compression_thickness;
	private Double distance_source_to_reference_point;
	private Double distance_source_to_isocenter;
	private Double distance_source_to_detector;
	private Double distance_source_to_table_plane;
	private Double percent_fibroglandular_tissue;
	private Double distance_source_to_patient;
	private String field_of_view_shape;
	private String field_of_view_dimensions;
	private Double field_of_view_origin;
	private Double field_of_view_rotation;
	private Boolean field_of_view_horizontal_flip;
	private Double body_part_thickness;
	private Double compression_force;
	private Double relative_x_ray_exposure;
	private String positioner_type;
	private String exposure_control_mode;
	private String exposure_control_mode_description;
	private Double distance_source_to_entrance;
	private String clinical_view;
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
	private Double magnification_factor;
	private Long protocol_key;
	private String protocol_name;
	private Integer image_number;
	private Double average_glandular_dose_p75_protocol;
	private String image_type;
	private Timestamp series_end_datetime;
	private Integer series_duration;
	private Integer total_number_of_images;

	public Serie_mg() {
		super();
	}

	public Date getAcquisition_date() {
		return acquisition_date;
	}

	public String getAcquisition_protocol() {
		return acquisition_protocol;
	}

	public Time getAcquisition_time() {
		return acquisition_time;
	}

	public String getAnatomical_structure() {
		return anatomical_structure;
	}

	public String getAnode_target_material() {
		return anode_target_material;
	}

	public Double getAverage_glandular_dose() {
		return average_glandular_dose;
	}

	public Double getAverage_glandular_dose_left() {
		return average_glandular_dose_left;
	}

	public Double getAverage_glandular_dose_p75_protocol() {
		return average_glandular_dose_p75_protocol;
	}

	public Double getAverage_glandular_dose_right() {
		return average_glandular_dose_right;
	}

	public Double getAverage_x_ray_tube_current() {
		return average_x_ray_tube_current;
	}

	public Double getBody_part_thickness() {
		return body_part_thickness;
	}

	public String getBreast_composition() {
		return breast_composition;
	}

	public String getBreast_imaging_procedure_modifier_code() {
		return breast_imaging_procedure_modifier_code;
	}

	public String getBreast_imaging_procedure_modifier_description() {
		return breast_imaging_procedure_modifier_description;
	}

	public String getClinical_view() {
		return clinical_view;
	}

	public Double getCollimated_field_area() {
		return collimated_field_area;
	}

	public Double getCollimated_field_height() {
		return collimated_field_height;
	}

	public Double getCollimated_field_width() {
		return collimated_field_width;
	}

	public Double getColumn_angulation() {
		return column_angulation;
	}

	public String getComment() {
		return comment;
	}

	public Double getCompression_force() {
		return compression_force;
	}

	public Double getCompression_thickness() {
		return compression_thickness;
	}

	public Double getDistance_source_to_detector() {
		return distance_source_to_detector;
	}

	public Double getDistance_source_to_entrance() {
		return distance_source_to_entrance;
	}

	public Double getDistance_source_to_isocenter() {
		return distance_source_to_isocenter;
	}

	public Double getDistance_source_to_patient() {
		return distance_source_to_patient;
	}

	public Double getDistance_source_to_reference_point() {
		return distance_source_to_reference_point;
	}

	public Double getDistance_source_to_table_plane() {
		return distance_source_to_table_plane;
	}

	public String getDosewatch_generated_uid() {
		return dosewatch_generated_uid;
	}

	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}

	public Double getEntrance_exposure_at_rp() {
		return entrance_exposure_at_rp;
	}

	public Double getExposure() {
		return exposure;
	}

	public String getExposure_control_mode() {
		return exposure_control_mode;
	}

	public String getExposure_control_mode_description() {
		return exposure_control_mode_description;
	}

	public Double getExposure_time() {
		return exposure_time;
	}

	public String getFacility_description() {
		return facility_description;
	}

	public Integer getFacility_key() {
		return facility_key;
	}

	public String getField_of_view_dimensions() {
		return field_of_view_dimensions;
	}

	public Boolean getField_of_view_horizontal_flip() {
		return field_of_view_horizontal_flip;
	}

	public Double getField_of_view_origin() {
		return field_of_view_origin;
	}

	public Double getField_of_view_rotation() {
		return field_of_view_rotation;
	}

	public String getField_of_view_shape() {
		return field_of_view_shape;
	}

	public Double getFocal_spot_size() {
		return focal_spot_size;
	}

	public Double getHalf_value_layer() {
		return half_value_layer;
	}

	public Long getId() {
		return id;
	}

	public Integer getImage_number() {
		return image_number;
	}

	public String getImage_type() {
		return image_type;
	}

	public String getImage_view() {
		return image_view;
	}

	public String getImage_view_modifier() {
		return image_view_modifier;
	}

	public Integer getInstance_key() {
		return instance_key;
	}

	public String getInstance_name() {
		return instance_name;
	}

	public Double getIrradiation_duration() {
		return irradiation_duration;
	}

	public String getIrradiation_event_label() {
		return irradiation_event_label;
	}

	public String getIrradiation_event_type() {
		return irradiation_event_type;
	}

	public String getIrradiation_event_uid() {
		return irradiation_event_uid;
	}

	public Integer getKvp() {
		return kvp;
	}

	public String getLabel_type() {
		return label_type;
	}

	public String getLaterality() {
		return laterality;
	}

	public Double getMagnification_factor() {
		return magnification_factor;
	}

	public String getPatient_orientation() {
		return patient_orientation;
	}

	public String getPatient_orientation_modifier() {
		return patient_orientation_modifier;
	}

	public String getPatient_table_relationship() {
		return patient_table_relationship;
	}

	public Double getPercent_fibroglandular_tissue() {
		return percent_fibroglandular_tissue;
	}

	public Double getPositioner_primary_angle() {
		return positioner_primary_angle;
	}

	public Double getPositioner_primary_end_angle() {
		return positioner_primary_end_angle;
	}

	public Double getPositioner_secondary_angle() {
		return positioner_secondary_angle;
	}

	public Double getPositioner_secondary_end_angle() {
		return positioner_secondary_end_angle;
	}

	public String getPositioner_type() {
		return positioner_type;
	}

	public String getProjection_eponymous_name() {
		return projection_eponymous_name;
	}

	public Long getProtocol_key() {
		return protocol_key;
	}

	public String getProtocol_name() {
		return protocol_name;
	}

	public Integer getPulse_width() {
		return pulse_width;
	}

	public Double getRadiological_thickness() {
		return radiological_thickness;
	}

	public String getReference_point_definition() {
		return reference_point_definition;
	}

	public Double getRelative_x_ray_exposure() {
		return relative_x_ray_exposure;
	}

	public Timestamp getSeries_datetime() {
		return series_datetime;
	}

	public Long getSeries_description_key() {
		return series_description_key;
	}

	public String getSeries_description_name() {
		return series_description_name;
	}

	public Integer getSeries_duration() {
		return series_duration;
	}

	public Timestamp getSeries_end_datetime() {
		return series_end_datetime;
	}

	public String getSeries_instance_uid() {
		return series_instance_uid;
	}

	public Integer getSeries_number() {
		return series_number;
	}

	public Long getStudy_key() {
		return study_key;
	}

	public String getTarget_region() {
		return target_region;
	}

	public String getTarget_region_key() {
		return target_region_key;
	}

	public Integer getTotal_number_of_images() {
		return total_number_of_images;
	}

	public String getX_ray_filter_material() {
		return x_ray_filter_material;
	}

	public Double getX_ray_filter_thickness_maximum() {
		return x_ray_filter_thickness_maximum;
	}

	public Double getX_ray_filter_thickness_minimum() {
		return x_ray_filter_thickness_minimum;
	}

	public String getX_ray_filter_type() {
		return x_ray_filter_type;
	}

	public String getX_ray_grid() {
		return x_ray_grid;
	}

	public Double getX_ray_tube_current() {
		return x_ray_tube_current;
	}

	public void setAcquisition_date(final Date acquisition_date) {
		this.acquisition_date = acquisition_date;
	}

	public void setAcquisition_protocol(final String acquisition_protocol) {
		this.acquisition_protocol = acquisition_protocol;
	}

	public void setAcquisition_time(final Time acquisition_time) {
		this.acquisition_time = acquisition_time;
	}

	public void setAnatomical_structure(final String anatomical_structure) {
		this.anatomical_structure = anatomical_structure;
	}

	public void setAnode_target_material(final String anode_target_material) {
		this.anode_target_material = anode_target_material;
	}

	public void setAverage_glandular_dose(final Double average_glandular_dose) {
		this.average_glandular_dose = average_glandular_dose;
	}

	public void setAverage_glandular_dose_left(final Double average_glandular_dose_left) {
		this.average_glandular_dose_left = average_glandular_dose_left;
	}

	public void setAverage_glandular_dose_p75_protocol(final Double average_glandular_dose_p75_protocol) {
		this.average_glandular_dose_p75_protocol = average_glandular_dose_p75_protocol;
	}

	public void setAverage_glandular_dose_right(final Double average_glandular_dose_right) {
		this.average_glandular_dose_right = average_glandular_dose_right;
	}

	public void setAverage_x_ray_tube_current(final Double average_x_ray_tube_current) {
		this.average_x_ray_tube_current = average_x_ray_tube_current;
	}

	public void setBody_part_thickness(final Double body_part_thickness) {
		this.body_part_thickness = body_part_thickness;
	}

	public void setBreast_composition(final String breast_composition) {
		this.breast_composition = breast_composition;
	}

	public void setBreast_imaging_procedure_modifier_code(final String breast_imaging_procedure_modifier_code) {
		this.breast_imaging_procedure_modifier_code = breast_imaging_procedure_modifier_code;
	}

	public void setBreast_imaging_procedure_modifier_description(
			final String breast_imaging_procedure_modifier_description) {
		this.breast_imaging_procedure_modifier_description = breast_imaging_procedure_modifier_description;
	}

	public void setClinical_view(final String clinical_view) {
		this.clinical_view = clinical_view;
	}

	public void setCollimated_field_area(final Double collimated_field_area) {
		this.collimated_field_area = collimated_field_area;
	}

	public void setCollimated_field_height(final Double collimated_field_height) {
		this.collimated_field_height = collimated_field_height;
	}

	public void setCollimated_field_width(final Double collimated_field_width) {
		this.collimated_field_width = collimated_field_width;
	}

	public void setColumn_angulation(final Double column_angulation) {
		this.column_angulation = column_angulation;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}

	public void setCompression_force(final Double compression_force) {
		this.compression_force = compression_force;
	}

	public void setCompression_thickness(final Double compression_thickness) {
		this.compression_thickness = compression_thickness;
	}

	public void setDistance_source_to_detector(final Double distance_source_to_detector) {
		this.distance_source_to_detector = distance_source_to_detector;
	}

	public void setDistance_source_to_entrance(final Double distance_source_to_entrance) {
		this.distance_source_to_entrance = distance_source_to_entrance;
	}

	public void setDistance_source_to_isocenter(final Double distance_source_to_isocenter) {
		this.distance_source_to_isocenter = distance_source_to_isocenter;
	}

	public void setDistance_source_to_patient(final Double distance_source_to_patient) {
		this.distance_source_to_patient = distance_source_to_patient;
	}

	public void setDistance_source_to_reference_point(final Double distance_source_to_reference_point) {
		this.distance_source_to_reference_point = distance_source_to_reference_point;
	}

	public void setDistance_source_to_table_plane(final Double distance_source_to_table_plane) {
		this.distance_source_to_table_plane = distance_source_to_table_plane;
	}

	public void setDosewatch_generated_uid(final String dosewatch_generated_uid) {
		this.dosewatch_generated_uid = dosewatch_generated_uid;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setEntrance_exposure_at_rp(final Double entrance_exposure_at_rp) {
		this.entrance_exposure_at_rp = entrance_exposure_at_rp;
	}

	public void setExposure(final Double exposure) {
		this.exposure = exposure;
	}

	public void setExposure_control_mode(final String exposure_control_mode) {
		this.exposure_control_mode = exposure_control_mode;
	}

	public void setExposure_control_mode_description(final String exposure_control_mode_description) {
		this.exposure_control_mode_description = exposure_control_mode_description;
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

	public void setFocal_spot_size(final Double focal_spot_size) {
		this.focal_spot_size = focal_spot_size;
	}

	public void setHalf_value_layer(final Double half_value_layer) {
		this.half_value_layer = half_value_layer;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setImage_number(final Integer image_number) {
		this.image_number = image_number;
	}

	public void setImage_type(final String image_type) {
		this.image_type = image_type;
	}

	public void setImage_view(final String image_view) {
		this.image_view = image_view;
	}

	public void setImage_view_modifier(final String image_view_modifier) {
		this.image_view_modifier = image_view_modifier;
	}

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setInstance_name(final String instance_name) {
		this.instance_name = instance_name;
	}

	public void setIrradiation_duration(final Double irradiation_duration) {
		this.irradiation_duration = irradiation_duration;
	}

	public void setIrradiation_event_label(final String irradiation_event_label) {
		this.irradiation_event_label = irradiation_event_label;
	}

	public void setIrradiation_event_type(final String irradiation_event_type) {
		this.irradiation_event_type = irradiation_event_type;
	}

	public void setIrradiation_event_uid(final String irradiation_event_uid) {
		this.irradiation_event_uid = irradiation_event_uid;
	}

	public void setKvp(final Integer kvp) {
		this.kvp = kvp;
	}

	public void setLabel_type(final String label_type) {
		this.label_type = label_type;
	}

	public void setLaterality(final String laterality) {
		this.laterality = laterality;
	}

	public void setMagnification_factor(final Double magnification_factor) {
		this.magnification_factor = magnification_factor;
	}

	public void setPatient_orientation(final String patient_orientation) {
		this.patient_orientation = patient_orientation;
	}

	public void setPatient_orientation_modifier(final String patient_orientation_modifier) {
		this.patient_orientation_modifier = patient_orientation_modifier;
	}

	public void setPatient_table_relationship(final String patient_table_relationship) {
		this.patient_table_relationship = patient_table_relationship;
	}

	public void setPercent_fibroglandular_tissue(final Double percent_fibroglandular_tissue) {
		this.percent_fibroglandular_tissue = percent_fibroglandular_tissue;
	}

	public void setPositioner_primary_angle(final Double positioner_primary_angle) {
		this.positioner_primary_angle = positioner_primary_angle;
	}

	public void setPositioner_primary_end_angle(final Double positioner_primary_end_angle) {
		this.positioner_primary_end_angle = positioner_primary_end_angle;
	}

	public void setPositioner_secondary_angle(final Double positioner_secondary_angle) {
		this.positioner_secondary_angle = positioner_secondary_angle;
	}

	public void setPositioner_secondary_end_angle(final Double positioner_secondary_end_angle) {
		this.positioner_secondary_end_angle = positioner_secondary_end_angle;
	}

	public void setPositioner_type(final String positioner_type) {
		this.positioner_type = positioner_type;
	}

	public void setProjection_eponymous_name(final String projection_eponymous_name) {
		this.projection_eponymous_name = projection_eponymous_name;
	}

	public void setProtocol_key(final Long protocol_key) {
		this.protocol_key = protocol_key;
	}

	public void setProtocol_name(final String protocol_name) {
		this.protocol_name = protocol_name;
	}

	public void setPulse_width(final Integer pulse_width) {
		this.pulse_width = pulse_width;
	}

	public void setRadiological_thickness(final Double radiological_thickness) {
		this.radiological_thickness = radiological_thickness;
	}

	public void setReference_point_definition(final String reference_point_definition) {
		this.reference_point_definition = reference_point_definition;
	}

	public void setRelative_x_ray_exposure(final Double relative_x_ray_exposure) {
		this.relative_x_ray_exposure = relative_x_ray_exposure;
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

	public void setSeries_instance_uid(final String series_instance_uid) {
		this.series_instance_uid = series_instance_uid;
	}

	public void setSeries_number(final Integer series_number) {
		this.series_number = series_number;
	}

	public void setStudy_key(final Long study_key) {
		this.study_key = study_key;
	}

	public void setTarget_region(final String target_region) {
		this.target_region = target_region;
	}

	public void setTarget_region_key(final String target_region_key) {
		this.target_region_key = target_region_key;
	}

	public void setTotal_number_of_images(final Integer total_number_of_images) {
		this.total_number_of_images = total_number_of_images;
	}

	public void setX_ray_filter_material(final String x_ray_filter_material) {
		this.x_ray_filter_material = x_ray_filter_material;
	}

	public void setX_ray_filter_thickness_maximum(final Double x_ray_filter_thickness_maximum) {
		this.x_ray_filter_thickness_maximum = x_ray_filter_thickness_maximum;
	}

	public void setX_ray_filter_thickness_minimum(final Double x_ray_filter_thickness_minimum) {
		this.x_ray_filter_thickness_minimum = x_ray_filter_thickness_minimum;
	}

	public void setX_ray_filter_type(final String x_ray_filter_type) {
		this.x_ray_filter_type = x_ray_filter_type;
	}

	public void setX_ray_grid(final String x_ray_grid) {
		this.x_ray_grid = x_ray_grid;
	}

	public void setX_ray_tube_current(final Double x_ray_tube_current) {
		this.x_ray_tube_current = x_ray_tube_current;
	}
}
