package com.mahi.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahi.Student.Entity.Product;



public interface ProductRepository extends JpaRepository<Product,Integer> {
	 Product findByName(String name);

}
