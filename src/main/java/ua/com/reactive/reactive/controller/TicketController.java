package ua.com.reactive.reactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ua.com.reactive.reactive.entity.Ticket;


@RestController

public class TicketController {

    @GetMapping("/tickets")

    public Flux<Ticket> getTickets() {
        Flux<Ticket> tickets = Flux.just(
                        new Ticket(1L, 1L, 1L, "Kyiv", "Lviv", "2024-10-14", "10:30:00", "200 UAH", "Olena", "Kovalenko"),
                        new Ticket(2L, 2L, 2L, "Odesa", "Kharkiv", "2024-10-14", "11:00:00", "300 UAH", "Andrij", "Melnyk"),
                        new Ticket(3L, 3L, 3L, "Dnipro", "Zaporizhzhia", "2024-10-14", "12:15:00", "250 UAH", "Sasha", "Butenko")
                )
                .skip(0)
                .take(3);

        return tickets;
    }

}
