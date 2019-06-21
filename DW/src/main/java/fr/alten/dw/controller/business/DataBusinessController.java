package fr.alten.dw.controller.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.alten.dw.model.beans.Ae;
import fr.alten.dw.model.beans.Lexicon.Lexicon;
import fr.alten.dw.model.beans.Study.Count_study;
import fr.alten.dw.model.beans.Study.Mg_study_alert;
import fr.alten.dw.model.beans.Study.Rf_study_alert;
import fr.alten.dw.model.beans.Study.Study;
import fr.alten.dw.model.beans.Study.Study_mg;
import fr.alten.dw.model.beans.Study.Study_mr;
import fr.alten.dw.model.beans.Study.Study_range;
import fr.alten.dw.model.beans.Study.Study_rf;
import fr.alten.dw.model.beans.Study.Study_us;
import fr.alten.dw.model.beans.Study.Study_xa;
import fr.alten.dw.model.beans.Study.Xa_study_alert;
import fr.alten.dw.model.dao.DataRepository;

@Service
public class DataBusinessController {

	@Autowired
	private DataRepository dataRepository;

	public DataBusinessController() throws InstantiationException, IllegalAccessException {
		// this.dataRepository = new DataRepository();
	}

	public Object getDataForObject(String objectSearched) throws ClassNotFoundException {
//		String packageName = "fr.alten.dw.model.beans." + objectSearched.substring(0, objectSearched.indexOf("_"))+".";
//		System.out.println(packageName);
//		Class<?> className = Class.forName(packageName + objectSearched);
		return this.dataRepository.findByTable(Study.class);
	}

	public String getAllDatasWithinDates(String dateStart, String dateEnd) {
		// TODO Auto-generated method stub
		return null;
	}

}
