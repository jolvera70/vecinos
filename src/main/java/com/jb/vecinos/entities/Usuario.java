package com.jb.vecinos.entities;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by bvelasco on 21/11/2016.
 */
@Entity
@Table(name = "users")
public class Usuario  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "iduser")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iduser;
    private String username;



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
}
