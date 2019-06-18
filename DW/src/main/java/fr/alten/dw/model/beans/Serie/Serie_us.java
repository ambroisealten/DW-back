/**
 * 
 */
package fr.alten.dw.model.beans.Serie;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 
 * @author Thomas Decamp
 *
 */
public class Serie_us implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5031451655940179668L;

	
	private Long id;
	private int instance_key;
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
	private String application;
	private String image_type;
	private String target_region;
	private String image_mode;
	private String sop_class_uid;
	private String sop_instance_uid;
	private Timestamp content_datetime;
	private int instance_number;
	private Long protocol_key;
	private String protocol_name;
	private Timestamp image_freeze_datetime_ocr;
	private String probe_ocr;
	private String program_ocr;
	private String mode_ocr;
	private String contrast_bolus_agent;
	private double contrast_bolus_volume;
	private double contrast_bolus_ingredient_concentration;
	private Time contrast_bolus_start_time;
	private String contrast_bolus_route;
	private String productivity;
	private String image_enhancement_volume_imaging;
	private String automation_tool;
	private Timestamp series_end_datetime;
	private int series_duration;
	private String transducer_type;
	
	public Serie_us() {
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

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getImage_type() {
		return image_type;
	}

	public void setImage_type(String image_type) {
		this.image_type = image_type;
	}

	public String getTarget_region() {
		return target_region;
	}

	public void setTarget_region(String target_region) {
		this.target_region = target_region;
	}

	public String getImage_mode() {
		return image_mode;
	}

	public void setImage_mode(String image_mode) {
		this.image_mode = image_mode;
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

	public Timestamp getContent_datetime() {
		return content_datetime;
	}

	public void setContent_datetime(Timestamp content_datetime) {
		this.content_datetime = content_datetime;
	}

	public int getInstance_number() {
		return instance_number;
	}

	public void setInstance_number(int instance_number) {
		this.instance_number = instance_number;
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

	public Timestamp getImage_freeze_datetime_ocr() {
		return image_freeze_datetime_ocr;
	}

	public void setImage_freeze_datetime_ocr(Timestamp image_freeze_datetime_ocr) {
		this.image_freeze_datetime_ocr = image_freeze_datetime_ocr;
	}

	public String getProbe_ocr() {
		return probe_ocr;
	}

	public void setProbe_ocr(String probe_ocr) {
		this.probe_ocr = probe_ocr;
	}

	public String getProgram_ocr() {
		return program_ocr;
	}

	public void setProgram_ocr(String program_ocr) {
		this.program_ocr = program_ocr;
	}

	public String getMode_ocr() {
		return mode_ocr;
	}

	public void setMode_ocr(String mode_ocr) {
		this.mode_ocr = mode_ocr;
	}

	public String getContrast_bolus_agent() {
		return contrast_bolus_agent;
	}

	public void setContrast_bolus_agent(String contrast_bolus_agent) {
		this.contrast_bolus_agent = contrast_bolus_agent;
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

	public Time getContrast_bolus_start_time() {
		return contrast_bolus_start_time;
	}

	public void setContrast_bolus_start_time(Time contrast_bolus_start_time) {
		this.contrast_bolus_start_time = contrast_bolus_start_time;
	}

	public String getContrast_bolus_route() {
		return contrast_bolus_route;
	}

	public void setContrast_bolus_route(String contrast_bolus_route) {
		this.contrast_bolus_route = contrast_bolus_route;
	}

	public String getProductivity() {
		return productivity;
	}

	public void setProductivity(String productivity) {
		this.productivity = productivity;
	}

	public String getImage_enhancement_volume_imaging() {
		return image_enhancement_volume_imaging;
	}

	public void setImage_enhancement_volume_imaging(String image_enhancement_volume_imaging) {
		this.image_enhancement_volume_imaging = image_enhancement_volume_imaging;
	}

	public String getAutomation_tool() {
		return automation_tool;
	}

	public void setAutomation_tool(String automation_tool) {
		this.automation_tool = automation_tool;
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

	public String getTransducer_type() {
		return transducer_type;
	}

	public void setTransducer_type(String transducer_type) {
		this.transducer_type = transducer_type;
	}
	
}
