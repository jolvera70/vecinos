package com.jb.vecinos.controller.estado;

import com.jb.vecinos.entities.Colonia;
import com.jb.vecinos.services.estado.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jolvera on 21/11/2016.
 */
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @RequestMapping(value = "/rootCatalogoEstado", method = RequestMethod.GET)
    public Model catalogoEstado(Model model, final int idPais) {
        model.addAttribute("catalogoEstado", estadoService.getCatalogoByPais(idPais));
        return model;

    }
}
