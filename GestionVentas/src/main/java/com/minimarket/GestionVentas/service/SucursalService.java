package com.minimarket.GestionVentas.service;

import com.minimarket.GestionVentas.dto.SucursalDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalService implements ISucursalService {
    @Override
    public List<SucursalDTO> traerSucursales() {
        return List.of();
    }

    @Override
    public SucursalDTO crearSucursal(SucursalDTO sucursalDto) {
        return null;
    }

    @Override
    public SucursalDTO actualizarSucursal(Long id, SucursalDTO sucursalDto) {
        return null;
    }

    @Override
    public void eliminarSucursal(Long id) {

    }
}
