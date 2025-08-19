package com.api.auth;

import lombok.Getter;

@Getter
public class AutenticacionResponse {
    private String token;

    public AutenticacionResponse(String token) {
        this.token = token;
    }
}
