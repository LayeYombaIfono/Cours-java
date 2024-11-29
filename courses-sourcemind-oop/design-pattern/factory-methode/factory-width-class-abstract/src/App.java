import model.ConcreteCreatorA;
import model.ConcreteCreatorB;
import model.Creator;
import model.Product;

public class App {
    public static void main(String[] args) {

        infoProductA();
        System.out.println("<------------->");
        infoProductB();

    }

    //  Méthode pour qfficher des informqtions du produit A
    private static void infoProductB() {
        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.display();
        System.out.println(productB);

    }

    //  Méthode pour qfficher des informqtions du produit B
    private static void infoProductA() {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.display();
        System.out.println(productA);



    }
}