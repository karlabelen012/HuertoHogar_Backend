package com.huertohogar.backend.service;

import com.huertohogar.backend.model.Categoria;
import com.huertohogar.backend.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository repo;

    public CategoriaService(CategoriaRepository repo) {
        this.repo = repo;
    }

    public List<Categoria> listar() {
        return repo.findAll();
    }

    public Categoria guardar(Categoria c) {
        return repo.save(c);
    }
}
