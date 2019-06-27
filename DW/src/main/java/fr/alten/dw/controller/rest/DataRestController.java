package fr.alten.dw.controller.rest;

import java.io.IOException;
import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import fr.alten.dw.controller.business.DataBusinessController;
import fr.alten.dw.utils.CorrespondenceDataMap;

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
		final CorrespondenceDataMap dataMap = CorrespondenceDataMap.getInstance();
		final GsonBuilder builder = new GsonBuilder();
		gson = builder
				.setFieldNamingStrategy(new FieldNamingStrategy() {
					@Override
					public String translateName(Field f) {
						return dataMap.getColumnName(f.getName());
					}
				})
				.create();
	}

	
	@GetMapping(value="/data/{object}/{start}/{end}")
	@ResponseBody
	public String getAllDataOfAnObjectWithinStartAndEnd(@PathVariable("object") final String objectSearched, @PathVariable("start") String lineStart, @PathVariable("end") String lineNumber) throws ClassNotFoundException, IOException {
		return gson.toJson(dataBusinessController.getAllDataOfAnObjectWithinStartAndEnd(objectSearched,Integer.parseInt(lineStart),Integer.parseInt(lineNumber)));
	}

	@GetMapping(value="/data/{object}")
	@ResponseBody
	public String getDataForObject(@PathVariable("object") final String objectSearched) throws ClassNotFoundException, IOException {
		return gson.toJson(dataBusinessController.getDataForObject(objectSearched));
	}

}
