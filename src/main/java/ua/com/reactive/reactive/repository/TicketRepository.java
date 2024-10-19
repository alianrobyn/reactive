package ua.com.reactive.reactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.com.reactive.reactive.entity.Ticket;

public interface TicketRepository extends ReactiveCrudRepository<Ticket, Long>  {
}
