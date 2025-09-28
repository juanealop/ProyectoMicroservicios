package com.proyectoMicro.ProyectoDatos.servicios;



import com.proyectoMicro.ProyectoDatos.entidades.Servicio;
import com.proyectoMicro.ProyectoDatos.repositorios.ServicioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioServicioImpl implements IServicioServicio {

    @Autowired
    private ServicioRepositorio repo;

    @Override
    public Servicio guardar(Servicio servicio) {
        return repo.save(servicio);
    }

    @Override
    public List<Servicio> listar() {
        return repo.findAll();
    }

    @Override
    public Optional<Servicio> buscarPorId(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Servicio> buscarPorCategoria(String categoria) {
        return repo.findByCategoria(categoria);
    }

    @Override
    public List<Servicio> buscarPorProveedor(Long proveedorId) {
        return repo.findByProveedorId(proveedorId);
    }

    @Override
    public Servicio actualizar(Long id, Servicio servicio) {
        if (repo.existsById(id)) {
            servicio.setId(id);
            return repo.save(servicio);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}

