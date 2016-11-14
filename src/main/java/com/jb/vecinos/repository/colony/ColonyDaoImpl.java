package com.jb.vecinos.repository.colony;

import com.jb.vecinos.entities.Colony;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by jolvera on 13/11/2016.
 */
@Repository
@Transactional
public class ColonyDaoImpl implements ColonyDao{

    final static Logger logger = Logger.getLogger(ColonyDaoImpl.class);

    @PersistenceContext
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = false)
    public void add(Colony colony) {
        try{
            logger.info("in DAO insert "+colony.getName());
            em.persist(colony);
        }catch(Exception e){
            logger.error(e);
        }
    }
}
