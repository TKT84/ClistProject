package com.app.clist.project.entities;


import java.util.Date;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;



//ENTITY

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class AbstractUser {

	// FIELDS
	
	@Version
	private int version;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 50)
	private String lastName;
	
	@Column(length = 50)
	private String firstName;
	
	@Column(length = 10)
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Column(length = 50, unique = true)
	private String email;
	
	@Column(length = 15)
	private Long phoneNumber;
	
	@Embedded
	private Address address;
	
	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn( name = "id_identification" )
	@JsonBackReference(value = "abstract_user_id")
	private Identification identification;

	// CONSTRUCTORS
	
	public AbstractUser(String lastName, String firstName, String email, Date dateOfBirth, Address address, Long phoneNumber) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public AbstractUser(String lastName, String firstName, String email, Date dateOfBirth, Address address, Long phoneNumber, Identification identification) {
		this(lastName, firstName, email, dateOfBirth, address, phoneNumber);
		this.identification = identification;
	}

	public AbstractUser(String lastName, String firstName, String email, Address address, Long phoneNumber,
			Identification identification) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.identification = identification;
	}

	public AbstractUser(String email, Address address, Long phoneNumber, Identification identification) {
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.identification = identification;
	}

	public AbstractUser(String email, Long phoneNumber, Identification identification) {
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.identification = identification;
	}

	public AbstractUser() {
	}

	// GETTERS AND SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Identification getIdentification() {
		return identification;
	}

	public void setIdentification(Identification identification) {
		this.identification = identification;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
}
