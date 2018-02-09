package com.app.clist.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.app.clist.project.entities.ProductForSale;

@Repository
@Transactional
public class ProductForSaleDaoImpl implements ProductForSaleDao{

	@Autowired
	ProductForSaleRepository productForSaleRepo;
	
	@Override
	public ProductForSale create(ProductForSale productForSale) {
		// TODO Auto-generated method stub
		return productForSaleRepo.saveAndFlush(productForSale);
	}

	@Override
	public ProductForSale update(ProductForSale productForSale) {
		// TODO Auto-generated method stub
		ProductForSale pfs = productForSaleRepo.findOne(productForSale.getId());
		
		pfs.setTitle(productForSale.getTitle());
		pfs.setDescription(productForSale.getDescription());
		pfs.setUserClient(productForSale.getUserClient());
	
		return productForSaleRepo.save(pfs);
	}

	@Override
	public ProductForSale find(Long idLong) {
		// TODO Auto-generated method stub
		return productForSaleRepo.findOne(idLong);
	}

	@Override
	public List<ProductForSale> findAll() {
		// TODO Auto-generated method stub
		return productForSaleRepo.findAll();
	}

	@Override
	public boolean delete(ProductForSale productForSale) {
		// TODO Auto-generated method stub
		productForSaleRepo.delete(productForSaleRepo.findOne(productForSale.getId()));
		return true;
	}

}
