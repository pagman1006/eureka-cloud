/**
 * 
 */
package com.inad.springboot.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.inad.springboot.app.commons.models.entity.Producto;

/**
 * @author P. Andres Gasca (andresg1006@gmail.com)
 *
 */
public interface ProductoDAO extends CrudRepository<Producto, Long> {

}
