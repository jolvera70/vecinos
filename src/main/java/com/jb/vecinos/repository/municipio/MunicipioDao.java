package com.jb.vecinos.repository.municipio;

import com.jb.vecinos.entities.Municipio;

import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
public interface MunicipioDao {

    public List<Municipio> getCatalogo();

    public Municipio getMunicipioByIdAndEstado(final int idMunicipio,final int idEstado);

}
