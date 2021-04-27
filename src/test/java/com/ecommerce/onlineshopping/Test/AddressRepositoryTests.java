package com.ecommerce.onlineshopping.Test;




import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import com.ecommerce.onlineshopping.model.Address;
import com.ecommerce.onlineshopping.repository.AddressRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class AddressRepositoryTests {

	@Test
	public void contextLoads() {
	}

   
	@Autowired
    private AddressRepository repository;
	
    private Address address;
    
    public void setup() {
    
    }
	
//	@Test
//	public void saveAddress() {
//		address = new Address();
//		address.setAddressLineOne("123 example ave");
//		address.setAddressLineTwo("apt 2");
//		address.setCity("Newark");
//		address.setState("New Jersey");
//		address.setPostalCode("07029");
//		address.setCountry("USA");
//		address.setShipping(false);
//		address.setBilling(true);
//		address.setId(0);
//		User user = new User();
//		user.setCart(new Cart());
//		user.setConfirmPassword("abcd@1234");
//		user.setContactNumber("1234567891");
//		user.setEmail("abcd@example.com");
//		user.setEnabled(true);
//		user.setFirstName("Kunj");
//		user.setId(4);
//		user.setLastName("Shah");
//		user.setPassword("$2a$10$lG0CXPCRulRLu/AoMZugT.HjLWRxGDSfu2OiXUiOaBdvQvCsBOLSm");
//		user.setRole("USER");
//    	address.setUser(user);
//    	repository.saveAndFlush(address);	
//	}
	
	@Test
	public void testLineOne() {
        Address cur = repository.findAddressByUser_id(4);
        assertEquals("123 example ave", cur.getAddressLineOne());
	}
	
	@Test
	public void testLineTwo() {
        Address cur = repository.findAddressByUser_id(4);
        assertEquals("apt 2", cur.getAddressLineTwo());
	}
	
	@Test
	public void testCity() {
        Address cur = repository.findAddressByUser_id(4);
        assertEquals("Newark", cur.getCity());
	}
	
	@Test
	public void testState() {
        Address cur = repository.findAddressByUser_id(4);
        assertEquals("New Jersey", cur.getState());
	}
	
	@Test
	public void testPostLCode() {
        Address cur = repository.findAddressByUser_id(4);
        assertEquals("USA", cur.getCountry());
	}
	
	@Test
	public void testCountry() {
        Address cur = repository.findAddressByUser_id(4);
        assertEquals("07029", cur.getPostalCode());
	}

	

}
