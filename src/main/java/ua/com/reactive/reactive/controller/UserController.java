package ua.com.reactive.reactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ua.com.reactive.reactive.entity.User;

@RestController

public class UserController {

    @GetMapping("/users")

    public Flux<User> getUsers() {
        Flux<User> users = Flux.just(
                        new User(1L, "Olena", "Kovalenko", "+380971234567"),
                        new User(2L, "Andrij", "Melnyk", "+380730987654"),
                        new User(3L, "Sasha", "Butenko", "+380679382048")
                )
                .skip(0)
                .take(2);

        return users;
    }

}
