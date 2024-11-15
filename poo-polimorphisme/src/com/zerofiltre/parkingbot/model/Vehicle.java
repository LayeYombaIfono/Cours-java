package com.zerofiltre.parkingbot.model;

public class Vehicle {
    private String registrationNumber;

    // Getters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    // Setters
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCategory(){
        return "BMW";
    }

}
