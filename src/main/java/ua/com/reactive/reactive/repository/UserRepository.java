package ua.com.reactive.reactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import ua.com.reactive.reactive.entity.User;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {

}
