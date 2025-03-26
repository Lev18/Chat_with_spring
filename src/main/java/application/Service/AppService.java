package application.Service;

import java.util.List;
import application.Model.User;

public interface AppService {
    public List<User> getUsers();
    public User insertUser(User user);
}
