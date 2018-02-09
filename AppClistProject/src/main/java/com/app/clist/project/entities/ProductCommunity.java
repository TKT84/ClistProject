package com.app.clist.project.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("product community")
public class ProductCommunity extends Product implements Serializable{

	public ProductCommunity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductCommunity(Description description, UserClient userClient) {
		super(description, userClient);
		// TODO Auto-generated constructor stub
	}

	public ProductCommunity(String title, Description description, UserClient userClient) {
		super(title, description, userClient);
		// TODO Auto-generated constructor stub
	}	
	
	
}
