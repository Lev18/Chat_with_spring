package application.Model;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "age", nullable = false)
    private short age;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "email", nullable = false)
    private String email;

    public User() {}
    public User(Long id, short age, String userName, String email) {
        this.id = id;
        this.age = age;
        this.userName = userName;
        this.email = email;
    }
}
