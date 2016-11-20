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


    //entity
    @Id
    @Column(name = "id_colonia")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idColonia;

    public Integer getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(Integer idColonia) {
        this.idColonia = idColonia;
    }

    public String getNombre() { return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
