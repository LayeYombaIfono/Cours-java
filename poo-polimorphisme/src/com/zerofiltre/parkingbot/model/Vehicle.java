package com.zerofiltre.parkingbot.model;

public class Vehicle {
    private String registrationNumber;

    // Geter
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    // Seter
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCategory(){
        return "BMW";
    }

}
