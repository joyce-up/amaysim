package com.amaysim.web;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.amaysim.model.Product;
import com.amaysim.service.ProductService;
import com.amaysim.web.ProductResource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/WEB-INF/springrest-servlet.xml" })
public class ProductResourceImplTest {

	private ProductResource target;

	@Mock
	private ProductService productService;

	@Mock
	private Product productMock;

	private List<Product> products;

	@Before
	public void setUp() {

		MockitoAnnotations.initMocks(this);
		target = new ProductResource();
		target.setProductService(productService);

		productMock = new Product(1, "ult_small", "Unlimited 1GB", "", 24.90, 30, true, true, 1024,
				"http://amaysim.com.au/terms-conditions/special-conditions-and-service-description-unlimited-1gb.pdf",
				"http://amaysim.com.au/critical-information-summary/critical-info-summary-unl-1gb.pdf");

		products = Arrays.asList(new Product(1, "ult_small", "Unlimited 1GB", "", 24.90, 30, true, true, 1024,
				"http://amaysim.com.au/terms-conditions/special-conditions-and-service-description-unlimited-1gb.pdf",
				"http://amaysim.com.au/critical-information-summary/critical-info-summary-unl-1gb.pdf")
				, new Product(2, "ult_medium", "Unlimited 2GB", "", 29.90, 30, true, true, 2048,
						"http://amaysim.com.au/terms-conditions/special-conditions-and-service-description-unlimited-2gb.pdf",
						"http://amaysim.com.au/critical-information-summary/critical-info-summary-unl-2gb.pdf")
				, new Product(3, "ult_large", "Unlimited 5GB", "", 44.90, 30, true, true, 5120,
						"http://amaysim.com.au/terms-conditions/special-conditions-and-service-description-unlimited-5gb.pdf",
						"http://amaysim.com.au/critical-information-summary/critical-info-summary-unl-5gb.pdf"));
	}

	@Test
	public void successfulGetAllProducts() {
		Mockito.when(productService.getAll()).thenReturn(products);
		List<Product> products = target.getProducts();
		assertEquals(products.size(), 3);
	}

	@Test
	public void successfulGetProductById() {
		int id = 1;
		Mockito.when(productService.getById(id)).thenReturn(productMock);
		Product product = target.getProductById(id);
		assertEquals(product, productMock);
	}

}
