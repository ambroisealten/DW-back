/**
 *
 */
package fr.alten.dw.controller.rest;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.alten.dw.controller.business.DataSchemeBusinessController;
import fr.alten.dw.model.beans.BeanScheme;

/**
 * Rest controller for data scheme logic
 *
 * @author Andy Chabalier
 *
 */
@Controller
public class DataSchemeRestController {

	@Autowired
	private DataSchemeBusinessController dataSchemeBusinessController;

	/**
	 * HTTP REST End point. METHOD: GET Use to fetch the data scheme from beans
	 * introspection
	 *
	 * @return a list of {@link BeanScheme}
	 * @throws ClassNotFoundException - if the class cannot be located
	 * @throws SecurityException      - If a security manager, s, is present and any
	 *                                of the following conditions is met:
	 *                                thecaller's class loader is not the same as
	 *                                the class loader of this class and invocation
	 *                                ofs.checkPermission method
	 *                                withRuntimePermission("accessDeclaredMembers")denies
	 *                                access to the declared fields within this
	 *                                class the caller's class loader is not the
	 *                                same as or an ancestor of the class loader for
	 *                                the current class and invocation
	 *                                ofs.checkPackageAccess() denies access to the
	 *                                package of this
	 * @throws classIOException       - If I/O errors occur
	 */
	@GetMapping("/dataScheme")
	@ResponseBody
	public List<BeanScheme> fetchDataScheme() throws ClassNotFoundException, SecurityException, IOException {
		return this.dataSchemeBusinessController.getDataScheme();
	}

}
