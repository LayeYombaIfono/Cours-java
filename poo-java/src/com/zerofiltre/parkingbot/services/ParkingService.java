package com.zerofiltre.parkingbot.services;

import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicle;

import java.util.Date;


/**
 * Cette class est une class qui gere la logique
 */
public class ParkingService {

    /**
     * Methode de traitrement du véhicule entrant
     * @param vehicle : Vehivcule entrant au garage
     * @return : le ticket attribué au vehicule
     */
    public Ticket processIncomingVehicle(Vehicle vehicle){

        // Instencier un ticket
        Ticket ticket = new Ticket();
        Date now = new Date();

        ticket.setEnteringTime(now);
        ticket.setVehicle(vehicle);

        return ticket;
    }

}
