package com.huertohogar.backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clienteNombre;
    private double total;
    private String estado;
    private LocalDateTime fecha;

    public Long getId() { return id; }
    public String getClienteNombre() { return clienteNombre; }
    public double getTotal() { return total; }
    public String getEstado() { return estado; }
    public LocalDateTime getFecha() { return fecha; }

    public void setClienteNombre(String clienteNombre) { this.clienteNombre = clienteNombre; }
    public void setTotal(double total) { this.total = total; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
}
