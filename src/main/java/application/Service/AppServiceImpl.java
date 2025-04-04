package application.Service;


import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import application.Model.User;
import application.Repository.UserRepo;

@Component("appServiceImpl")
@Service
public class AppServiceImpl implements AppService {
    
    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User insertUser(User user) {
        userRepo.save(user);
        return user;
    }

    @Override
    public User getUser(Long id) {
        return userRepo.findById(id.intValue()).orElse(null);
    }
}
