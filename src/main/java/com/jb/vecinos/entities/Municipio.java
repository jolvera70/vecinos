package com.jb.vecinos.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jolvera on 20/11/2016.
 */
@Entity
@Table(name = "cat_municipio")
public class Municipio implements Serializable {

    private static final long serialVersionUID = 1L;

    private String descMunicipio;
    private Integer idEstado;

    //entity
    @Id
    @Column(name = "idMunicipio")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idMunicipio;


    public String getDescMunicipio() {
        return descMunicipio;
    }

    public void setDescMunicipio(String descMunicipio) {
        this.descMunicipio = descMunicipio;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
}
