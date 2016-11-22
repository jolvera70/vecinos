package com.jb.vecinos.services.calle;

import com.jb.vecinos.entities.Calle;
import com.jb.vecinos.entities.Estado;
import com.jb.vecinos.repository.calle.CalleDao;
import com.jb.vecinos.repository.colonia.ColoniaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bvelasco on 20/11/2016.
 */
@Service
public class CalleServiceImpl implements CalleService {

    @Autowired
    CalleDao calleDao;

    @Override
    public void insertCalle(Calle calle) {
        calleDao.add(calle);
    }

    public List<Calle> listCalle() {
        return calleDao.listCalle();
    }

    public List<Calle> getCatalogo() {
        return calleDao.getCatalogo();
    }
}
