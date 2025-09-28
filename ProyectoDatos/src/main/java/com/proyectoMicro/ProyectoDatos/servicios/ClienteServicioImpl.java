package com.proyectoMicro.ProyectoDatos.servicios;



import com.proyectoMicro.ProyectoDatos.entidades.Cliente;
import com.proyectoMicro.ProyectoDatos.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicioImpl implements IClienteServicio {

    @Autowired
    private ClienteRepositorio repo;

    @Override
    public Cliente guardar(Cliente cliente) {
        return repo.save(cliente);
    }

    @Override
    public List<Cliente> listar() {
        return repo.findAll();
    }

    @Override
    public Optional<Cliente> buscarPorId(Long id) {
        return repo.findById(id);
    }

    @Override
    public Optional<Cliente> buscarPorEmail(String email) {
        return Optional.ofNullable(repo.findByEmail(email));
    }

    @Override
    public Cliente actualizar(Long id, Cliente cliente) {
        if (repo.existsById(id)) {
            cliente.setId(id);
            return repo.save(cliente);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
