package ua.com.reactive.reactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.reactive.entity.RolesHasUsers;
import ua.com.reactive.reactive.repository.RolesHasUsersRepository;

@Service

public class RolesHasUsersService {

    private final RolesHasUsersRepository rolesHasUsersRepository;

    @Autowired
    public RolesHasUsersService(RolesHasUsersRepository rolesHasUsersRepository) {
        this.rolesHasUsersRepository = rolesHasUsersRepository;
    }

    public Flux<RolesHasUsers> list() {
        return rolesHasUsersRepository.findAll();
    }

    public Mono<RolesHasUsers> save(RolesHasUsers rolesHasUsers) {
        return rolesHasUsersRepository.save(rolesHasUsers);
    }
}
