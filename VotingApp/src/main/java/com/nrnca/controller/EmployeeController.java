package com.nrnca.controller;

import com.nrnca.model.Employee;
import com.nrnca.service.EmployeeService;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by shrestar on 2015-06-17.
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private  EmployeeService employeeService;

    private final static Logger logger = LoggerFactory.getLogger(EmployeeController.class);


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee, BindingResult result) {

        logger.debug("adding employee");
        employee.setJoiningDate(new LocalDate(2015,03,12));

        if (employee != null) {
            employeeService.saveEmployee(employee);

        }


        return "redirect:addemployee";
    }


    @RequestMapping(value = { "/{name}", "/addemployee/{namea}" })
    public String index(@PathVariable String namea,Model model) {

        model.addAttribute("message", "welcome to voting system " + namea);

//        map.put("book", new Book());
//        map.put("bookList", bookService.listBooks());
        logger.info("listbooks");

        return "/addemployee";
    }

//    @RequestMapping(value = "/addemployee")
    public String index(@ModelAttribute("model") ModelMap model) {

        logger.debug( "/addemployee index called");

        return "/emp/addemployee";
    }

}
