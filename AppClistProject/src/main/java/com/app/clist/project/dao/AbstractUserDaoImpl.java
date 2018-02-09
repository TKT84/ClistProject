package com.app.clist.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.clist.project.entities.AbstractUser;

@Repository
@Transactional
public class AbstractUserDaoImpl implements AbstractUserDao{

	@Autowired
	AbstractUserRepository userRepo;
	
	@Override
	public AbstractUser create(AbstractUser abstractUser) {
		return userRepo.saveAndFlush(abstractUser);
	}

	@Override
	public AbstractUser update(AbstractUser abstractUser) {
		
		AbstractUser u = userRepo.findOne(abstractUser.getId());
		
		u.setFirstName(abstractUser.getFirstName());
		u.setLastName(abstractUser.getLastName());
		u.setDateOfBirth(abstractUser.getDateOfBirth());
		u.setEmail(abstractUser.getEmail());
		u.setPhoneNumber(abstractUser.getPhoneNumber());
		u.setAddress(abstractUser.getAddress());
		u.setIdentification(abstractUser.getIdentification());
		
		return userRepo.save(u);
	}

	@Override
	public AbstractUser find(Long idLong) {
		// TODO Auto-generated method stub
		return userRepo.findOne(idLong);
	}

	@Override
	public List<AbstractUser> findAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public boolean delete(AbstractUser abstractUser) {
		// TODO Auto-generated method stub
		userRepo.delete(userRepo.findOne(abstractUser.getId()));
		return true;
	}

}
