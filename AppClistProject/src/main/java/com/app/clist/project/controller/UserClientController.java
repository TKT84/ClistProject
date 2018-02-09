package com.app.clist.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.clist.project.dao.*;
import com.app.clist.project.entities.Product;
import com.app.clist.project.entities.UserClient;
import com.app.clist.project.exception.ClientAlreadyExists;
import com.app.clist.project.exception.ClientIsNotFoundException;
import com.app.clist.project.services.UserClientServices;

@RestController
@RequestMapping("/api")
public class UserClientController {

	@Autowired
	UserClientServices userClientServices;
	@Autowired
	UserAdminDao userAdminDao;
	@Autowired
	UserClientDao userClientDao;
	@Autowired
	DescriptionDao descriptionDao;
	@Autowired
	ProductDao productDao;

	@GetMapping("/hi")
	public String hi() {
		return "hi bitch";
	}

	// -------------------------------------------------------- ADMIN ----------------------------------------------------------

	// ADMIN - GOOD
	@GetMapping(value = "/userClient")
	public List<UserClient> findAll() {
		return userClientDao.findAll();
	};

	// -------------------------------------------------------- CLIENT ----------------------------------------------------------

	// LOGIN - GOOD
	@PostMapping(value = "/signin/{username}_{password}")
	public ResponseEntity<UserClient> signIn(@PathVariable("username") String username,
			@PathVariable("password") String password) throws ClientIsNotFoundException {
		UserClient userClient = userClientServices.signIn(username, password);
		return new ResponseEntity<UserClient>(userClient, HttpStatus.ACCEPTED);
	}

	// LOGOUT - GOOD
	@GetMapping("/signout")
	public void signOut(HttpServletRequest request, UserClient userClientLoggedin) {
		userClientServices.signOut(request, userClientLoggedin);
	}

	// SIGN UP - GOOD
	@PostMapping(value = "/postUserClient", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserClient> signUp(@RequestBody UserClient userClient) throws ClientAlreadyExists {
		userClientServices.signUp(userClient);
		return new ResponseEntity<UserClient>(userClient, HttpStatus.CREATED);
	}

	// UPDATE - GOOD
	@PutMapping(value = "/postUserClientModify", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserClient> modifyUserClient(@RequestBody UserClient userClient) throws ClientAlreadyExists {
		userClientServices.modifyUserClient(userClient);
		return new ResponseEntity<UserClient>(userClient, HttpStatus.OK);
	}

	// -------------------------------------------------------- PRODUCT ----------------------------------------------------------

	// ALL PRODUCTS - GOOD

	@GetMapping("/products")
	public ResponseEntity<List<Product>> findByProductsAll() {
		return new ResponseEntity<List<Product>>(userClientServices.findByProducts(), HttpStatus.OK);
	}

//	// ALL PRODUCT CATEGORY - NOT GOOD - ON HOLD
//
//	@GetMapping("/products/product_category/{category}")
//	public ResponseEntity<List<Product>> findByProductCategory(@PathVariable("category") String category) {
//		return new ResponseEntity<List<Product>>(userClientServices.findByProductCategory(category), HttpStatus.OK);
//	}

	// PRODUCT TITLE - GOOD - TO BE REVIEWED

	@GetMapping("/products/product_title/{title}")
	public ResponseEntity<List<Product>> findByProductTitle(@PathVariable("title") String title) {
		return new ResponseEntity<List<Product>>(userClientServices.findByProductTitle(title), HttpStatus.OK);
	}
	
	// FIND PRODUCT BY USERCLIENT ID - GOOD

	@GetMapping("/products/product_userclient_id/{userclient_id}")
	public ResponseEntity<List<Product>> findByUserClient(@PathVariable("userclient_id") Long id) {
		UserClient ucId = userClientDao.find(id);
		return new ResponseEntity<List<Product>>(userClientServices.findByUserClient(ucId), HttpStatus.OK);
	}

	 // FIND PRODUCTS BY PRICE RANGE - GOOD
	
	@GetMapping("/products/product_price/{minprice}_{maxprice}")
	 public ResponseEntity <List<Product>> findByPrice(@PathVariable("minprice")Double priceMin, @PathVariable("maxprice") Double priceMax)
	 {
	 return new ResponseEntity<List<Product>> (userClientServices.findByPrice(priceMin, priceMax), HttpStatus.OK);
	 }
	//
	 // FIND PRODUCTS BY CITY - GOOD
	
	@GetMapping("/products/product_city/{city}")
	 public ResponseEntity< List<Product>> findByCity(@PathVariable("city") String city) {
	 return new ResponseEntity< List<Product>>(userClientServices.findByCity(city), HttpStatus.OK);
	 }
	
	 // FIND PRODUCTS BY REGION - GOOD
	
	@GetMapping("/products/product_region/{region}")
	 public ResponseEntity< List<Product>> findByRegion(@PathVariable("region") String region) {
	 return new ResponseEntity< List<Product>>(userClientServices.findByRegion(region), HttpStatus.OK);
	 }
	
	 // FIND PRODUCTS BY ZIPCODE - GOOD
	
	@GetMapping("/products/product_zip_code/{zip_code}")
	 public ResponseEntity< List<Product>> findByZipCode(@PathVariable("zip_code") Double zipCode) {
	 return new ResponseEntity< List<Product>>(userClientServices.findByZipCode(zipCode), HttpStatus.OK);
	 }
		

	 // FIND PRODUCTS BY COMMUNE - GOOD
	
	@GetMapping("/products/product_commune/{commune}")
	 public ResponseEntity< List<Product>> findByCommune(@PathVariable("commune") String commune) {
	 return new ResponseEntity <List<Product>> (userClientServices.findByCommune(commune), HttpStatus.OK);
	 }
	
	// FIND PRODUCTS BY BOROUGH - GOOD
	
	@GetMapping("/pruducts/product_borough/{borough}")
	public ResponseEntity< List<Product>> findByBorough(@PathVariable("borough") String borough) {
		return new ResponseEntity< List<Product>> (userClientServices.findByBorough(borough), HttpStatus.OK);
	}
	
	// FIND PRODUCTS BY DEPARTMENT - GOOD
	
	@GetMapping("/pruducts/product_department/{borough}")
	public ResponseEntity< List<Product>> findByDepartment(@PathVariable("borough") String department) {
		return new ResponseEntity< List<Product>> (userClientServices.findByDepartment(department), HttpStatus.OK);
	}
	
	
	
	 // FIND PRODUCTS BY TYPE
//	
//	@GetMapping("/pruducts/product_type/{type}")
//	 public ResponseEntity< List<Product>> findByType(@PathVariable("type") String type) {
//	 return new ResponseEntity< List<Product>> (userClientServices.findByType(type), HttpStatus.OK);
//	}
	// // FIND PRODUCT BY KEYWORD
	//
	
	// }
	
		// FIND BY CATEGORY
		// public List<Product> findByProductCategory(ProductCategory productCategory) {
		// return productDao.findByProductCategory(productCategory);
		// }

		// FIND BY USERNAME

//		@GetMapping("/products/product_userclient_name/{userclient_username}")
//		public ResponseEntity<List<Product>> findByUsername(@PathVariable("userclient_username") String username) {
//			return new ResponseEntity<List<Product>>(userClientServices.findByUsername(username), HttpStatus.OK);
//		}

	
	//
}
