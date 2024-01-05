package com.pantigoso.webapp.springbootwebapp.Controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pantigoso.webapp.springbootwebapp.Model.UserService;
import com.pantigoso.webapp.springbootwebapp.Model.DTO.UserDTO;

@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping("/details-dto")
    public UserDTO detailsDto(){

        UserService user = new UserService("Miguel", "Pantigoso");
        UserDTO userDto = new UserDTO();

        userDto.setTitle("Perra vida");
        userDto.setUser(user);

        return userDto;
    }

    @GetMapping(path="/details-map")
    public Map<String,Object> detailsMap(){

        UserService user = new UserService("Migue", "Pantigoso");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo de SpringBoot");
        body.put("user", user);

        return body;
    }

    @GetMapping("/list")
    /**Ejemplo de lista  */
    public List<UserService> lista(){
        UserService user1 = new UserService("Jose", "Puraca");
        UserService user2 = new UserService("Giuseppe", "Richetti");
        UserService user3 = new UserService("Jhon", "Doe");

        List<UserService> users = Arrays.asList(user1,user2,user3);
        // List<UserService> users = new ArrayList<>();
        // users.add(user1);
        // users.add(user2);
        // users.add(user3);
           
        return users;
    }
}
