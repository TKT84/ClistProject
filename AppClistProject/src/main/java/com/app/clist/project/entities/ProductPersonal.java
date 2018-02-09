package com.app.clist.project.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("personal")
public class ProductPersonal extends Product implements Serializable{

	public ProductPersonal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductPersonal(Description description, UserClient userClient) {
		super(description, userClient);
		// TODO Auto-generated constructor stub
	}

	public ProductPersonal(String title, Description description, UserClient userClient) {
		super(title, description, userClient);
		// TODO Auto-generated constructor stub
	}

	
}
