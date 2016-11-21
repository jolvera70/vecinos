package com.jb.vecinos.entities;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * Created by bvelasco on 21/11/2016.
 */
public class Usuario extends User {
    private final int userid;
    public Usuario(String username, String password, Collection<? extends GrantedAuthority> authorities,int userId) {
        super(username, password, authorities);
        this.userid=userId;
    }

    public int getUserid() {
        return userid;
    }
}
