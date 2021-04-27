package com.ecommerce.onlineshopping.service;

import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.Address;


public interface AddressService {

	boolean saveAddress(Address address);
	
	Address findAddressByBilling(boolean billing);
	
	Address findAddressById(int id);

}
