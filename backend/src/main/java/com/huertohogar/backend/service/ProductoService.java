package com.huertohogar.backend.service;

import com.huertohogar.backend.model.Producto;
import com.huertohogar.backend.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository repo;

    public ProductoService(ProductoRepository repo) {
        this.repo = repo;
    }

    public List<Producto> listar() {
        return repo.findAll();
    }

    public Producto guardar(Producto p) {
        return repo.save(p);
    }

    public Producto obtener(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
