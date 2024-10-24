package ua.com.reactive.reactive.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.reactive.entity.User;
import ua.com.reactive.reactive.entity.Train;
import ua.com.reactive.reactive.entity.Greeting;
import ua.com.reactive.reactive.repository.UserRepository;

import java.util.Map;

@Component
public class GreetingHandler {

    public Mono<ServerResponse> hello(ServerRequest request) {
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue("Hello World!"));
    }

    public Mono<ServerResponse> users(ServerRequest request){
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue("User Page"));
    }


    public Mono<ServerResponse> admin(ServerRequest request) {

        Flux<User> users = Flux.
                just(
                        new User(2L, "John", "Kek", "+380979305729", "jek", "1111"),
                        new User(3L, "Lyudmyla", "Serdyuk", "+380689304829", "ludo4ka", "2222"),
                        new User(4L,"Valeriy", "Zhab", "+380739605389", "zhabka", "3333"),
                        new User(5L, "Alina", "Robyn", "+380972797473", "alianrobyn", "4444")
//
                );

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(users, User.class);
    }

    public Mono<ServerResponse> registration (ServerRequest request) {
        return ServerResponse.ok().render("registration");
    }


//    public Mono<ServerResponse> users(ServerRequest request){
//        return ServerResponse
//                .ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(BodyInserters.fromValue("User Page"));
//    }

//    public Mono<ServerResponse> admin(ServerRequest request) {
//
//        Flux<User> users = Flux.
//                just(
//                        new User("John", "Kek", "+380979305729", "jek", "1111"),
//                        new User("Lyudmyla", "Serdyuk", "+380689304829", "ludo4ka", "2222"),
//                        new User("Valeriy", "Zhab", "+380739605389", "zhabka", "3333"),
//                        new User("Alina", "Robyn", "+380972797473", "alianrobyn", "4444")
//                );
//
//        return ServerResponse
//                .ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(users, User.class);
//    }

//    public Mono<ServerResponse> getUsers(ServerRequest request) {
//
//        String start = request
//                .queryParam("start")
//                .orElse("0");
//
//
//        Flux<User> users = Flux.just(
//                        new User(1L, "Olena", "Kovalenko", "+380971234567"),
//                        new User(2L, "Andrij", "Melnyk", "+380730987654"),
//                        new User(3L, "Sasha", "Butenko", "+380679382048")
//                )
//                .skip(Long.valueOf(start))
//                .take(5);
//
//
//        return ServerResponse
//                .ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(users, User.class);
//    }


//    public Mono<ServerResponse> getUsers(ServerRequest request) {
//        String user = request.queryParam("user").orElse("no user");
//
//        // Creating a simple response body map
//        Map<String, String> responseBody = Map.of("user", user);
//
//        // Return as JSON
//        return ServerResponse
//                .ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .bodyValue(responseBody);  // Use bodyValue for simple objects
//    }


//    public Mono<ServerResponse> getTrains(ServerRequest request) {
//
//        String start = request
//                .queryParam("start")
//                .orElse("0");
//
//
//        Flux<Train> trains = Flux.just(
//                        new Train(1L, "Kyiv", "Lviv", "2024-10-14", "10:30:00", "200 UAH"),
//                        new Train(2L, "Odesa", "Kharkiv", "2024-10-14", "11:00:00", "300 UAH"),
//                        new Train(3L, "Dnipro", "Zaporizhzhia", "2024-10-14", "12:15:00", "250 UAH")
//                )
//                .skip(Long.valueOf(start))
//                .take(2);
//
//
//        return ServerResponse
//                .ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(trains, Train.class);
//    }

}