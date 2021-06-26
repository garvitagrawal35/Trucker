package com.egen.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ReadingsNotFoundException extends RuntimeException{

     public ReadingsNotFoundException(String message) {
          super(message);
     }

}
