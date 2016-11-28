package com.jb.vecinos.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by bvelasco on 27/11/2016.
 */
@Entity
@Table(name = "facturacion")
public class Facturacion implements Serializable {

    private static final long serialVersionUID = 1L;

    private String rfc;
    private String direccion;
    private Integer idEstatus;

    //entity
    @Id
    @Column(name = "idFactura")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idFactura;


    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }
}
