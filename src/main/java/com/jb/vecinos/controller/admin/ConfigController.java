package com.jb.vecinos.controller.admin;

import com.jb.vecinos.entities.Calle;
import com.jb.vecinos.entities.Colonia;
import com.jb.vecinos.entities.Usuario;
import com.jb.vecinos.entities.Vecino;
import com.jb.vecinos.services.calle.CalleService;
import com.jb.vecinos.services.vecino.VecinosService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by jolvera on 12/11/2016.
 * Modify by bvelasco on 20/11/2016.
 */
@Controller
public class ConfigController {

    final static Logger logger = Logger.getLogger(ConfigController.class);
    final static String jspPath  = "admin/config/";

    @Autowired
    private CalleService calleService;

    @RequestMapping(value = "/configCalleForm", method = RequestMethod.GET)
    public ModelAndView addCalle(Model model) {
        return new ModelAndView(jspPath + "calleForm", "command", new Calle());

    }
    @RequestMapping(value = "/addCalle", method = RequestMethod.POST)
    public String addCalle(@ModelAttribute("SpringWeb") Calle calle,
                             ModelMap model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        //Usuario usuario = (Usuario)auth.getPrincipal();
        calle.setIduser(new Integer("1"));
        calle.setIdColonia(new Integer("1"));
        logger.info("insert to calle");
        try {
            calleService.insertCalle(calle);
        } catch (Exception e) {
            logger.error("ERROR INSERT calle " + e.getMessage());
        }
        model.addAttribute("Nombre", calle.getDescCalle());
        return jspPath + "calleResult";
    }
}
