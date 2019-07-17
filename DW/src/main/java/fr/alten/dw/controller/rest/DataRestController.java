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
		this.gson = builder.setFieldNamingStrategy(f -> dataMap.getColumnName(f.getName())).create();
	}

	/**
	 * HTTP METHOD: GET Fetch data betwen two delimiters
	 *
	 * @param objectSearched the table to fetch
	 * @param lineStart      the first line to fetch
	 * @param lineNumber     the number of line to fetch after lineStart
	 * @return the list of all data between the provided limits
	 * @throws ClassNotFoundException if the class cannot be located
	 * @throws IOException            If I/O errors occur
	 */
	@GetMapping(value = "/data/{object}/{start}/{end}")
	@ResponseBody
	public String getAllDataOfAnObjectWithinStartAndEnd(@PathVariable("object") final String objectSearched,
			@PathVariable("start") final String lineStart, @PathVariable("end") final String lineNumber)
			throws ClassNotFoundException, IOException {
		return this.gson.toJson(this.dataBusinessController.getAllDataOfAnObjectWithinStartAndEnd(objectSearched,
				Integer.parseInt(lineStart), Integer.parseInt(lineNumber)));
	}

	/**
	 * HTTP METHOD: GET Fetch data from a table
	 *
	 * @param objectSearched the table to fetch
	 * @return the table to fetch
	 * @throws ClassNotFoundException if the class cannot be located
	 * @throws IOException            If I/O errors occur
	 */
	@GetMapping(value = "/data/{object}")
	@ResponseBody
	public String getDataForObject(@PathVariable("object") final String objectSearched)
			throws ClassNotFoundException, IOException {
		return this.gson.toJson(this.dataBusinessController.getDataOfTable(objectSearched));
	}

	/**
	 * HTTP METHOD: GET Fetch data from a column of a specific table
	 *
	 * @param tableSearched  the table to analyze
	 * @param columnSearched the column to fetch
	 * @return the table to fetch
	 * @throws ClassNotFoundException if the class cannot be located
	 * @throws IOException            If I/O errors occur
	 */
	@GetMapping(value = "/data/{table}/{column}")
	@ResponseBody
	public String getDataFromColumn(@PathVariable("table") final String tableSearched,
			@PathVariable("column") final String columnSearched) throws ClassNotFoundException, IOException {
		return this.gson.toJson(this.dataBusinessController.getDataFromColumn(tableSearched, columnSearched));
	}

}
