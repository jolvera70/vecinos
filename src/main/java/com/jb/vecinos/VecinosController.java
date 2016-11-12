package com.jb.vecinos;

import org.springframework.stereotype.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by jolvera on 26/10/2016.
 */
@Controller
public class VecinosController {

    private final Logger logger = LoggerFactory.getLogger(VecinosController.class);

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(Model model) {
        return "login";
    }


    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login(Model model) {
        return "login";
    }


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home :D :D :D! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);
        model.addAttribute("now", formattedDate);

        return "home";
    }


    @RequestMapping(value="/403", method = RequestMethod.GET)
    public ModelAndView accesssDenied(ModelAndView  model) {
        if (model != null) {
            model.addObject("msg", "Hi " + model.toString()
                    + ", you do not have permission to access this page!");
        } else {
            model.addObject("msg",
                    "You do not have permission to access this page!");
        }

        model.setViewName("403");
        return model;

    }

    @RequestMapping(value="/loginError", method = RequestMethod.GET)
    public String loginError(Model model) {
        model.addAttribute("error", "Invalid user or password");
        return "login";

    }

}
