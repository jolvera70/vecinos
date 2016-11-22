package com.jb.vecinos.services.vecino;

import com.jb.vecinos.entities.Vecino;

import java.util.List;

/**
 * Created by bvelasco on 20/11/2016.
 */
public interface VecinoService {
    public void insertVecino(Vecino vecino);
    public List<Vecino> listVecino();
}
