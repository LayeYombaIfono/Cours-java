import model.*;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Came", 1);
        System.out.println(cat);
        cat.wolk();
        System.out.println("<--------------->");

        Duck card1 = new Duck("Canard 1", 1);
        Eagle eagle1 = new Eagle("Eagle 1", 1);

        FlyingAnimal[] birds = new FlyingAnimal[3];
        birds[0] = new Duck("Canard", 1);
        birds[1] = new Eagle("Eagle show", 2);
        birds[2] = new Duck("Canard 2", 2);

        for (int i = 0; i < 3; i++){
            birds[i].fly();
        }

        System.out.println(card1);
        card1.fly();
        card1.swim();
        System.out.println("<----------------->");
        System.out.println(eagle1);
        eagle1.fly();
    }
}