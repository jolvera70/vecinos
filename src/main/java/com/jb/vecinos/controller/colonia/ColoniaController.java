package com.jb.vecinos.controller.colonia;


import com.jb.vecinos.entities.Colonia;
import com.jb.vecinos.services.colonia.ColoniaService;
import com.jb.vecinos.services.pais.PaisService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jolvera on 13/11/2016.
 */
@Controller
public class ColoniaController {

    @Autowired
    private ColoniaService coloniaService;

    @Autowired
    private PaisService paisService;

    final static Logger logger = Logger.getLogger(ColoniaController.class);
    final static String jspPath = "root/colonia/";

    @RequestMapping(value = "/rootColoniaForm", method = RequestMethod.GET)
    public ModelAndView addAdminUser(Model model) {
        model.addAttribute("catalogoPais", paisService.getCatalogo());
        return new ModelAndView(jspPath + "coloniaForm", "command", new Colonia());

    }

    @RequestMapping(value = "/rootAddColonia", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") Colonia colonia,
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
}
