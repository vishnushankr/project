package com.example.demo.exception;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value =HttpStatus.UNAUTHORIZED)

public class UnauthorizedException extends RuntimeException{
	
	public static final long serialVersionUID=1L;
	
	public UnauthorizedException(String message) {
		super(message);
	}

}
