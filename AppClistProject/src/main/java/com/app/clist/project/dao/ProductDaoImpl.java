package com.app.clist.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.clist.project.entities.Product;
import com.app.clist.project.entities.UserClient;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	ProductRepository productRepo;

	@Override
	public Product create(Product product) {
		return productRepo.saveAndFlush(product);
	}

	@Override
	public Product update(Product product) {
		Product prod = productRepo.findOne(product.getId());

		prod.setTitle(product.getTitle());
		prod.setUserClient(product.getUserClient());
		prod.setDescription(product.getDescription());

		return productRepo.save(prod);
	}

	@Override
	public Product find(Long idLong) {
		return productRepo.findOne(idLong);
	}

	@Override
	public List<Product> findAll() {
		return productRepo.findAll();
	}

	@Override
	public boolean delete(Product product) {
		productRepo.delete(productRepo.findOne(product.getId()));
		return true;
	}

	@Override
	public Product findProductByDescription(String description) {
		return productRepo.findProductByDescription(description);
	}

//	@Override
//	public List <Product> findByProductCategory(String productCategory) {
//		return productRepo.findByProductCategory(productCategory);
//	}
//
	@Override
	public List <Product> findByTitle(String title) {
		return productRepo.findByTitle(title);
	}

	@Override
	public List <Product> findByUserClient(UserClient userClient) {
		return productRepo.findByUserClient(userClient);
	}

	@Override
	public List<Product> findByCity(String city) {
		return productRepo.findByCity(city);
	}

	@Override
	public List<Product> findByPrice(double priceMin, double priceMax) {
		return productRepo.findByPrice(priceMin, priceMax);
	}

	@Override
	public List<Product> findByBorough(String borough) {
		return productRepo.findByBorough(borough);
	}

	@Override
	public List<Product> findByRegion(String region) {
		return productRepo.findByRegion(region);
	}

	@Override
	public List<Product> findByZipCode(Double zipCode) {
		return productRepo.findByZipCode(zipCode);
	}

	@Override
	public List<Product> findByCommune(String commune) {
		return productRepo.findByCommune(commune);
	}

	@Override
	public List<Product> findByDepartment(String department) {
		return productRepo.findByDepartment(department);
	}

//	@Override
//	public List<Product> findByKeyword(String keyword) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
//	@Override
//	public List<Product> findByType(String type) {
//		return productRepo.findByType(type);
//	}

}
