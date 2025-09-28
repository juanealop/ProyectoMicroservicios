package com.proyectoMicro.ProyectoDatos.repositorios;
import com.proyectoMicro.ProyectoDatos.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
    Cliente findByEmail(String email);
}
