package com.proyectoMicro.catalogo_servicio.repositorio;

import com.proyectoMicro.catalogo_servicio.entidad.ServicioTuristico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicioTuristicoRepository extends JpaRepository<ServicioTuristico, Long> {
    List<ServicioTuristico> findByCategoria(String categoria);
    List<ServicioTuristico> findByUbicacion(String ubicacion);
}