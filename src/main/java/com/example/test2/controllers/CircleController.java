package com.example.test2.controllers;

import com.example.test2.model.Circle;
import com.example.test2.services.CircleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CircleController {
    public final CircleService circleService;

    public CircleController(CircleService circleService) {
        this.circleService = circleService;
    }

    @GetMapping("/")
    public String mainPage(){
        return "index";
    }

    @PostMapping("/long")
    public String getLong(Circle circle, Model model){
        String res = String.valueOf(circleService.getLong(circle.getRadius()));
        model.addAttribute("result", res);
        return "index";
    }

    @PostMapping("/square")
    public String getSquare(Circle circle, Model model){
        String res = String.valueOf(circleService.getSquare(circle.getRadius()));
        model.addAttribute("result", res);
        return "index";
    }


}
