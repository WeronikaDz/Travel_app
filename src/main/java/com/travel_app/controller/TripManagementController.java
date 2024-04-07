package com.travel_app.controller;

import com.travel_app.model.Trip;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/alltrips")
public class TripManagementController {

    private static final List<Trip> TRIPS = Arrays.asList(
            new Trip(1, "Polska"),
            new Trip(2, "Hiszpania"),
            new Trip(3, "Rosja")
    );

    @PostMapping
//    @PreAuthorize("hasAuthority('edit:trip')")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void editTrip (@RequestBody Trip trip) {
        System.out.println("Edit Trip");
        System.out.println(trip);
    }


}

