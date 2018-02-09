package com.app.clist.project.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("for sale")
public class ProductForSale extends Product implements Serializable{
	
	@Enumerated(EnumType.STRING)
	private ForSale forSaleType;

	public ProductForSale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductForSale(Description description, UserClient userClient) {
		super(description, userClient);
		// TODO Auto-generated constructor stub
	}

	public ProductForSale(String title, Description description, UserClient userClient, ForSale forSaleType) {
		super(title, description, userClient);
		// TODO Auto-generated constructor stub
	}

	public ForSale getForSaleType() {
		return forSaleType;
	}

	public void setForSaleType(ForSale forSaleType) {
		this.forSaleType = forSaleType;
	}

}
