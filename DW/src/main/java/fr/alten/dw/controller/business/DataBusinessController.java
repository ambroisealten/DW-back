package fr.alten.dw.controller.business;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.alten.dw.model.beans.BeanScheme;
import fr.alten.dw.model.dao.DataRepository;
import fr.alten.dw.utils.ReflectionClass;

@Service
@SuppressWarnings("rawtypes")
public class DataBusinessController {

	@Autowired
	private DataRepository dataRepository;

	public DataBusinessController() throws InstantiationException, IllegalAccessException {
		// this.dataRepository = new DataRepository();
	}

	public String getAllDatasWithinDates(final String dateStart, final String dateEnd) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<?> getDataForObject(final String objectSearched) throws ClassNotFoundException, IOException {
		final Package pack = BeanScheme.class.getPackage();
		for( final Class classFound: ReflectionClass.getClasses(pack.getName())) {
			if(classFound.getSimpleName().equals(objectSearched)) {
				return dataRepository.findByTable(classFound);
			}
		}
		return new ArrayList<>();
	}

}
