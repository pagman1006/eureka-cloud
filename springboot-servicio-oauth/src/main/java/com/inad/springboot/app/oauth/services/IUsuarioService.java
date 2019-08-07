/**
 * 
 */
package com.inad.springboot.app.oauth.services;

import com.inad.springboot.app.usuarios.commons.models.entity.Usuario;

/**
 * @author P. Andres Gasca (andresg1006@gmail.com)
 *
 */
public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	public Usuario update(Usuario usuario, Long id);

}
