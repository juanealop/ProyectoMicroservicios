package com.proyectoMicro.marketplace_servicio.controlador; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.proyectoMicro.marketplace_servicio.repositorio.ServicioRepository;
import com.proyectoMicro.marketplace_servicio.servicio.ServicioService;
import com.proyectoMicro.marketplace_servicio.entidad.ServicioTuristico;

@RestController
@RequestMapping("/servicios")
@CrossOrigin(origins = "*")
public class ServicioController {

    private final ServicioService servicioService;

    public ServicioController(ServicioService servicioService) {
        this.servicioService = servicioService;
    }

    @PostMapping
    public ResponseEntity<ServicioTuristico> crearServicio(@RequestBody ServicioTuristico servicio) {
        return ResponseEntity.ok(servicioService.crearServicio(servicio));
    }

    @GetMapping
    public ResponseEntity<List<ServicioTuristico>> listarServicios() {
        return ResponseEntity.ok(servicioService.listarServicios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServicioTuristico> obtenerPorId(@PathVariable Long id) {
        return servicioService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<List<ServicioTuristico>> buscarPorCategoria(@PathVariable String categoria) {
        return ResponseEntity.ok(servicioService.buscarPorCategoria(categoria));
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<ServicioTuristico>> buscarPorNombre(@RequestParam String nombre) {
        return ResponseEntity.ok(servicioService.buscarPorNombre(nombre));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServicioTuristico> actualizarServicio(@PathVariable Long id,
                                                                 @RequestBody ServicioTuristico servicio) {
        ServicioTuristico actualizado = servicioService.actualizarServicio(id, servicio);
        return (actualizado != null) ? ResponseEntity.ok(actualizado)
                                     : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarServicio(@PathVariable Long id) {
        servicioService.eliminarServicio(id);
        return ResponseEntity.noContent().build();
    }
}