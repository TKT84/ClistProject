package com.app.clist.project.exception;

@SuppressWarnings("serial")
public class ProductCannotBeNegative extends Exception {

	private String message = "";
	
	public ProductCannotBeNegative(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}


	
	
}
