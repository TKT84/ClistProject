package com.app.clist.project.exception;

@SuppressWarnings("serial")
public class AdminIsNotFoundException extends Exception {

	private String message = "";

	public AdminIsNotFoundException (String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}		
}
