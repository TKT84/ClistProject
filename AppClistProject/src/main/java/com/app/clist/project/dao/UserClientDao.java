package com.app.clist.project.dao;

import java.util.List;

import com.app.clist.project.entities.Product;
import com.app.clist.project.entities.UserClient;

public interface UserClientDao extends Dao<UserClient, Long> {

	// FIND BY IDENTIFICATION
	UserClient findByIdentification(String username, String password);

	// FIND BY EMAIL
	UserClient findByEmail(String email);

	// FIND BY USERNAME
	UserClient findByUsername(String username);
	
	// FIND BY NAME
	UserClient findByLastName(String lastName);

	// FIND LIST PRODUCT BY CLIENT
	List <Product> findByClient(UserClient userClient);

	
}
