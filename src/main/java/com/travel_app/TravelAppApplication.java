package com.travel_app;

import com.travel_app.entity.Trip;
import com.travel_app.repository.AirportRepository;
import com.travel_app.repository.TripRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TravelAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelAppApplication.class, args);
    }


}
