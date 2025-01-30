package methode.flux;

import java.util.ArrayList;
import java.util.List;


public class MethodeFlux {

    List<Integer> notes = new ArrayList<>();

    List<String>employes = new ArrayList<>();


    public void notesEleves(){

        notes.add(12);
        notes.add(10);
        notes.add(17);
        notes.add(19);

        System.out.println("Liste des notes : ");
        notes.forEach(System.out::println);

        System.out.println("Notes supérieur à 10 : ");
        notes.stream()
                .filter( note -> note > 10)
                .forEach(System.out::println);

    }

    public void listeEmployes(){

        employes.add("Jean");
        employes.add("Michel");
        employes.add("Finda");

        System.out.println("Liste des employés");
        employes.forEach(System.out::println);


        System.out.println("Employé cherché");
        employes.stream()
                .filter(employe -> employe.equals("Finda"))
                .forEach( System.out::println);




    }
}

