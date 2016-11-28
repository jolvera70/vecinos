package com.jb.vecinos.entities;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Modify by bvelasco on 20/11/2016
 */

@Entity
@Table(name = "vecino")
public class Vecino implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Integer idCalle;
    private String numCasa;
    private String numCelular;
    private String numTelefono;
    private String email;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean requiereFactura;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean casaRentada;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean esVisible;
    private Integer idInquilino;
    private Integer idFactura;
    private Integer idEstatus;
    private String rutaFoto;
    //private Date fechaRegistro;


    //entity
    @Id
    @Column(name = "idVecino")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idVecino;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Integer getIdCalle() {
        return idCalle;
    }

    public void setIdCalle(Integer idCalle) {
        this.idCalle = idCalle;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getRequiereFactura() {
        return requiereFactura;
    }

    public void setRequiereFactura(boolean requiereFactura) {
        this.requiereFactura = requiereFactura;
    }

    public boolean getCasaRentada() {
        return casaRentada;
    }

    public void setCasaRentada(boolean casaRentada) {
        this.casaRentada = casaRentada;
    }

    public boolean getEsVisible() {
        return esVisible;
    }

    public void setEsVisible(boolean esVisible) {
        this.esVisible = esVisible;
    }

    public Integer getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(Integer idInquilino) {
        this.idInquilino = idInquilino;
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

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public Integer getIdVecino() {
        return idVecino;
    }

    public void setIdVecino(Integer idVecino) {
        this.idVecino = idVecino;
    }


}
