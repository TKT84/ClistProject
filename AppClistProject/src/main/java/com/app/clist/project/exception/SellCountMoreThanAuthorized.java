package com.app.clist.project.exception;

@SuppressWarnings("serial")
public class SellCountMoreThanAuthorized extends Exception {

	private String message = "";

    public SellCountMoreThanAuthorized( String message ) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
