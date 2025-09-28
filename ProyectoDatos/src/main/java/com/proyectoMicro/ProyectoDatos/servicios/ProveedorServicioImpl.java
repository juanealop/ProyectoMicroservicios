package com.proyectoMicro.ProyectoDatos.servicios;



import com.proyectoMicro.ProyectoDatos.entidades.Proveedor;
import com.proyectoMicro.ProyectoDatos.repositorios.ProveedorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorServicioImpl implements IProveedorServicio {

    @Autowired
    private ProveedorRepositorio repo;

    @Override
    public Proveedor guardar(Proveedor proveedor) {
        return repo.save(proveedor);
    }

    @Override
    public List<Proveedor> listar() {
        return repo.findAll();
    }

    @Override
    public Optional<Proveedor> buscarPorId(Long id) {
        return repo.findById(id);
    }

    @Override
    public Optional<Proveedor> buscarPorEmail(String email) {
        return Optional.ofNullable(repo.findByEmail(email));
    }

    @Override
    public Proveedor actualizar(Long id, Proveedor proveedor) {
        if (repo.existsById(id)) {
            proveedor.setId(id);
            return repo.save(proveedor);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
