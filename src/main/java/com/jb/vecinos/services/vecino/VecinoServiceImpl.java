package com.jb.vecinos.services.vecino;

import com.jb.vecinos.entities.Vecino;
import com.jb.vecinos.repository.vecino.VecinoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bvelasco on 20/11/2016.
 */
@Service
public class VecinoServiceImpl implements VecinoService {

    @Autowired
    VecinoDao vecinoDao;

    @Override
    public void insertVecino(Vecino vecino) {
        vecinoDao.add(vecino);
    }

    @Override
    public List<Vecino> listVecino() {
        return vecinoDao.listVecinos();
    }
}
