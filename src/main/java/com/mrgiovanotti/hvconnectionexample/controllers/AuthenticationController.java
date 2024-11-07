package com.mrgiovanotti.hvconnectionexample.controllers;

import com.mrgiovanotti.hvconnectionexample.exceptions.ForbiddenException;
import com.mrgiovanotti.hvconnectionexample.models.AuthenticationResponse;
import com.mrgiovanotti.hvconnectionexample.models.Credentials;
import com.mrgiovanotti.hvconnectionexample.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody Credentials credentials) {
        String username = credentials.getUsername();
        String password = credentials.getPassword();
        if (authenticationService.login(username, password)) {
            return ResponseEntity.ok(new AuthenticationResponse("200", "Successful login"));
        } else {
            throw new ForbiddenException("Invalid credentials");
        }
    }



}
