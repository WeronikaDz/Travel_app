package com.travel_app.controller;

import com.travel_app.entity.Trip;
import com.travel_app.model.Cart;
import com.travel_app.model.TripwithAmountofTravelers;
import com.travel_app.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Optional;

@RestController
@RequestMapping("/management")
public class CartController {
    @Autowired
    private TripRepository tripRepository;
    @Autowired
    private Cart cart;

    @Autowired
    public CartController(TripRepository tripRepository, Cart cart) {
        this.tripRepository = tripRepository;
        this.cart = cart;
    }

    @PostMapping("/addtrip/{tripId}")
    public ResponseEntity<String> addTriptoCart(@PathVariable Long tripId,
                                                          @RequestBody TripwithAmountofTravelers position) {
        Optional<Trip> optionalTrip = tripRepository.findById(tripId);
        if (optionalTrip.isPresent()) {
            Trip trip = optionalTrip.get();
            BigDecimal priceForAdult = trip.getPriceForAdult();
            BigDecimal priceForKid = trip.getPriceForKid();

            cart.addTrip(trip, position.getAmountOfAdults(), position.getAmountOfKids());

            return ResponseEntity.ok("Wycieczka została dodana do koszyka.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
// todo moze dodać dodatkowe metody?
//    @GetMapping("/usunWycieczke/{idWycieczki}")
//    public String usunWycieczkeZKoszyka(@PathVariable Long idWycieczki) {
//        Trip wycieczka = tripRepository.findById(idWycieczki).get();
//        cart.usunWycieczke(wycieczka);
//        return "redirect:/koszyk";
//    }
//
