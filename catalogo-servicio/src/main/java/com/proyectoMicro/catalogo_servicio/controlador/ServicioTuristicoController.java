package com.proyectoMicro.catalogo_servicio.controlador;



import com.proyectoMicro.catalogo_servicio.entidad.ServicioTuristico;
import com.proyectoMicro.catalogo_servicio.servicio.ServicioTuristicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalogo")
public class ServicioTuristicoController {

    private final ServicioTuristicoService service;

    public ServicioTuristicoController(ServicioTuristicoService service) {
        this.service = service;
    }

    @GetMapping
    public List<ServicioTuristico> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ServicioTuristico getById(@PathVariable Long id) {
        return service.getById(id).orElse(null);
    }

    @PostMapping
    public ServicioTuristico crear(@RequestBody ServicioTuristico servicio) {
        return service.crear(servicio);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }

    @GetMapping("/categoria/{categoria}")
    public List<ServicioTuristico> buscarPorCategoria(@PathVariable String categoria) {
        return service.buscarPorCategoria(categoria);
    }

    @GetMapping("/ubicacion/{ubicacion}")
    public List<ServicioTuristico> buscarPorUbicacion(@PathVariable String ubicacion) {
        return service.buscarPorUbicacion(ubicacion);
    }
}
