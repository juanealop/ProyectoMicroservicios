package com.proyectoMicro.marketplace_servicio.entidad; 

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "servicios_turisticos")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ServicioTuristico { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(length = 1000)
    private String descripcion;

    private String categoria; // Alojamiento, Transporte, Alimentación, Paseo Ecológico, etc.

    private Double precio;

    private String ubicacion;

    private Boolean disponibilidad;

    private Long proveedorId; // Id del proveedor que ofrece este servicio

    private String imagenUrl; // Imagen principal (opcional)  


    
    // Getters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public Long getProveedorId() {
        return proveedorId;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setProveedorId(Long proveedorId) {
        this.proveedorId = proveedorId;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
    
}
