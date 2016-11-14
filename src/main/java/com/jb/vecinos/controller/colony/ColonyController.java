package com.jb.vecinos.controller.colony;

import com.jb.vecinos.entities.Colony;
import com.jb.vecinos.services.colony.ColonyService;
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
public class ColonyController {

    @Autowired
    private ColonyService colonyService;

    final static Logger logger = Logger.getLogger(ColonyController.class);
    final static String jspPath  = "root/colony/";

    @RequestMapping(value="/rootColonyForm", method = RequestMethod.GET)
    public ModelAndView addAdminUser(Model model) {
        return new ModelAndView(jspPath+"colonyForm", "command", new Colony());

    }

    @RequestMapping(value="/rootAddColony", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb")Colony colony,
                             ModelMap model) {
        logger.info("inserto to colony");
        try
        {
            colonyService.insertColony(colony);
        }
        catch (Exception e)
        {
            logger.error("ERROR INSERT COLONY "+e);
        }
        model.addAttribute("name", colony.getName());
        model.addAttribute("address", colony.getAddress());
        return jspPath+"colonyResult";
    }
}
