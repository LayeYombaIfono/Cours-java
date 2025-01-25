/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notions.lambdas;

/**
 *
 * @author Ifono
 */
public class Main {
    
    public static void main(String[] args) {
        traitementDeThread();
    
    }
    
    public static void traitementDeThread(){
         MyThread myThread = new MyThread();
         myThread.start();

    }
    
}
