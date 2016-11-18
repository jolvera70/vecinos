package com.jb.vecinos.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jolvera on 13/11/2016.
 */

@Entity
@Table(name = "colony")
public class Colony implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String address;
    //entity
    @Id
    @Column(name = "idColony")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idColony;

    public Integer getIdColony() {
        return idColony;
    }

    public void setIdColony(Integer idColony) {
        this.idColony = idColony;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
