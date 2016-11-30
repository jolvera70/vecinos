package com.jb.vecinos.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jolvera on 20/11/2016.
 */
@Entity
@Table(name = "cat_estado")
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;

    private String descEstado;
    private Integer idPais;
    @Transient
    private List<Colonia> colonias = new ArrayList<Colonia>();


    //entity
    @Id
    @Column(name = "idEstado")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEstado;


    public String getDescEstado() {
        return descEstado;
    }

    public void setDescEstado(String descEstado) {
        this.descEstado = descEstado;
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

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "colonia")
    public void setColonias(List<Colonia> colonias) {
        this.colonias = colonias;
    }
}
