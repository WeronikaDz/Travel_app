package com.travel_app.model;

import com.travel_app.entity.Trip;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Component
public class Cart {

    private List<TripwithAmountofTravelers> tripwithAmountofTravelers = new ArrayList<>();

    public void addTrip(Trip trip, int amountOfAdults, int amountOfKids) {
        TripwithAmountofTravelers position = new TripwithAmountofTravelers(amountOfAdults, amountOfKids);
        tripwithAmountofTravelers.add(position);
    }

    public List<TripwithAmountofTravelers> getTripwithAmountofTravelers() {
        return tripwithAmountofTravelers;
    }
}
