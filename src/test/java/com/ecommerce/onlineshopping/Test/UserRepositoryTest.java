package com.ecommerce.onlineshopping.Test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ecommerce.onlineshopping.model.Cart;
import com.ecommerce.onlineshopping.model.User;
import com.ecommerce.onlineshopping.repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UserRepositoryTest {
	
	@Test
	public void contextLoads() {
	}
	
	@Autowired
    private UserRepository repository;
	
    private User user;
    
//	@Test
//	public void saveAddress() {
//		user = new User();
//		user.setCart(new Cart());
//		user.setConfirmPassword("abcd@1234");
//		user.setContactNumber("4087997472");
//		user.setEmail("abcd@example.com");
//		user.setEnabled(true);
//		user.setFirstName("Akul");
//		user.setId(4);
//		user.setLastName("Prabhudesai");
//		user.setPassword("$2a$10$lG0CXPCRulRLu/AoMZugT.HjLWRxGDSfu2OiXUiOaBdvQvCsBOLSm");
//		user.setRole("USER");
//    	repository.saveAndFlush(user);	
//	}
    
	@Test
	public void testFirstName() {
        User cur = repository.findUserById(4);
        assertEquals("Akul", cur.getFirstName());
	}
	
	@Test
	public void testLastName() {
        User cur = repository.findUserById(4);
        assertEquals("Prabhudesai", cur.getLastName());
	}
	
	@Test
	public void testConfirmPassword() {
        User cur = repository.findUserById(4);
        assertEquals("$2a$10$lG0CXPCRulRLu/AoMZugT.HjLWRxGDSfu2OiXUiOaBdvQvCsBOLSm", cur.getPassword());
	}
	
	@Test
	public void testContactNumber() {
        User cur = repository.findUserById(4);
        assertEquals("4087997472", cur.getContactNumber());
	}
	
	@Test
	public void testEmail() {
        User cur = repository.findUserById(4);
        assertEquals("abcd@example.com", cur.getEmail());
	}
	
	@Test
	public void testRole() {
        User cur = repository.findUserById(4);
        assertEquals("USER", cur.getRole());
	}
	
	
	
}
