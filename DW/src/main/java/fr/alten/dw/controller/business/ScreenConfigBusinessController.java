package fr.alten.dw.controller.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.alten.dw.model.beans.ScreenConfig;
import fr.alten.dw.model.dao.ScreenConfigRepository;

/**
 * Controller for screen configuration logic.
 * 
 * @author Lucas Royackkers, Andy Chabalier
 *
 */
@Service
public class ScreenConfigBusinessController {

	@Autowired
	private ScreenConfigRepository screenConfigRepository;

	/**
	 * Ask for the screen configuration
	 * 
	 * @param screenId            the id of the chart to fetch
	 * @param screenDisplayedName the name of the chart to fetch
	 * @return the screen configuration
	 */
	public ScreenConfig getScreenConfiguration(final int screenId, final String screenDisplayedName) {
		final List<?> resultList = this.screenConfigRepository.findByIdAndDisplayedName(ScreenConfig.class, screenId,
				screenDisplayedName);
		return (ScreenConfig) resultList.get(0);
	}

	/**
	 * delegate the saving process to repository
	 *
	 * @param screenDisplayedName the screen display name
	 * @param screenConfiguration a JSON Object (as a String) that contains all the
	 *                            screen configurations (type, filters, etc.)
	 * @return the message to display to the user
	 */
	public String saveConfig(final String screenConfiguration, final String screenDisplayedName) {
		final int resultId = this.screenConfigRepository.saveScreenConfig(screenDisplayedName, screenConfiguration);
		return resultId != 0 ? resultId + ":" + screenDisplayedName : "Sauvegarde non-effectuée";
	}

}
