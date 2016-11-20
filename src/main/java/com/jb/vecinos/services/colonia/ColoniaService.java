package com.jb.vecinos.services.colonia;

import com.jb.vecinos.entities.Colonia;

import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
public interface ColoniaService {
    public void insertColonia(Colonia colonia);
    public List<Colonia> listColonia();
}
