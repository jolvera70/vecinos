package com.jb.vecinos;

import org.springframework.stereotype.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by jolvera on 26/10/2016.
 */
@Controller
public class VecinosController {

    private final Logger logger = LoggerFactory.getLogger(VecinosController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        logger.debug("index()");
        return "redirect:/welcome";
    }

    // list page
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome(Model model) {

        logger.debug("showAllUsers()");
        return "welcome";

    }
}
