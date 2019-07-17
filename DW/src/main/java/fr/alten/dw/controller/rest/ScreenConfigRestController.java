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

import fr.alten.dw.controller.business.ScreenConfigBusinessController;

/**
 * Rest Controller for screens configuration saving
 *
 * Creation code for the table 'screen_config':
 *
 * DROP TABLE IF EXISTS `dwh_screen_config`;
 *
 * CREATE TABLE `dwh_screen_config` ( `id` INT(11) NOT NULL AUTO_INCREMENT,
 * `displayed_name` VARCHAR(200) NOT NULL DEFAULT 'Nom écran', `screen_saved`
 * LONGTEXT NULL DEFAULT NULL, `date_of_creation` DATE NOT NULL, PRIMARY KEY
 * (`id`, `displayed_name`) ) COLLATE='latin1_swedish_ci' ENGINE=InnoDB ;
 *
 *
 * @author Lucas Royackkers
 *
 */
@Controller
public class ScreenConfigRestController {

	@Autowired
	private ScreenConfigBusinessController screenConfigBusinessController;

	private final Gson gson;

	public ScreenConfigRestController() {
		final GsonBuilder builder = new GsonBuilder();
		this.gson = builder.create();
	}

	/**
	 * HTTP METHOD: GET Method to fetch a screen configuration
	 * 
	 * @param screenId            the screen id
	 * @param screenDisplayedName the screen display name
	 * @return the screen configuration
	 */
	@GetMapping(value = "/getChartConfig/{id}/{displayedName}")
	@ResponseBody
	public String getScreenConfiguration(@PathVariable("id") final int screenId,
			@PathVariable("displayedName") final String screenDisplayedName) {
		return this.gson
				.toJson(this.screenConfigBusinessController.getScreenConfiguration(screenId, screenDisplayedName));
	}

	/**
	 * HTTP METHOD: POST Method to save screen configuration
	 * 
	 * @param screenConfiguration the JSON Object (as a String) that contains all
	 *                            the screen configurations (type, filters, etc.)
	 * @param screenDisplayedName the screen display name
	 * @return the message to display to the user
	 */
	@PostMapping(value = "/saveChartConfig/{displayedName}")
	@ResponseBody
	public String saveScreenConfiguration(@RequestBody final String screenConfiguration,
			@PathVariable("displayedName") final String screenDisplayedName) {
		final String configId = this.screenConfigBusinessController.saveConfig(screenConfiguration,
				screenDisplayedName);
		return "{ \"link\" : \"" + configId + "\"}";
	}

}
