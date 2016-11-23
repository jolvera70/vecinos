package com.jb.vecinos.entities.colonia;

import com.jb.vecinos.entities.*;
import com.jb.vecinos.services.estado.EstadoService;
import com.jb.vecinos.services.municipio.MunicipioService;
import com.jb.vecinos.services.pais.PaisService;
import com.jb.vecinos.services.zona.ZonaService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jolvera on 21/11/2016.
 */
public class ColoniaBase {

    private Pais pais;
    private Estado estado;
    private Zona zona;
    private Municipio municipio;

    @Autowired
    private PaisService paisService;

    @Autowired
    private EstadoService estadoService;

    @Autowired
    private ZonaService zonaService;

    @Autowired
    private MunicipioService municipioService;

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
}
