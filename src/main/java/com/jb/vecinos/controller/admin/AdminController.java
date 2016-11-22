package com.jb.vecinos.controller.admin;

import com.jb.vecinos.entities.Calle;
import com.jb.vecinos.entities.Vecino;
import com.jb.vecinos.services.calle.CalleService;
import com.jb.vecinos.services.vecino.VecinoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jolvera on 12/11/2016.
 * Modify by bvelasco on 20/11/2016.
 */
@Controller
public class AdminController {

    final static Logger logger = Logger.getLogger(AdminController.class);
    final static String jspPath  = "admin/";

    @Autowired
    private VecinoService vecinoService ;

    @RequestMapping(value="/homeAdmin", method = RequestMethod.GET)
    public String addAdminVecino(Model model) {
        model.addAttribute("vecinosList",vecinoService.listVecino());
        return jspPath+"homeAdmin";
    }

    @Autowired
    private CalleService calleService;

    @RequestMapping(value="/configAdmin", method = RequestMethod.GET)
    public String configAdmin(Model model) {
        List<Calle> calleList =  calleService.listCalle();
        model.addAttribute("calleList",calleList);
        return jspPath+"config/configAdmin";
    }
}
