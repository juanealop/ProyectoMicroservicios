package com.proyectoMicro.catalogo_servicio.servicio;

import com.proyectoMicro.catalogo_servicio.entidad.ServicioTuristico;
import com.proyectoMicro.catalogo_servicio.repositorio.ServicioTuristicoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioTuristicoService {

    private final ServicioTuristicoRepository repository;
     private final RestTemplate restTemplate;

    public ServicioTuristicoService(ServicioTuristicoRepository repository, RestTemplate restTemplate) {
        this.repository = repository;
        this.restTemplate = restTemplate;
    }

    public List<ServicioTuristico> getAll() {
        return repository.findAll();
    }

    public Optional<ServicioTuristico> getById(Long id) {
        return repository.findById(id);
    }

      public ServicioTuristico crear(ServicioTuristico servicio) {
    String url = "http://localhost:8080/api/proveedores/" + servicio.getProveedorId(); // a través del gateway
    try {
        restTemplate.getForObject(url, Object.class);
    } catch (Exception e) {
        throw new RuntimeException("Proveedor con id " + servicio.getProveedorId() + " no existe.");
    }

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