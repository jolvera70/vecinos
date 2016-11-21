package com.jb.vecinos.repository.zona;

import com.jb.vecinos.entities.Zona;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
@Repository(value = "zonaDao")
public class ZonaDaoImpl implements ZonaDao {

    final static Logger logger = Logger.getLogger(ZonaDaoImpl.class);
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Zona> getCatalogo()
    {
        List<Zona> list = null;
        try
        {
            list = em.createQuery("select c from Zona c order by c.descZona")
                    .getResultList();
        }
        catch(Exception e)
        {
            logger.error(e);
        }
        return list;
    }
}
