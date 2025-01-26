import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class ArrayToArrayList {

    public void arrayList(){
        String [] tableau = {"A", "B", "C", "D"};

        List<String> list = new ArrayList<>();

        System.out.println("Contenu du tableau");
        for (String t : tableau){
            System.out.println("-> " + t);
        }

        list = Arrays.asList(tableau);
        System.out.println("\nContenu de la liste");
        for (String l: list){
            System.out.println(" -> " + l);
        }

        System.out.println("\n");
        tableau[0] = "AA";
        System.out.println("\nContenu de la liste");
        for (String l: list){
            System.out.println("-> " + l);
        }

        list.add("E");
        System.out.println("Contenu du tableau");
        for (String t : tableau){
            System.out.println("-> " + t);
        }


    }

    public void collectionAddAll(){
        String[]fruits = {"Pomme", "Orange", "Mangue"};

        List<String> listFruits = new ArrayList<>();

        Collections.addAll(listFruits, fruits);

        System.out.println("Contenu de tableau");
        for (String fruit : fruits){
            System.out.println("-> " + fruit);
        }

        fruits[0] = "BANANE";
        listFruits.add("POMME");

        System.out.println("Contenu de tableau");
        for (String fruit : fruits){
            System.out.println("-> " + fruit);
        }

        System.out.println("Contenu de la liste");
        for (String listFruit : listFruits ){
            System.out.println("Fruit -> " + listFruit);
        }






    }


}
