package com.jb.vecinos.services.estado;

import com.jb.vecinos.entities.Estado;
import com.jb.vecinos.repository.estado.EstadoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
@Service
public class EstadoServiceImpl implements EstadoService{

    @Autowired
    EstadoDao estadoDao;

    public List<Estado> getCatalogo() {
        return estadoDao.getCatalogo();
    }

    public List<Estado> getCatalogoByPais(final int idPais) {
        return estadoDao.getCatalogoByPais(idPais);
    }
}
