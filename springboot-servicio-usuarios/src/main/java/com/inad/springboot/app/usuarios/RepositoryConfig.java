/**
 * 
 */
package com.inad.springboot.app.usuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.inad.springboot.app.usuarios.commons.models.entity.Role;
import com.inad.springboot.app.usuarios.commons.models.entity.Usuario;

/**
 * @author P. Andres Gasca (andresg1006@gmail.com)
 *
 */
@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class, Role.class);
	}

}
