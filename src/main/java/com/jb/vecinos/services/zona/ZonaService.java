package com.jb.vecinos.services.zona;

import com.jb.vecinos.entities.Zona;

import java.util.List;

/**
 * Created by bvelasco on 20/11/2016.
 */
public interface ZonaService {

    public List<Zona> getCatalogo();

    public Zona getZonaById(final int idZona);
}
