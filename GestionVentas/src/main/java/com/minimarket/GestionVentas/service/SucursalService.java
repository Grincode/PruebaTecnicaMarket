package com.minimarket.GestionVentas.service;

import com.minimarket.GestionVentas.dto.SucursalDTO;
import com.minimarket.GestionVentas.exception.NotFoundException;
import com.minimarket.GestionVentas.mapper.Mapper;
import com.minimarket.GestionVentas.model.Sucursal;
import com.minimarket.GestionVentas.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalService implements ISucursalService {

    @Autowired
    private SucursalRepository repository;

    @Override
    public List<SucursalDTO> traerSucursales() {
        return repository.findAll()
                .stream()
                .map(Mapper::toDTO)
                .toList();
    }

    @Override
    public SucursalDTO crearSucursal(SucursalDTO sucursalDto) {
        Sucursal suc = Sucursal.builder()
                .nombre(sucursalDto.getNombre())
                .direccion(sucursalDto.getDireccion())
                .build();

        return Mapper.toDTO(repository.save(suc));
    }

    @Override
    public SucursalDTO actualizarSucursal(Long id, SucursalDTO sucursalDto) {
        Sucursal suc = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Sucursal no encontrada"));

        suc.setNombre(sucursalDto.getNombre());
        suc.setDireccion(sucursalDto.getDireccion());

        return Mapper.toDTO(repository.save(suc));
    }

    @Override
    public void eliminarSucursal(Long id) {
        if (!repository.existsById(id))
            throw new NotFoundException("Sucursal no encontrada");

        repository.deleteById(id);
    }
}