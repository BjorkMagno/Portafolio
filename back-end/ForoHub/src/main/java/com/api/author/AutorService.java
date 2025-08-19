package com.api.author;

import com.api.security.JWTUtils;
import com.api.user.IUsuario;
import com.api.user.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JWTUtils jwtUtils;

    @Autowired
    private IUsuario usuarioRepository;

    public String login(AutorRequest request) {
        Authentication authToken = new UsernamePasswordAuthenticationToken(
                request.getEmail(), request.getPassword());

        authManager.authenticate(authToken);

        Usuario usuario = usuarioRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        return jwtUtils.generarToken(usuario);
    }
}
