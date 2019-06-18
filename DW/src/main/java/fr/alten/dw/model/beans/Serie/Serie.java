/**
 * 
 */
package fr.alten.dw.model.beans.Serie;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 *
 */
public class Serie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5222272030691996886L;

	@Id
	private transient ObjectId _id;
	
	private int instance_key;
	private String target_region_key;
	private int series_number;
	private Timestamp series_datetime;
	private Long series_description_key;
	private String series_description_name;
	private int facility_key;
	private String facility_description;
	private Timestamp dt_last_update_dwh;
	private String instance_name;
	private int bits_allocated;
	private int bits_stored;
	private String contrast_bolus_agent;
	private Boolean contrast_bolus_agent_use_detected;
	private double contrast_bolus_ingredient_concentration;
	private String contrast_bolus_route;
	private Timestamp contrast_bolus_start_time;
	private double contrast_bolus_volume;
	private int high_bit;
	private String image_type;
	private int instance_number;
	private String patient_orientation;
	private String patient_position;
	private String pixel_representation;
	private int protocol_key;
	private String protocol_name;
	private int series_columns;
	private int series_rows;
	private double slice_thickness;
	private String sop_class_uid;
	private String sop_instance_uid;
	private double spacing_between_slices;
	private double window_center;
	private double window_width;
	private String target_region;
	private Timestamp acquisition_datetime;
	private Timestamp series_end_datetime;
	private int series_duration;
	
	
	public Serie() {
		super();
	}


	public int getInstance_key() {
		return instance_key;
	}


	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
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


	public String getContrast_bolus_agent() {
		return contrast_bolus_agent;
	}


	public void setContrast_bolus_agent(String contrast_bolus_agent) {
		this.contrast_bolus_agent = contrast_bolus_agent;
	}


	public Boolean getContrast_bolus_agent_use_detected() {
		return contrast_bolus_agent_use_detected;
	}


	public void setContrast_bolus_agent_use_detected(Boolean contrast_bolus_agent_use_detected) {
		this.contrast_bolus_agent_use_detected = contrast_bolus_agent_use_detected;
	}


	public double getContrast_bolus_ingredient_concentration() {
		return contrast_bolus_ingredient_concentration;
	}


	public void setContrast_bolus_ingredient_concentration(double contrast_bolus_ingredient_concentration) {
		this.contrast_bolus_ingredient_concentration = contrast_bolus_ingredient_concentration;
	}


	public String getContrast_bolus_route() {
		return contrast_bolus_route;
	}


	public void setContrast_bolus_route(String contrast_bolus_route) {
		this.contrast_bolus_route = contrast_bolus_route;
	}


	public Timestamp getContrast_bolus_start_time() {
		return contrast_bolus_start_time;
	}


	public void setContrast_bolus_start_time(Timestamp contrast_bolus_start_time) {
		this.contrast_bolus_start_time = contrast_bolus_start_time;
	}


	public double getContrast_bolus_volume() {
		return contrast_bolus_volume;
	}


	public void setContrast_bolus_volume(double contrast_bolus_volume) {
		this.contrast_bolus_volume = contrast_bolus_volume;
	}


	public int getHigh_bit() {
		return high_bit;
	}


	public void setHigh_bit(int high_bit) {
		this.high_bit = high_bit;
	}


	public String getImage_type() {
		return image_type;
	}


	public void setImage_type(String image_type) {
		this.image_type = image_type;
	}


	public int getInstance_number() {
		return instance_number;
	}


	public void setInstance_number(int instance_number) {
		this.instance_number = instance_number;
	}


	public String getPatient_orientation() {
		return patient_orientation;
	}


	public void setPatient_orientation(String patient_orientation) {
		this.patient_orientation = patient_orientation;
	}


	public String getPatient_position() {
		return patient_position;
	}


	public void setPatient_position(String patient_position) {
		this.patient_position = patient_position;
	}


	public String getPixel_representation() {
		return pixel_representation;
	}


	public void setPixel_representation(String pixel_representation) {
		this.pixel_representation = pixel_representation;
	}


	public int getProtocol_key() {
		return protocol_key;
	}


	public void setProtocol_key(int protocol_key) {
		this.protocol_key = protocol_key;
	}


	public String getProtocol_name() {
		return protocol_name;
	}


	public void setProtocol_name(String protocol_name) {
		this.protocol_name = protocol_name;
	}


	public int getSeries_columns() {
		return series_columns;
	}


	public void setSeries_columns(int series_columns) {
		this.series_columns = series_columns;
	}


	public int getSeries_rows() {
		return series_rows;
	}


	public void setSeries_rows(int series_rows) {
		this.series_rows = series_rows;
	}


	public double getSlice_thickness() {
		return slice_thickness;
	}


	public void setSlice_thickness(double slice_thickness) {
		this.slice_thickness = slice_thickness;
	}


	public String getSop_class_uid() {
		return sop_class_uid;
	}


	public void setSop_class_uid(String sop_class_uid) {
		this.sop_class_uid = sop_class_uid;
	}


	public String getSop_instance_uid() {
		return sop_instance_uid;
	}


	public void setSop_instance_uid(String sop_instance_uid) {
		this.sop_instance_uid = sop_instance_uid;
	}


	public double getSpacing_between_slices() {
		return spacing_between_slices;
	}


	public void setSpacing_between_slices(double spacing_between_slices) {
		this.spacing_between_slices = spacing_between_slices;
	}


	public double getWindow_center() {
		return window_center;
	}


	public void setWindow_center(double window_center) {
		this.window_center = window_center;
	}


	public double getWindow_width() {
		return window_width;
	}


	public void setWindow_width(double window_width) {
		this.window_width = window_width;
	}


	public String getTarget_region() {
		return target_region;
	}


	public void setTarget_region(String target_region) {
		this.target_region = target_region;
	}


	public Timestamp getAcquisition_datetime() {
		return acquisition_datetime;
	}


	public void setAcquisition_datetime(Timestamp acquisition_datetime) {
		this.acquisition_datetime = acquisition_datetime;
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
