package ua.com.reactive.reactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ua.com.reactive.reactive.entity.Train;

@RestController

public class TrainController {

    @GetMapping("/trains")

    public Flux<Train> getTrains() {
        Flux<Train> trains = Flux.just(
                        new Train(1L, "Kyiv", "Lviv", "2024-10-14", "10:30:00", "200 UAH"),
                        new Train(2L, "Odesa", "Kharkiv", "2024-10-14", "11:00:00", "300 UAH"),
                        new Train(3L, "Dnipro", "Zaporizhzhia", "2024-10-14", "12:15:00", "250 UAH")
                )
                .skip(0)
                .take(2);

        return trains;
    }

}

