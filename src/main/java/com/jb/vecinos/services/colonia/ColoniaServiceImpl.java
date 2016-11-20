package com.jb.vecinos.services.colonia;

import com.jb.vecinos.entities.Colonia;
import com.jb.vecinos.repository.colonia.ColoniaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
@Service
public class ColoniaServiceImpl implements ColoniaService{

    @Autowired
    ColoniaDao coloniaDao;

    @Override
    public void insertColonia(Colonia colonia) {
        coloniaDao.add(colonia);
    }

    public List<Colonia> listColonia() {
        return coloniaDao.listColonia();
    }
}
