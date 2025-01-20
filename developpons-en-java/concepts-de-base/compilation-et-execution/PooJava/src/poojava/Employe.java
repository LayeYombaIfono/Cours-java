/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poojava;

/**
 *
 * @author Ifono
 */
public class Employe extends Person{
    
    private int salaire;

    public Employe(int salaire, String nom, String prenoms, String numeroTelephone, String addresseEmail) {
        super(nom, prenoms, numeroTelephone, addresseEmail);
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

   
    
    
    

    @Override
    public void caractereDeLaPerson() {
        System.out.println("J'ai un caractere simple"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
    
    
    
}
