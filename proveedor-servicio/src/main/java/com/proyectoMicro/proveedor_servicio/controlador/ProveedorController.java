package com.proyectoMicro.proveedor_servicio.controlador;

import com.proyectoMicro.proveedor_servicio.entidad.Proveedor;
import com.proyectoMicro.proveedor_servicio.servicio.ProveedorService;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

    private final ProveedorService service;

    public ProveedorController(ProveedorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Proveedor> getAll() {
        return service.getAll();
    }

   @GetMapping("/{id}")
    public ResponseEntity<Proveedor> getById(@PathVariable Long id) {
    return service.getById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Proveedor crear(@RequestBody Proveedor proveedor) {
        return service.crear(proveedor);
    }  
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
