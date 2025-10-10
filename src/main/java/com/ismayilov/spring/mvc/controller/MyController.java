package com.ismayilov.spring.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/first-view")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askName")
    public String askNameEmployee() {
        return "ask-employee-view";
    }

    @RequestMapping("/showName")
    public String showNameEmployee() {
        return "show-name-employee-view";
    }

}
