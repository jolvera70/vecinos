package com.jb.vecinos.services.user;

import com.jb.vecinos.entities.Usuario;
import com.jb.vecinos.repository.usuario.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jolvera on 24/11/2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UsuarioDao usuarioDao;

    @Override
    public Usuario findUsuarioByName(final String username) {
        return usuarioDao.findUsuarioByName(username);
    }
}
