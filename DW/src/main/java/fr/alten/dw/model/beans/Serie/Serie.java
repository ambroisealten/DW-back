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
@Table(name = "dwh_serie")
public class Serie implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -6870016127836889683L;
	@Id
	@Column(name = "id")
	private Long id;
	private Integer instance_key;
	private String target_region_key;
	private Integer series_number;
	private Timestamp series_datetime;
	private Long series_description_key;
	private String series_description_name;
	private Integer facility_key;
	private String facility_description;
	private Timestamp dt_last_update_dwh;
	private String instance_name;
	private Integer bits_allocated;
	private Integer bits_stored;
	private String contrast_bolus_agent;
	private Boolean contrast_bolus_agent_use_detected;
	private Double contrast_bolus_ingredient_concentration;
	private String contrast_bolus_route;
	private Timestamp contrast_bolus_start_time;
	private Double contrast_bolus_volume;
	private Integer high_bit;
	private String image_type;
	private Integer instance_number;
	private String patient_orientation;
	private String patient_position;
	private String pixel_representation;
	private Integer protocol_key;
	private String protocol_name;
	private Integer series_columns;
	private Integer series_rows;
	private Double slice_thickness;
	private String sop_class_uid;
	private String sop_instance_uid;
	private Double spacing_between_slices;
	private Double window_center;
	private Double window_width;
	private String target_region;
	private Timestamp acquisition_datetime;
	private Timestamp series_end_datetime;
	private Integer series_duration;

	public Serie() {
		super();
	}

	public Timestamp getAcquisition_datetime() {
		return this.acquisition_datetime;
	}

	public Integer getBits_allocated() {
		return this.bits_allocated;
	}

	public Integer getBits_stored() {
		return this.bits_stored;
	}

	public String getContrast_bolus_agent() {
		return this.contrast_bolus_agent;
	}

	public Boolean getContrast_bolus_agent_use_detected() {
		return this.contrast_bolus_agent_use_detected;
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

	public Timestamp getDt_last_update_dwh() {
		return this.dt_last_update_dwh;
	}

	public String getFacility_description() {
		return this.facility_description;
	}

	public Integer getFacility_key() {
		return this.facility_key;
	}

	public Integer getHigh_bit() {
		return this.high_bit;
	}

	public Long getId() {
		return this.id;
	}

	public String getImage_type() {
		return this.image_type;
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

	public String getPatient_orientation() {
		return this.patient_orientation;
	}

	public String getPatient_position() {
		return this.patient_position;
	}

	public String getPixel_representation() {
		return this.pixel_representation;
	}

	public Integer getProtocol_key() {
		return this.protocol_key;
	}

	public String getProtocol_name() {
		return this.protocol_name;
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

	public Integer getSeries_number() {
		return this.series_number;
	}

	public Integer getSeries_rows() {
		return this.series_rows;
	}

	public Double getSlice_thickness() {
		return this.slice_thickness;
	}

	public String getSop_class_uid() {
		return this.sop_class_uid;
	}

	public String getSop_instance_uid() {
		return this.sop_instance_uid;
	}

	public Double getSpacing_between_slices() {
		return this.spacing_between_slices;
	}

	public String getTarget_region() {
		return this.target_region;
	}

	public String getTarget_region_key() {
		return this.target_region_key;
	}

	public Double getWindow_center() {
		return this.window_center;
	}

	public Double getWindow_width() {
		return this.window_width;
	}

	public void setAcquisition_datetime(final Timestamp acquisition_datetime) {
		this.acquisition_datetime = acquisition_datetime;
	}

	public void setBits_allocated(final Integer bits_allocated) {
		this.bits_allocated = bits_allocated;
	}

	public void setBits_stored(final Integer bits_stored) {
		this.bits_stored = bits_stored;
	}

	public void setContrast_bolus_agent(final String contrast_bolus_agent) {
		this.contrast_bolus_agent = contrast_bolus_agent;
	}

	public void setContrast_bolus_agent_use_detected(final Boolean contrast_bolus_agent_use_detected) {
		this.contrast_bolus_agent_use_detected = contrast_bolus_agent_use_detected;
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

	public void setDt_last_update_dwh(final Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public void setFacility_description(final String facility_description) {
		this.facility_description = facility_description;
	}

	public void setFacility_key(final Integer facility_key) {
		this.facility_key = facility_key;
	}

	public void setHigh_bit(final Integer high_bit) {
		this.high_bit = high_bit;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setImage_type(final String image_type) {
		this.image_type = image_type;
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

	public void setPatient_orientation(final String patient_orientation) {
		this.patient_orientation = patient_orientation;
	}

	public void setPatient_position(final String patient_position) {
		this.patient_position = patient_position;
	}

	public void setPixel_representation(final String pixel_representation) {
		this.pixel_representation = pixel_representation;
	}

	public void setProtocol_key(final Integer protocol_key) {
		this.protocol_key = protocol_key;
	}

	public void setProtocol_name(final String protocol_name) {
		this.protocol_name = protocol_name;
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

	public void setSeries_number(final Integer series_number) {
		this.series_number = series_number;
	}

	public void setSeries_rows(final Integer series_rows) {
		this.series_rows = series_rows;
	}

	public void setSlice_thickness(final Double slice_thickness) {
		this.slice_thickness = slice_thickness;
	}

	public void setSop_class_uid(final String sop_class_uid) {
		this.sop_class_uid = sop_class_uid;
	}

	public void setSop_instance_uid(final String sop_instance_uid) {
		this.sop_instance_uid = sop_instance_uid;
	}

	public void setSpacing_between_slices(final Double spacing_between_slices) {
		this.spacing_between_slices = spacing_between_slices;
	}

	public void setTarget_region(final String target_region) {
		this.target_region = target_region;
	}

	public void setTarget_region_key(final String target_region_key) {
		this.target_region_key = target_region_key;
	}

	public void setWindow_center(final Double window_center) {
		this.window_center = window_center;
	}

	public void setWindow_width(final Double window_width) {
		this.window_width = window_width;
	}
}
