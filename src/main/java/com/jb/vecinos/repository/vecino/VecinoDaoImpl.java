package com.jb.vecinos.repository.vecino;

import com.jb.vecinos.entities.Vecino;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by bvelasco on 20/11/2016.
 */
@Repository(value = "vecinoDao")
public class VecinoDaoImpl implements VecinoDao {

    final static Logger logger = Logger.getLogger(VecinoDaoImpl.class);
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = false)
    @SuppressWarnings("unchecked")
    public void add(Vecino vecino) {
        try{
            logger.debug("in DAO insert "+vecino.getNombre());
            em.persist(vecino);
            em.flush();
        }catch(Exception e){
            logger.error(e);
        }
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Vecino> listVecinos() {
        List<Vecino> list = null;
        try
        {
            list = em.createQuery("select c from Vecino c order by c.idVecino")
                    .getResultList();
        }
        catch(Exception e)
        {
            logger.error(e);
        }
        return list;

    }
}
