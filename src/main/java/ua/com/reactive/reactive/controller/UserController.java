package ua.com.reactive.reactive.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.reactive.entity.User;
import ua.com.reactive.reactive.service.UserService;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})

public class UserController {

    private final UserService userService;

    @GetMapping
    public Flux<User> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return userService.list();
    }

    @PostMapping
    public Mono<User> createUser(@RequestBody User user) {
        return userService.save(user);
    }


//    @GetMapping("/users")
//
//
//    public Flux<User> getUsers() {
//        Flux<User> users = Flux.just(
//                        new User(1L, "Olena", "Kovalenko", "+380971234567"),
//                        new User(2L, "Andrij", "Melnyk", "+380730987654"),
//                        new User(3L, "Sasha", "Butenko", "+380679382048")
//                )
//                .skip(0)
//                .take(2);
//
//        return users;
//    }


}
