package com.proyectoMicro.ProyectoDatos.servicios;
import com.proyectoMicro.ProyectoDatos.entidades.Cliente;
import java.util.List;
import java.util.Optional;

public interface IClienteServicio {
    Cliente guardar(Cliente cliente);
    List<Cliente> listar();
    Optional<Cliente> buscarPorId(Long id);
    Optional<Cliente> buscarPorEmail(String email);
    Cliente actualizar(Long id, Cliente cliente);
    void eliminar(Long id);
}
