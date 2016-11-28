package com.jb.vecinos.repository.inquilino;

import com.jb.vecinos.entities.Inquilino;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by bvelasco on 27/11/2016.
 */
@Repository(value = "inquilinoDao")
public class InquilinoDaoImpl implements InquilinoDao
{

    final static Logger logger = Logger.getLogger(InquilinoDaoImpl.class);
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = false)
    @SuppressWarnings("unchecked")
    public void add(Inquilino inquilino) {
        try{
            logger.debug("in DAO insert "+inquilino.getInqNombre());
            em.persist(inquilino);
            em.flush();
        }catch(Exception e){
            logger.error(e);
        }
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public Inquilino getInquilino() {
        Inquilino inq = null;
        try
        {
            inq= (Inquilino) em.createQuery("select c from Inquilino c order by c.idInquilino").getSingleResult();
        }
        catch(Exception e)
        {
            logger.error(e);
        }
        return inq;

    }
}
