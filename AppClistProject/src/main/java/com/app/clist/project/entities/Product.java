package com.app.clist.project.entities;
//import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

//ENTITY
//@SuppressWarnings("serial")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("userClient")
public abstract class Product {

	// FIELDS
	@Version
	private int version;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(length = 100)
	private String title;

	@OneToOne(cascade = { CascadeType.ALL })
	@JsonManagedReference(value = "prod_desc")
	@JoinColumn(name = "prod_desc")
	private Description description;

	@ManyToOne
	@JoinColumn(name = "prod_user_client")
	@JsonManagedReference(value = "prod_client")
	private UserClient userClient;

	@Column(length = 50)
	@Enumerated(EnumType.STRING)
	private ProductCategory productCategory;

	// CONSTRUCTORS

	public Product(String title, Description description, UserClient userClient) {
		this.title = title;
		this.description = description;
		this.userClient = userClient;
		
		if (this instanceof ProductJobs) {
			this.productCategory = ProductCategory.JOBS;
			
		}
		if (this instanceof ProductForSale) {
			this.productCategory = ProductCategory.FORSALE;
		}
		if (this instanceof ProductGigs) {
			this.productCategory = ProductCategory.GIGS;
		}
		if (this instanceof ProductHousing) {
			this.productCategory = ProductCategory.HOUSING;
		}
		if (this instanceof ProductPersonal) {
			this.productCategory = ProductCategory.PERSONAL;
		}
		if (this instanceof ProductCommunity) {
			this.productCategory = ProductCategory.COMMUNITY;
		}
		if (this instanceof ProductDiscussionsForums) {
			this.productCategory = ProductCategory.DISCUSSIONSFORUMS;
		}
	}

	public Product(Description description, UserClient userClient) {
		this.description = description;
		this.userClient = userClient;
		
		if (this instanceof ProductJobs) {
			this.productCategory = ProductCategory.JOBS;
		}
		if (this instanceof ProductForSale) {
			this.productCategory = ProductCategory.FORSALE;
		}
		if (this instanceof ProductGigs) {
			this.productCategory = ProductCategory.GIGS;
		}
		if (this instanceof ProductHousing) {
			this.productCategory = ProductCategory.HOUSING;
		}
		if (this instanceof ProductPersonal) {
			this.productCategory = ProductCategory.PERSONAL;
		}
		if (this instanceof ProductCommunity) {
			this.productCategory = ProductCategory.COMMUNITY;
		}
		if (this instanceof ProductDiscussionsForums) {
			this.productCategory = ProductCategory.DISCUSSIONSFORUMS;
		}
	}

	public Product() {
		if (this instanceof ProductJobs) {
			this.productCategory = ProductCategory.JOBS;
		}
		if (this instanceof ProductForSale) {
			this.productCategory = ProductCategory.FORSALE;
		}
		if (this instanceof ProductGigs) {
			this.productCategory = ProductCategory.GIGS;
		}
		if (this instanceof ProductHousing) {
			this.productCategory = ProductCategory.HOUSING;
		}
		if (this instanceof ProductPersonal) {
			this.productCategory = ProductCategory.PERSONAL;
		}
		if (this instanceof ProductCommunity) {
			this.productCategory = ProductCategory.COMMUNITY;
		}
		if (this instanceof ProductDiscussionsForums) {
			this.productCategory = ProductCategory.DISCUSSIONSFORUMS;
		}
	}

	// GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public UserClient getUserClient() {
		return userClient;
	}

	public void setUserClient(UserClient userClient) {
		this.userClient = userClient;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

}
