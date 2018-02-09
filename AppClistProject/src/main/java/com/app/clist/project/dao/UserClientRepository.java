package com.app.clist.project.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.app.clist.project.entities.Product;
import com.app.clist.project.entities.UserClient;
public interface UserClientRepository extends JpaRepository<UserClient, Long> {

	// SIGN IN
	@Query("SELECT userClient " 
			+ " FROM UserClient userClient " 
			+ " JOIN userClient.identification Id "
			+ " WHERE Id.username = ?1 " 
			+ " AND Id.password = ?2")
	UserClient findByIdentification(String username, String password);

	UserClient findByEmail(String email);

	
	@Query("SELECT userClient " 
			+ " FROM UserClient userClient " 
			+ " JOIN userClient.identification Id "
			+ " WHERE Id.username = ?1 ")
	UserClient findByUsername(String username);
	
	
	@Query("SELECT prod "
			+ "FROM UserClient prod "
			+ "JOIN prod.products prods "
			+ "WHERE prods.userClient = ?1 ")
	List <Product> findByClient(UserClient userClient);
	
	
	UserClient findByLastName(String lastName);
	
}
