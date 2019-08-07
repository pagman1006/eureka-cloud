/**
 * 
 */
package com.inad.springboot.app.usuarios.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.inad.springboot.app.usuarios.commons.models.entity.Usuario;

/**
 * @author P. Andres Gasca (andresg1006@gmail.com)
 *
 */
@RepositoryRestResource(path = "usuarios")
public interface UsuarioDAO extends PagingAndSortingRepository<Usuario, Long> {
	
	@RestResource(path = "buscar-username")
	public Usuario findByUsername(@Param("username") String username);
}
