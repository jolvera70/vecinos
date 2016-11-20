package com.jb.vecinos.repository.colonia;

import com.jb.vecinos.entities.Colonia;

import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
public interface ColoniaDao {

    public void add(Colonia colonia);

    public List<Colonia> listColonia();

}
