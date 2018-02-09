package com.app.clist.project.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//ENTITY
@Entity
@SuppressWarnings("serial")
@DiscriminatorValue("admin")
public class UserAdmin extends AbstractUser implements Serializable{

	
	//CONSTRUCTORS
	
	public UserAdmin(String email, Address address, Long phoneNumber, Identification identification) {
		super(email, address, phoneNumber, identification);
		// TODO Auto-generated constructor stub
	}

	public UserAdmin(String email, Long phoneNumber, Identification identification) {
		super(email, phoneNumber, identification);
		// TODO Auto-generated constructor stub
	}

	public UserAdmin(String lastName, String firstName, String email, Address address, Long phoneNumber,
			Identification identification) {
		super(lastName, firstName, email, address, phoneNumber, identification);
		// TODO Auto-generated constructor stub
	}

	public UserAdmin(String lastName, String firstName, String email, Date dateOfBirth, Address address,
			Long phoneNumber, Identification identification) {
		super(lastName, firstName, email, dateOfBirth, address, phoneNumber, identification);
		// TODO Auto-generated constructor stub
	}
	
	public UserAdmin() {
	}

	
	//GETTERS AND SETTERS
	
	
	
}
