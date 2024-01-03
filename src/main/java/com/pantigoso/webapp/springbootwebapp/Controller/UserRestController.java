package com.pantigoso.webapp.springbootwebapp.Controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pantigoso.webapp.springbootwebapp.Model.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping("/user")
    public Map<String,Object> test(){

        UserService user = new UserService("Migue", "Pantigoso");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo de SpringBoot");
        body.put("user", user);

        return body;
    }
}
