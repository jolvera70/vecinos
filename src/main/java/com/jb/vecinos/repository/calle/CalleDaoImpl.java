package com.jb.vecinos.repository.calle;

import com.jb.vecinos.entities.Calle;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by bvelasco on 20/11/2016.
 */
@Repository(value = "calleDao")
public class CalleDaoImpl implements CalleDao {

    final static Logger logger = Logger.getLogger(CalleDaoImpl.class);
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Calle> getCatalogo()
    {
        List<Calle> list = null;
        try
        {
            list = em.createQuery("select c from Calle c order by c.descCalle")
                    .getResultList();
        }
        catch(Exception e)
        {
            logger.error(e);
        }
        return list;
    }

    @Transactional(readOnly = false)
    @SuppressWarnings("unchecked")
    public void add(Calle calle) {
        try{
            logger.info("in DAO insert "+calle.getDescCalle());
            em.persist(calle);
            em.flush();
        }catch(Exception e){
            logger.error(e);
        }
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Calle> listCalle()
    {
        List<Calle> list = null;
        try
        {
            list = em.createQuery("select c from Calle c order by c.idCalle")
                    .getResultList();
        }
        catch(Exception e)
        {
            logger.error(e);
        }
        return list;
    }
}
