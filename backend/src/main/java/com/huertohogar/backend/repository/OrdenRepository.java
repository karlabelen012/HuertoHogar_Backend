package com.huertohogar.backend.repository;

import com.huertohogar.backend.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
}
