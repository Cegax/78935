package com.example.articulos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ArticuloController {
    
    @Autowired
    Iinventario iinventario;

    @Autowired
    IservicioPrestamo IservicioPrestamo;


    @PostMapping("/agregarArticulo")
    public void agregarArticulo(@RequestBody Inventario inventario){
        iinventario.save(inventario);
    }
    
    @GetMapping("/mostrarInventario")
    public List<Inventario> mostrarInventario() {
        List<Inventario> bodega = new ArrayList<>();
        Iterable<Inventario> bodegaIterable = iinventario.findAll();
        for(Inventario inventario : bodegaIterable){
            Inventario inv = new Inventario(inventario.getId(), inventario.getNombreArticulo(), inventario.getTipo(), inventario.getLugar());
            bodega.add(inv);
        }
        //Inventario inv = new Inventario(2, "Carpetas", "Papeles", "Fei");
        //bodega.add(inv);
        //System.out.println(bodegaIterable[0]);
        return bodega;    
               
    }
    
    
}
