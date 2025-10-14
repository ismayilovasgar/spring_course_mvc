package com.ismayilov.spring.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/v1")
@RequestMapping("/employee")
public class MyController {
    // * MVC part 1 ****************************************************
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
//    *****************************************************************
    //    * MVC part 2 1 ****************************************************
//    @RequestMapping("/")
//    public String showFirstView() {
//        return "first-view";
//    }
//
//    @RequestMapping("/askName")
//    public String askNameEmployee() {
//        return "ask-employee-view";
//    }
//
//
//    @RequestMapping("/showName")
//    public String showNameEmployee(@RequestParam("employeeName") String empName, Model model) {
//        empName = "Mr." + empName;
//        model.addAttribute("empName", empName);
//        return "show-name-employee-view";
//    }
//    *****************************************************************

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetail")
    public String askNameEmployee(Model model) {
        Employee employee = new Employee();
        employee.setName("ASGAR");
        employee.setSalary(0);
        employee.setSurname("ISMAYILOV");
        String[] languageOptions = {"English", "Russian", "Turkish"};
        model.addAttribute("employee", employee);
        model.addAttribute("languageOptions", languageOptions);
        return "ask-employee-name-view";
    }


    @RequestMapping("/showDetail")
    public String showNameEmployee(@ModelAttribute("employee") Employee employee) {
        return "show-employee-name-view";
    }

}
