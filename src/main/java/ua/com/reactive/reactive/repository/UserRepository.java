package ua.com.reactive.reactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.com.reactive.reactive.entity.User;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {

}
