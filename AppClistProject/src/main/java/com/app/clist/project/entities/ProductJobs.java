package com.app.clist.project.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

//ENTITY
@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("jobs")
public class ProductJobs extends Product implements Serializable{

	
	//FIELDS
	
	@Enumerated(EnumType.STRING)
	private ProductCategory productJobs;
	
	@Enumerated(EnumType.STRING)
	private Jobs jobType;
	
	
	//CONSTRUCTOR
	public ProductJobs() {
		// TODO Auto-generated constructor stub
	}

	public ProductJobs(Description description, UserClient userClient) {
		super(description, userClient);
		// TODO Auto-generated constructor stub
	}

	public ProductJobs(String title, Description description, UserClient userClient) {
		super(title, description, userClient );
		// TODO Auto-generated constructor stub
	}
	

	public ProductJobs(String title, Description description, UserClient userClient, Jobs jobType, ProductCategory productCategory) {
		super(title, description, userClient);
		this.jobType = jobType;
	}
	
	public ProductJobs(String title, Description description, UserClient userClient, Jobs jobType) {
		super(title, description, userClient);
		this.jobType = jobType;
	}

	public Jobs getJobType() {
		return jobType;
	}

	public void setJobType(Jobs jobType) {
		this.jobType = jobType;
	}

	public ProductCategory getProductJobs() {
		return productJobs;
	}

	public void setProductJobs(ProductCategory productJobs) {
		this.productJobs = productJobs;
	}

	
}
