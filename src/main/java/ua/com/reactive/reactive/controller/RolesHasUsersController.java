package ua.com.reactive.reactive.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.reactive.entity.RolesHasUsers;
import ua.com.reactive.reactive.service.RolesHasUsersService;

@RestController
@RequestMapping("/rolesHasUsers")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})

public class RolesHasUsersController {

    private final RolesHasUsersService rolesHasUsersService;

    @GetMapping
    public Flux<RolesHasUsers> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return rolesHasUsersService.list();
    }

    @PostMapping
    public Mono<RolesHasUsers> createRole(@RequestBody RolesHasUsers rolesHasUsers) {
        return rolesHasUsersService.save(rolesHasUsers);
    }
}
