package application.Service;


import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import application.Component.User;
import application.Repository.UserRepo;

@Component("appServiceImpl")
@Service
public class AppServiceImpl implements AppService {
    
    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User addUser(User user) {
        return user;
    }
}
