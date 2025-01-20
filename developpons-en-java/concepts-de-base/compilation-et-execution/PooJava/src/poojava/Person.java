/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poojava;

/**
 *
 * @author Ifono
 */
public class Person {
    String nom;
    String prenoms;
    String numeroTelephone;
    String addresseEmail;

    public Person(String nom, String prenoms, String numeroTelephone, String addresseEmail) {
        this.nom = nom;
        this.prenoms = prenoms;
        this.numeroTelephone = numeroTelephone;
        this.addresseEmail = addresseEmail;
    }

   
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getAddresseEmail() {
        return addresseEmail;
    }

    public void setAddresseEmail(String addresseEmail){
        this.addresseEmail = addresseEmail;
    }
    
    public  void caractereDeLaPerson(){
        System.out.println("J'ai un caratere dure. ");
    }

    @Override
    public String toString() {
        return  "nom=" + nom + ", prenoms=" + prenoms + ", numeroTelephone=" + numeroTelephone + ", addresseEmail=" + addresseEmail;
    }

   
    
    
    
    
}
