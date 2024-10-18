package ua.com.reactive.reactive.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.reactive.entity.Train;
import ua.com.reactive.reactive.service.TrainService;


@RestController
@RequestMapping("/trains")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})

public class TrainController {

    private final TrainService trainService;

    @GetMapping
    public Flux<Train> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return trainService.list();
    }

    @PostMapping
    public Mono<Train> createTrain(@RequestBody Train train) {
        return trainService.save(train);
    }

//    @GetMapping("/trains")
//
//    public Flux<Train> getTrains() {
//        Flux<Train> trains = Flux.just(
//                        new Train(1L, "Kyiv", "Lviv", "2024-10-14", "10:30:00", "200 UAH"),
//                        new Train(2L, "Odesa", "Kharkiv", "2024-10-14", "11:00:00", "300 UAH"),
//                        new Train(3L, "Dnipro", "Zaporizhzhia", "2024-10-14", "12:15:00", "250 UAH")
//                )
//                .skip(0)
//                .take(2);
//
//        return trains;
//    }

}

