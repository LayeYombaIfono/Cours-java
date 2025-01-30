import methode.flux.MethodeFlux;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Methode containsAll
        MethodeContainsAll methodeContainsAll = new MethodeContainsAll();
        MethodeContainsAll fruits = new MethodeContainsAll();
        methodeContainsAll.containsAllInteger();
        fruits.containsAllString();

//     Methode addAll   Ajout des élements dans le tableau
        MethodeAddAll add1 = new MethodeAddAll();
        MethodeAddAll add2 = new MethodeAddAll();
        add1.addAllInteger();
        add2.addAllString();


// Méthode RevomeAll
        MethodeRemoveAll removeAll = new MethodeRemoveAll();
        removeAll.removeAllFruits();

//        Méthode RetainAll
        MethodeRetainAll employe = new MethodeRetainAll();
        employe.methodeRetainAllEmployes();

//        Méthode Flux
        MethodeFlux methodeFlux = new MethodeFlux();
        methodeFlux.notesEleves();

        MethodeFlux employeSearch = new MethodeFlux();
        employeSearch.listeEmployes();
    }


}