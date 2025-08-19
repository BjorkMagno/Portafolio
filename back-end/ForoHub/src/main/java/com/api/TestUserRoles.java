package com.api;

import com.api.modelo.Role;
import com.api.modelo.RoleName;
import com.api.user.Usuario;

import java.util.Set;

public class TestUserRoles {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setEmail("admincorreo@example.com");
        usuario.setPassword("securitypassword");

        Role adminRole = new Role(RoleName.ROLE_ADMIN);
        usuario.setRoles(Set.of(adminRole));

        boolean tieneRolAdmin = usuario.getAuthorities().stream()
                .anyMatch(auth -> auth.getAuthority().equals("ROLE_ADMIN"));

        System.out.println("¿Tiene un ROLE_ADMIN? " + tieneRolAdmin);
    }
}
