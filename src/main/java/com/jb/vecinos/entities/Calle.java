package com.jb.vecinos.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by bvelasco on 20/11/2016.
 */
@Entity
@Table(name = "cat_admin_calle")
public class Calle implements Serializable {

    private static final long serialVersionUID = 1L;

    private String descCalle;
    private Integer iduser;
    private Integer idColonia;
    //entity
    @Id
    @Column(name = "idCalle")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCalle;


    public String getDescCalle() {
        return descCalle;
    }

    public void setDescCalle(String descCalle) {
        this.descCalle = descCalle;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public Integer getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(Integer idColonia) {
        this.idColonia = idColonia;
    }

    public Integer getIdCalle() {
        return idCalle;
    }

    public void setIdCalle(Integer idCalle) {
        this.idCalle = idCalle;
    }
}
