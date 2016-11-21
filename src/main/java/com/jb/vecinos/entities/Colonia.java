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
    private Integer idPais;
    private Integer idEstado;
    private Integer idMunicipio;
    private Integer idZona;
    private String cp;


    //entity
    @Id
    @Column(name = "idColonia")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idColonia;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Integer getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(Integer idColonia) {
        this.idColonia = idColonia;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
}
