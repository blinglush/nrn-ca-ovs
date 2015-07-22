package com.nrnca.controller;

import com.nrnca.model.Candidate;
import com.nrnca.service.CandidateService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;

/**
 * Created by shrestar on 2015-07-17.
 */
@Controller
//@RequestMapping("/admin")
public class AdminController {

//    @Autowired
    private CandidateService candidateService;

    private final String ADMIN_PAGE = "admin/administration";
    private static ArrayList<Candidate> candidates = new ArrayList<Candidate>();

//    static {
//        candidates.add(new Candidate("pramila", "basnet"));
//        candidates.add(new Candidate("surendra", "rijal"));
//        candidates.add(new Candidate("alok", "sharma"));
//    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(ModelMap model) {

        model.addAttribute("message", "Welcome to Site Administration");
//		model.addAttribute("counter", ++counter);
//		logger.debug("[welcome] counter : {}", counter);

        // Spring uses InternalResourceViewResolver and return back index.jsp
        return ADMIN_PAGE;

    }

//    @RequestMapping(value = "/candidates", method = RequestMethod.GET)
//    public String listCandidate(@ModelAttribute("cadlist") ModelMap modelMap) {
//        modelMap.addAttribute("candidateList", candidates);
//        modelMap.addAttribute("test", "test message");
//
//
//        return ADMIN_PAGE;
//    }

    @RequestMapping(value = "/saveCandidate", method = RequestMethod.POST)
    public String saveCandidate() {



        return ADMIN_PAGE;
    }
    }

