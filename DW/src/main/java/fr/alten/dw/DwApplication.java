/**
 * 
 */
package fr.alten.dw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("fr.alten.dw.model")
@EntityScan("fr.alten.dw.model")
public class DwApplication extends SpringBootServletInitializer {

	public static void main(final String[] args) {
		SpringApplication.run(DwApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DwApplication.class);
	}

}
