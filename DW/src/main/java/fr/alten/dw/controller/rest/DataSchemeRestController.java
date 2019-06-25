/**
 * 
 */
package fr.alten.dw.controller.rest;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.alten.dw.controller.business.DataSchemeBusinessController;
import fr.alten.dw.model.beans.BeanScheme;

/**
 * @author Andy Chabalier
 *
 */
@Controller
public class DataSchemeRestController {

	@Autowired
	private DataSchemeBusinessController dataSchemeBusinessController;
	
	@GetMapping("/dataScheme")
	@ResponseBody
	public ArrayList<BeanScheme> fetchDataScheme() throws ClassNotFoundException, SecurityException, IOException {
		return this.dataSchemeBusinessController.getDataScheme();
	}
	
}
