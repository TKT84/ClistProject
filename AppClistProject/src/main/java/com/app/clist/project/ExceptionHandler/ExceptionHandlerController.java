 package com.app.clist.project.ExceptionHandler;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.app.clist.project.exception.ClientAlreadyExists;
import com.app.clist.project.exception.ClientIsNotFoundException;
import com.app.clist.project.exception.ProductCannotBeNegative;
import com.app.clist.project.exception.SellCountMoreThanAuthorized;

@RestControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(ClientAlreadyExists.class)
	@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
	public String ClientAlreadyExistsHandlerException(Exception e) {
		return e.getMessage();	
		}
	
	@ExceptionHandler(ClientIsNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
	public String ClientIsNotFoundHandlerException(Exception e) {
		return e.getMessage();	
		}
	
	@ExceptionHandler(ProductCannotBeNegative.class)
	@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
	public String ProductCannotBeNegativeHandlerException(Exception e) {
		return e.getMessage();	
		}
	
	@ExceptionHandler(SellCountMoreThanAuthorized.class)
	@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
	public String SellCountMoreThanAuthorizedHandlerException(Exception e) {
		return e.getMessage();	
		}
}
