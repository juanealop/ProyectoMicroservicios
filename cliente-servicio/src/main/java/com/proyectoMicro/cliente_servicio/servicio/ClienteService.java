package com.proyectoMicro.cliente_servicio.servicio;

import com.proyectoMicro.cliente_servicio.entidad.Cliente;

import com.proyectoMicro.cliente_servicio.repositorio.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> getAllClientes() {
        return repository.findAll();
    }

    public Optional<Cliente> getClienteById(Long id) {
        return repository.findById(id);
    }

    public Cliente crearCliente(Cliente cliente) {
        return repository.save(cliente);
    }
}
