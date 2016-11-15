package com.jb.vecinos.controller;

import com.jb.vecinos.entities.Colony;
import com.jb.vecinos.services.RootService;
import com.jb.vecinos.services.colony.ColonyService;
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
 * Created by jolvera on 26/10/2016.
 */
@Controller
public class RootController {

    final static Logger logger = Logger.getLogger(RootController.class);
    final static String jspPath  = "root/";

    @Autowired
    private RootService rootService;

    @Autowired
    private ColonyService colonyService;

    @RequestMapping(value={"","/","/login"}, method = RequestMethod.GET)
    public String login(Model model)
    {
        return "login";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model)
    {
        logger.info("Welcome home :D");
        model.addAttribute("now", ":D");
        return "home";
    }


    @RequestMapping(value="/403", method = RequestMethod.GET)
    public String accessDenied(Model model) {
        final Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        final String name = auth.getName(); //get logged in username
        final String messageError ="You "+name+" do not have permission to access this page!";
        model.addAttribute("message",messageError);
        return "403";

    }

    @RequestMapping(value="/loginError", method = RequestMethod.GET)
    public String loginError(Model model) {
        model.addAttribute("error", "Invalid user or password");
        return "login";

    }

    @RequestMapping(value="/rootColonyConfiguration", method = RequestMethod.GET)
    public String addAdminUser(Model model) {
        List<Colony> colonyList =  colonyService.listColony();
        for(Colony c:colonyList){
            logger.info(c.getName());
        }
        return jspPath+"colonyConfiguration";

    }

}
