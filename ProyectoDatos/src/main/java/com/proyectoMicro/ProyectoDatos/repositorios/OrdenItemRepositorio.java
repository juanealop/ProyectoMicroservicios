package com.proyectoMicro.ProyectoDatos.repositorios;



import com.proyectoMicro.ProyectoDatos.entidades.OrdenItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrdenItemRepositorio extends JpaRepository<OrdenItem, Long> {
    List<OrdenItem> findByOrdenId(Long ordenId);
}

