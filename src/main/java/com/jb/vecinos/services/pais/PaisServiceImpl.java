package com.jb.vecinos.services.pais;

import com.jb.vecinos.entities.Colonia;
import com.jb.vecinos.entities.Pais;
import com.jb.vecinos.repository.colonia.ColoniaDao;
import com.jb.vecinos.repository.pais.PaisDao;
import com.jb.vecinos.services.colonia.ColoniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
@Service
public class PaisServiceImpl implements PaisService{

    @Autowired
    PaisDao paisDao;

    public List<Pais> getCatalogo() {
        return paisDao.getCatalogo();
    }

    public Pais getPaisById(final int idPais) {
        return paisDao.getPaisById(idPais);
    }
}
