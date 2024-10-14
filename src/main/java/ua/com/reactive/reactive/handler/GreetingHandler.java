package ua.com.reactive.reactive.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.reactive.entity.Client;
import ua.com.reactive.reactive.entity.Train;
import ua.com.reactive.reactive.entity.Greeting;

@Component

public class GreetingHandler {

    public Mono<ServerResponse> hello(ServerRequest request) {

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(new Greeting("Hello, Spring")));
    }

    public Mono<ServerResponse> home(ServerRequest request) {
        return ServerResponse
                .ok()
                .contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromValue("Main page!"));
    }

    public Mono<ServerResponse> getClients(ServerRequest request) {

        String start = request
                .queryParam("start")
                .orElse("0");


        Flux<Client> clients = Flux.just(
                        new Client(1L, "Olena", "Kovalenko", "+380971234567"),
                        new Client(2L, "Andrij", "Melnyk", "+380730987654"),
                        new Client(3L, "Sasha", "Butenko", "+380679382048")
                )
                .skip(Long.valueOf(start))
                .take(2);


        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(clients, Client.class);
    }

    public Mono<ServerResponse> getTrains(ServerRequest request) {

        String start = request
                .queryParam("start")
                .orElse("0");


        Flux<Train> trains = Flux.just(
                        new Train(1L, "Kyiv", "Lviv", "2024-10-14", "10:30:00", "200 UAH"),
                        new Train(2L, "Odesa", "Kharkiv", "2024-10-14", "11:00:00", "300 UAH"),
                        new Train(3L, "Dnipro", "Zaporizhzhia", "2024-10-14", "12:15:00", "250 UAH")
                )
                .skip(Long.valueOf(start))
                .take(2);


        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(trains, Train.class);
    }

}
