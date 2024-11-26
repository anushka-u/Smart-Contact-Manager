package com.smart.contact.manager.SmartContactManager.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    private static final Logger logger = LoggerFactory.getLogger(PageController.class);

    @GetMapping("/home")
    public String home() {
        logger.info("Home page was accessed");  // Logs when the method is hit
        return "home";  // Matches the home.html template
    }
}
