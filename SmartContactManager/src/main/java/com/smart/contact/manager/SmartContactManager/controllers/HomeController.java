package com.smart.contact.manager.SmartContactManager.controllers;


import com.smart.contact.manager.SmartContactManager.dao.UserRepository;
import com.smart.contact.manager.SmartContactManager.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        User user = new User();
        user.setUserName("Aadhya");
        user.setAbout("Working It proffesional");
        user.setRole("Developer");
        user.setPassword("123434");

        return "Working";
    }


}
