package com.jb.vecinos.repository.estado;

import com.jb.vecinos.entities.Estado;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
@Repository(value = "estadoDao")
public class EstadoDaoImpl implements EstadoDao {

    final static Logger logger = Logger.getLogger(EstadoDaoImpl.class);
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Estado> getCatalogo()
    {
        List<Estado> list = null;
        try
        {
            list = em.createQuery("select c from Estado c order by c.descEstado")
                    .getResultList();
        }
        catch(Exception e)
        {
            logger.error(e);
        }
        return list;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public Estado getEstadoById(final int idEstado)
    {
        Estado estado = null;
        try
        {
            estado = em.find(Estado.class,idEstado);
        }
        catch(Exception e)
        {
            logger.error(e);
        }
        return estado;
    }
}
