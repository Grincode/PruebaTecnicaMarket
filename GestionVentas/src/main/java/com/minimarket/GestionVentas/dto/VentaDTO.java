package com.minimarket.GestionVentas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VentaDTO {
    private Long id;
    private LocalDate fecha;
    private String estado;
    private Long idSucursal;
    private List<DetalleVentaDTO> detalle;
    private Double total;

}
