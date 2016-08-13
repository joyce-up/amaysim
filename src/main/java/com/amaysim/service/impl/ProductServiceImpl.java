package com.amaysim.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amaysim.dao.ProductDao;
import com.amaysim.model.Product;
import com.amaysim.service.ProductService;

/**
 * This class implements the service that accesses the products.
 * It retrieves data via ProductDao from a specific data source.
 * 
 * @author joyce
 *
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    protected ProductDao productDao;

	
	public Product getById(int id) {
		return productDao.getById(id);
	}

	public Product getByCode(String code) {
		return productDao.getByCode(code);
	}

	public List<Product> getAll() {
		return productDao.getAll();
	}
	
	public void setProductDao(ProductDao productDao){
		this.productDao = productDao;
	}
	
}
