package com.ecommerce.onlineshopping.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ecommerce.onlineshopping.model.CartLine;
import com.ecommerce.onlineshopping.model.Product;
import com.ecommerce.onlineshopping.repository.CartLineRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CartLineRepositoryTest {

	
	@Test
	public void contextLoads() {
	}
	
	@Autowired
	private CartLineRepository repository;
	
	private CartLine cart_line;
	
//	@Test
//	public void saveCart() {
//		cart_line = new CartLine();
//		
//		cart_line.setId(10);
//		cart_line.setAvailable(true);
//		cart_line.setBuyingPrice(40);
//		cart_line.setCartId(10);
//		cart_line.setProductCount(80);
//		cart_line.setTotal(3200);
//		
//		Product p = new Product();
//		p.setActive(true);
//		p.setBrand("test");
//		p.setCategoryId(10);
//		p.setCode("4");
//		p.setDescription("test");
//		p.setId(2);
//		p.setName("test");
//		p.setPurchases(5);
//		p.setQuantity(80);
//		p.setSupplierId(10);
//		p.setUnitPrice(40);
//		p.setViews(50);
//		cart_line.setProduct(p);
//		repository.saveAndFlush(cart_line);
//	}
	
	
	@Test
	public void testId() {
		CartLine cur = repository.findCartLineByCartIdAndProductId(10, 2);
       assertTrue(cur.getId() == 7);
	}
	
	@Test
	public void testAvailable() {
		CartLine cur = repository.findCartLineByCartIdAndProductId(10, 2);
       assertTrue(cur.isAvailable());
	}
	
	@Test
	public void testBuyingPrice() {
		CartLine cur = repository.findCartLineByCartIdAndProductId(10, 2);
       assertTrue(cur.getBuyingPrice() == 40);
	}
	
	@Test
	public void testCartId() {
		CartLine cur = repository.findCartLineByCartIdAndProductId(10, 2);
       assertTrue(cur.getCartId() == 10);
	}
	
	@Test
	public void testProductCount() {
		CartLine cur = repository.findCartLineByCartIdAndProductId(10, 2);
       assertTrue(cur.getProductCount() == 80);
	}
	
	@Test
	public void testTotal() {
		CartLine cur = repository.findCartLineByCartIdAndProductId(10, 2);
        assertTrue(cur.getTotal() == 3200);
	}
	
	
}
