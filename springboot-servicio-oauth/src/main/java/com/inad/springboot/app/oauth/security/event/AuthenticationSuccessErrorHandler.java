/**
 * 
 */
package com.inad.springboot.app.oauth.security.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.inad.springboot.app.oauth.services.IUsuarioService;
import com.inad.springboot.app.usuarios.commons.models.entity.Usuario;

import feign.FeignException;

/**
 * @author P. Andres Gasca (andresg1006@gmail.com)
 *
 */
@Component
public class AuthenticationSuccessErrorHandler implements AuthenticationEventPublisher {

	private final static Logger logger = LoggerFactory.getLogger(AuthenticationSuccessErrorHandler.class);

	@Autowired
	private IUsuarioService usuarioService;

	@Override
	public void publishAuthenticationSuccess(Authentication authentication) {
		UserDetails user = (UserDetails) authentication.getPrincipal();
		Usuario usuario = usuarioService.findByUsername(authentication.getName());
		if(usuario.getIntentos() != null && usuario.getIntentos() > 0) {
			usuario.setIntentos(0);
		}
		usuarioService.update(usuario, usuario.getId());
		logger.info("Success Login: " + user.getUsername());
	}

	@Override
	public void publishAuthenticationFailure(AuthenticationException exception, Authentication authentication) {
		logger.info("Error en el Login: " + exception.getMessage());

		try {
			Usuario usuario = usuarioService.findByUsername(authentication.getName());
			if(usuario.getIntentos() == null) {
				usuario.setIntentos(0);
			}
			
			usuario.setIntentos(usuario.getIntentos()+1);
			
			if (usuario.getIntentos()>=3) {
				logger.info(String.format("El usuario %s deshabilitado por máximo de intentos", usuario.getUsername()));
				usuario.setEnabled(false);
			}
			
			usuarioService.update(usuario, usuario.getId());
		} catch (FeignException e) {
			logger.error(String.format("El usuario %s no existe en el sistema", authentication.getName()));
		}
	}

}
