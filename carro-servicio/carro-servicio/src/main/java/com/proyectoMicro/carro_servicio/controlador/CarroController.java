package com.proyectoMicro.carro_servicio.controlador;


import com.proyectoMicro.carro_servicio.entidad.Carro;
import com.proyectoMicro.carro_servicio.entidad.CarroItem;
import com.proyectoMicro.carro_servicio.servicio.CarroService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private final CarroService service;

    public CarroController(CarroService service) {
        this.service = service;
    }

    @PostMapping
    public Carro crearCarro(@RequestBody Carro carro) {
        return service.crearCarro(carro);
    }

    @GetMapping("/{id}")
    public Carro getCarro(@PathVariable Long id) {
        return service.getCarro(id).orElse(null);
    }

    @PostMapping("/{carroId}/items")
    public Carro agregarItem(@PathVariable Long carroId, @RequestBody CarroItem item) {
        return service.agregarItem(carroId, item);
    }

    @DeleteMapping("/{id}")
    public void eliminarCarro(@PathVariable Long id) {
        service.eliminarCarro(id);
    }
}