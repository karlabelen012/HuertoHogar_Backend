package com.huertohogar.backend.service;

import com.huertohogar.backend.model.Orden;
import com.huertohogar.backend.repository.OrdenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenService {

    private final OrdenRepository repo;

    public OrdenService(OrdenRepository repo) {
        this.repo = repo;
    }

    public List<Orden> listar() {
        return repo.findAll();
    }
}
