package com.jb.vecinos.services.user;

import com.jb.vecinos.entities.Usuario;

import java.util.List;

/**
 * Created by jolvera on 24/11/2016.
 */
public interface UserService {

    public Usuario findUsuarioByName(final String userName);
}
