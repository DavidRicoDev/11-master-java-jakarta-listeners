package es.davidrico.jakarta.listeners.servicios;

import es.davidrico.jakarta.listeners.modelos.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listar();
    Optional<Producto> porId(Long id);
}
