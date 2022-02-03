package com.frowProject.frowAssignment.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

public class FashionLineController {

   @GetMapping("/cart")
   public String getSingleDesigner(Model model, HttpServletRequest request) {
       return "cart";
   }
}
