package com.proyectoMicro.marketplace_servicio.repositorio;

import com.proyectoMicro.marketplace_servicio.entidad.ServicioTuristico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ServicioRepository extends JpaRepository<ServicioTuristico, Long> {

    List<ServicioTuristico> findByCategoriaIgnoreCase(String categoria);

    List<ServicioTuristico> findByNombreContainingIgnoreCase(String nombre);
}