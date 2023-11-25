package com.thapak.demopostgresql.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    public String globalException(RuntimeException exception){
        return "something went wrong !"+exception.getMessage();
    }
    
}
