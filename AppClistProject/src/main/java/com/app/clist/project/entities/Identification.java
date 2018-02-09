package com.app.clist.project.entities;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;


//ENTITY
@Entity
public class Identification {

	//FIELDS
	@Version
	private int version;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 50, unique = true)
	private String username;
	
	@Column(length = 50)
	private String password;
	
	@OneToOne(mappedBy = "identification")
	@JsonBackReference(value = "Abstract_user_id")
	private AbstractUser abstractUser;
	
	//CONSTRUCTORS
	
	public Identification(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Identification() {
		
	}
	
	//GETTERS AND SETTERS
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public AbstractUser getUser() {
		return abstractUser;
	}

	public void setUser(AbstractUser abstractUser) {
		this.abstractUser = abstractUser;
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
