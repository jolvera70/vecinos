package com.jb.vecinos;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by jolvera on 26/10/2016.
 */
@Controller
public class RootController {

    final static Logger logger = Logger.getLogger(RootController.class);

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

}
