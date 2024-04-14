package com.travel_app.controller;

import com.travel_app.dtos.TripDTO;
import com.travel_app.entity.Trip;
import com.travel_app.service.TripService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/management")
public class TripManagementController {
    private final TripService tripService;
    public TripManagementController(TripService tripService) {
        this.tripService = tripService;
    }
    @GetMapping("/alltrips")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public List<TripDTO> showTrips() {
        return tripService.findAll();
    }

    @PostMapping("/addtrip")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void addTrip(@RequestBody Trip trip) {
        tripService.addTrip(trip);
    }

    @DeleteMapping("/deletetrips/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void deleteTrip(@PathVariable Long id) {
        tripService.deleteTrip(id);
    }

    @PutMapping("/updatetrips/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void updateTrip(@PathVariable Integer id, @RequestBody Trip trip) {
        tripService.updateTrip(id, trip);

    }
}


