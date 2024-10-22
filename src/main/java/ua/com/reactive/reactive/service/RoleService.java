package ua.com.reactive.reactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.reactive.entity.Role;
import ua.com.reactive.reactive.repository.RoleRepository;

@Service

public class RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Flux<Role> list() {
        return roleRepository.findAll();
    }

    public Mono<Role> save(Role role) {
        return roleRepository.save(role);
    }
}
