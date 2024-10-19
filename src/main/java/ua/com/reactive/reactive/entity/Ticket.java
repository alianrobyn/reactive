package ua.com.reactive.reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Table(name = "tickets")
public class Ticket {

    @Id
    private Long id;
    @Column("user_id")
    private Long user_id;
    @Column("train_id")
    private Long train_id;
    private String user_firstname;
    private String user_lastname;
    private String train_station1;
    private String train_station2;
    private LocalDate train_date;
    private LocalTime train_time;
    private String train_price;

    public Ticket (Long user_id, Long train_id, String user_firstname, String user_lastname, String train_station1, String train_station2, LocalDate train_date, LocalTime train_time, String train_price) {
        this.user_id = user_id;
        this.train_id = train_id;
        this.user_firstname = user_firstname;
        this.user_lastname = user_lastname;
        this.train_station1 = train_station1;
        this.train_station2 = train_station2;
        this.train_date = train_date;
        this.train_time = train_time;
        this.train_price = train_price;
    }
}
