package fr.alten.dw.controller.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.alten.dw.model.beans.ChartConfig;
import fr.alten.dw.model.dao.ChartSaveRepository;

@Service
public class ChartSaveBusinessController {
	
	@Autowired
	private ChartSaveRepository chartSaveRepository;

	public String saveConfig(String chartConfiguration, String chartDisplayedName) {
		int resultId = chartSaveRepository.createChartSave(chartDisplayedName, chartConfiguration);
		if(resultId != 0) return resultId+":"+chartDisplayedName;
		return "Sauvegarde non-effectuée";
	}
	
	public ChartConfig getChartConfiguration(int chartId, String chartDisplayedName) {
		List<?> resultList = chartSaveRepository.findByIdAndDisplayedName(ChartConfig.class, chartId, chartDisplayedName);
		ChartConfig result = (ChartConfig) resultList.get(0);
		return result;
	}

}
