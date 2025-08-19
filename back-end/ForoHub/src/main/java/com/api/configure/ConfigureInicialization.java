package com.api.configure;

import com.api.modelo.IRole;
import com.api.modelo.Role;
import com.api.modelo.RoleName;
import com.api.user.IUsuario;
import com.api.user.Usuario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@Configuration
public class ConfigureInicialization {
    @Bean
    CommandLineRunner initData(IRole roleRepository, IUsuario usuarioRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Crear roles
            for (RoleName roleName : RoleName.values()) {
                if (!roleRepository.existsByName(roleName)) {
                    roleRepository.save(new Role(roleName));
                    System.out.println("Rol creado: " + roleName);
                }
            }

            // Crear usuario
            // Crear usuario
            if (!usuarioRepository.existsByEmail("user@forohub.com")) {
                Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
                        .orElseThrow(() -> new IllegalStateException("ROLE_USER no encontrado"));
                Usuario user = new Usuario();
                user.setUsername("usuario123"); // ← Esta línea es clave
                user.setName("Usuario");
                user.setEmail("user@forohub.com");
                user.setPassword(passwordEncoder.encode("user123"));
                user.setRoles(Set.of(userRole));
                usuarioRepository.save(user);
                System.out.println("Usuario USER creado");
            }
        };
    }
}
