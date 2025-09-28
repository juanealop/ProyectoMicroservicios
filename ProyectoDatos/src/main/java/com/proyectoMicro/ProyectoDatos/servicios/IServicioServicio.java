package com.proyectoMicro.ProyectoDatos.servicios;

import com.proyectoMicro.ProyectoDatos.entidades.Servicio;
import java.util.List;
import java.util.Optional;

public interface IServicioServicio {
    Servicio guardar(Servicio servicio);
    List<Servicio> listar();
    Optional<Servicio> buscarPorId(Long id);
    List<Servicio> buscarPorCategoria(String categoria);
    List<Servicio> buscarPorProveedor(Long proveedorId);
    Servicio actualizar(Long id, Servicio servicio);
    void eliminar(Long id);
}

