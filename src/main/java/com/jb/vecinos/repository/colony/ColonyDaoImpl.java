package com.jb.vecinos.repository.colony;

import com.jb.vecinos.entities.Colony;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
@Repository(value = "colonyDao")
public class ColonyDaoImpl implements ColonyDao{

    final static Logger logger = Logger.getLogger(ColonyDaoImpl.class);
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = false)
    @SuppressWarnings("unchecked")
    public void add(Colony colony) {
        try{
            logger.info("in DAO insert "+colony.getName()+":"+colony.getAddress());
            em.persist(colony);
            em.flush();
        }catch(Exception e){
            logger.error(e);
        }
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Colony> listColony()
    {
        List<Colony> list = null;
        try
        {
            list = em.createQuery("select c from Colony c order by c.idColony")
                    .getResultList();
        }
        catch(Exception e)
        {
            logger.error(e);
        }
        return list;
    }
}
