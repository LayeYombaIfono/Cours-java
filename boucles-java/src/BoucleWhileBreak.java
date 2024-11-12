
import java.security.SecureRandom;

public class BoucleWhileBreak {

    // Variable globales
    static int randomNumbers = new SecureRandom().nextInt(5);
    static String[] fruits = {"Pomme", "Orange", "Mangue", "Banane", "Ananas"};

    /**
     * Methode principale  retourne la methode getFruits
     * qui gener les fruits
     * @param args :
     */
    public static void main(String[] args) {
        System.out.println("Nous avons generer : " + randomNumbers + " fruit(s)");
        getFruits();
    }

    private static void getFruits(){

        int fruitNumber = 0;

        while (randomNumbers > 0){

            randomNumbers --;

            // Utilisation du mot clé break
            if ("Banane".equals(fruits[fruitNumber])){
                break;
            }

            System.out.println(fruits[fruitNumber]);
            fruitNumber++;
        }
    }
}
