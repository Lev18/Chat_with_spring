package application.Component;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    private long id;
    private short age;
    private String userName;
    private String email;
    public User() {}
    public User(Long id, short age, String userName, String email) {
        this.id = id;
        this.age = age;
        this.userName = userName;
        this.email = email;
    }
}
