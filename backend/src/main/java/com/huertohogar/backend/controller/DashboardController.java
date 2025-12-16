package com.huertohogar.backend.controller;

import com.huertohogar.backend.service.DashboardService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin
public class DashboardController {

    private final DashboardService service;

    public DashboardController(DashboardService service) {
        this.service = service;
    }

    @GetMapping("/estadisticas")
    public Map<String, Object> estadisticas() {
        return service.estadisticas();
    }
}
