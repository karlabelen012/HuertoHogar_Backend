package com.huertohogar.backend.controller;

import com.huertohogar.backend.model.Orden;
import com.huertohogar.backend.service.OrdenService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ordenes")
@CrossOrigin
public class OrdenController {

    private final OrdenService service;

    public OrdenController(OrdenService service) {
        this.service = service;
    }

    @GetMapping
    public List<Orden> listar() {
        return service.listar();
    }
}
