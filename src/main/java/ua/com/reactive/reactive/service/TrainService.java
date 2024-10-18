package ua.com.reactive.reactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.reactive.entity.Train;
import ua.com.reactive.reactive.repository.TrainRepository;

@Service

public class TrainService {

    private final TrainRepository trainRepository;

    @Autowired
    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public Flux<Train> list() {
        return trainRepository.findAll();
    }

    public Mono<Train> save(Train train) {
        return trainRepository.save(train);
    }
}
