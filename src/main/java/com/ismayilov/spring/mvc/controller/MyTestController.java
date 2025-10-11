package com.ismayilov.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/test")
public class MyTestController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askName")
    public String askNameEmployee() {
        return "ask-employee-view";
    }

//    @RequestMapping("/showName")
//    public String showNameEmployee() {
//        return "show-name-employee-view";
//    }

//    @RequestMapping("/showName")
//    public String showNameEmployee(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr." + empName;
//        model.addAttribute("empName", empName);
//        return "show-name-employee-view";
//    }

    @RequestMapping("/showName")
    public String showNameEmployee(@RequestParam("employeeName") String empName, Model model) {
        empName = "Mr." + empName;
        model.addAttribute("empName", empName);
        return "show-name-employee-view";
    }

}
