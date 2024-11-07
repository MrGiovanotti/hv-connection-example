package com.mrgiovanotti.hvconnectionexample.exceptions;

import com.mrgiovanotti.hvconnectionexample.models.AuthenticationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(ForbiddenException.class)
    public ResponseEntity<AuthenticationResponse> handleForbiddenException(ForbiddenException exception) {
        return ResponseEntity.status(401).body(new AuthenticationResponse("401", exception.getMessage()));
    }

}
