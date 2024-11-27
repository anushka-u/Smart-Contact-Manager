package com.smart.contact.manager.SmartContactManager.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    private static final Logger logger = LoggerFactory.getLogger(PageController.class);

    @GetMapping("/home")
    public String home(Model model) {
        logger.info("Home page was accessed");// Logs when the method is hit
        model.addAttribute("name","Substring Technologies");
        model.addAttribute("githubRepo","https://github.com/anushka-u");
        return "home";  // Matches the home.html template
    }
}
