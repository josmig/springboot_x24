package com.pantigoso.webapp.springbootwebapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pantigoso.webapp.springbootwebapp.Model.UserService;


@Controller
public class UserController {

    @GetMapping("/details")    
    public String details (Model model){

        UserService user = new UserService("Giuseppe", "Richetti");
        model.addAttribute("title", "My firts Webapp");
        model.addAttribute("title_content", "Bienvenidos a Spring Boot 3");
        model.addAttribute("user", user);
        
        return "details";
    }
        
}
