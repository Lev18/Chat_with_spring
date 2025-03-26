package application.Repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;
import application.Model.User;

@RepositoryRestResource
public interface UserRepo extends JpaRepository<User, Integer>{

}
