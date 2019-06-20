package fr.alten.dw.controller.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.alten.dw.model.dao.DataRepository;

@Service
public class DataBusinessController {
	
	@Autowired
	private DataRepository dataRepository;
	
	
	public DataBusinessController() throws InstantiationException, IllegalAccessException {
	}
	
	public String getDataForObject(String objectSearched) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAllDatasWithinDates(String dateStart, String dateEnd) {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
