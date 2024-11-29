package model;

public class ConcreteCreatorA extends Creator{

    @Override
    public Product factoryMethod() {
        return new ConcreteProductA("Pomme", 3000, 50);
    }

}
