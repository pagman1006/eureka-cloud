/**
 * 
 */
package com.inad.springboot.app.productos.models.service;

import java.util.List;

import com.inad.springboot.app.commons.models.entity.Producto;

/**
 * @author P. Andres Gasca (andresg1006@gmail.com)
 *
 */
public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
	
	public Producto save(Producto producto);
	
	public void deleteById(Long id);
}
