package com.travel_app.model;


public class TripwithAmountofTravelers {


    private int amountOfAdults;
    private int amountOfKids;
    public TripwithAmountofTravelers(int amountOfAdults, int amountOfKids) {
        this.amountOfAdults = amountOfAdults;
        this.amountOfKids = amountOfKids;
    }

    public int getAmountOfAdults() {
        return amountOfAdults;
    }

    public void setAmountOfAdults(int amountOfAdults) {
        this.amountOfAdults = amountOfAdults;
    }

    public int getAmountOfKids() {
        return amountOfKids;
    }

    public void setAmountOfKids(int amountOfKids) {
        this.amountOfKids = amountOfKids;
    }
}
