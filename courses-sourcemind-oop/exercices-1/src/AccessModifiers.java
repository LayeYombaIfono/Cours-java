//Modificateurs d'accès

/*
    Les membres de la classe (champs et méthodes) peuvent être :
    ● public
    Le champ/la méthode peut être utilisé(e) depuis
    et depuis l'extérieur de la classe
    ● private
    Le champ/la méthode peut être utilisé(e) depuis
    l'intérieur de la classe uniquement
    ● protected
    Le champ/la méthode peut être utilisé(e) depuis
    l'intérieur de la classe et ses sous-classes, ainsi que d'autres
    classes du même package.
    ● package-private (vide)
    Le champ/la méthode peut être utilisé(e) depuis
    le même package uniquement.
 */

public class AccessModifiers {
    private String name;
    public char gender;
    protected boolean isPet;

    // les constructeurs ont également des modificateurs d'accès
    public AccessModifiers(String catName){
        name = catName;
    }

    public String getName() {
        return "Nom: " + name;
    }
    private void meow(){

    }

    public static void main(String[] args) {
        AccessModifiers cat = new AccessModifiers("Medor");
        System.out.println(cat.getName());

    }
}
