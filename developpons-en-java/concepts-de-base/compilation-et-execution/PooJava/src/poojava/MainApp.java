/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poojava;

/**
 *
 * @author Ifono
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employe employe1 = new Employe(20000, "Ifono", "Laye Yomba", "621454565", "layeyomba@");
      
        System.out.println(employe1);
        
        Vehicule bmw = new Vehicule("BMW");
        bmw.changerVitesse();
        Vehicule.nombreDePneu();
        
        
        System.out.println("La voiture : "+bmw.getNom());
        Vehicule moto = new Moto("TVS 225");
        
        Moto ktm = new Moto("KTM");
        Moto.nombreDePneu();
        moto.changerVitesse();
        System.out.println("Moto 1 : "+ktm.getNom());
        ktm.changerVitesse();
        System.out.println("Moto 2 : "+moto.getNom());
        
        
        
    }
    
}
