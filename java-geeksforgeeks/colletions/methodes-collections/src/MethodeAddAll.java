import java.util.ArrayList;
import java.util.List;

public class MethodeAddAll {

    List<Integer> list = new ArrayList<>();
    List <Integer> list1 = new ArrayList<>();

    List<String> fruit1 = new ArrayList<>();
    List<String> fruit2 = new ArrayList<>();

    public void addAllInteger(){
        list.add(7);
        list.add(4);
        list.add(9);
        list.add(15);

        list1.add(30);
        list1.add(20);

        System.out.println("Ajout des chiffres dans le tableau 1 " + list.addAll(list1));

        for (Integer lists : list){
            System.out.println("✅-> "+lists);
        }


    }


    public void addAllString(){
        fruit1.add("Banane");
        fruit1.add("Orange");
        fruit1.add("Mangue");

        fruit2.add("Pomme");
        fruit2.add("Ananas");

        System.out.println("Ajouter des fruits sur la liste 1 : "+ fruit1.addAll(fruit2));

        for (String fruit : fruit1){
            System.out.println("✅-> "+ fruit);
        }
    }
}
