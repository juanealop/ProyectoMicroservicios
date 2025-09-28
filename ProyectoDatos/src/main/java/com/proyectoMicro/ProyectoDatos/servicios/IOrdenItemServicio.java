package com.proyectoMicro.ProyectoDatos.servicios;



import com.proyectoMicro.ProyectoDatos.entidades.OrdenItem;
import java.util.List;
import java.util.Optional;

public interface IOrdenItemServicio {
    OrdenItem guardar(OrdenItem item);
    List<OrdenItem> listar();
    Optional<OrdenItem> buscarPorId(Long id);
    List<OrdenItem> buscarPorOrden(Long ordenId);
    OrdenItem actualizar(Long id, OrdenItem item);
    void eliminar(Long id);
}

