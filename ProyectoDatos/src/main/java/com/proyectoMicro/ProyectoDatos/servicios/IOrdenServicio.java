package com.proyectoMicro.ProyectoDatos.servicios;



import com.proyectoMicro.ProyectoDatos.entidades.Orden;
import java.util.List;
import java.util.Optional;

public interface IOrdenServicio {
    Orden guardar(Orden orden);
    List<Orden> listar();
    Optional<Orden> buscarPorId(Long id);
    List<Orden> buscarPorCliente(Long clienteId);
    Orden actualizar(Long id, Orden orden);
    void eliminar(Long id);
}
