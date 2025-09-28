package com.proyectoMicro.ProyectoDatos.repositorios;



import com.proyectoMicro.ProyectoDatos.entidades.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrdenRepositorio extends JpaRepository<Orden, Long> {
    List<Orden> findByClienteId(Long clienteId);
}
