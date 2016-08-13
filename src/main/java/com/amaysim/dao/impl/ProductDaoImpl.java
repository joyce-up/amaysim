package com.amaysim.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.amaysim.dao.ProductDao;
import com.amaysim.model.Product;

/**
 * This class is used to access Product data from the actual data source.
 * For the initial purposes, the data is hard-coded.
 * 
 * @author joyce
 *
 */
@Repository
public class ProductDaoImpl implements ProductDao{
	
	// Sample data
	private List<Product> products = Arrays.asList(
			new Product(1
					, "ult_small"
					, "Unlimited 1GB"
					, ""
					, 24.90
					, 30
					, true
					, true
					, 1024
					, "http://amaysim.com.au/terms-conditions/special-conditions-and-service-description-unlimited-1gb.pdf"
					, "http://amaysim.com.au/critical-information-summary/critical-info-summary-unl-1gb.pdf"
					)

			, new Product(2
					, "ult_medium"
					, "Unlimited 2GB"
					, ""
					, 29.90
					, 30
					, true
					, true
					, 2048
					, "http://amaysim.com.au/terms-conditions/special-conditions-and-service-description-unlimited-2gb.pdf"
					, "http://amaysim.com.au/critical-information-summary/critical-info-summary-unl-2gb.pdf"
					)
			, new Product(3
					, "ult_large"
					, "Unlimited 5GB"
					, ""
					, 44.90
					, 30
					, true
					, true
					, 5120
					, "http://amaysim.com.au/terms-conditions/special-conditions-and-service-description-unlimited-5gb.pdf"
					, "http://amaysim.com.au/critical-information-summary/critical-info-summary-unl-5gb.pdf"
					)
			);
			
	public Product getById(int id) {
		for (Product product : products){
			if (product.getId() == id){
				return product;
			}
		}
		return null;
	}

	public Product getByCode(String code) {
		for (Product product : products){
			if (product.getCode().equals(code)){
				return product;
			}
		}
		return null;
	}

	public List<Product> getAll() {
		return products;
	}

}
