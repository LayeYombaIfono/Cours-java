import model.ConcreteFactoryA;
import model.ConcreteFactoryB;
import model.Factory;
import model.Produt;

public class AppProduct {
    public static void main(String[] args) {
        infoProductA();
        System.out.println("<--------------------->");
        infoProductB();
    }

    public static void  infoProductA(){
        Factory factoryA = new ConcreteFactoryA();
        Produt productA = factoryA.factoryMethod();
        productA.display();
        System.out.println(productA);
    }

    public static void infoProductB(){
        Factory factoryB = new ConcreteFactoryB();
        Produt produtB = factoryB.factoryMethod();
        produtB.display();
    }

}