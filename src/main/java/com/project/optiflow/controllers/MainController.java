package com.project.optiflow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Main Page");
        return "home";
    }

    @GetMapping({"/MyResumes"})
    public String MyResumes(Model model) {
        model.addAttribute("title", "My Resumes");
        return "MyResumes";
    }

    @GetMapping({"/Responses"})
    public String Responses(Model model) {
        model.addAttribute("title", "Responses");
        return "Responses";
    }

    @GetMapping({"/FAQs"})
    public String FAQs(Model model) {
        model.addAttribute("title", "FAQs");
        return "FAQs";
    }
}