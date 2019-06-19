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
public class Serie_xa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1098390202552687062L;

	private Long id;
	private int instance_key;
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
	private String protocol_name;
	private String series_type;
	private double exposure_time;
	private double kv;
	private double field_of_view;
	private double table_vertical_position;
	private double frames_per_second;
	private int number_of_frames;
	private double positioner_primary_angle;
	private int run_number;
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
	private int number_of_pulses;
	private double pulse_width;
	private double table_longitudinal_position;
	private double table_lateral_position;
	private String reference_point_definition;
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
	private double distance_source_to_ref_point;
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
	private int id_group;
	private String group_name;
	private int id_division;
	private String division_name;
	private String study_comments;
	private double patient_height;
	private String study_id;
	private Timestamp study_datetime;
	private String accession_number;
	private int ae_key;
	private Long sd_key;
	private Long ssd_key;
	private int domain_key;
	private String aet;
	private String study_description_name;
	private String nature_of_exam;
	private double patient_age;
	private Long patient_key;
	private double focal_spot_size;
	
	public Serie_xa() {
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

	public String getProtocol_name() {
		return protocol_name;
	}

	public void setProtocol_name(String protocol_name) {
		this.protocol_name = protocol_name;
	}

	public String getSeries_type() {
		return series_type;
	}

	public void setSeries_type(String series_type) {
		this.series_type = series_type;
	}

	public double getExposure_time() {
		return exposure_time;
	}

	public void setExposure_time(double exposure_time) {
		this.exposure_time = exposure_time;
	}

	public double getKv() {
		return kv;
	}

	public void setKv(double kv) {
		this.kv = kv;
	}

	public double getField_of_view() {
		return field_of_view;
	}

	public void setField_of_view(double field_of_view) {
		this.field_of_view = field_of_view;
	}

	public double getTable_vertical_position() {
		return table_vertical_position;
	}

	public void setTable_vertical_position(double table_vertical_position) {
		this.table_vertical_position = table_vertical_position;
	}

	public double getFrames_per_second() {
		return frames_per_second;
	}

	public void setFrames_per_second(double frames_per_second) {
		this.frames_per_second = frames_per_second;
	}

	public int getNumber_of_frames() {
		return number_of_frames;
	}

	public void setNumber_of_frames(int number_of_frames) {
		this.number_of_frames = number_of_frames;
	}

	public double getPositioner_primary_angle() {
		return positioner_primary_angle;
	}

	public void setPositioner_primary_angle(double positioner_primary_angle) {
		this.positioner_primary_angle = positioner_primary_angle;
	}

	public int getRun_number() {
		return run_number;
	}

	public void setRun_number(int run_number) {
		this.run_number = run_number;
	}

	public double getPositioner_secondary_angle() {
		return positioner_secondary_angle;
	}

	public void setPositioner_secondary_angle(double positioner_secondary_angle) {
		this.positioner_secondary_angle = positioner_secondary_angle;
	}

	public String getRadiation_mode() {
		return radiation_mode;
	}

	public void setRadiation_mode(String radiation_mode) {
		this.radiation_mode = radiation_mode;
	}

	public String getFilter_material_1() {
		return filter_material_1;
	}

	public void setFilter_material_1(String filter_material_1) {
		this.filter_material_1 = filter_material_1;
	}

	public String getFilter_type_1() {
		return filter_type_1;
	}

	public void setFilter_type_1(String filter_type_1) {
		this.filter_type_1 = filter_type_1;
	}

	public double getFilter_thickness_minimum_1() {
		return filter_thickness_minimum_1;
	}

	public void setFilter_thickness_minimum_1(double filter_thickness_minimum_1) {
		this.filter_thickness_minimum_1 = filter_thickness_minimum_1;
	}

	public double getFilter_thickness_maximum_1() {
		return filter_thickness_maximum_1;
	}

	public void setFilter_thickness_maximum_1(double filter_thickness_maximum_1) {
		this.filter_thickness_maximum_1 = filter_thickness_maximum_1;
	}

	public String getFilter_material_2() {
		return filter_material_2;
	}

	public void setFilter_material_2(String filter_material_2) {
		this.filter_material_2 = filter_material_2;
	}

	public String getFilter_type_2() {
		return filter_type_2;
	}

	public void setFilter_type_2(String filter_type_2) {
		this.filter_type_2 = filter_type_2;
	}

	public double getFilter_thickness_minimum_2() {
		return filter_thickness_minimum_2;
	}

	public void setFilter_thickness_minimum_2(double filter_thickness_minimum_2) {
		this.filter_thickness_minimum_2 = filter_thickness_minimum_2;
	}

	public double getFilter_thickness_maximum_2() {
		return filter_thickness_maximum_2;
	}

	public void setFilter_thickness_maximum_2(double filter_thickness_maximum_2) {
		this.filter_thickness_maximum_2 = filter_thickness_maximum_2;
	}

	public double getDose_area_product() {
		return dose_area_product;
	}

	public void setDose_area_product(double dose_area_product) {
		this.dose_area_product = dose_area_product;
	}

	public double getDose_rp() {
		return dose_rp;
	}

	public void setDose_rp(double dose_rp) {
		this.dose_rp = dose_rp;
	}

	public Long getProtocol_key() {
		return protocol_key;
	}

	public void setProtocol_key(Long protocol_key) {
		this.protocol_key = protocol_key;
	}

	public int getNumber_of_pulses() {
		return number_of_pulses;
	}

	public void setNumber_of_pulses(int number_of_pulses) {
		this.number_of_pulses = number_of_pulses;
	}

	public double getPulse_width() {
		return pulse_width;
	}

	public void setPulse_width(double pulse_width) {
		this.pulse_width = pulse_width;
	}

	public double getTable_longitudinal_position() {
		return table_longitudinal_position;
	}

	public void setTable_longitudinal_position(double table_longitudinal_position) {
		this.table_longitudinal_position = table_longitudinal_position;
	}

	public double getTable_lateral_position() {
		return table_lateral_position;
	}

	public void setTable_lateral_position(double table_lateral_position) {
		this.table_lateral_position = table_lateral_position;
	}

	public String getReference_point_definition() {
		return reference_point_definition;
	}

	public void setReference_point_definition(String reference_point_definition) {
		this.reference_point_definition = reference_point_definition;
	}

	public double getXray_tube_current() {
		return xray_tube_current;
	}

	public void setXray_tube_current(double xray_tube_current) {
		this.xray_tube_current = xray_tube_current;
	}

	public double getExposure() {
		return exposure;
	}

	public void setExposure(double exposure) {
		this.exposure = exposure;
	}

	public double getIrradiation_duration() {
		return irradiation_duration;
	}

	public void setIrradiation_duration(double irradiation_duration) {
		this.irradiation_duration = irradiation_duration;
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

	public double getTable_head_tilt_angle() {
		return table_head_tilt_angle;
	}

	public void setTable_head_tilt_angle(double table_head_tilt_angle) {
		this.table_head_tilt_angle = table_head_tilt_angle;
	}

	public double getTable_cradle_tilt_angle() {
		return table_cradle_tilt_angle;
	}

	public void setTable_cradle_tilt_angle(double table_cradle_tilt_angle) {
		this.table_cradle_tilt_angle = table_cradle_tilt_angle;
	}

	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}

	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public double getDistance_source_detector() {
		return distance_source_detector;
	}

	public void setDistance_source_detector(double distance_source_detector) {
		this.distance_source_detector = distance_source_detector;
	}

	public String getAcquisition_plane() {
		return acquisition_plane;
	}

	public void setAcquisition_plane(String acquisition_plane) {
		this.acquisition_plane = acquisition_plane;
	}

	public String getAuto_exposure_preference() {
		return auto_exposure_preference;
	}

	public void setAuto_exposure_preference(String auto_exposure_preference) {
		this.auto_exposure_preference = auto_exposure_preference;
	}

	public double getPatient_thickness_radiological() {
		return patient_thickness_radiological;
	}

	public void setPatient_thickness_radiological(double patient_thickness_radiological) {
		this.patient_thickness_radiological = patient_thickness_radiological;
	}

	public double getDistance_source_isocenter() {
		return distance_source_isocenter;
	}

	public void setDistance_source_isocenter(double distance_source_isocenter) {
		this.distance_source_isocenter = distance_source_isocenter;
	}

	public String getProprietary_type() {
		return proprietary_type;
	}

	public void setProprietary_type(String proprietary_type) {
		this.proprietary_type = proprietary_type;
	}

	public String getIrradiation_event_type() {
		return irradiation_event_type;
	}

	public void setIrradiation_event_type(String irradiation_event_type) {
		this.irradiation_event_type = irradiation_event_type;
	}

	public String getAcquired_image() {
		return acquired_image;
	}

	public void setAcquired_image(String acquired_image) {
		this.acquired_image = acquired_image;
	}

	public double getPositioner_primary_angle_end() {
		return positioner_primary_angle_end;
	}

	public void setPositioner_primary_angle_end(double positioner_primary_angle_end) {
		this.positioner_primary_angle_end = positioner_primary_angle_end;
	}

	public double getPositioner_secondary_angle_end() {
		return positioner_secondary_angle_end;
	}

	public void setPositioner_secondary_angle_end(double positioner_secondary_angle_end) {
		this.positioner_secondary_angle_end = positioner_secondary_angle_end;
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

	public double getDistance_source_to_ref_point() {
		return distance_source_to_ref_point;
	}

	public void setDistance_source_to_ref_point(double distance_source_to_ref_point) {
		this.distance_source_to_ref_point = distance_source_to_ref_point;
	}

	public double getTable_horizontal_rotation_angle() {
		return table_horizontal_rotation_angle;
	}

	public void setTable_horizontal_rotation_angle(double table_horizontal_rotation_angle) {
		this.table_horizontal_rotation_angle = table_horizontal_rotation_angle;
	}

	public double getTable_longitudinal_position_end() {
		return table_longitudinal_position_end;
	}

	public void setTable_longitudinal_position_end(double table_longitudinal_position_end) {
		this.table_longitudinal_position_end = table_longitudinal_position_end;
	}

	public double getTable_lateral_position_end() {
		return table_lateral_position_end;
	}

	public void setTable_lateral_position_end(double table_lateral_position_end) {
		this.table_lateral_position_end = table_lateral_position_end;
	}

	public double getTable_height_position_end() {
		return table_height_position_end;
	}

	public void setTable_height_position_end(double table_height_position_end) {
		this.table_height_position_end = table_height_position_end;
	}

	public String getXray_grid() {
		return xray_grid;
	}

	public void setXray_grid(String xray_grid) {
		this.xray_grid = xray_grid;
	}

	public String getFilter_material_3() {
		return filter_material_3;
	}

	public void setFilter_material_3(String filter_material_3) {
		this.filter_material_3 = filter_material_3;
	}

	public String getFilter_type_3() {
		return filter_type_3;
	}

	public void setFilter_type_3(String filter_type_3) {
		this.filter_type_3 = filter_type_3;
	}

	public double getFilter_thickness_minimum_3() {
		return filter_thickness_minimum_3;
	}

	public void setFilter_thickness_minimum_3(double filter_thickness_minimum_3) {
		this.filter_thickness_minimum_3 = filter_thickness_minimum_3;
	}

	public double getFilter_thickness_maximum_3() {
		return filter_thickness_maximum_3;
	}

	public void setFilter_thickness_maximum_3(double filter_thickness_maximum_3) {
		this.filter_thickness_maximum_3 = filter_thickness_maximum_3;
	}

	public String getSeries_instance_uid() {
		return series_instance_uid;
	}

	public void setSeries_instance_uid(String series_instance_uid) {
		this.series_instance_uid = series_instance_uid;
	}

	public String getStudy_instance_uid() {
		return study_instance_uid;
	}

	public void setStudy_instance_uid(String study_instance_uid) {
		this.study_instance_uid = study_instance_uid;
	}

	public String getOld_study_description() {
		return old_study_description;
	}

	public void setOld_study_description(String old_study_description) {
		this.old_study_description = old_study_description;
	}

	public String getStandard_study_description() {
		return standard_study_description;
	}

	public void setStandard_study_description(String standard_study_description) {
		this.standard_study_description = standard_study_description;
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

	public String getAe_name() {
		return ae_name;
	}

	public void setAe_name(String ae_name) {
		this.ae_name = ae_name;
	}

	public String getAe_device_groups() {
		return ae_device_groups;
	}

	public void setAe_device_groups(String ae_device_groups) {
		this.ae_device_groups = ae_device_groups;
	}

	public String getManufacturer_name() {
		return manufacturer_name;
	}

	public void setManufacturer_name(String manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}

	public String getSdm_model() {
		return sdm_model;
	}

	public void setSdm_model(String sdm_model) {
		this.sdm_model = sdm_model;
	}

	public String getPerformed_ae_title() {
		return performed_ae_title;
	}

	public void setPerformed_ae_title(String performed_ae_title) {
		this.performed_ae_title = performed_ae_title;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_bmi() {
		return patient_bmi;
	}

	public void setPatient_bmi(String patient_bmi) {
		this.patient_bmi = patient_bmi;
	}

	public String getIqvote() {
		return iqvote;
	}

	public void setIqvote(String iqvote) {
		this.iqvote = iqvote;
	}

	public String getInstance_name() {
		return instance_name;
	}

	public void setInstance_name(String instance_name) {
		this.instance_name = instance_name;
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

	public String getStudy_comments() {
		return study_comments;
	}

	public void setStudy_comments(String study_comments) {
		this.study_comments = study_comments;
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

	public String getAccession_number() {
		return accession_number;
	}

	public void setAccession_number(String accession_number) {
		this.accession_number = accession_number;
	}

	public int getAe_key() {
		return ae_key;
	}

	public void setAe_key(int ae_key) {
		this.ae_key = ae_key;
	}

	public Long getSd_key() {
		return sd_key;
	}

	public void setSd_key(Long sd_key) {
		this.sd_key = sd_key;
	}

	public Long getSsd_key() {
		return ssd_key;
	}

	public void setSsd_key(Long ssd_key) {
		this.ssd_key = ssd_key;
	}

	public int getDomain_key() {
		return domain_key;
	}

	public void setDomain_key(int domain_key) {
		this.domain_key = domain_key;
	}

	public String getAet() {
		return aet;
	}

	public void setAet(String aet) {
		this.aet = aet;
	}

	public String getStudy_description_name() {
		return study_description_name;
	}

	public void setStudy_description_name(String study_description_name) {
		this.study_description_name = study_description_name;
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

	public double getFocal_spot_size() {
		return focal_spot_size;
	}

	public void setFocal_spot_size(double focal_spot_size) {
		this.focal_spot_size = focal_spot_size;
	}
	
}
