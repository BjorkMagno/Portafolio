package com.api.curse;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    private final ICurso cursoRepository;

    public CursoService(ICurso cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> obtenerTodos() {
        return cursoRepository.findAll();
    }

    public Curso obtenerPorId(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public Curso crearCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

}
