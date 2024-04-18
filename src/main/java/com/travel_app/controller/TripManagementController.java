package com.travel_app.controller;

import com.travel_app.dtos.TripDTO;
import com.travel_app.entity.Trip;
import com.travel_app.model.CartItem;
import com.travel_app.service.TripService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/management")
public class TripManagementController {
    private final TripService tripService;
    @Autowired
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

//    @PostMapping("/buytrip")
//    @PreAuthorize("hasRole('ROLE_USER')")
//    public ResponseEntity<String> addToCart(@RequestBody CartItem cartItem) {
//        tripService.addToCart(cartItem);
//        return ResponseEntity.status(HttpStatus.OK).body("Trip added to cart successfully.");
//    }
//    @PostMapping("/buytrip/{id}")
//    @PreAuthorize("hasRole('ROLE_USER')")
//    public String buyTrip(@PathVariable Integer tripId, Integer numberOfAdults, Integer numberOfKids,
//                            String[] adultFirstNames, String[] adultLastNames, int[] adultAges,
//                            String[] kidFirstNames, String[] kidLastNames, int[] kidAges) {
//        int actualNumberOfAdults = numberOfAdults != null ? numberOfAdults : 0;  // Set default if null
//        tripService.addToCart(tripId, numberOfAdults, numberOfKids, adultFirstNames, adultLastNames, adultAges, kidFirstNames, kidLastNames, kidAges);
//
//        return "redirect:/cart";  // Replace "cart" with your actual cart view path
//    }

    }




