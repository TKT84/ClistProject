package com.app.clist.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.app.clist.project.entities.ProductGigs;

@Repository
@Transactional
public class ProductGigsDaoImpl implements ProductGigsDao {

	@Autowired
	ProductGigsRepository productGigsRepo;
	
	@Override
	public ProductGigs create(ProductGigs productGigs) {
		// TODO Auto-generated method stub
		return productGigsRepo.saveAndFlush(productGigs);
	}

	@Override
	public ProductGigs update(ProductGigs productGigs) {
		// TODO Auto-generated method stub
		ProductGigs pg = productGigsRepo.findOne(productGigs.getId());
		 
		pg.setTitle(productGigs.getTitle());
		pg.setDescription(productGigs.getDescription());
		pg.setUserClient(productGigs.getUserClient());
		
		return productGigsRepo.save(pg);
	}

	@Override
	public ProductGigs find(Long idLong) {
		// TODO Auto-generated method stub
		return productGigsRepo.findOne(idLong);
	}

	@Override
	public List<ProductGigs> findAll() {
		// TODO Auto-generated method stub
		return productGigsRepo.findAll();
	}

	@Override
	public boolean delete(ProductGigs productGigs) {
		// TODO Auto-generated method stub
		productGigsRepo.delete(productGigsRepo.findOne(productGigs.getId()));
		return true;
	}

}
