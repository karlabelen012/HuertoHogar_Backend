package com.huertohogar.backend.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class DashboardService {

    public Map<String, Object> estadisticas() {
        Map<String, Object> data = new HashMap<>();
        data.put("totalCompras", 24);
        data.put("proyeccionCompras", 15);
        data.put("totalProductos", 156);
        data.put("inventarioTotal", 1248);
        data.put("totalUsuarios", 89);
        data.put("nuevosUsuariosMes", 12);
        return data;
    }
}
