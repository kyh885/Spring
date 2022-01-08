package com.example.intercepter.handler;

import com.example.intercepter.exception.AuthException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {

    @ExceptionHandler(AuthException.class)
    public ResponseEntity authException(){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();

    }
}