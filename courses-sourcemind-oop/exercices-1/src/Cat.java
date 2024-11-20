/*
*  1- Les champs et méthodes définis avec le mot clé "static" sont appélés membres statiaues.
*  2- Les champs et méthodes non statiques appartiennent à l'instance.
*  3- Chaque instance possède les mêmes champs et méthodes car ils appartiennent à la classe.
* */

import javax.xml.catalog.CatalogResolver;

public class Cat {
    // Champ membre de class
    public static int count = 0;

    // Méthode membre de class
    public static  String describre(){
        return "https://en.wikipedia.org/wiki/Cat";
    }
    // Champs ou attributs membre d'instance
    public String nam;
    public int age = 1;
    public char genre;

    public Cat(){
        System.out.println("La construction du chat est exécutée");
    }

    // // Méthode membre d'instance
    public void breathe(){

    }

    @Override
    public String toString() {
        return ("Nom: " + nam + "\nAge: " + age + "\nGenre: " + genre);
    }

    public static void main(String[] args) {
        Cat oscar = new Cat(); // Premier objet
        Cat patience = new Cat(); // Deuxième objet
        oscar.nam = "Oscar";
        oscar.genre = 'M';
        patience.nam = "Patience";
        patience.genre = 'F';

        System.out.println(oscar.toString());
        System.out.println(patience.toString());
    }
}