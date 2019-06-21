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
@Table(name = "dwh_serie_xa")
public class Serie_xa implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 4722489905295947185L;
	@Id
	@Column(name = "id")
	private Long id;
	private Integer instance_key;
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
	private String protocol_name;
	private String series_type;
	private double exposure_time;
	private double kv;
	private double field_of_view;
	private double table_vertical_position;
	private double frames_per_second;
	private Integer number_of_frames;
	private double positioner_primary_angle;
	private Integer run_number;
	private double positioner_secondary_angle;
	private String radiation_mode;
	private String filter_material_1;
	private String filter_type_1;
	private double filter_thickness_minimum_1;
	private double filter_thickness_maximum_1;
	private String filter_material_2;
	private String filter_type_2;
	private double filter_thickness_minimum_2;
	private double filter_thickness_maximum_2;
	private double dose_area_product;
	private double dose_rp;
	private Long protocol_key;
	private Integer number_of_pulses;
	private double pulse_width;
	private double table_longitudinal_position;
	private double table_lateral_position;
	private String reference_poInteger_definition;
	private double xray_tube_current;
	private double exposure;
	private double irradiation_duration;
	private String patient_table_relationship;
	private String patient_orientation;
	private String patient_orientation_modifier;
	private double table_head_tilt_angle;
	private double table_cradle_tilt_angle;
	private Timestamp dt_last_update_dwh;
	private double distance_source_detector;
	private String acquisition_plane;
	private String auto_exposure_preference;
	private double patient_thickness_radiological;
	private double distance_source_isocenter;
	private String proprietary_type;
	private String irradiation_event_type;
	private String acquired_image;
	private double positioner_primary_angle_end;
	private double positioner_secondary_angle_end;
	private double collimated_field_area;
	private double collimated_field_height;
	private double collimated_field_width;
	private double distance_source_to_ref_poInteger;
	private double table_horizontal_rotation_angle;
	private double table_longitudinal_position_end;
	private double table_lateral_position_end;
	private double table_height_position_end;
	private String xray_grid;
	private String filter_material_3;
	private String filter_type_3;
	private double filter_thickness_minimum_3;
	private double filter_thickness_maximum_3;
	private String series_instance_uid;
	private String study_instance_uid;
	private String old_study_description;
	private String standard_study_description;
	private String referring_physician_last_name;
	private String referring_physician_first_name;
	private String requesting_physician_last_name;
	private String requesting_physician_first_name;
	private String performing_physician_last_name;
	private String performing_physician_first_name;
	private String operator_last_name;
	private String operator_first_name;
	private String ae_name;
	private String ae_device_groups;
	private String manufacturer_name;
	private String sdm_model;
	private String performed_ae_title;
	private String patient_id;
	private String patient_bmi;
	private String iqvote;
	private String instance_name;
	private Integer id_group;
	private String group_name;
	private Integer id_division;
	private String division_name;
	private String study_comments;
	private double patient_height;
	private String study_id;
	private Timestamp study_datetime;
	private String accession_number;
	private Integer ae_key;
	private Long sd_key;
	private Long ssd_key;
	private Integer domain_key;
	private String aet;
	private String study_description_name;
	private String nature_of_exam;
	private double patient_age;
	private Long patient_key;
	private double focal_spot_size;

	public Serie_xa() {
		super();
	}

	public String getAccession_number() {
		return this.accession_number;
	}

	public String getAcquired_image() {
		return this.acquired_image;
	}

	public String getAcquisition_plane() {
		return this.acquisition_plane;
	}

	public String getAe_device_groups() {
		return this.ae_device_groups;
	}

	public Integer getAe_key() {
		return this.ae_key;
	}

	public String getAe_name() {
		return this.ae_name;
	}

	public String getAet() {
		return this.aet;
	}

	public String getAuto_exposure_preference() {
		return this.auto_exposure_preference;
	}

	public double getCollimated_field_area() {
		return this.collimated_field_area;
	}

	public double getCollimated_field_height() {
		return this.collimated_field_height;
	}

	public double getCollimated_field_width() {
		return this.collimated_field_width;
	}

	public double getDistance_source_detector() {
		return this.distance_source_detector;
	}

	public double getDistance_source_isocenter() {
		return this.distance_source_isocenter;
	}

	public double getDistance_source_to_ref_poInteger() {
		return this.distance_source_to_ref_poInteger;
	}

	public String getDivision_name() {
		return this.division_name;
	}

	public Integer getDomain_key() {
		return this.domain_key;
	}

	public double getDose_area_product() {
		return this.dose_area_product;
	}

	public double getDose_rp() {
		return this.dose_rp;
	}

	public String getDosewatch_generated_uid() {
		return this.dosewatch_generated_uid;
	}

	public Timestamp getDt_last_update_dwh() {
		return this.dt_last_update_dwh;
	}

	public double getExposure() {
		return this.exposure;
	}

	public double getExposure_time() {
		return this.exposure_time;
	}

	public String getFacility_description() {
		return this.facility_description;
	}

	public Integer getFacility_key() {
		return this.facility_key;
	}

	public double getField_of_view() {
		return this.field_of_view;
	}

	public String getFilter_material_1() {
		return this.filter_material_1;
	}

	public String getFilter_material_2() {
		return this.filter_material_2;
	}

	public String getFilter_material_3() {
		return this.filter_material_3;
	}

	public double getFilter_thickness_maximum_1() {
		return this.filter_thickness_maximum_1;
	}

	public double getFilter_thickness_maximum_2() {
		return this.filter_thickness_maximum_2;
	}

	public double getFilter_thickness_maximum_3() {
		return this.filter_thickness_maximum_3;
	}

	public double getFilter_thickness_minimum_1() {
		return this.filter_thickness_minimum_1;
	}

	public double getFilter_thickness_minimum_2() {
		return this.filter_thickness_minimum_2;
	}

	public double getFilter_thickness_minimum_3() {
		return this.filter_thickness_minimum_3;
	}

	public String getFilter_type_1() {
		return this.filter_type_1;
	}

	public String getFilter_type_2() {
		return this.filter_type_2;
	}

	public String getFilter_type_3() {
		return this.filter_type_3;
	}

	public double getFocal_spot_size() {
		return this.focal_spot_size;
	}

	public double getFrames_per_second() {
		return this.frames_per_second;
	}

	public String getGroup_name() {
		return this.group_name;
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

	public Integer getInstance_key() {
		return this.instance_key;
	}

	public String getInstance_name() {
		return this.instance_name;
	}

	public String getIqvote() {
		return this.iqvote;
	}

	public double getIrradiation_duration() {
		return this.irradiation_duration;
	}

	public String getIrradiation_event_type() {
		return this.irradiation_event_type;
	}

	public String getIrradiation_event_uid() {
		return this.irradiation_event_uid;
	}

	public double getKv() {
		return this.kv;
	}

	public String getManufacturer_name() {
		return this.manufacturer_name;
	}

	public String getNature_of_exam() {
		return this.nature_of_exam;
	}

	public Integer getNumber_of_frames() {
		return this.number_of_frames;
	}

	public Integer getNumber_of_pulses() {
		return this.number_of_pulses;
	}

	public String getOld_study_description() {
		return this.old_study_description;
	}

	public String getOperator_first_name() {
		return this.operator_first_name;
	}

	public String getOperator_last_name() {
		return this.operator_last_name;
	}

	public double getPatient_age() {
		return this.patient_age;
	}

	public String getPatient_bmi() {
		return this.patient_bmi;
	}

	public double getPatient_height() {
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

	public String getPatient_orientation_modifier() {
		return this.patient_orientation_modifier;
	}

	public String getPatient_table_relationship() {
		return this.patient_table_relationship;
	}

	public double getPatient_thickness_radiological() {
		return this.patient_thickness_radiological;
	}

	public String getPerformed_ae_title() {
		return this.performed_ae_title;
	}

	public String getPerforming_physician_first_name() {
		return this.performing_physician_first_name;
	}

	public String getPerforming_physician_last_name() {
		return this.performing_physician_last_name;
	}

	public double getPositioner_primary_angle() {
		return this.positioner_primary_angle;
	}

	public double getPositioner_primary_angle_end() {
		return this.positioner_primary_angle_end;
	}

	public double getPositioner_secondary_angle() {
		return this.positioner_secondary_angle;
	}

	public double getPositioner_secondary_angle_end() {
		return this.positioner_secondary_angle_end;
	}

	public String getProprietary_type() {
		return this.proprietary_type;
	}

	public Long getProtocol_key() {
		return this.protocol_key;
	}

	public String getProtocol_name() {
		return this.protocol_name;
	}

	public double getPulse_width() {
		return this.pulse_width;
	}

	public String getRadiation_mode() {
		return this.radiation_mode;
	}

	public String getReference_poInteger_definition() {
		return this.reference_poInteger_definition;
	}

	public String getReferring_physician_first_name() {
		return this.referring_physician_first_name;
	}

	public String getReferring_physician_last_name() {
		return this.referring_physician_last_name;
	}

	public String getRequesting_physician_first_name() {
		return this.requesting_physician_first_name;
	}

	public String getRequesting_physician_last_name() {
		return this.requesting_physician_last_name;
	}

	public Integer getRun_number() {
		return this.run_number;
	}

	public Long getSd_key() {
		return this.sd_key;
	}

	public String getSdm_model() {
		return this.sdm_model;
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

	public String getSeries_type() {
		return this.series_type;
	}

	public Long getSsd_key() {
		return this.ssd_key;
	}

	public String getStandard_study_description() {
		return this.standard_study_description;
	}

	public String getStudy_comments() {
		return this.study_comments;
	}

	public Timestamp getStudy_datetime() {
		return this.study_datetime;
	}

	public String getStudy_description_name() {
		return this.study_description_name;
	}

	public String getStudy_id() {
		return this.study_id;
	}

	public String getStudy_instance_uid() {
		return this.study_instance_uid;
	}

	public Long getStudy_key() {
		return this.study_key;
	}

	public double getTable_cradle_tilt_angle() {
		return this.table_cradle_tilt_angle;
	}

	public double getTable_head_tilt_angle() {
		return this.table_head_tilt_angle;
	}

	public double getTable_height_position_end() {
		return this.table_height_position_end;
	}

	public double getTable_horizontal_rotation_angle() {
		return this.table_horizontal_rotation_angle;
	}

	public double getTable_lateral_position() {
		return this.table_lateral_position;
	}

	public double getTable_lateral_position_end() {
		return this.table_lateral_position_end;
	}

	public double getTable_longitudinal_position() {
		return this.table_longitudinal_position;
	}

	public double getTable_longitudinal_position_end() {
		return this.table_longitudinal_position_end;
	}

	public double getTable_vertical_position() {
		return this.table_vertical_position;
	}

	public String getTarget_region_key() {
		return this.target_region_key;
	}

	public String getXray_grid() {
		return this.xray_grid;
	}

	public double getXray_tube_current() {
		return this.xray_tube_current;
	}

	public void setAccession_number(final String accession_number) {
		this.accession_number = accession_number;
	}

	public void setAcquired_image(final String acquired_image) {
		this.acquired_image = acquired_image;
	}

	public void setAcquisition_plane(final String acquisition_plane) {
		this.acquisition_plane = acquisition_plane;
	}

	public void setAe_device_groups(final String ae_device_groups) {
		this.ae_device_groups = ae_device_groups;
	}

	public void setAe_key(final Integer ae_key) {
		this.ae_key = ae_key;
	}

	public void setAe_name(final String ae_name) {
		this.ae_name = ae_name;
	}

	public void setAet(final String aet) {
		this.aet = aet;
	}

	public void setAuto_exposure_preference(final String auto_exposure_preference) {
		this.auto_exposure_preference = auto_exposure_preference;
	}

	public void setCollimated_field_area(final double collimated_field_area) {
		this.collimated_field_area = collimated_field_area;
	}

	public void setCollimated_field_height(final double collimated_field_height) {
		this.collimated_field_height = collimated_field_height;
	}

	public void setCollimated_field_width(final double collimated_field_width) {
		this.collimated_field_width = collimated_field_width;
	}

	public void setDistance_source_detector(final double distance_source_detector) {
		this.distance_source_detector = distance_source_detector;
	}

	public void setDistance_source_isocenter(final double distance_source_isocenter) {
		this.distance_source_isocenter = distance_source_isocenter;
	}

	public void setDistance_source_to_ref_poInteger(final double distance_source_to_ref_poInteger) {
		this.distance_source_to_ref_poInteger = distance_source_to_ref_poInteger;
	}

	public void setDivision_name(final String division_name) {
		this.division_name = division_name;
	}

	public void setDomain_key(final Integer domain_key) {
		this.domain_key = domain_key;
	}

	public void setDose_area_product(final double dose_area_product) {
		this.dose_area_product = dose_area_product;
	}

	public void setDose_rp(final double dose_rp) {
		this.dose_rp = dose_rp;
	}

	public void setDosewatch_generated_uid(final String dosewatch_generated_uid) {
		this.dosewatch_generated_uid = dosewatch_generated_uid;
	}

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setExposure(final double exposure) {
		this.exposure = exposure;
	}

	public void setExposure_time(final double exposure_time) {
		this.exposure_time = exposure_time;
	}

	public void setFacility_description(final String facility_description) {
		this.facility_description = facility_description;
	}

	public void setFacility_key(final Integer facility_key) {
		this.facility_key = facility_key;
	}

	public void setField_of_view(final double field_of_view) {
		this.field_of_view = field_of_view;
	}

	public void setFilter_material_1(final String filter_material_1) {
		this.filter_material_1 = filter_material_1;
	}

	public void setFilter_material_2(final String filter_material_2) {
		this.filter_material_2 = filter_material_2;
	}

	public void setFilter_material_3(final String filter_material_3) {
		this.filter_material_3 = filter_material_3;
	}

	public void setFilter_thickness_maximum_1(final double filter_thickness_maximum_1) {
		this.filter_thickness_maximum_1 = filter_thickness_maximum_1;
	}

	public void setFilter_thickness_maximum_2(final double filter_thickness_maximum_2) {
		this.filter_thickness_maximum_2 = filter_thickness_maximum_2;
	}

	public void setFilter_thickness_maximum_3(final double filter_thickness_maximum_3) {
		this.filter_thickness_maximum_3 = filter_thickness_maximum_3;
	}

	public void setFilter_thickness_minimum_1(final double filter_thickness_minimum_1) {
		this.filter_thickness_minimum_1 = filter_thickness_minimum_1;
	}

	public void setFilter_thickness_minimum_2(final double filter_thickness_minimum_2) {
		this.filter_thickness_minimum_2 = filter_thickness_minimum_2;
	}

	public void setFilter_thickness_minimum_3(final double filter_thickness_minimum_3) {
		this.filter_thickness_minimum_3 = filter_thickness_minimum_3;
	}

	public void setFilter_type_1(final String filter_type_1) {
		this.filter_type_1 = filter_type_1;
	}

	public void setFilter_type_2(final String filter_type_2) {
		this.filter_type_2 = filter_type_2;
	}

	public void setFilter_type_3(final String filter_type_3) {
		this.filter_type_3 = filter_type_3;
	}

	public void setFocal_spot_size(final double focal_spot_size) {
		this.focal_spot_size = focal_spot_size;
	}

	public void setFrames_per_second(final double frames_per_second) {
		this.frames_per_second = frames_per_second;
	}

	public void setGroup_name(final String group_name) {
		this.group_name = group_name;
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

	public void setInstance_key(final Integer instance_key) {
		this.instance_key = instance_key;
	}

	public void setInstance_name(final String instance_name) {
		this.instance_name = instance_name;
	}

	public void setIqvote(final String iqvote) {
		this.iqvote = iqvote;
	}

	public void setIrradiation_duration(final double irradiation_duration) {
		this.irradiation_duration = irradiation_duration;
	}

	public void setIrradiation_event_type(final String irradiation_event_type) {
		this.irradiation_event_type = irradiation_event_type;
	}

	public void setIrradiation_event_uid(final String irradiation_event_uid) {
		this.irradiation_event_uid = irradiation_event_uid;
	}

	public void setKv(final double kv) {
		this.kv = kv;
	}

	public void setManufacturer_name(final String manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}

	public void setNature_of_exam(final String nature_of_exam) {
		this.nature_of_exam = nature_of_exam;
	}

	public void setNumber_of_frames(final Integer number_of_frames) {
		this.number_of_frames = number_of_frames;
	}

	public void setNumber_of_pulses(final Integer number_of_pulses) {
		this.number_of_pulses = number_of_pulses;
	}

	public void setOld_study_description(final String old_study_description) {
		this.old_study_description = old_study_description;
	}

	public void setOperator_first_name(final String operator_first_name) {
		this.operator_first_name = operator_first_name;
	}

	public void setOperator_last_name(final String operator_last_name) {
		this.operator_last_name = operator_last_name;
	}

	public void setPatient_age(final double patient_age) {
		this.patient_age = patient_age;
	}

	public void setPatient_bmi(final String patient_bmi) {
		this.patient_bmi = patient_bmi;
	}

	public void setPatient_height(final double patient_height) {
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

	public void setPatient_orientation_modifier(final String patient_orientation_modifier) {
		this.patient_orientation_modifier = patient_orientation_modifier;
	}

	public void setPatient_table_relationship(final String patient_table_relationship) {
		this.patient_table_relationship = patient_table_relationship;
	}

	public void setPatient_thickness_radiological(final double patient_thickness_radiological) {
		this.patient_thickness_radiological = patient_thickness_radiological;
	}

	public void setPerformed_ae_title(final String performed_ae_title) {
		this.performed_ae_title = performed_ae_title;
	}

	public void setPerforming_physician_first_name(final String performing_physician_first_name) {
		this.performing_physician_first_name = performing_physician_first_name;
	}

	public void setPerforming_physician_last_name(final String performing_physician_last_name) {
		this.performing_physician_last_name = performing_physician_last_name;
	}

	public void setPositioner_primary_angle(final double positioner_primary_angle) {
		this.positioner_primary_angle = positioner_primary_angle;
	}

	public void setPositioner_primary_angle_end(final double positioner_primary_angle_end) {
		this.positioner_primary_angle_end = positioner_primary_angle_end;
	}

	public void setPositioner_secondary_angle(final double positioner_secondary_angle) {
		this.positioner_secondary_angle = positioner_secondary_angle;
	}

	public void setPositioner_secondary_angle_end(final double positioner_secondary_angle_end) {
		this.positioner_secondary_angle_end = positioner_secondary_angle_end;
	}

	public void setProprietary_type(final String proprietary_type) {
		this.proprietary_type = proprietary_type;
	}

	public void setProtocol_key(final Long protocol_key) {
		this.protocol_key = protocol_key;
	}

	public void setProtocol_name(final String protocol_name) {
		this.protocol_name = protocol_name;
	}

	public void setPulse_width(final double pulse_width) {
		this.pulse_width = pulse_width;
	}

	public void setRadiation_mode(final String radiation_mode) {
		this.radiation_mode = radiation_mode;
	}

	public void setReference_poInteger_definition(final String reference_poInteger_definition) {
		this.reference_poInteger_definition = reference_poInteger_definition;
	}

	public void setReferring_physician_first_name(final String referring_physician_first_name) {
		this.referring_physician_first_name = referring_physician_first_name;
	}

	public void setReferring_physician_last_name(final String referring_physician_last_name) {
		this.referring_physician_last_name = referring_physician_last_name;
	}

	public void setRequesting_physician_first_name(final String requesting_physician_first_name) {
		this.requesting_physician_first_name = requesting_physician_first_name;
	}

	public void setRequesting_physician_last_name(final String requesting_physician_last_name) {
		this.requesting_physician_last_name = requesting_physician_last_name;
	}

	public void setRun_number(final Integer run_number) {
		this.run_number = run_number;
	}

	public void setSd_key(final Long sd_key) {
		this.sd_key = sd_key;
	}

	public void setSdm_model(final String sdm_model) {
		this.sdm_model = sdm_model;
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

	public void setSeries_type(final String series_type) {
		this.series_type = series_type;
	}

	public void setSsd_key(final Long ssd_key) {
		this.ssd_key = ssd_key;
	}

	public void setStandard_study_description(final String standard_study_description) {
		this.standard_study_description = standard_study_description;
	}

	public void setStudy_comments(final String study_comments) {
		this.study_comments = study_comments;
	}

	public void setStudy_datetime(final Timestamp study_datetime) {
		this.study_datetime = study_datetime;
	}

	public void setStudy_description_name(final String study_description_name) {
		this.study_description_name = study_description_name;
	}

	public void setStudy_id(final String study_id) {
		this.study_id = study_id;
	}

	public void setStudy_instance_uid(final String study_instance_uid) {
		this.study_instance_uid = study_instance_uid;
	}

	public void setStudy_key(final Long study_key) {
		this.study_key = study_key;
	}

	public void setTable_cradle_tilt_angle(final double table_cradle_tilt_angle) {
		this.table_cradle_tilt_angle = table_cradle_tilt_angle;
	}

	public void setTable_head_tilt_angle(final double table_head_tilt_angle) {
		this.table_head_tilt_angle = table_head_tilt_angle;
	}

	public void setTable_height_position_end(final double table_height_position_end) {
		this.table_height_position_end = table_height_position_end;
	}

	public void setTable_horizontal_rotation_angle(final double table_horizontal_rotation_angle) {
		this.table_horizontal_rotation_angle = table_horizontal_rotation_angle;
	}

	public void setTable_lateral_position(final double table_lateral_position) {
		this.table_lateral_position = table_lateral_position;
	}

	public void setTable_lateral_position_end(final double table_lateral_position_end) {
		this.table_lateral_position_end = table_lateral_position_end;
	}

	public void setTable_longitudinal_position(final double table_longitudinal_position) {
		this.table_longitudinal_position = table_longitudinal_position;
	}

	public void setTable_longitudinal_position_end(final double table_longitudinal_position_end) {
		this.table_longitudinal_position_end = table_longitudinal_position_end;
	}

	public void setTable_vertical_position(final double table_vertical_position) {
		this.table_vertical_position = table_vertical_position;
	}

	public void setTarget_region_key(final String target_region_key) {
		this.target_region_key = target_region_key;
	}

	public void setXray_grid(final String xray_grid) {
		this.xray_grid = xray_grid;
	}

	public void setXray_tube_current(final double xray_tube_current) {
		this.xray_tube_current = xray_tube_current;
	}

}
