package ua.com.reactive.reactive.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.reactive.entity.Ticket;
import ua.com.reactive.reactive.service.TicketService;

@RestController
@RequestMapping("/tickets")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})

public class TicketController {

    private final TicketService ticketService;

    @GetMapping
    public Flux<Ticket> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return ticketService.list();
    }

    @PostMapping
    public Mono<Ticket> createTicket(@RequestBody Ticket ticket) {
        return ticketService.save(ticket);
    }


//    @GetMapping("/tickets")
//
//    public Flux<Ticket> getTickets() {
//        Flux<Ticket> tickets = Flux.just(
//                        new Ticket(1L, 1L, 1L, "Kyiv", "Lviv", "2024-10-14", "10:30:00", "200 UAH", "Olena", "Kovalenko"),
//                        new Ticket(2L, 2L, 2L, "Odesa", "Kharkiv", "2024-10-14", "11:00:00", "300 UAH", "Andrij", "Melnyk"),
//                        new Ticket(3L, 3L, 3L, "Dnipro", "Zaporizhzhia", "2024-10-14", "12:15:00", "250 UAH", "Sasha", "Butenko")
//                )
//                .skip(0)
//                .take(3);
//
//        return tickets;
//    }

}
