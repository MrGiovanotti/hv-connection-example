package com.mrgiovanotti.hvconnectionexample.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
public class Credentials implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;

}
