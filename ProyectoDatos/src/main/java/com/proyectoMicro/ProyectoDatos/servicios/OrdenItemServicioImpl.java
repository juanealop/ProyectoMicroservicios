package com.proyectoMicro.ProyectoDatos.servicios;



import com.proyectoMicro.ProyectoDatos.entidades.OrdenItem;
import com.proyectoMicro.ProyectoDatos.repositorios.OrdenItemRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenItemServicioImpl implements IOrdenItemServicio {

    @Autowired
    private OrdenItemRepositorio repo;

    @Override
    public OrdenItem guardar(OrdenItem item) {
        return repo.save(item);
    }

    @Override
    public List<OrdenItem> listar() {
        return repo.findAll();
    }

    @Override
    public Optional<OrdenItem> buscarPorId(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<OrdenItem> buscarPorOrden(Long ordenId) {
        return repo.findByOrdenId(ordenId);
    }

    @Override
    public OrdenItem actualizar(Long id, OrdenItem item) {
        if (repo.existsById(id)) {
            item.setId(id);
            return repo.save(item);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
