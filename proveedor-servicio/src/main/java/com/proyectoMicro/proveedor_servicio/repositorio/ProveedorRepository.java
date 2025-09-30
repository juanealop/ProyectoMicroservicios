package com.proyectoMicro.proveedor_servicio.repositorio;

import com.proyectoMicro.proveedor_servicio.entidad.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
}