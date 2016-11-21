package com.jb.vecinos.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jolvera on 20/11/2016.
 */
@Entity
@Table(name = "cat_zona")
public class Zona implements Serializable {

    private static final long serialVersionUID = 1L;

    private String descZona;

    //entity
    @Id
    @Column(name = "idZona")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idZona;

    public String getDescZona() {
        return descZona;
    }

    public void setDescZona(String descZona) {
        this.descZona = descZona;
    }

    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }
}
