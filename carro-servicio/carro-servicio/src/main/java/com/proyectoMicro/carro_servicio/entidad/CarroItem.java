package com.proyectoMicro.carro_servicio.entidad;

import jakarta.persistence.*;

@Entity
public class CarroItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long servicioId;
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getServicioId() { return servicioId; }
    public void setServicioId(Long servicioId) { this.servicioId = servicioId; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public Carro getCarro() { return carro; }
    public void setCarro(Carro carro) { this.carro = carro; }
}
