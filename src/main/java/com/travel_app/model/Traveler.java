package com.travel_app.model;


public class Traveler {

    private String travelerFirstName;
    private String travelerLastName;
    private int age;

    public Traveler() {
    }

    public Traveler(String travelerFirstName, String travelerLastName, int age) {
        this.travelerFirstName = travelerFirstName;
        this.travelerLastName = travelerLastName;
        this.age = age;
    }
    public String getTravelerFirstName() {
        return travelerFirstName;
    }

    public void setTravelerFirstName(String travelerFirstName) {
        this.travelerFirstName = travelerFirstName;
    }

    public String getTravelerLastName() {
        return travelerLastName;
    }

    public void setTravelerLastName(String travelerLastName) {
        this.travelerLastName = travelerLastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
