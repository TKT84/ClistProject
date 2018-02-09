package com.app.clist.project.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.clist.project.dao.AbstractUserDao;
import com.app.clist.project.dao.DescriptionDao;
import com.app.clist.project.dao.IdentificationDao;
import com.app.clist.project.dao.ProductDao;
import com.app.clist.project.dao.ProductForSaleDao;
import com.app.clist.project.dao.ProductGigsDao;
import com.app.clist.project.dao.ProductHousingDao;
import com.app.clist.project.dao.ProductJobsDao;
import com.app.clist.project.dao.UserAdminDao;
import com.app.clist.project.dao.UserClientDao;
import com.app.clist.project.entities.Product;
import com.app.clist.project.entities.UserClient;
import com.app.clist.project.exception.ClientAlreadyExists;
import com.app.clist.project.exception.ClientIsNotFoundException;

@Service
public class UserClientServices {

	@Autowired
	AbstractUserDao abstractUserDao;
	@Autowired
	UserAdminDao userAdminDao;
	@Autowired
	UserClientDao userClientDao;
	@Autowired
	IdentificationDao identificationDao;
	@Autowired
	DescriptionDao descriptionDao;
	@Autowired
	ProductDao productDao;
	@Autowired
	ProductForSaleDao productForSaleDao;
	@Autowired
	ProductGigsDao productGigsDao;
	@Autowired
	ProductHousingDao productHousingDao;
	@Autowired
	ProductJobsDao productJobsDao;

	// -------------------------------------------------------- CLIENT ----------------------------------------------------------

	// TO LOGIN  - GOOD
	public UserClient signIn(String username, String password) throws ClientIsNotFoundException {

		UserClient uc = userClientDao.findByIdentification(username, password);

		if (uc == null) {

			throw new ClientIsNotFoundException(
					"The Authentication that you entered does not match the information we have on file");

		} else {
			return uc;
		}
	}

	// TO LOGOUT - GOOD
	public void signOut(HttpServletRequest request, UserClient userClientLoggedin) {
		//userClientLoggedin = userClientDao.find(userClientLoggedin.getId());
		HttpSession session = request.getSession();
		session.invalidate();
	}

	// TO SIGN UP - GOOD
	public UserClient signUp(UserClient uc) throws ClientAlreadyExists {
		if (userClientDao.findByEmail(uc.getEmail()) != null) {
			throw new ClientAlreadyExists("The Authentication information that you entered already exists");
		} else {
			return userClientDao.create(uc);
		}
	}

	// MODIFY USERCLIENT - GOOD
	public UserClient modifyUserClient(UserClient userClient) {
		return userClientDao.update(userClient);

	};

	// -------------------------------------------------------- PRODUCT ----------------------------------------------------------

	// FIND ALL PRODUCTS - GOOD
	public List<Product> findByProducts() {
		return productDao.findAll();
	}

	// FIND PRODUCT BY TITLE
	public List<Product> findByProductTitle(String title) {
		return productDao.findByTitle(title);
	}

//	// FIND BY CATEGORY
//	public List<Product> findByProductCategory(String productCategory) {
//		return productDao.findByProductCategory(productCategory);
//	}

	 // FIND BY USERNAME
//	
//	 public UserClient findByUsername(String username) {
//	 return userClientDao.findByUsername(username);
//	 }

	 // FIND PRODUCT BY USERCLIENT
	
	 public List <Product> findByUserClient(UserClient userClient){
	 return productDao.findByUserClient(userClient);
	 }
	

	// // FIND BY EMAIL
	// public UserClient findByEmail(String email) {
	// return userClientDao.findByEmail(email);
	// }

	// FIND PRODUCTS BY PRICE RANGE
	public List<Product> findByPrice(double priceMin, double priceMax) {
		return productDao.findByPrice(priceMin, priceMax);
	}

	// FIND PRODUCTS BY CITY
	public List<Product> findByCity(String city) {
		return productDao.findByCity(city);
	}

	// FIND PRODUCTS BY REGION
	public List<Product> findByRegion(String region) {
		return productDao.findByRegion(region);
	}

	// FIND PRODUCTS BY ZIPCODE
	public List<Product> findByZipCode(Double zipCode) {
		return productDao.findByZipCode(zipCode);
	}
	// FIND PRODUCTS BY BOROUGH
	public List<Product> findByBorough(String borough) {
		return productDao.findByBorough(borough);
	}

	// FIND PRODUCTS BY COMMUNE
	public List<Product> findByCommune(String commune) {
		return productDao.findByCommune(commune);
	}
	
	// FIND PRODUCTS BY DEPARTMENT
		public List<Product> findByDepartment(String department) {
			return productDao.findByDepartment(department);
		}

//	// FIND PRODUCTS BY TYPE
//	public List<Product> findByType(String type) {
//		return productDao.findByType(type);
//}
		// FIND PRODUCT BY KEYWORD

	

	// -------------------------------------------------------- DESCRIPTION ----------------------------------------------------------

}
