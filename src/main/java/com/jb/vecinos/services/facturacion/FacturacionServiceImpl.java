package com.jb.vecinos.services.facturacion;

import com.jb.vecinos.entities.Facturacion;
import com.jb.vecinos.repository.facturacion.FacturacionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by bvelasco on 20/11/2016.
 */
@Service
public class FacturacionServiceImpl implements FacturacionService {

    @Autowired
    FacturacionDao facturacionDao;

    @Override
    public void insertFacturacion(Facturacion facturacion) {
        facturacionDao.add(facturacion);
    }

    @Override
    public List<Facturacion> listFacturacion() {
        return facturacionDao.listFacturacion();
    }

}
