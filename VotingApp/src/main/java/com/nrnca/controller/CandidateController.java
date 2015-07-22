package com.nrnca.controller;

import com.nrnca.model.Candidate;
import com.nrnca.model.Contact;
import com.nrnca.service.CandidateService;
import com.nrnca.service.ContactService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by shrestar on 2015-07-20.
 */
@Controller
public class CandidateController extends MultiActionController {

    @Autowired
    private CandidateService candidateService;

    @Autowired
    private ContactService contactService;

    private final String ADMIN_PAGE="admin/administration";

    private final static Logger logger = LoggerFactory.getLogger(CandidateController.class);


    @RequestMapping(value = "candidate/add", method = RequestMethod.POST)
    public String add(HttpServletRequest request, HttpServletResponse response) {

        logger.info("candidate/add called");
        Contact contact = new Contact();
        contact.setFirstName(request.getParameter("fname"));
        contact.setMiddleName(request.getParameter("mname"));
        contact.setLastName(request.getParameter("lname"));
        contact.setEmail(request.getParameter("email"));
        contact.setPhone(Long.parseLong(request.getParameter("phone")));
        contact.setPostalCode(request.getParameter("postal"));
        contactService.saveContact(contact);

//        contactService.saveContact(contact);
        logger.info("contact ***** " +contact);

        Candidate candidate = new Candidate();
        candidate.setZone(request.getParameter("zone"));
        candidate.setContact(contact);
        contact.getCandidates().add(candidate);
        candidateService.saveCandidate(candidate);
        return ADMIN_PAGE;

    }

    @RequestMapping(value = "/candidates", method = RequestMethod.GET)
    public String listCandidate(@ModelAttribute("cadlist") ModelMap modelMap) {
//        modelMap.addAttribute("candidateList", candidates);
        modelMap.addAttribute("test", "test message");


        return ADMIN_PAGE;
    }
}
