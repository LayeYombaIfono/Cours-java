/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacompiler;

/**
 *
 * @author Ifono
 */
public class JavaCompiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double price = 5.4d;
        int quantity = 10;
        
        double total = price * quantity;
        
        System.out.println("Prix total : " +total+" Euro");
        
//        Utilisation des underscores dans les entiers littéreaux
    int monSolde;
        monSolde = 123_1456_789;
        
        float flottant1 = +.1f , flottant2 = 1e10f;
        
        System.out.println("Nombre 1: "+ flottant1+" Nombre 2 : " + flottant2);
        System.out.println("Le solde : "+monSolde);
        
        short a = 45, b = 10;
            a = (short) (a + b);
        System.out.println("La valeur short : "+a);
        
        testEntierBinaire(); // Appel de la methode

    }
    
//    Les entiers exprimés en binaire (Binary Literals)
    public static void testEntierBinaire() {
    byte valeurByte = (byte) 0b00010001;
    System.out.println("valeurByte = " + valeurByte);
    valeurByte = (byte) 0B10001;
    System.out.println("valeurByte = " + valeurByte);
    valeurByte = (byte) 0B11101111;
    System.out.println("valeurByte = " + valeurByte);
    short valeurShort = (short) 0b1001110111101;
    System.out.println("valeurShort = " + valeurShort);
    int valeurInt = 0b1000;
    System.out.println("valeurInt = " + valeurInt);
    valeurInt = 0b1001110100010110100110101000101;
    System.out.println("valeurInt = " + valeurInt);
    long valeurLong =
        0b010000101000101101000010100010110100001010001011010000101000101L;
    System.out.println("valeurLong = " + valeurLong);
  }
    
}
