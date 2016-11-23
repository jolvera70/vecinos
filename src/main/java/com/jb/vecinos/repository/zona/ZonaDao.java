package com.jb.vecinos.repository.zona;

import com.jb.vecinos.entities.Zona;

import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
public interface ZonaDao {

    public List<Zona> getCatalogo();

    public Zona getZonaById(final int idZona);

}
