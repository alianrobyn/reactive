package ua.com.reactive.reactive.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Train {

    private Long id;
    private String station1;
    private String station2;
    private String date;
    private String time;
    private String price;

}
