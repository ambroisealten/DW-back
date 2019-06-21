package fr.alten.dw.controller.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import fr.alten.dw.controller.business.DataBusinessController;

/**
 * Rest Controller for Data retrieving
 *
 * @author Lucas Royackkers
 *
 */
@Controller
public class DataRestController {

	@Autowired
	private DataBusinessController dataBusinessController;

	private final Gson gson;

	public DataRestController() {
		final GsonBuilder builder = new GsonBuilder();
		gson = builder.create();
	}

	@GetMapping(value="/data/all/{start]/{end}")
	@ResponseBody
	public String getAllDatasWithinDates(@PathVariable("start") final String dateStart, @PathVariable("end") final String dateEnd) {
		return dataBusinessController.getAllDatasWithinDates(dateStart,dateEnd);
	}

	@GetMapping(value="/data/{object}")
	@ResponseBody
	public String getDataForObject(@PathVariable("object") final String objectSearched) throws ClassNotFoundException, IOException {
		return gson.toJson(dataBusinessController.getDataForObject(objectSearched));
	}

}
