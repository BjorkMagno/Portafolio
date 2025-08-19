package com.api.topic;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
    @Autowired
    private ITopic topicoRepository;

    public Topic crearTopico(Topic topico) {
        boolean existe = topicoRepository.existsByTituloAndMensaje(topico.getTitulo(), topico.getMensaje());
        if (existe) {
            throw new RuntimeException("Ya existe un tópico con el mismo título y mensaje");
        }
        return topicoRepository.save(topico);
    }

    public List<Topic> obtenerTodos() {
        return topicoRepository.findAll();
    }

    public Topic obtenerPorId(Long id) {
        return topicoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tópico no encontrado"));
    }
    public void eliminarPorId(Long id) {
        Topic topico = topicoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tópico no encontrado con ID: " + id));
        topicoRepository.delete(topico);
    }

    public Topic actualizarTopico(Long id, ActualizarTopicDTO dto) {
        Topic topico = topicoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tópico no encontrado con ID: " + id));

        topico.setTitulo(dto.getTitulo());
        topico.setMensaje(dto.getMensaje());

        return topicoRepository.save(topico);
    }
}
