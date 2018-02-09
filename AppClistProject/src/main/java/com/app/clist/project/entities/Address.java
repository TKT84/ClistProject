package com.app.clist.project.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

//EMBEDDED
@SuppressWarnings("serial")
@Embeddable
public class Address implements Serializable {

	// FIELDS
	@Column(length = 10)
	private Integer streetNumber;
	@Column(length = 100)
	private String streetName;
	@Column(length = 50)
	private String city;
	@Column(length = 50)
	private String region;
	@Column(name = "Zip_Code", length = 10)
	private Double zipCode;
	@Column(length = 50)
	private String country;
	@Column(length = 50)
	private String landmark;
	@Column(length = 50)
	private String borough;
	@Column(length = 50)
	private String neighborhood;
	@Column(length = 50)
	private String department;
	@Column(length = 50)
	private String commune;
	
	// CONSTRUCTORS

	public Address() {
	}

	public Address(Integer streetNumber, String streetName, String city, String region, Double zipCode, String country,
			String landmark, String boroughs, String neighborhood) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.region = region;
		this.zipCode = zipCode;
		this.country = country;
		this.landmark = landmark;
		this.borough = boroughs;
		this.neighborhood = neighborhood;
	}

	public Address(Integer streetNumber, String streetName, String city, String region, Double zipCode,
			String landmark, String boroughs, String neighborhood) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.region = region;
		this.zipCode = zipCode;
		this.landmark = landmark;
		this.borough = boroughs;
		this.neighborhood = neighborhood;
	}

	public Address(Integer streetNumber, String streetName, String city, Double zipCode, String landmark,
			String boroughs, String neighborhood) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.zipCode = zipCode;
		this.landmark = landmark;
		this.borough = boroughs;
		this.neighborhood = neighborhood;
	}

	public Address(Integer streetNumber, String streetName, String landmark, String boroughs, String neighborhood) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.landmark = landmark;
		this.borough = boroughs;
		this.neighborhood = neighborhood;
	}

	// GETTERS AND SETTERS
	public Integer getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Double getZipCode() {
		return zipCode;
	}

	public void setZipCode(Double zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getBoroughs() {
		return borough;
	}

	public void setBoroughs(String boroughs) {
		this.borough = boroughs;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

}
