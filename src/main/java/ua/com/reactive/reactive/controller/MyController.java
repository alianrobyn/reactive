package ua.com.reactive.reactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ua.com.reactive.reactive.entity.Client;

@RestController

public class MyController {

    @GetMapping("/clients")

    public Flux<Client> getClients() {
        Flux<Client> clients = Flux.just(
                        new Client(1L, "Vasya", "Pypkin", "+380971234567"),
                        new Client(2L, "Iva", "Pypkina", "+380730987654"),
                        new Client(3L, "Inna", "Pypkina", "+380679382048")
                )
                .skip(0)
                .take(2);

        return clients;
    }

}
