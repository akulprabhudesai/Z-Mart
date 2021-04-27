package com.ecommerce.onlineshopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.onlineshopping.model.Product;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findProductByCategoryId(Integer categoryId);

}
