package com.app.clist.project.exception;

@SuppressWarnings("serial")
public class ClientAlreadyExists extends Exception {
	
	private String message = "";

	public ClientAlreadyExists(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}


	
	

}
