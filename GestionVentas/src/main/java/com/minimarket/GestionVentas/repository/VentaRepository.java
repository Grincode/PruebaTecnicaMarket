package com.minimarket.GestionVentas.repository;

import com.minimarket.GestionVentas.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
