package com.jb.vecinos.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by jolvera on 13/11/2016.
 * Modify by bvelasco on 19/11/2016
 */

@Entity
@Table(name = "colonia")
public class Colonia implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nombre;
    private Integer id_pais;
    private Integer id_estado;
    private Integer id_ciudad;
    private Integer id_zona;
    private String cp;


    //entity
    @Id
    @Column(name = "id_colonia")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_colonia;

    public Integer getIdColonia() {
        return id_colonia;
    }

    public void setIdColonia(Integer id_colonia) {
        this.id_colonia = id_colonia;
    }

    public String getNombre() { return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdPais() {
        return id_pais;
    }

    public void setIdPais(Integer id_pais) {
        this.id_pais = id_pais;
    }

    public Integer getIdEstado() {
        return id_estado;
    }

    public void setIdEstado(Integer id_estado) {
        this.id_estado = id_estado;
    }

    public Integer getIdCiudad() {
        return id_ciudad;
    }

    public void setIdCiudad(Integer id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public Integer getIdZona() {
        return id_zona;
    }

    public void setIdZona(Integer id_zona) {
        this.id_zona = id_zona;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
}
