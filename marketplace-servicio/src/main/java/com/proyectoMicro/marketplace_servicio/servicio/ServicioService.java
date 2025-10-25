package com.proyectoMicro.marketplace_servicio.servicio; 
import com.proyectoMicro.marketplace_servicio.entidad.ServicioTuristico;
import com.proyectoMicro.marketplace_servicio.repositorio.ServicioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioService {

    private final ServicioRepository servicioRepository;

    public ServicioService(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }

    public ServicioTuristico crearServicio(ServicioTuristico servicio) {
        return servicioRepository.save(servicio);
    }

    public List<ServicioTuristico> listarServicios() {
        return servicioRepository.findAll();
    }

    public Optional<ServicioTuristico> obtenerPorId(Long id) {
        return servicioRepository.findById(id);
    }

    public List<ServicioTuristico> buscarPorCategoria(String categoria) {
        return servicioRepository.findByCategoriaIgnoreCase(categoria);
    }

    public List<ServicioTuristico> buscarPorNombre(String nombre) {
        return servicioRepository.findByNombreContainingIgnoreCase(nombre);
    }

    public ServicioTuristico actualizarServicio(Long id, ServicioTuristico servicioActualizado) {
        return servicioRepository.findById(id)
                .map(servicio -> {
                    servicio.setNombre(servicioActualizado.getNombre());
                    servicio.setDescripcion(servicioActualizado.getDescripcion());
                    servicio.setCategoria(servicioActualizado.getCategoria());
                    servicio.setPrecio(servicioActualizado.getPrecio());
                    servicio.setUbicacion(servicioActualizado.getUbicacion());
                    servicio.setDisponibilidad(servicioActualizado.getDisponibilidad());
                    servicio.setProveedorId(servicioActualizado.getProveedorId());
                    servicio.setImagenUrl(servicioActualizado.getImagenUrl());
                    return servicioRepository.save(servicio);
                })
                .orElse(null);
    }

    public void eliminarServicio(Long id) {
        servicioRepository.deleteById(id);
    }
}