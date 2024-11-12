package com.parking;


import com.parking.services.ParkingService;

public class ParkingBot {

   static String completion = "des équipes du parking Zerofiltre " ; // Celle-ci est une variable globale

    // Variable globale qui reçois les données externe de la classe parkingService
    static ParkingService parkingServices = new ParkingService();

    /**
     * Cette methode main retourne 2 methodes
     * @param args : Tableau de donnes lors du lancement de l'application
     */
    public static void main(String[] args) {

        sayHello(); // Methode
        sayBye(); // Methode
    }

    /**
     * Cette methode permet d'afficher le message de bienvenue
     */
    private static void sayHello(){
        String welcomeSentence = "Hello, recevez la bienvenue " + completion;
        System.out.println(welcomeSentence);

        String parkingService = parkingServices.parking;
        String washingService = parkingServices.washing;

        System.out.println("Nous faisons des services " + parkingService.toUpperCase() + " et " + washingService.toUpperCase() );
    }

    private static void sayBye(){
        String sayByeSentence = "Recevez les aurevoirs " + completion;

        System.out.println(sayByeSentence);
    }
}
