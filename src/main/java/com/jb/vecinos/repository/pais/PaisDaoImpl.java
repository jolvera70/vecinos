package com.jb.vecinos.repository.pais;

import com.jb.vecinos.entities.Pais;
import com.jb.vecinos.repository.colonia.ColoniaDao;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
@Repository(value = "paisDao")
public class PaisDaoImpl implements PaisDao {

    final static Logger logger = Logger.getLogger(PaisDaoImpl.class);
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Pais> getCatalogo()
    {
        List<Pais> list = null;
        try
        {
            list = em.createQuery("select c from Pais c order by c.descPais")
                    .getResultList();
        }
        catch(Exception e)
        {
            logger.error(e);
        }
        return list;
    }
}
