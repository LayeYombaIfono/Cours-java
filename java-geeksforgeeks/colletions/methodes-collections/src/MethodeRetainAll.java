import java.util.ArrayList;
import java.util.List;

public class MethodeRetainAll {
    List<String>employes = new ArrayList<>();
    List<String>employes1 = new ArrayList<>();

    public void methodeRetainAllEmployes(){
        employes.add("Jean");
        employes.add("Paul");
        employes.add("Finda");

        employes1.add("Paul");
        employes1.add("Jean");

        System.out.println("Liste des  employees : " + employes.retainAll(employes1));

        for (String employe : employes){
            System.out.println(employe);
        }
    }
}
