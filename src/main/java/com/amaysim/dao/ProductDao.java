package com.amaysim.dao;

import java.util.List;

import com.amaysim.model.Product;

/**
 * 
 * This interface is used to define Product data access. 
 * It abstracts where the data is coming from.
 * 
 * @author joyce
 *
 */
public interface ProductDao {
	
	Product getById(int id);

	Product getByCode(String code);
	 
	List<Product> getAll();

	
}
