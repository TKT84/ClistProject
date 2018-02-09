package com.app.clist.project.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("discussions forums")
public class ProductDiscussionsForums extends Product implements Serializable{

	public ProductDiscussionsForums() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDiscussionsForums(Description description, UserClient userClient) {
		super(description, userClient);
		// TODO Auto-generated constructor stub
	}

	public ProductDiscussionsForums(String title, Description description, UserClient userClient) {
		super(title, description, userClient);
		// TODO Auto-generated constructor stub
	}

	
}
