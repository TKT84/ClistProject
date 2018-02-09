package com.app.clist.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.app.clist.project.entities.Description;

@Repository
@Transactional
public class DescriptionDaoImpl implements DescriptionDao {

	@Autowired
	DescriptionRepository descriptionRepo;
	
	
	@Override
	public Description create(Description description) {
		return descriptionRepo.saveAndFlush(description);
	}

	@Override
	public Description update(Description description) {
		Description descript = descriptionRepo.findOne(description.getId());
		descript.setPrice(description.getPrice());
		descript.setDescription(description.getDescription());
		descript.setAddress(description.getAddress());
		return descriptionRepo.save(descript);
	}

	@Override
	public Description find(Long idLong) {
		return descriptionRepo.findOne(idLong);
	}

	@Override
	public List<Description> findAll() {
		return descriptionRepo.findAll();
	}

	@Override
	public boolean delete(Description description) {
		descriptionRepo.delete(descriptionRepo.findOne(description.getId()));
		return true;
	}

//	@Override
//	public Description findByProductKeyword(String keyword) {
//		// TODO Auto-generated method stub
//		return descriptionRepo.findByProductKeyword(keyword);
//	}

}
