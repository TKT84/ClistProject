package com.app.clist.project.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonBackReference;

//ENTITY
@Entity
@DiscriminatorValue("userClient")
public class UserClient extends AbstractUser {
	
	//FIELD
	
	@OneToMany(mappedBy = "userClient", cascade = { CascadeType.ALL})
	@JsonBackReference(value = "prod_client")
	private List <Product> products = new ArrayList<>();
	
	private Integer countOfProductForSale;
	
	//CONSTRUCTOR
	
	public UserClient(String email, Address address, Long phoneNumber, Identification identification, List<Product> products) {
		super(email, address, phoneNumber, identification);
		// TODO Auto-generated constructor stub
		this.products = products;
	}
	public UserClient(String email, Address address, Long phoneNumber, Identification identification) {
		super(email, address, phoneNumber, identification);
		// TODO Auto-generated constructor stub
		
	}

	public UserClient(String email, Long phoneNumber, Identification identification) {
		super(email, phoneNumber, identification);
		// TODO Auto-generated constructor stub
	}

	public UserClient(String lastName, String firstName, String email, Address address, Long phoneNumber,
			Identification identification, List<Product> products) {
		super(lastName, firstName, email, address, phoneNumber, identification);
		// TODO Auto-generated constructor stub
		this.products = products;
	}

	public UserClient(String lastName, String firstName, String email, Date dateOfBirth, Address address,
			Long phoneNumber, Identification identification, List<Product> products) {
		this(lastName, firstName, email, dateOfBirth, address, phoneNumber, identification);
		// TODO Auto-generated constructor stub
		this.products = products;
	}

	public UserClient() {
		super();
	}

	public UserClient(String lastName, String firstName, String email, Date dateOfBirth, Address address,
			Long phoneNumber, Identification identification) {
		// TODO Auto-generated constructor stub

	}

	//GETTERS AND SETTERS
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public Integer getCountOfProductForSale() {
		return countOfProductForSale;
	}
	
	public void setCountOfProductForSale(Integer countOfProductForSale) {
		this.countOfProductForSale = countOfProductForSale;
	}
	
}

