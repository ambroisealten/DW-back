package fr.alten.dw.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import fr.alten.dw.controller.business.ChartSaveBusinessController;

/**
 * Rest Controller for Charts configuration saving
 * 
 * Creation code for the table 'chart_config':
 * 
 * DROP TABLE IF EXISTS `dwh_chart_config`;
 * 
 * CREATE TABLE `dwh_chart_config` ( `id` INT(11) NOT NULL AUTO_INCREMENT,
 * `displayed_name` VARCHAR(200) NOT NULL DEFAULT 'Nom écran', `chart_saved`
 * LONGTEXT NULL DEFAULT NULL, `date_of_creation` DATE NOT NULL, PRIMARY KEY
 * (`id`, `displayed_name`) ) COLLATE='latin1_swedish_ci' ENGINE=InnoDB ;
 * 
 * 
 * @author Lucas Royackkers
 *
 */
@Controller
public class ChartSaveRestController {

	@Autowired
	private ChartSaveBusinessController chartSaveBusinessController;

	private final Gson gson;

	public ChartSaveRestController() {
		final GsonBuilder builder = new GsonBuilder();
		this.gson = builder.create();
	}

	@PostMapping(value = "/saveChartConfig/{displayedName}")
	@ResponseBody
	public String saveChartConfiguration(@RequestBody final String chartConfiguration,
			@PathVariable("displayedName") final String chartDisplayedName) {
		final String configId = this.chartSaveBusinessController.saveConfig(chartConfiguration, chartDisplayedName);
		return "{ \"link\" : \""+configId+"\"}";
	}

	@GetMapping(value = "/getChartConfig/{id}/{displayedName}")
	@ResponseBody
	public String getChartConfiguration(@PathVariable("id") final int chartId,
			@PathVariable("displayedName") final String displayedName) {
		return this.gson.toJson(chartSaveBusinessController.getChartConfiguration(chartId, displayedName));
	}

}
