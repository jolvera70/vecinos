package com.jb.vecinos.services.municipio;

import com.jb.vecinos.entities.Municipio;
import com.jb.vecinos.repository.municipio.MunicipioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
@Service
public class MunicipioServiceImpl implements MunicipioService{

    @Autowired
    MunicipioDao municipioDao;

    public List<Municipio> getCatalogo() {
        return municipioDao.getCatalogo();
    }
}
