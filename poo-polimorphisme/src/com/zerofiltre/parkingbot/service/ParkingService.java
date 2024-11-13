package com.zerofiltre.parkingbot.service;

import com.zerofiltre.parkingbot.model.Tickets;
import com.zerofiltre.parkingbot.model.Vehicle;

import java.util.Date;

public class ParkingService {

    public Tickets processIncomingVehicle(Vehicle vehicle){
        Tickets tickets = new Tickets();
        Date now = new Date();

        tickets.setEnteringTime(now);
        tickets.setVehicle(vehicle);

        return tickets;

    }
}
