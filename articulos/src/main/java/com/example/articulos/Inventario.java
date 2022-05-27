package com.example.articulos;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Inventario", schema = "articulos")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id", nullable = false)
    private int id;
    private String nombreArticulo;
    private String tipo;
    private String lugar;

    public Inventario() {

    }

    public Inventario(int id, String nombreArticulo, String tipo, String lugar) {
        this.id = id;
        this.nombreArticulo = nombreArticulo;
        this.tipo = tipo;
        this.lugar = lugar;
        
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreArticulo() {
        return this.nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /*@OneToMany(mappedBy = "Inventario", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ServicioPrestamo> servicioPrestamo;



    public List<ServicioPrestamo> getServicioPrestamo() {
        return this.servicioPrestamo;
    }

    public void setServicioPrestamo(List<ServicioPrestamo> servicioPrestamo) {
        this.servicioPrestamo = servicioPrestamo;
    }*/


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombreArticulo='" + getNombreArticulo() + "'" +
            ", tipoArticulo='" + getTipo() + "'" +
            ", Lugar='" + getLugar() + "'" +
            //", Servicio='" + getServicioPrestamo() + "'" +
            "}";
    }

    
}
