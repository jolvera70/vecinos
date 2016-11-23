package com.jb.vecinos.controller.vecino;


import com.jb.vecinos.entities.Vecino;
import com.jb.vecinos.services.calle.CalleService;
import com.jb.vecinos.services.vecino.VecinoService;
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
    private VecinoService vecinoService;
    @Autowired
    private CalleService calleService;

    final static Logger logger = Logger.getLogger(VecinoController.class);
    final static String jspPath  = "admin/vecino/";

    @RequestMapping(value="/adminVecinoForm", method = RequestMethod.GET)
    public ModelAndView addVecino(Model model) {
        model.addAttribute("vecino",new Vecino());
        model.addAttribute("catalogoCalle", calleService.getCatalogo());
        return new ModelAndView(jspPath+"vecinoForm", "command", new Vecino());

    }

    @RequestMapping(value="/adminAddVecino", method = RequestMethod.POST)
    public String addVecino(@ModelAttribute("SpringWeb")Vecino vecino,
                             ModelMap model) {
        vecino.setEsVisible(new Integer("1"));
        //vecino.setRequiereFactura(new Integer("1"));
        vecino.setCasaRentada(new Integer("1"));
        vecino.setIdEstatus(new Integer("1"));
        logger.info("insert to vecino"+model.values());
        try
        {
            logger.info("vecino requiere factura:"+vecino.getRequiereFactura());
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
