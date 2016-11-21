package com.jb.vecinos.repository.vecino;

import com.jb.vecinos.entities.Vecino;

import java.util.List;

/**
 * Created by bvelasco on 20/11/2016.
 */
public interface VecinoDao {

    public void add(Vecino vecino);

    public List<Vecino> listVecinos();

}
