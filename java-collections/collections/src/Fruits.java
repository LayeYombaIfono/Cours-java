import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fruits {

    public static void main(String[] args) {
        fruitsList();
    }

    private static void fruitsList() {
        //       ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Pomme");
        fruits.add("Orange");
        fruits.add("Mangue");
        fruits.add("Banane");
        fruits.add("Paplemouse");

        String phrase = "Le nombre total des fruits dans le pannier est de : %d \n";

//        Connaitre la taille d'une liste
        System.out.printf(phrase,fruits.size());


//        Parcourir la liste avec la boucle for
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }


        System.out.println("<----Récuperer le premier et le dernier élément----->");

        // Recuperer le premier element
        System.out.println("Le premier fruit dans le pannier est : " + fruits.getFirst());


        //Recuperer le dernier element
        System.out.println("Le dernier fruit dans le pannier est : " + fruits.getLast());


        System.out.println("<-----Vérifier si l'élément existe----->");

        // Vérifier si un élément se trouve dans la liste
        if (fruits.contains("Citrone")){
            System.out.println("Il y a une Citrone dans votre pannier");
        }else {
            System.out.println("Le fruit Citrone n'est pas dans votre pannier");

        }

        System.out.println("<-----Supprimer l'élément ---->");

        //   Supprimer l'élément dans la liste
        fruits.removeFirst();

        phrase = "Le nombre total restant dans le pannier est de : %d \n";
        System.out.printf(phrase,fruits.size());
        for (String fruit: fruits){
            System.out.println(fruit);
        }

        System.out.println("<-----Mise à jour d'un élémént---->");
        // Mise à jour d'un élément de la liste
        System.out.println("Le fruit qui sera mise à jour est : " + fruits.set(0, "Ananas"));
        System.out.println(fruits);


        System.out.println("<----Rechercher un élément---->");

//        Rechercher un élément dans une liste
        int search = fruits.indexOf("Mangue");
        System.out.println("L'élément recherché est à la position : " + search);
        search = fruits.lastIndexOf("Banane");
        System.out.println("Le dernier élément recherché dans la liste est à la position : " + search);




    }
}