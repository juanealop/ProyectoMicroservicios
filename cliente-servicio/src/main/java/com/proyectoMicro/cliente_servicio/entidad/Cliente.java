package com.proyectoMicro.cliente_servicio.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true) 
    private String userId;
    
    @Column(nullable = false)
    private String nombre; 

    @Column(nullable = false)
    private int edad;  
    

    @Column(length = 1000)
    private String descripcion; 
    
    
    @Column(length = 500)
    private String foto;  


    

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}          