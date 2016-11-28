package com.jb.vecinos.services.inquilino;

import com.jb.vecinos.entities.Inquilino;
import com.jb.vecinos.repository.inquilino.InquilinoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by bvelasco on 20/11/2016.
 */
@Service
public class InquilinoServiceImpl implements InquilinoService {

    @Autowired
    InquilinoDao inquilinoDao;

    @Override
    public void insertInquilino(Inquilino inquilino) {
        inquilinoDao.add(inquilino);
    }

    @Override
    public Inquilino getInquilino() {
        return inquilinoDao.getInquilino();
    }

}
