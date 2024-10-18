package ua.com.reactive.reactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.com.reactive.reactive.entity.Train;

public interface TrainRepository extends ReactiveCrudRepository<Train, Long> {
}
