package com.proyectoMicro.ProyectoDatos.repositorios;

import com.proyectoMicro.ProyectoDatos.entidades.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ServicioRepositorio extends JpaRepository<Servicio, Long> {
    List<Servicio> findByCategoria(String categoria);
    List<Servicio> findByProveedorId(Long proveedorId);
}
