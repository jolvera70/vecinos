package com.jb.vecinos.repository.usuario;

import com.jb.vecinos.entities.Usuario;

/**
 * Created by jolvera on 24/11/2016.
 */
public interface UsuarioDao {

    public Usuario findUsuarioByName(final String username);
}
