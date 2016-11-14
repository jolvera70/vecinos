package com.jb.vecinos.controller;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jolvera on 12/11/2016.
 */
@Controller
public class AdminController {

    final static Logger logger = Logger.getLogger(AdminController.class);
    final static String jspPath  = "admin/";

    @RequestMapping(value = "/admin_home", method = RequestMethod.GET)
    public String user_home(Model model)
    {
        final Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        final String name = auth.getName(); //get logged in username
        logger.info("Welcome admin_home :D"+name);
        model.addAttribute("username", name);
        return jspPath+"admin_home";
    }
}
