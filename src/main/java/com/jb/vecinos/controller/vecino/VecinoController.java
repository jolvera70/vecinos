package com.jb.vecinos.controller.vecino;


import com.jb.vecinos.entities.Colonia;
import com.jb.vecinos.entities.Vecino;
import com.jb.vecinos.services.vecino.VecinosService;
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
public class VecinoController {

    @Autowired
    private VecinosService vecinoService;

    final static Logger logger = Logger.getLogger(VecinoController.class);
    final static String jspPath  = "admin/vecino/";

    @RequestMapping(value="/adminVecinoForm", method = RequestMethod.GET)
    public ModelAndView addVecino(Model model) {
        return new ModelAndView(jspPath+"vecinoForm", "command", new Vecino());

    }

    @RequestMapping(value="/adminAddVecino", method = RequestMethod.POST)
    public String addVecino(@ModelAttribute("SpringWeb")Vecino vecino,
                             ModelMap model) {
        logger.info("insert to vecino");
        try
        {
            vecinoService.insertVecino(vecino);
        }
        catch (Exception e)
        {
            logger.error("ERROR INSERT Vecino "+e);
        }
        model.addAttribute("Vecino", vecino.getNombre()+" "+vecino.getApellidoPaterno()+" "+vecino.getApellidoMaterno());
        return jspPath+"vecinoResult";
    }
}
