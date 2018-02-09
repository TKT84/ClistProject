package com.app.clist.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.clist.project.entities.Product;
import com.app.clist.project.entities.UserClient;

@Repository
@Transactional
public class UserClientDaoImpl implements UserClientDao {

	@Autowired
	UserClientRepository userClientRepo;

	@Override
	public UserClient create(UserClient userClient) {
		return userClientRepo.saveAndFlush(userClient);
	}

	@Override
	public UserClient update(UserClient userClient) {

		UserClient uc = userClientRepo.findOne(userClient.getId());

		if (uc != null) {

			uc.setProducts(userClient.getProducts());
			uc.setFirstName(userClient.getFirstName());
			uc.setLastName(userClient.getLastName());
			uc.setDateOfBirth(userClient.getDateOfBirth());
			uc.setEmail(userClient.getEmail());
			uc.setPhoneNumber(userClient.getPhoneNumber());
			uc.setAddress(userClient.getAddress());
			uc.setIdentification(userClient.getIdentification());

		}
		return userClientRepo.save(uc);
		
	}

	@Override
	public UserClient find(Long idLong) {
		return userClientRepo.findOne(idLong);
	}

	@Override
	public List<UserClient> findAll() {
		return userClientRepo.findAll();
	}

	@Override
	public boolean delete(UserClient userClient) {
		userClientRepo.delete(userClientRepo.findOne(userClient.getId()));
		return true;
	}

	@Override
	public UserClient findByIdentification(String username, String password) {
		return userClientRepo.findByIdentification(username, password);	
	}

	@Override
	public UserClient findByEmail(String email) {
		return userClientRepo.findByEmail(email);
	}

	@Override
	public UserClient findByUsername(String username) {
		return userClientRepo.findByUsername(username);
	}

	@Override
	public List <Product> findByClient(UserClient userClient) {
		return userClientRepo.findByClient(userClient);
	}

	@Override
	public UserClient findByLastName(String lastName) {
		return userClientRepo.findByLastName(lastName);
	}

	
	}


