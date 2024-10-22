package ua.com.reactive.reactive.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.reactive.entity.Role;
import ua.com.reactive.reactive.service.RoleService;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})

public class RoleController {

    private final RoleService roleService;

    @GetMapping
    public Flux<Role> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return roleService.list();
    }

    @PostMapping
    public Mono<Role> createRole(@RequestBody Role role) {
        return roleService.save(role);
    }

}
