package com.zerofiltre.parkingbot;

import com.zerofiltre.parkingbot.model.Bicycles;
import com.zerofiltre.parkingbot.model.Cars;
import com.zerofiltre.parkingbot.model.Tickets;
import com.zerofiltre.parkingbot.model.Vehicle;
import com.zerofiltre.parkingbot.service.ParkingService;

public class ParkingBoto {

    static ParkingService parkingService = new ParkingService();

    /**
     * Fonction principale
     * @param args :
     */
    public static void main(String[] args) {
       processVehicles();
    }

    private static void processVehicles(){

        // Creation d'un objet vehicule

        Vehicle vehicle = new Vehicle();
        vehicle.setRegistrationNumber("LS-458-4P");
        Tickets vehicleTicket = parkingService.processIncomingVehicle(vehicle);

        // Creation d'un objet moto
        Vehicle bicycle = new Bicycles();
        bicycle.setRegistrationNumber("LS-10-P");
        Tickets bicyleTicket = parkingService.processIncomingVehicle(bicycle);

        // Creation d'un objet voiture
        Vehicle car = new Cars();
        car.setRegistrationNumber("LS-09-P1");
        Tickets carTicket = parkingService.processIncomingVehicle(car);

        // Afficher les objets
        System.out.println(vehicleTicket);
        System.out.println(bicyleTicket);
        System.out.println(carTicket);

    }

}