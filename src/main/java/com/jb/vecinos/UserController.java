package com.jb.vecinos;

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
public class UserController {

    final static Logger logger = Logger.getLogger(UserController.class);
    final static String jspPath  = "user/";

    @RequestMapping(value = "/user_home", method = RequestMethod.GET)
    public String user_home(Model model)
    {
        final Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        final String name = auth.getName(); //get logged in username
        logger.info("Welcome user_home :D"+name);
        model.addAttribute("username", name);
        return jspPath+"user_home";
    }
}
