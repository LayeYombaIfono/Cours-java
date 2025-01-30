import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MethodeContainsAll {

    List <Integer> list = new ArrayList<>();
    List <Integer> list1 = new ArrayList<>();

    List<String> fruit1 = new ArrayList<>();
    List<String> fruit2 = new ArrayList<>();

    public void containsAllInteger(){
        list.add(7);
        list.add(4);
        list.add(9);
        list.add(15);

        list1.add(4);
        list1.add(9);

        System.out.println("Est-ce que le tableau 1 contient tout les élements du " +
                "tableau 2 : " + new HashSet<>(list).containsAll(list1));


    }


    public void containsAllString(){
        fruit1.add("Banane");
        fruit1.add("Orange");
        fruit1.add("Mangue");

        fruit2.add("Mangue");
        fruit2.add("Orange");

        System.out.println("Est-ce que liste fruits contient" +
                "tout les elements de liste fruits 2 : " + new HashSet<>(fruit1).containsAll(fruit2));

    }



}
