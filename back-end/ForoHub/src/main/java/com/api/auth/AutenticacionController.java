package com.api.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/controller")
public class AutenticacionController {
    private final AutenticacionService authService;
    // Cosntructor
    public AutenticacionController(AutenticacionService autenticacionService) {
        this.authService = autenticacionService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AutenticacionRequest request) {
        try {
            return ResponseEntity.ok(authService.login(request));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of("error", e.getMessage()));
        }
    }
}
