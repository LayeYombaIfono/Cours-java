
/*
    ● Chaque instance de classe possède des
        variables spéciales désignées par ce mot-clé
    ● La variable this est une référence à l'instance actuelle de la classe
    ● La variable this n'a aucune signification dans les
         membres de la classe (membres statiques)
    ● L'exemple montre également qu'une classe
        peut avoir plusieurs constructeurs
 */
public class ClassAndInstanceMembers {

    private String name;
    private char gender;

    // les constructeurs ont également des modificateurs d'accès
    public ClassAndInstanceMembers(String catName){
        name = catName; // J'en ai déduit cela
    }

    public ClassAndInstanceMembers(String name, char gender) {
        this.name = name; // Explicite ceci
        this.gender = gender;
    }

    public String getName() {
        return "Nom: " + name;
    }

    public char getGender() {
        return  gender;
    }

    public static void main(String[] args) {
        ClassAndInstanceMembers cat1 = new ClassAndInstanceMembers("Oscar", 'M');
        cat1.name = "Patience";
        cat1.gender = 'M';
        System.out.println(cat1.getName() +  "\nGenre: " + cat1.getGender());


    }
}
