package com.amaysim.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.amaysim.dao.impl.ProductDaoImpl;
import com.amaysim.model.Product;
import com.amaysim.service.impl.ProductServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/WEB-INF/springrest-servlet.xml" })
public class ProductServiceImplTest {

	private ProductServiceImpl target;
	
    @Before
    public void setUp() {
        target = new ProductServiceImpl();
        target.setProductDao(new ProductDaoImpl());
	}

    @Test
    public void successfulGetById() {
    	int id = 1;
    	Product product = target.getById(id);
    	assertNotNull(product);
    }

    @Test
    public void successfulGetAll() {
    	List<Product> products = target.getAll();
    	assertTrue(products.size() == 3);
    }
    
}
