package com.jb.vecinos.entities;

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
    private Integer idCatCalle;
    private String numCasa;
    private String numCelular;
    private String numTelefono;
    private String email;
    private Integer requiereFactura;
    private Integer casaRentada;
    private Integer esVisible;
    private Integer idInquilino;
    private Integer idFactura;
    private Integer idCatEstatus;
    private String rutaFoto;
    private Date fechaRegistro;

    //entity
    @Id
    @Column(name = "id_vecino")
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

    public Integer getIdCatCalle() {
        return idCatCalle;
    }

    public void setIdCatCalle(Integer idCatCalle) {
        this.idCatCalle = idCatCalle;
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

    public Integer getRequiereFactura() {
        return requiereFactura;
    }

    public void setRequiereFactura(Integer requiereFactura) {
        this.requiereFactura = requiereFactura;
    }

    public Integer getCasaRentada() {
        return casaRentada;
    }

    public void setCasaRentada(Integer casaRentada) {
        this.casaRentada = casaRentada;
    }

    public Integer getEsVisible() {
        return esVisible;
    }

    public void setEsVisible(Integer esVisible) {
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

    public Integer getIdCatEstatus() {
        return idCatEstatus;
    }

    public void setIdCatEstatus(Integer idCatEstatus) {
        this.idCatEstatus = idCatEstatus;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
