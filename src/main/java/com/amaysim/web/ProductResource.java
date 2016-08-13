package com.amaysim.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amaysim.model.Product;
import com.amaysim.service.ProductService;

@RestController
public class ProductResource {
	
	@Autowired
	ProductService productService;

	@RequestMapping(value = "/products", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<Product> getProducts() {
    	return productService.getAll();

    }
    
	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Product getProductById(@PathVariable int id) {
    	return productService.getById(id);
    }
    
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}
