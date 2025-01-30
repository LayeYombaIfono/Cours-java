import java.util.ArrayList;
import java.util.List;

public class MethodeRemoveAll {

    List<String> fruit1 = new ArrayList<>();
    List<String> fruit2 = new ArrayList<>();



    public void removeAllFruits(){
        fruit1.add("Banane");
        fruit1.add("Orange");
        fruit1.add("Mangue");

        fruit2.add("Pomme");
        fruit2.add("Ananas");


        System.out.println("Est-ce que liste fruits contient" +
                "tout les elements de liste fruits 2 : " + fruit1.addAll(fruit2));

        for (String fruit : fruit1){
            System.out.println("✅-> "+ fruit);
        }
        fruit1.removeAll(fruit2);

        System.out.println("Après la suppression");
        for (String fruit : fruit1){
            System.out.println("✅-> "+ fruit);
        }

    }
}
