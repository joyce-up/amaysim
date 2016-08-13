package com.amaysim.service;

import java.util.List;

import com.amaysim.model.Product;

/**
 * This interface defines the service that accesses the products.
 * It abstracts the implementation on how the products are accessed.
 * 
 * @author joyce
 *
 */
public interface ProductService {

	Product getById(int id);
	
	Product getByCode(String code);
	
	List<Product> getAll();
	
	
}
