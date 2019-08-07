/**
 * 
 */
package com.inad.springboot.app.item.models.service;

import java.util.List;

import com.inad.springboot.app.item.models.Item;
import com.inad.springboot.app.commons.models.entity.Producto;

/**
 * @author P. Andres Gasca (andresg1006@gmail.com)
 *
 */
public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
	
	public Producto save(Producto producto);
	public Producto update(Producto producto, Long id);
	public void delete(Long id);
}
