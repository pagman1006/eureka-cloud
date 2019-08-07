/**
 * 
 */
package com.inad.springboot.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inad.springboot.app.productos.models.dao.ProductoDAO;
import com.inad.springboot.app.commons.models.entity.Producto;

/**
 * @author P. Andres Gasca (andresg1006@gmail.com)
 *
 */
@Service
@Transactional(readOnly = true)
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private ProductoDAO productoDAO;
	
	@Override
	public List<Producto> findAll() {
		return (List<Producto>) productoDAO.findAll();
	}

	@Override
	public Producto findById(Long id) {
		return productoDAO.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Producto save(Producto producto) {
		return productoDAO.save(producto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		productoDAO.deleteById(id);
	}

}
