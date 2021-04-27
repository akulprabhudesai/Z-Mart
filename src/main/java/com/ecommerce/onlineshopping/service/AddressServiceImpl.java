package com.ecommerce.onlineshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.Address;
import com.ecommerce.onlineshopping.repository.AddressRepository;

@Service("addressService")
public class AddressServiceImpl implements AddressService {

	@Qualifier("addressRepository")
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public boolean saveAddress(Address address) {
		// TODO Auto-generated method stub
		addressRepository.saveAndFlush(address);
		return true;
	}

	@Override
	public Address findAddressByBilling(boolean billing) {
		// TODO Auto-generated method stub
		return addressRepository.findAddressByBilling(billing);
	}
	
	@Override
	public Address findAddressById(int id) {
		// TODO Auto-generated method stub
		return addressRepository.findAddressByUser_id(id);
	}

}
