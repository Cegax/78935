package com.example.articulos;

import javax.persistence.*;

import org.springframework.data.repository.CrudRepository;

public interface Iinventario extends CrudRepository<Inventario, Integer> {
    
}
