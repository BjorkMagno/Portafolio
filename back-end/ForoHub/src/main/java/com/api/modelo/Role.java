package com.api.modelo;


import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RoleName nombre;

    @Override
    public String getAuthority() {
        return nombre.name();
    }

    // Constructor
    public Role() {

    }

    public Role(RoleName name) {
        this.nombre = name;
    }

    // Getter y Setter
    public Long getId() {
        return id;
    }

    public RoleName getName() {
        return nombre;
    }

    public void setName(RoleName name) {
        this.nombre = name;
    }
}
