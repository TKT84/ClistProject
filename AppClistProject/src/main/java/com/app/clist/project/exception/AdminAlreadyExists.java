package com.app.clist.project.exception;

@SuppressWarnings("serial")
public class AdminAlreadyExists extends Exception {

	private String message = "";

	public AdminAlreadyExists(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
