package fr.alten.dw.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

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
	
	private Gson gson;
	
	public DataRestController() {
		
	}
	
	@GetMapping(value="/data/{object}")
	@ResponseBody
	public String getDataForObject(@PathVariable("object") final String objectSearched) {
		return dataBusinessController.getDataForObject(objectSearched);
	}
	
	@GetMapping(value="/data/all/{start]/{end}")
	@ResponseBody
	public String getAllDatasWithinDates(@PathVariable("start") final String dateStart, @PathVariable("end") final String dateEnd) {
		return dataBusinessController.getAllDatasWithinDates(dateStart,dateEnd);
	}
	
}
