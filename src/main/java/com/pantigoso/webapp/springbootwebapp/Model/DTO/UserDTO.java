package com.pantigoso.webapp.springbootwebapp.Model.DTO;

import com.pantigoso.webapp.springbootwebapp.Model.UserService;

public class UserDTO {

    private String title;
    private UserService user;
    

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public UserService getUser() {
        return user;
    }
    public void setUser(UserService user) {
        this.user = user;
    }
    
}
