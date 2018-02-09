package com.app.clist.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.clist.project.entities.ProductHousing;


@Repository
@Transactional
public class ProductHousingDaoImpl implements  ProductHousingDao{

	ProductHousingRepository productHousingRepo;
	
	
	@Override
	public ProductHousing create(ProductHousing productHousing) {
		// TODO Auto-generated method stub
		return productHousingRepo.saveAndFlush(productHousing);
	}

	@Override
	public ProductHousing update(ProductHousing productHousing) {
		// TODO Auto-generated method stub
		ProductHousing ph = productHousingRepo.findOne(productHousing.getId());
		ph.setUserClient(productHousing.getUserClient());
		ph.setTitle(productHousing.getTitle());
		ph.setDescription(productHousing.getDescription());
		return productHousingRepo.save(ph);
	}

	@Override
	public ProductHousing find(Long idLong) {
		// TODO Auto-generated method stub
		return productHousingRepo.findOne(idLong);
	}

	@Override
	public List<ProductHousing> findAll() {
		// TODO Auto-generated method stub
		return productHousingRepo.findAll();
	}

	@Override
	public boolean delete(ProductHousing productHousing) {
		// TODO Auto-generated method stub
		productHousingRepo.delete(productHousingRepo.findOne(productHousing.getId()));
		return true;
	}

}
