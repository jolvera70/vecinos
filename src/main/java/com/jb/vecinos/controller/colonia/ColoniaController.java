package com.jb.vecinos.controller.colonia;


import com.jb.vecinos.entities.Colonia;
import com.jb.vecinos.entities.colonia.ColoniaBase;
import com.jb.vecinos.services.colonia.ColoniaService;
import com.jb.vecinos.services.estado.EstadoService;
import com.jb.vecinos.services.municipio.MunicipioService;
import com.jb.vecinos.services.pais.PaisService;
import com.jb.vecinos.services.zona.ZonaService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by jolvera on 13/11/2016.
 */
@Controller
public class ColoniaController {

    @Autowired
    private ColoniaService coloniaService;

    @Autowired
    private PaisService paisService;

    @Autowired
    private EstadoService estadoService;

    @Autowired
    private MunicipioService municipioService;

    @Autowired
    private ZonaService zonaService;

    final static Logger logger = Logger.getLogger(ColoniaController.class);
    final static String jspPath = "root/colonia/";

    @RequestMapping(value="/rootColoniaConfiguration", method = RequestMethod.GET)
    public String coloniaConfiguration(Model model) {
         model.addAttribute("coloniaList", getInformacion(coloniaService.listColonia()));
        return jspPath+"coloniaConfiguration";
    }

    @RequestMapping(value = "/rootColoniaForm", method = RequestMethod.GET)
    public ModelAndView ColoniaForm(Model model) {
        model.addAttribute("catalogoPais", paisService.getCatalogo());
        model.addAttribute("catalogoEstado", estadoService.getCatalogo());
        model.addAttribute("catalogoMunicipio", municipioService.getCatalogo());
        model.addAttribute("catalogoZona", zonaService.getCatalogo());
        return new ModelAndView(jspPath + "coloniaForm", "command", new Colonia());

    }


    @RequestMapping(value = "/rootAddColonia", method = RequestMethod.POST)
    public String addColonia(@ModelAttribute("SpringWeb") Colonia colonia,
                             ModelMap model) {
        logger.info("insert to colonia");
        try {
            coloniaService.insertColonia(colonia);
        } catch (Exception e) {
            logger.error("ERROR INSERT Colonia " + e.getMessage());
        }
        model.addAttribute("Nombre", colonia.getNombre());
        return jspPath + "coloniaResult";
    }

    private List<Colonia> getInformacion(final List<Colonia> colonias) {
        for (final ListIterator<Colonia> i = colonias.listIterator(); i.hasNext();) {
            final Colonia colonia = i.next();
            colonia.setPais(paisService.getPaisById(colonia.getIdPais()));
            colonia.setEstado(estadoService.getEstadoById(colonia.getIdEstado()));
            colonia.setZona(zonaService.getZonaById(colonia.getIdZona()));
            colonia.setMunicipio(municipioService.getMunicipioByIdAndEstado(colonia.getIdMunicipio(),colonia.getIdEstado()));
            i.set(colonia);
        }
        return colonias;
    }
}
