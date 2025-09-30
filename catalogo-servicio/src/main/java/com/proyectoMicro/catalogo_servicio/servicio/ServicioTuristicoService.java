package com.proyectoMicro.catalogo_servicio.servicio;

import com.proyectoMicro.catalogo_servicio.entidad.ServicioTuristico;
import com.proyectoMicro.catalogo_servicio.repositorio.ServicioTuristicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioTuristicoService {

    private final ServicioTuristicoRepository repository;

    public ServicioTuristicoService(ServicioTuristicoRepository repository) {
        this.repository = repository;
    }

    public List<ServicioTuristico> getAll() {
        return repository.findAll();
    }

    public Optional<ServicioTuristico> getById(Long id) {
        return repository.findById(id);
    }

    public ServicioTuristico crear(ServicioTuristico servicio) {
        return repository.save(servicio);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    public List<ServicioTuristico> buscarPorCategoria(String categoria) {
        return repository.findByCategoria(categoria);
    }

    public List<ServicioTuristico> buscarPorUbicacion(String ubicacion) {
        return repository.findByUbicacion(ubicacion);
    }
}