package com.jb.vecinos.services.facturacion;
import com.jb.vecinos.entities.Facturacion;


import java.util.List;

/**
 * Created by bvelasco on 27/11/2016.
 */
public interface FacturacionService {
    public void insertFacturacion(Facturacion facturacion);
    public List<Facturacion> listFacturacion();
}

