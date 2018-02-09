package com.app.clist.project.entities;

import javax.persistence.Basic;
//import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import com.fasterxml.jackson.annotation.JsonBackReference;

//ENTITY
//@SuppressWarnings("serial")
@Entity
public class Description {

	@Version
	private int version;

	// FIELDS
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Lob
	@Column(unique = true)
	@Basic(fetch = FetchType.LAZY)
	private String description;

	@Column(length = 10)
	private Double price;

	@Embedded
	@Column(length = 100)
	private Address address;

	// private String image;

	@OneToOne(mappedBy = "description")
	@JsonBackReference(value = "prod_desc")
	private Product product;

	// CONSTRUCTORS
	public Description(String description) {
		this.description = description;
	}

	public Description(String description, Double price) {
		this.description = description;
		this.price = price;
	}

	public Description(String description, Address address) {
		this.description = description;
		this.address = address;
	}

	public Description(String description, Double price, Address address) {
		this.description = description;
		this.price = price;
		this.address = address;
	}

	public Description(String description, Double price, Address address, Product product) {
		this.description = description;
		this.price = price;
		this.address = address;
		this.product = product;
	}

	public Description(Double price, Address address, Product product) {
		this.price = price;
		this.address = address;
		this.product = product;
	}

	public Description() {
	}

	// GETTERS AND SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	// public String getImage() {
	// return image;
	// }

	// public void setImage(String image) {
	// this.image = image;
	// }

}
