package com.proyectoMicro.proveedor_servicio.servicio;

import com.proyectoMicro.proveedor_servicio.entidad.Proveedor;
import com.proyectoMicro.proveedor_servicio.repositorio.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService {

    private final ProveedorRepository repository;

    public ProveedorService(ProveedorRepository repository) {
        this.repository = repository;
    }

    public List<Proveedor> getAll() {
        return repository.findAll();
    }

    public Optional<Proveedor> getById(Long id) {
        return repository.findById(id);
    }

    public Proveedor crear(Proveedor proveedor) {
        return repository.save(proveedor);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}

