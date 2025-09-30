package com.proyectoMicro.carro_servicio.repositorio;

import com.proyectoMicro.carro_servicio.entidad.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
