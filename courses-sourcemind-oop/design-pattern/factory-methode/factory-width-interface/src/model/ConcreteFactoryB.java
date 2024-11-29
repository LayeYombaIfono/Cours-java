package model;

public class ConcreteFactoryB implements Factory{
    @Override
    public Produt factoryMethod() {
        return  new ConcreteProductB();
    }
}
