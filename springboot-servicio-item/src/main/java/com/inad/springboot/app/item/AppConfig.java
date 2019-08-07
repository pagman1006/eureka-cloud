/**
 * 
 */
package com.inad.springboot.app.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author P. Andres Gasca (andresg1006@gmail.com)
 *
 */
@Configuration
public class AppConfig {

	@Bean("clienteRest")
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	};
}
