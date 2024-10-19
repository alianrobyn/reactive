package ua.com.reactive.reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Table(name = "trains")
public class Train {

    @Id
    private Long id;
    private String station1;
    private String station2;
    private LocalTime time;
    private LocalDate date;
    private String price;

    public Train(String station1, String station2, LocalTime time, LocalDate date, String price) {
        this.station1 = station1;
        this.station2 = station2;
        this.time = time;
        this.date = date;
        this.price = price;
    }

}
