package com.huertohogar.backend.controller;

import com.huertohogar.backend.model.Categoria;
import com.huertohogar.backend.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin
public class CategoriaController {

    private final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Categoria> listar() {
        return service.listar();
    }

    @PostMapping
    public Categoria crear(@RequestBody Categoria c) {
        return service.guardar(c);
    }
}
