package com.travel_app.controller;

import com.travel_app.model.Trip;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/trips")
public class TripController {

    private static final List<Trip> TRIPS = Arrays.asList(
            new Trip(1, "Polska"),
            new Trip(2, "Hiszpania"),
            new Trip(3, "Rosja")
    );


}
