package com.app.clist.project.exception;


@SuppressWarnings("serial")
public class ClientIsNotFoundException extends Exception {

	private String message = "";

	public ClientIsNotFoundException (String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}		
}
