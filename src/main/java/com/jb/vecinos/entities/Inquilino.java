package com.jb.vecinos.entities;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Modify by bvelasco on 27/11/2016
 */

@Entity
@Table(name = "inquilino")
public class Inquilino implements Serializable {

    private static final long serialVersionUID = 1L;

    private String inqNombre;
    private String inqApellidoPaterno;
    private String inqApellidoMaterno;
    private String inqNumCelular;
   private String inqEmail;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean inqRequiereFactura;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean inqEsVisible;
    private Integer idFactura;
    private Integer idEstatus;
    //private Date fechaRegistro;

    //entity
    @Id
    @Column(name = "idInquilino")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idInquilino;


    public String getInqNombre() {
        return inqNombre;
    }

    public void setInqNombre(String inqNombre) {
        this.inqNombre = inqNombre;
    }

    public String getInqApellidoPaterno() {
        return inqApellidoPaterno;
    }

    public void setInqApellidoPaterno(String inqApellidoPaterno) {
        this.inqApellidoPaterno = inqApellidoPaterno;
    }

    public String getInqApellidoMaterno() {
        return inqApellidoMaterno;
    }

    public void setInqApellidoMaterno(String inqApellidoMaterno) {
        this.inqApellidoMaterno = inqApellidoMaterno;
    }

    public String getInqNumCelular() {
        return inqNumCelular;
    }

    public void setInqNumCelular(String inqNumCelular) {
        this.inqNumCelular = inqNumCelular;
    }

    public String getInqEmail() {
        return inqEmail;
    }

    public void setInqEmail(String inqEmail) {
        this.inqEmail = inqEmail;
    }

    public boolean isInqRequiereFactura() {
        return inqRequiereFactura;
    }

    public void setInqRequiereFactura(boolean inqRequiereFactura) {
        this.inqRequiereFactura = inqRequiereFactura;
    }

    public boolean isInqEsVisible() {
        return inqEsVisible;
    }

    public void setInqEsVisible(boolean inqEsVisible) {
        this.inqEsVisible = inqEsVisible;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Integer getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(Integer idInquilino) {
        this.idInquilino = idInquilino;
    }
}
