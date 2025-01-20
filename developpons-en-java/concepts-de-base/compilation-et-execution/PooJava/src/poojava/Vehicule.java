/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poojava;

/**
 *
 * @author Ifono
 */
public class Vehicule {
    private String nom;

    public Vehicule(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
    
    public  void changerVitesse(){
        System.out.println("Changer vitesse avec la main");
    }
    
    public static void nombreDePneu(){
        System.out.println("La voiture a 4 pneus ");
    }
    
}
