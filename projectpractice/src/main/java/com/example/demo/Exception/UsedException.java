package com.example.demo.Exception;
import org.springframework.http.HttpStatus;


import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value =HttpStatus.IM_USED)
public class UsedException extends RuntimeException{
	
	public static final long serialVersionUID=1L;

public UsedException(String message) {
	super(message);
}
}
