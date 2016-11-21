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

    private String desc_pais;

    //entity
    @Id
    @Column(name = "id_pais")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_pais;

    public Integer getId_pais() {
        return id_pais;
    }

    public void setId_pais(Integer id_pais) {
        this.id_pais = id_pais;
    }

    public String getDesc_pais() {
        return desc_pais;
    }

    public void setDesc_pais(String desc_pais) {
        this.desc_pais = desc_pais;
    }

}
