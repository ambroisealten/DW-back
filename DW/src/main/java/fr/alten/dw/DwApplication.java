/**
 *
 */
package fr.alten.dw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Start point of the spring boot app
 * 
 * @author Andy Chabalier
 *
 */
@SpringBootApplication
public class DwApplication extends SpringBootServletInitializer {

	public static void main(final String[] args) {
		SpringApplication.run(DwApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder builder) {
		return builder.sources(DwApplication.class);
	}

}
