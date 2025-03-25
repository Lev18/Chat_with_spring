package application.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.List;
import application.Component.User;
import application.Service.AppService;

@RestController
@RequestMapping("/")
public class ApplicationController {
    @Autowired
    @Qualifier("appServiceImpl")
    AppService appService;

    List<User> users = new ArrayList<>();
    
    @GetMapping(path = "users")
    public List<User> getUsers() {
        return appService.getUsers();
    }

    @PostMapping(path = "add_user")
    @ResponseStatus(code = HttpStatus.CREATED)
    public User addUser(@RequestBody User user) {
        users.add(user);
        return user;
    }
}
