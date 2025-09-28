package com.proyectoMicro.ProyectoDatos.repositorios;

import com.proyectoMicro.ProyectoDatos.entidades.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepositorio extends JpaRepository<Proveedor, Long> {
    Proveedor findByEmail(String email);
}
