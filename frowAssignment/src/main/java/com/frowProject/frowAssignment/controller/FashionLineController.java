package com.frowProject.frowAssignment.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import com.frowProject.frowAssignment.models.Outfit;

public class FashionLineController {

 @GetMapping("/fashion-line")
   public String getOutfits(Model modelOutfits, HttpServletRequest request) {
    modelOutfits.addAttribute("outfits", Arrays.asList(
        new Outfit(1231, 9816541, 4564561, "shirt", "elegant", 4054600),
        new Outfit(5645, 98465311, 45465361, "shirt", "elegant", 43564000),
        new Outfit(1546231, 984511, 4565461, "shirt", "elegant", 4005640),
        new Outfit(1453231, 9814561, 455661, "shirt", "elegant", 40654300),
        new Outfit(12345631, 981154, 4456561, "shirt", "elegant", 4000)
));

       return "fashion-line";
   }
   
//     @GetMapping("/cart")
//    public String getSingleDesigner(Model model, HttpServletRequest request) {
//        return "cart";
//    }
}
