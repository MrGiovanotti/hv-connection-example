package com.mrgiovanotti.hvconnectionexample.services.impl;

import com.mrgiovanotti.hvconnectionexample.configuration.ApplicationProperties;
import com.mrgiovanotti.hvconnectionexample.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final ApplicationProperties applicationProperties;

    @Override
    public boolean login(String username, String password) {
        return applicationProperties.getUsername().equals(username) && applicationProperties.getPassword().equals(password);
    }
}
