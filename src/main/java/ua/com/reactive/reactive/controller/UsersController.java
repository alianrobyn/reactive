package ua.com.reactive.reactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import ua.com.reactive.reactive.entity.User;
import ua.com.reactive.reactive.service.UserService;

@RestController
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registration")
    public Mono<User> registerUser(@RequestBody User user) {
        return userService.save(user);
    }
}
