package com.minimarket.GestionVentas.service;

import com.minimarket.GestionVentas.dto.ProductoDTO;
import com.minimarket.GestionVentas.mapper.Mapper;
import com.minimarket.GestionVentas.model.Producto;
import com.minimarket.GestionVentas.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductoService implements IProductoService{

    @Autowired
    private ProductoRepository repository;

    @Override
    public List<ProductoDTO> traerProductos() {
        return repository.findAll().stream().map(Mapper::toDTO).toList();
    }

    @Override
    public ProductoDTO crearProducto(ProductoDTO productoDto) {
        Producto prod = Producto.builder()
                .nombre(productoDto.getNombre())
                .categoria(productoDto.getCategoria())
                .precio(productoDto.getPrecio())
                .cantidad(productoDto.getCantidad())
                .build();
        return Mapper.toDTO(repository.save(prod));


    }

    @Override
    public ProductoDTO actualizarProducto(Long id, ProductoDTO productoDTO) {
        return null;
    }

    @Override
    public void eliminarProducto(Long id) {

    }
}
