package com.jb.vecinos.repository.estado;

import com.jb.vecinos.entities.Estado;

import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
public interface EstadoDao {

    public List<Estado> getCatalogo();

    public List<Estado> getCatalogoByPais(final int idPais);

}
