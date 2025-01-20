/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poojava;

/**
 *
 * @author Ifono
 */
public class Moto extends Vehicule{

    public Moto(String nom) {
        super(nom);
    }

    @Override
    public void changerVitesse() {
        System.out.println("Changer vitesse avec le pied"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

     public static void nombreDePneu(){
        System.out.println("La moto a 2 pneus ");
    }

    
}
