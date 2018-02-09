package com.app.clist.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.clist.project.entities.Identification;

@Transactional
@Repository
public class IdentificationDaoImpl implements IdentificationDao {

	@Autowired
	IdentificationRepository identificationRepo;
	
	@Override
	public Identification create(Identification identification) {
		return identificationRepo.saveAndFlush(identification);
	}

	@Override
	public Identification update(Identification identification) {
		
		Identification id = identificationRepo.findOne(identification.getId());
		
		id.setUsername(identification.getUsername());
		id.setPassword(identification.getPassword());
		id.setUser(identification.getUser());
		return identificationRepo.save(id);
	}

	@Override
	public Identification find(Long idLong) {
		return identificationRepo.findOne(idLong);
	}

	@Override
	public List<Identification> findAll() {
		return identificationRepo.findAll();
	}

	@Override
	public boolean delete(Identification identification) {
		identificationRepo.delete(identificationRepo.findOne(identification.getId()));
		return true;
	}

}
