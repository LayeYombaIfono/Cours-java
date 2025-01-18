/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notiondebase;

import java.util.*;


/**
 *
 * @author Ifono
 */
public class NotionDeBase {
    
    // Methode post incrementation et pre incrementation
    public static void incrementationDecrementation(){
  
    int n1=0;
    int n2=0;
    System.out.println("Avant l'incrementation :"+ " n1 = " + n1 + " n2 = " + n2);
    n1=n2++;         
    System.out.println("L'incrementation apres la variable n2 : "+" n1 = " + n1 + " n2 = " + n2);
    n1=++n2;        
    System.out.println("L'incrementation avant  la variable n2 : "+" n1 = " + n1 + " n2 = " + n2);
    n1=n1++;        //attention
    System.out.println("L'incrementation avant  la variable n1 : "+"n1 = " + n1 + " n2 = " + n2);

    }
    
    
//    Methode pour la boucle while
    public static void boucleWhile(){
        
        int [] number = {1,2,3,4};
        int [] number2 = {1,2,3,4};
        int n = 0;
        int i = 0;
        
        System.out.println("---Boucle while---");
        while(n < number.length){
            
            System.out.println("Position : "+ n++);
      }
        
        System.out.println("---Boucle Do while---");
        
        do {
           System.out.println("Position : "+ i++);
        } while (i < number2.length);
    
    
    }
    
    
//    Methode pour la boucle for
    public static void boucleFor(){
    
//    Premiere boucle for 
    for(int i = 0; i < 5; i++){
        System.out.println("Position : "+i);
    }
    
//Les boucles for améliorées

    List list = new ArrayList();
    list.add("Hello");
    list.add(3);
    list.add(1);
    list.add(4);
    
    
    
    for(int i = 0; i < list.size(); i++){
        
        System.out.println("Position changement : "+i); 
    }
    
    
//    L'itération sur les éléments d'une collection
    for(Iterator ir = list.iterator(); ir.hasNext();){
        System.out.println(ir.next());
    }
    
    
    List<String> fruit = new ArrayList<>();
    fruit.add("Mangue");
    fruit.add("Banane");
    fruit.add("Pomme");
        System.out.println("Liste des fruits");
    for(Iterator fr = fruit.iterator(); fr.hasNext();){
        System.out.println(fr.next());
    }
    
    List<String>person = new ArrayList<>();
    person.add("Jean");
    person.add("Paul");
    person.add("Pierre");
    
    System.out.println("Liste des personnes");
    for(Iterator p = person.iterator(); p.hasNext();){
        System.out.println(p.next());
    }
    
        System.out.println("Autre liste");
    for(String p : person ){
        System.out.println(p);
    }
    
    
    
    

    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
//        Methode post incrementation et pre incrementation
        //incrementationDecrementation(); 
        
        
//         Methode boucle while
        //boucleWhile();
         
         // Methode boucle for
         boucleFor();
       
    }
    
}
