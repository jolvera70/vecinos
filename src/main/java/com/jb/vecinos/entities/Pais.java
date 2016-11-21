package com.jb.vecinos.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jolvera on 20/11/2016.
 */
@Entity
@Table(name = "cat_pais")
public class Pais implements Serializable {

    private static final long serialVersionUID = 1L;

    private String descPais;

    //entity
    @Id
    @Column(name = "idPais")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPais;


    public String getDescPais() {
        return descPais;
    }

    public void setDescPais(String descPais) {
        this.descPais = descPais;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }
}
