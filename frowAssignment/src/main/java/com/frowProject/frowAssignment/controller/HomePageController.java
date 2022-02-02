package com.frowProject.frowAssignment.controller;

import com.frowProject.frowAssignment.models.Designer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class HomePageController {

    @GetMapping("/")
    public String getDesigner(Model model, HttpServletRequest request) {
//        I'm pretty sure right here is where we pull in the database info. I hard coded the designer info.
        model.addAttribute("designers", Arrays.asList(
                new Designer( 1,"Designer 1", "info about designer 1", "Location1"),
                new Designer( 2,"Designer 2", "info about designer 2", "Location2"),
                new Designer( 3,"Designer 3", "info about designer 3", "Location3"),
                new Designer( 4,"Designer 4", "info about designer 4", "Location4")
        ));
        return "homepage";
    }

    @GetMapping("/designer")
    public String getSingleDesigner(Model model, HttpServletRequest request) {
        return "designer";
    }

    @GetMapping("/cart")
    public String getSingleDesigner(Model model) {
        return "cart";
    }

    @GetMapping("/confirmation")
    public String getSingleDesigner() {
        return "confirmation";
    }

}
