package com.app.clist.project.dao;

import java.util.List;

import com.app.clist.project.entities.Product;
import com.app.clist.project.entities.UserClient;

public interface ProductDao extends Dao<Product, Long> {

	// FIND BY DESCRIPTION - NEEDS TO BE REVIEWED

	Product findProductByDescription(String description);

	// FIND BY PRODUCT CATEGORY

	//List<Product> findByProductCategory(String productCategory);

	// FIND BY TITLE - GOOD

	List<Product> findByTitle(String title);

	// FIND BY USERCLIENT - GOOD

	List<Product> findByUserClient(UserClient userClient);

	// FIND PRODUCTS BY CITY - GOOD

	List<Product> findByCity(String city);

	// FIND PRODUCTS BY PRICE RANGE - GOOD

	List<Product> findByPrice(double priceMin, double priceMax);

	// FIND PRODUCTS BY BOROUGH - GOOD

	List<Product> findByBorough(String borough);

	// FIND PRODUCTS BY REGION - GOOD

	List<Product> findByRegion(String region);

	// FIND PRODUCTS BY ZIPCODE - GOOD

	List<Product> findByZipCode(Double zipCode);

	// FIND PRODUCTS BY COMMUNE - GOOD

	List<Product> findByCommune(String commune);

	// FIND PRODUCTS BY DEPARTMENT - GOOD

	List<Product> findByDepartment(String department);

	 //FIND PRODUCT BY KEYWORD

	// List <Product> findByKeyword(String keyword);

	// FIND PRODUCTS BY TYPE - GOOD
//
//	List<Product> findByType(String type);

}
