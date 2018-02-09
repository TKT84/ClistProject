package com.app.clist.project.entities;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("gigs")
public class ProductGigs extends Product implements Serializable{

	@Enumerated(EnumType.STRING)
	private Gigs gigsType;
	
	@Enumerated(EnumType.STRING)
	private ProductCategory productGigs;
	
	
	public ProductGigs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductGigs(Description description, UserClient userClient) {
		super(description, userClient);
		// TODO Auto-generated constructor stub
	}

	public ProductGigs(String title, Description description, UserClient userClient) {
		super(title, description, userClient);
		// TODO Auto-generated constructor stub
	}

	public Gigs getGigsType() {
		return gigsType;
	}

	public void setGigsType(Gigs gigsType) {
		this.gigsType = gigsType;
	}

	public ProductCategory getProductGigs() {
		return productGigs;
	}

	public void setProductGigs(ProductCategory productGigs) {
		this.productGigs = productGigs;
	}

	
}
