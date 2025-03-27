package application.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import org.springframework.http.HttpStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.List;
import application.Model.User;
import application.Service.AppService;

@RestController
@RequestMapping("/api")
public class ApplicationController {
    @Autowired
    @Qualifier("appServiceImpl")
    AppService appService;    
    
    @GetMapping
    public String front (){
        return "Welcome";
    }

    @GetMapping(path = "users")
    public List<User> getUsers() {
        return appService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return appService.getUser(id);
    }

    @PostMapping(path = "add_user")
    @ResponseStatus(code = HttpStatus.CREATED)
    public User addUser(@RequestBody User user) {
        appService.insertUser(user);
        return user;
    }
}
