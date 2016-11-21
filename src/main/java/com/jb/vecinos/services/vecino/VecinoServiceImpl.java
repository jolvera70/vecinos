package com.jb.vecinos.services.vecino;

import com.jb.vecinos.entities.Colonia;
import com.jb.vecinos.entities.Vecino;
import com.jb.vecinos.repository.colonia.ColoniaDao;
import com.jb.vecinos.services.vecino.VecinosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bvelasco on 20/11/2016.
 */
@Service
public class VecinoServiceImpl implements VecinosService{

    @Autowired
    ColoniaDao coloniaDao;

    @Override
    public void insertVecino(Vecino vecino) {

    }

    @Override
    public List<Vecino> listVecino() {
        return null;
    }
}
