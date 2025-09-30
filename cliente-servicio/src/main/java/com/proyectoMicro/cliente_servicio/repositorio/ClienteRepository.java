package com.proyectoMicro.cliente_servicio.repositorio;

import com.proyectoMicro.cliente_servicio.entidad.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
