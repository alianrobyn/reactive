package ua.com.reactive.reactive.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Ticket {
    private Long id;
    private Long train_id;
    private Long user_id;
    private String station1;
    private String station2;
    private String date;
    private String time;
    private String price;
    private String firstName;
    private String lastName;
}
