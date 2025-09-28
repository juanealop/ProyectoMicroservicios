package com.proyectoMicro.ProyectoDatos.servicios;



import com.proyectoMicro.ProyectoDatos.entidades.Orden;
import com.proyectoMicro.ProyectoDatos.repositorios.OrdenRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenServicioImpl implements IOrdenServicio {

    @Autowired
    private OrdenRepositorio repo;

    @Override
    public Orden guardar(Orden orden) {
        return repo.save(orden);
    }

    @Override
    public List<Orden> listar() {
        return repo.findAll();
    }

    @Override
    public Optional<Orden> buscarPorId(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Orden> buscarPorCliente(Long clienteId) {
        return repo.findByClienteId(clienteId);
    }

    @Override
    public Orden actualizar(Long id, Orden orden) {
        if (repo.existsById(id)) {
            orden.setId(id);
            return repo.save(orden);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
