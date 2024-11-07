package com.mrgiovanotti.hvconnectionexample.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "example.authentication")
@Getter
@Setter
public class ApplicationProperties {

    private String username;
    private String password;

}
