package com.jb.vecinos.repository.municipio;

import com.jb.vecinos.entities.Municipio;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
@Repository(value = "municipioDao")
public class MunicipioDaoImpl implements MunicipioDao {

    final static Logger logger = Logger.getLogger(MunicipioDaoImpl.class);
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Municipio> getCatalogo()
    {
        List<Municipio> list = null;
        try
        {
            list = em.createQuery("select c from Municipio c order by c.descMunicipio")
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
    public Municipio getMunicipioByIdAndEstado(final int idMunicipio,final int idEstado)
    {
        Municipio municipio = null;
        try
        {
            municipio = (Municipio) em.createQuery("select c from Municipio c where c.idMunicipio="+idMunicipio+
                    " and c.idEstado="+idEstado+" order by c.descMunicipio")
                    .getSingleResult();
        }
        catch(Exception e)
        {
            logger.error(e);
        }
        return municipio;
    }
}
