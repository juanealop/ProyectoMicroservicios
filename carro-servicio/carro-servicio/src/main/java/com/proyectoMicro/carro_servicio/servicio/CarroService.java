package com.proyectoMicro.carro_servicio.servicio;

import com.proyectoMicro.carro_servicio.entidad.Carro;
import com.proyectoMicro.carro_servicio.entidad.CarroItem;
import com.proyectoMicro.carro_servicio.repositorio.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarroService {

    private final CarroRepository repository;

    public CarroService(CarroRepository repository) {
        this.repository = repository;
    }

    public Carro crearCarro(Carro carro) {
        return repository.save(carro);
    }

    public Optional<Carro> getCarro(Long id) {
        return repository.findById(id);
    }

    public Carro agregarItem(Long carroId, CarroItem item) {
        Carro carro = repository.findById(carroId).orElseThrow();
        item.setCarro(carro);
        carro.getItems().add(item);
        return repository.save(carro);
    }

    public void eliminarCarro(Long id) {
        repository.deleteById(id);
    }
}
