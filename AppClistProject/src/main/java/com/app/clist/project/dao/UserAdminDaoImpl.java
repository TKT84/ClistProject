package com.app.clist.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.clist.project.entities.UserAdmin;

@Repository
@Transactional
public class UserAdminDaoImpl implements UserAdminDao {

	@Autowired
	UserAdminRepository userAdminRepo;

	@Override
	public UserAdmin create(UserAdmin userAdmin) {
		// TODO Auto-generated method stub
		return userAdminRepo.saveAndFlush(userAdmin);
	}

	@Override
	public UserAdmin update(UserAdmin userAdmin) {
		// TODO Auto-generated method stub
		UserAdmin ua = userAdminRepo.findOne(userAdmin.getId());
		
		ua.setFirstName(userAdmin.getFirstName());
		ua.setLastName(userAdmin.getLastName());
		ua.setDateOfBirth(userAdmin.getDateOfBirth());
		ua.setEmail(userAdmin.getEmail());
		ua.setPhoneNumber(userAdmin.getPhoneNumber());
		ua.setAddress(userAdmin.getAddress());
		ua.setIdentification(userAdmin.getIdentification());
		
		return userAdminRepo.save(ua);
	}

	@Override
	public UserAdmin find(Long idLong) {
		// TODO Auto-generated method stub
		return userAdminRepo.findOne(idLong);
	}

	@Override
	public List<UserAdmin> findAll() {
		// TODO Auto-generated method stub
		return userAdminRepo.findAll();
	}

	@Override
	public boolean delete(UserAdmin userAdmin) {
		// TODO Auto-generated method stub
		userAdminRepo.delete(userAdminRepo.findOne(userAdmin.getId()));
		return true;
	}

	@Override
	public UserAdmin findByIdentification(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
