/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classescellees;

/**
 *
 * @author Ifono
 */
public class AppSchool {
    
     private static void creationProfesseur(){
         System.out.println("----INFORMATION DU PROF 1 -------");
         Professeur prof1 = new Professeur("Kamano", "Etient", "6245789562", "etient@", "Anglais", 20000, 15);
         System.out.println("Nom: "+prof1.getName()+"\nPrenoms: "+prof1.getPrenom()+"\nTelephone: "+prof1.getTelephone()+
                 "\nAddresse e-mail: "+prof1.getEmail()+"\nCours: "+prof1.getCours());
         
         prof1.calculSalaireProfesseur();
         
         System.out.println("----INFORMATION DU PROF 2 -------");
         Professeur prof2 = new Professeur("Diallo", "Ousmane", "6245789652", "diallo@gmail.com", "Chimie",12000, 8);
         System.out.println("Nom: "+prof2.getName()+"\nPrenoms: "+prof2.getPrenom()+"\nTelephone: "+prof2.getTelephone()+
                 "\nAddresse e-mail: "+prof2.getEmail()+"\nCours: "+prof2.getCours());
         
         prof2.calculSalaireProfesseur();
    }
    
    public static void main(String[] args) {
        creationProfesseur();
    }
    
   
}
