package model;

public class ConcreteCreatorB extends Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB("Mangue", 2000);
    }
}
