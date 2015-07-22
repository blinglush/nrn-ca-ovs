package com.nrnca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;

import java.util.Map;

/**
 * Created by shrestar on 2015-07-21.
 */
@Controller
public class VotingController {

    @RequestMapping(name = "votenow")
    public ModelAndView votingPage(ModelMap modelMap) {

        modelMap.addAttribute("message","Lets vote now");
        String msg = "Voting Page";
        Map m = new HashMap();
        m.put("message",msg);
        return new ModelAndView("votenow",m);
    }

}
