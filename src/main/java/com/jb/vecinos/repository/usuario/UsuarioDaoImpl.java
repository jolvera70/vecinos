package com.jb.vecinos.repository.usuario;

import com.jb.vecinos.entities.Usuario;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by jolvera on 24/11/2016.
 */
@Repository(value = "usuarioDao")
public class UsuarioDaoImpl implements UsuarioDao {

    final static Logger logger = Logger.getLogger(UsuarioDaoImpl.class);
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public Usuario findUsuarioByName(final String username) {
        Usuario usuario = null;
        try
        {
            usuario = (Usuario) em.createQuery("select c from Usuario c where c.username = '"+username+"'").getSingleResult();
        }
        catch(Exception e)
        {
            logger.error(e);
        }
        return usuario;
    }
}
