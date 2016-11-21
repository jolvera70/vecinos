package com.jb.vecinos.services.estado;

import com.jb.vecinos.entities.Estado;

import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
public interface EstadoService {
    public List<Estado> getCatalogo();
    public List<Estado> getCatalogoByPais(final int idPais);
}
