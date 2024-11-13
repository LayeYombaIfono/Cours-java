package com.zerofiltre.parkingbot.model;

public class Vehicle {

    private String registrationNumber;
    private String category;
    private String color;


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", category='" + category + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
