package com.api.topic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITopic extends JpaRepository<Topic, Long> {
    boolean existsByTituloAndMensaje(String titulo, String mensaje);
}
