
import java.security.SecureRandom; // import de la class SecureRandom

public class BoucleWhileContinue {

    static int  nombreClientGenerer = new SecureRandom().nextInt(10);

    static String[] customersList = {"Paul", "Jean", "Pierre", "Finda", "Alice", "Christine", "Hawa"};

    /**
     * Methode principale  retourne la methode
     * qui gener les clients
     * @param args :
     */
    public static void main(String[] args) {
        System.out.println("Nous avons génerer : " + nombreClientGenerer + " clients ");
        setCustomersList();
    }

    /**
     * Methode qui gener la liste des clients
     */
    private static void setCustomersList(){
        int customerNumber = 0; // Initialiser la liste des clients a 0

        while (nombreClientGenerer > 0){
            nombreClientGenerer --;

            // Utilisation du mot clé continue
            if ("Pierre".equals(customersList[customerNumber])){
                customerNumber++;
                continue;
            }

            // Imprimer la liste des fruits
            System.out.println(customersList[customerNumber]);
            customerNumber++;
        }

    }

}
