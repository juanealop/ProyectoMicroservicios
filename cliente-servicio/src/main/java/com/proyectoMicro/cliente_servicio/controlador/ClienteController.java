package com.proyectoMicro.cliente_servicio.controlador;

import com.proyectoMicro.cliente_servicio.entidad.Cliente;


import com.proyectoMicro.cliente_servicio.servicio.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> getAllClientes() {
        return service.getAllClientes();
    }

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return service.crearCliente(cliente);
    }

    @GetMapping("/{id}")
    public Cliente getCliente(@PathVariable Long id) {
        return service.getClienteById(id).orElse(null);
    }
}