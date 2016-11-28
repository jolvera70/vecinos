package com.jb.vecinos.repository.facturacion;

import com.jb.vecinos.entities.Facturacion;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by bvelasco on 27/11/2016.
 */
@Repository(value = "facturacionDao")
public class FacturacionDaoImpl implements FacturacionDao {

    final static Logger logger = Logger.getLogger(FacturacionDaoImpl.class);
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = false)
    @SuppressWarnings("unchecked")
    public void add(Facturacion facturacion) {
        try{
            logger.debug("in DAO insert "+facturacion.getRfc());
            em.persist(facturacion);
            em.flush();
        }catch(Exception e){
            logger.error(e);
        }
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Facturacion> listFacturacion() {
        List<Facturacion> list = null;
        try
        {
            list = em.createQuery("select c from Facturacion c order by c.idFacturacion")
                    .getResultList();
        }
        catch(Exception e)
        {
            logger.error(e);
        }
        return list;

    }
}
