package com.app.clist.project.dao;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.app.clist.project.entities.Product;
import com.app.clist.project.entities.UserClient;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
		//FIND BY DESCRIPTION
		Product findProductByDescription(String description);
		
//		//FIND BY PRODUCT CATEGORY
//		//List <Product> findByProductCategory(String productCategory);
//
		//FIND BY TITLE
		List <Product> findByTitle(String title);

		//FIND BY USERCLIENT
		List <Product> findByUserClient(UserClient userClient);

		
		//FIND PRODUCTS BY CITY
		@Query("SELECT product "
				+ "FROM Product product "
				+ "WHERE product.description.address.city  = ?1")
		List <Product> findByCity(String city);
		
		//FIND PRODUCTS BY PRICE RANGE
		
		@Query("SELECT product "
				+ "FROM Product product "
				+ "WHERE product.description.price "
				+ "> ?1 AND product.description.price < ?2 ")
		List <Product> findByPrice(Double priceMin, Double priceMax);
	
		//FIND PRODUCTS BY BOROUGH
		@Query("SELECT product "
				+ "FROM Product product "
				+ "WHERE product.description.address.borough  = ?1")
		List <Product> findByBorough(String borough);
				
		//FIND PRODUCTS BY REGION
		@Query("SELECT product "
				+ "FROM Product product "
				+ "WHERE product.description.address.region  = ?1")
		List <Product> findByRegion(String region);

		//FIND PRODUCTS BY ZIPCODE
		@Query("SELECT product "
				+ "FROM Product product "
				+ "WHERE product.description.address.zipCode  = ?1")
		List <Product> findByZipCode(Double zipCode);
		
		//FIND PRODUCTS BY DEPARTMENT
		@Query("SELECT product "
				+ "FROM Product product "
				+ "WHERE product.description.address.department  = ?1")
		List <Product> findByDepartment(String department);
			
		//FIND PRODUCTS BY COMMUNE
		@Query("SELECT product "
				+ "FROM Product product "
				+ "WHERE product.description.address.commune  = ?1")
		List <Product> findByCommune(String commune);	
		
////		//FIND PRODUCT BY KEYWORD
////		List <Product> findByKeyword(String keyword);
		
		
//		//FIND BY USERNAME
//		@Query("SELECT product"
//				+ "FROM Product product" 
//				+ "WHERE product.userclient.identification = ?1")
//		List <Product> findByUsername(String username);
		
		
		//FIND PRODUCTS BY TYPE
//		@Query()
//		List <Product> findByType(String type);
}
