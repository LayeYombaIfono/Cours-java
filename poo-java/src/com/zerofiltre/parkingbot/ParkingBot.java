package com.zerofiltre.parkingbot;

import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicle;
import com.zerofiltre.parkingbot.services.ParkingService;

public class ParkingBot {

    /**
     * Methode principale main
     * @param args :
     */

    public static void main(String[] args) {

        processVehicles(); // Methode d'enregistrement de vehicule
    }

    /**
     * Methode d'enregistrement de vehicule
     */

    private static void processVehicles() {
        Vehicle vehicle = new Vehicle();

        vehicle.setRegistrationNumber("LSV-15478");
        vehicle.setCategory("BMW");
        vehicle.setColor("Blanche");

        // Instencier le parking service
        ParkingService parkingService = new ParkingService();

        // Attribuer un ticket au vehicule entrant
        Ticket ticket = parkingService.processIncomingVehicle(vehicle);

        System.out.println(ticket);
    }
}