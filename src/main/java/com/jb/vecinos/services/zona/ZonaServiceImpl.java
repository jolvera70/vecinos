package com.jb.vecinos.services.zona;

import com.jb.vecinos.entities.Zona;
import com.jb.vecinos.repository.zona.ZonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
@Service
public class ZonaServiceImpl implements ZonaService{

    @Autowired
    ZonaDao zonaDao;

    public List<Zona> getCatalogo() {
        return zonaDao.getCatalogo();
    }

    public Zona getZonaById(final int idZona) {
        return zonaDao.getZonaById(idZona);
    }
}
