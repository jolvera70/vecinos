package com.jb.vecinos.controller;

import com.jb.vecinos.entities.Vecino;
import com.jb.vecinos.services.vecino.VecinosService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jolvera on 12/11/2016.
 */
@Controller
public class AdminController {

    final static Logger logger = Logger.getLogger(AdminController.class);
    final static String jspPath  = "admin/";

    @Autowired
    private VecinosService vecinosService;

    @RequestMapping(value="/adminVecinosHome", method = RequestMethod.GET)
    public String addAdminVecino(Model model) {
        List<Vecino> vecinosList =  vecinosService.listVecino();
        model.addAttribute("vecinosList",vecinosList);
        return jspPath+"vecinosHome";
    }
}
