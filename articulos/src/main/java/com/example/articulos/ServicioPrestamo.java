package com.example.articulos;

import javax.persistence.*;

@Entity
@Table(name = "ServicioPrestamo", schema = "articulos")
public class ServicioPrestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPrestamo", nullable = false)
    private int idPrestamo;
    private String articuloPrestado;
    private String prestatario;
    private String lugarP;
    private String horaPrestamo;


    public ServicioPrestamo() {
    }

    public ServicioPrestamo(int idPrestamo, String articuloPrestado) {
        this.idPrestamo = idPrestamo;
        this.articuloPrestado = articuloPrestado;
    }


    public ServicioPrestamo(String articuloPrestado) {
        this.articuloPrestado = articuloPrestado;
    }
    


    public int getIdPrestamo() {
        return this.idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getArticuloPrestado() {
        return this.articuloPrestado;
    }

    public void setArticuloPrestado(String articuloPrestado) {
        this.articuloPrestado = articuloPrestado;
    }


    public String getPrestatario() {
        return this.prestatario;
    }

    public void setPrestatario(String prestatario) {
        this.prestatario = prestatario;
    }

    public String getLugarP() {
        return this.lugarP;
    }

    public void setLugarP(String lugarP) {
        this.lugarP = lugarP;
    }

    public String getHoraPrestamo() {
        return this.horaPrestamo;
    }

    public void setHoraPrestamo(String horaPrestamo) {
        this.horaPrestamo = horaPrestamo;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Inventario Inventario;


    public Inventario getInventario() {
        return this.Inventario  ;
    }

    public void setInventario(Inventario Inventario) {
        this.Inventario = Inventario;
    }
}
