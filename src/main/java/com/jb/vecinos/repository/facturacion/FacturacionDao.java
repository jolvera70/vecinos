package com.jb.vecinos.repository.facturacion;

import com.jb.vecinos.entities.Facturacion;

import java.util.List;

/**
 * Created by bvelasco on 27/11/2016.
 */
public interface FacturacionDao {

    public void add(Facturacion facturacion);

    public List<Facturacion> listFacturacion();

}
