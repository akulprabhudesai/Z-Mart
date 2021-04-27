package com.ecommerce.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.onlineshopping.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findUserByEmail(String email);

	User findUserById(int id);

}
