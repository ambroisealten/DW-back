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
@Table(name = "dwh_serie_us")
public class Serie_us implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 2950829674467668354L;
	@Id
	@Column(name = "id")
	private Long id;
	private Integer instance_key;
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
	private String application;
	private String image_type;
	private String target_region;
	private String image_mode;
	private String sop_class_uid;
	private String sop_instance_uid;
	private Timestamp content_datetime;
	private Integer instance_number;
	private Long protocol_key;
	private String protocol_name;
	private Timestamp image_freeze_datetime_ocr;
	private String probe_ocr;
	private String program_ocr;
	private String mode_ocr;
	private String contrast_bolus_agent;
	private Double contrast_bolus_volume;
	private Double contrast_bolus_ingredient_concentration;
	private Time contrast_bolus_start_time;
	private String contrast_bolus_route;
	private String productivity;
	private String image_enhancement_volume_imaging;
	private String automation_tool;
	private Timestamp series_end_datetime;
	private Integer series_duration;
	private String transducer_type;

	public Serie_us() {
		super();
	}

	public String getApplication() {
		return this.application;
	}

	public String getAutomation_tool() {
		return this.automation_tool;
	}

	public Timestamp getContent_datetime() {
		return this.content_datetime;
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

	public Time getContrast_bolus_start_time() {
		return this.contrast_bolus_start_time;
	}

	public Double getContrast_bolus_volume() {
		return this.contrast_bolus_volume;
	}

	public String getDosewatch_generated_uid() {
		return this.dosewatch_generated_uid;
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

	public Long getId() {
		return this.id;
	}

	public String getImage_enhancement_volume_imaging() {
		return this.image_enhancement_volume_imaging;
	}

	public Timestamp getImage_freeze_datetime_ocr() {
		return this.image_freeze_datetime_ocr;
	}

	public String getImage_mode() {
		return this.image_mode;
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

	public String getIrradiation_event_uid() {
		return this.irradiation_event_uid;
	}

	public String getMode_ocr() {
		return this.mode_ocr;
	}

	public String getProbe_ocr() {
		return this.probe_ocr;
	}

	public String getProductivity() {
		return this.productivity;
	}

	public String getProgram_ocr() {
		return this.program_ocr;
	}

	public Long getProtocol_key() {
		return this.protocol_key;
	}

	public String getProtocol_name() {
		return this.protocol_name;
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

	public String getSeries_instance_uid() {
		return this.series_instance_uid;
	}

	public Integer getSeries_number() {
		return this.series_number;
	}

	public String getSop_class_uid() {
		return this.sop_class_uid;
	}

	public String getSop_instance_uid() {
		return this.sop_instance_uid;
	}

	public Long getStudy_key() {
		return this.study_key;
	}

	public String getTarget_region() {
		return this.target_region;
	}

	public String getTarget_region_key() {
		return this.target_region_key;
	}

	public String getTransducer_type() {
		return this.transducer_type;
	}

	public void setApplication(final String application) {
		this.application = application;
	}

	public void setAutomation_tool(final String automation_tool) {
		this.automation_tool = automation_tool;
	}

	public void setContent_datetime(final Timestamp content_datetime) {
		this.content_datetime = content_datetime;
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

	public void setContrast_bolus_start_time(final Time contrast_bolus_start_time) {
		this.contrast_bolus_start_time = contrast_bolus_start_time;
	}

	public void setContrast_bolus_volume(final Double contrast_bolus_volume) {
		this.contrast_bolus_volume = contrast_bolus_volume;
	}

	public void setDosewatch_generated_uid(final String dosewatch_generated_uid) {
		this.dosewatch_generated_uid = dosewatch_generated_uid;
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

	public void setId(final Long id) {
		this.id = id;
	}

	public void setImage_enhancement_volume_imaging(final String image_enhancement_volume_imaging) {
		this.image_enhancement_volume_imaging = image_enhancement_volume_imaging;
	}

	public void setImage_freeze_datetime_ocr(final Timestamp image_freeze_datetime_ocr) {
		this.image_freeze_datetime_ocr = image_freeze_datetime_ocr;
	}

	public void setImage_mode(final String image_mode) {
		this.image_mode = image_mode;
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

	public void setIrradiation_event_uid(final String irradiation_event_uid) {
		this.irradiation_event_uid = irradiation_event_uid;
	}

	public void setMode_ocr(final String mode_ocr) {
		this.mode_ocr = mode_ocr;
	}

	public void setProbe_ocr(final String probe_ocr) {
		this.probe_ocr = probe_ocr;
	}

	public void setProductivity(final String productivity) {
		this.productivity = productivity;
	}

	public void setProgram_ocr(final String program_ocr) {
		this.program_ocr = program_ocr;
	}

	public void setProtocol_key(final Long protocol_key) {
		this.protocol_key = protocol_key;
	}

	public void setProtocol_name(final String protocol_name) {
		this.protocol_name = protocol_name;
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

	public void setSop_class_uid(final String sop_class_uid) {
		this.sop_class_uid = sop_class_uid;
	}

	public void setSop_instance_uid(final String sop_instance_uid) {
		this.sop_instance_uid = sop_instance_uid;
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

	public void setTransducer_type(final String transducer_type) {
		this.transducer_type = transducer_type;
	}

}
