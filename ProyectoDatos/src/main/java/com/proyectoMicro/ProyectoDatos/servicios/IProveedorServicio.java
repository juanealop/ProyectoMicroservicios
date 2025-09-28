package com.proyectoMicro.ProyectoDatos.servicios;


import com.proyectoMicro.ProyectoDatos.entidades.Proveedor;
import java.util.List;
import java.util.Optional;

public interface IProveedorServicio {
    Proveedor guardar(Proveedor proveedor);
    List<Proveedor> listar();
    Optional<Proveedor> buscarPorId(Long id);
    Optional<Proveedor> buscarPorEmail(String email);
    Proveedor actualizar(Long id, Proveedor proveedor);
    void eliminar(Long id);
}

