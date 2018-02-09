package com.app.clist.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.clist.project.entities.ProductJobs;

@Repository
@Transactional
public class ProductJobsDaoImpl implements ProductJobsDao {

	@Autowired
	ProductJobsRepository productJobsRepo;
	
	@Override
	public ProductJobs create(ProductJobs productJobs) {
		// TODO Auto-generated method stub
		return productJobsRepo.saveAndFlush(productJobs);
	}

	@Override
	public ProductJobs update(ProductJobs productJobs) {
		// TODO Auto-generated method stub
		ProductJobs pj = productJobsRepo.findOne(productJobs.getId());
		       
		pj.setUserClient(productJobs.getUserClient());
		pj.setTitle(productJobs.getTitle());
		pj.setDescription(productJobs.getDescription());
		pj.setJobType(productJobs.getJobType());
		
		return productJobsRepo.save(pj);
	}

	@Override
	public ProductJobs find(Long idLong) {
		// TODO Auto-generated method stub
		return productJobsRepo.findOne(idLong);
	}

	@Override
	public List<ProductJobs> findAll() {
		// TODO Auto-generated method stub
		return productJobsRepo.findAll();
	}

	@Override
	public boolean delete(ProductJobs productJobs) {
		// TODO Auto-generated method stub
		productJobsRepo.delete(productJobsRepo.findOne(productJobs.getId()));
		return true;
	}

}
