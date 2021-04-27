package com.ecommerce.onlineshopping.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.ecommerce.onlineshopping.model.Address;
import com.ecommerce.onlineshopping.repository.AddressRepository;
import com.ecommerce.onlineshopping.service.AddressServiceImpl;

@SpringBootTest
public class AddressIntegrationTests {

	@Autowired
	private AddressRepository repository;

	@Autowired
	private AddressServiceImpl service;

	
	@Test
	public void integrationTestLineOne() {
		Address cur_1 = repository.findAddressByUser_id(4);
		System.out.println(cur_1);
		Address cur_2 = service.findAddressById(4);
		assertEquals(cur_1.getAddressLineOne(), cur_2.getAddressLineOne());
	}

	@Test
	public void integrationTestLineTwo() {
		Address cur_1 = repository.findAddressByUser_id(4);
		Address cur_2 = service.findAddressById(4);
		assertEquals(cur_1.getAddressLineTwo(), cur_2.getAddressLineTwo());
	}

	@Test
	public void integrationTestCity() {
		Address cur_1 = repository.findAddressByUser_id(4);
		Address cur_2 = service.findAddressById(4);
		assertEquals(cur_1.getCity(), cur_2.getCity());
	}

	@Test
	public void integrationTestId() {
		Address cur_1 = repository.findAddressByUser_id(4);
		Address cur_2 = service.findAddressById(4);
		assertEquals(cur_1.getId(), cur_2.getId());
	}

	@Test
	public void integrationTestState() {
		Address cur_1 = repository.findAddressByUser_id(4);
		Address cur_2 = service.findAddressById(4);
		assertEquals(cur_1.getState(), cur_2.getState());
	}

	@Test
	public void integrationTestPostLCode() {
		Address cur_1 = repository.findAddressByUser_id(4);
		Address cur_2 = service.findAddressById(4);
		assertEquals(cur_1.getPostalCode(), cur_2.getPostalCode());
	}

	@Test
	public void integrationTestCountry() {
		Address cur_1 = repository.findAddressByUser_id(4);
		Address cur_2 = service.findAddressById(4);
		assertEquals(cur_1.getCountry(), cur_2.getCountry());
	}

}
