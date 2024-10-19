package ua.com.reactive.reactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.reactive.entity.Ticket;
import ua.com.reactive.reactive.repository.TicketRepository;

@Service

public class TicketService {

    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Flux<Ticket> list() {
        return ticketRepository.findAll();
    }

    public Mono<Ticket> save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
