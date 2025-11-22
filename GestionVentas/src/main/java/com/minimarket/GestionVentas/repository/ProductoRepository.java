package com.minimarket.GestionVentas.repository;

import com.minimarket.GestionVentas.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
