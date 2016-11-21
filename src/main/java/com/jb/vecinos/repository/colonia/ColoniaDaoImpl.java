package com.jb.vecinos.repository.colonia;

import com.jb.vecinos.entities.Colonia;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
@Repository(value = "coloniaDao")
public class ColoniaDaoImpl implements ColoniaDao {

    final static Logger logger = Logger.getLogger(ColoniaDaoImpl.class);
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = false)
    @SuppressWarnings("unchecked")
    public void add(Colonia colonia) {
        try{
            logger.info("in DAO insert "+colonia.getNombre());
            em.persist(colonia);
            em.flush();
        }catch(Exception e){
            logger.error(e);
        }
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Colonia> listColonia()
    {
        List<Colonia> list = null;
        try
        {
            list = em.createQuery("select c from Colonia c order by c.id_colonia")
                    .getResultList();
        }
        catch(Exception e)
        {
            logger.error(e);
        }
        return list;
    }
}
