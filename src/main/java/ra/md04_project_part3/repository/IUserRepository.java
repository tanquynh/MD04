package ra.md04_project_part3.repository;

import ra.md04_project_part3.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
}
