package com.proyectoMicro.carro_servicio.entidad;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long clienteId;

    @OneToMany(mappedBy = "carro", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CarroItem> items;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getClienteId() { return clienteId; }
    public void setClienteId(Long clienteId) { this.clienteId = clienteId; }

    public List<CarroItem> getItems() { return items; }
    public void setItems(List<CarroItem> items) { this.items = items; }
}
