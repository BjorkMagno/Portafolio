package com.api.auth;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutenticacionRequest {
    private String email;
    private String password;
}
