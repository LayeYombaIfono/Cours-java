
import com.sun.source.tree.WhileLoopTree;

import java.security.SecureRandom; //Fonction pour generer des nombres aleatoires

public class BoucleWhile {
    // Liste des clients
    static String[] customers = {
            "Jean",
            "Finda",
            "Hawa",
            "Marie",
            "Christine",
            "Laye Yomba",
            "Paul",
            "Michel"
    };

    static int customersSize = new SecureRandom().nextInt(10); // Variable pour generer les nombre aleatoires

    /**
     * Methode principale qui retourne une methode
     * @param args: nom du client
     */
    public static void main(String[] args) {
        displayCustomer();
    }

    /**
     * Methode pour afficher la liste des clients
     */
    private static void displayCustomer(){
        System.out.println("On a generer " + customersSize + " Clients");
         int i = 0;
         while (customersSize > 0 ){
             customersSize--;

             sayHelloCustomer(customers[i]);

             i++;
         }
    }

    /**
     * Methode qui affiche le message hello
     * @param customer : Le nom du client passer
     */
    private static void sayHelloCustomer(String customer){
        String greeting = "Hello ";

        System.out.println(greeting + customer);
    }


}
