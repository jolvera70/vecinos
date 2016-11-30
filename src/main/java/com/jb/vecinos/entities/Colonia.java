package com.jb.vecinos.entities;

import com.jb.vecinos.entities.colonia.ColoniaBase;
import com.jb.vecinos.services.pais.PaisService;
import org.springframework.beans.factory.annotation.Autowired;

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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPais", nullable = false)
    private Pais pais;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idEstado", nullable = false)
    private Estado estado;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idMunicipio", nullable = false)
    private Municipio municipio;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idZona", nullable = false)
    private Zona zona;
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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
}
