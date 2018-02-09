package com.app.clist.project.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("housing")
public class ProductHousing extends Product implements Serializable{

	
	//FIELDS
	
	@Enumerated(EnumType.STRING)
	private Housing HousingType;
	
	@Enumerated(EnumType.STRING)
	private ProductCategory productHousing;
	
	public ProductHousing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductHousing(Description description, UserClient userClient) {
		super(description, userClient);
		// TODO Auto-generated constructor stub
	}

	public ProductHousing(String title, Description description, UserClient userClient) {
		super(title, description, userClient);
		// TODO Auto-generated constructor stub
	}

	public Housing getHousingType() {
		return HousingType;
	}

	public void setHousingType(Housing housingType) {
		HousingType = housingType;
	}

	public ProductCategory getProductHousing() {
		return productHousing;
	}

	public void setProductHousing(ProductCategory productHousing) {
		this.productHousing = productHousing;
	}

	
	
}
