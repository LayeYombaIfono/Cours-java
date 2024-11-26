public class Main {
    public static void main(String[] args) {
         Cat cat1 = new Cat();
            cat1.name = "Oscar";
            cat1.gender = 'M';
            cat1.age = 2;
            cat1.weight = 7;
            cat1.color = "Blanche";

         Cat cat2 = new Cat();
         cat2.name = "Luna";
         cat2.gender = 'F';

         System.out.println(cat1.toString());
         System.out.println(cat2.toString());

    }



}