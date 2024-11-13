package com.zerofiltre.parkingbot.model;

import java.util.Date;

public class Ticket {

    // Variable pour le ticket
    private String amount; // Prix ou montant du ticket
    private Vehicle vehicle; // Nom du vehicule
    private Date enteringTime; // Heure d'entree
    private Date exitTime; // Heure de sortie

    /**
     * Methodes geters et seters
     * @return :
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(Date enteringTime) {
        this.enteringTime = enteringTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    /**
     *
     * @return : Les informations du ticket
     */
    @Override
    public String toString() {
        return "Ticket{" +
                "montant='" + amount + '\'' +
                ", vehicule=" + vehicle +
                ", heureEntree=" + enteringTime +
                ", heureSortie=" + exitTime +
                '}';
    }
}
