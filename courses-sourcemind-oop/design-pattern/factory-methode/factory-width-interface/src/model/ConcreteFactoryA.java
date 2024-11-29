package model;

public class ConcreteFactoryA implements Factory{
    @Override
    public Produt factoryMethod() {
        return new ConcreteProductA("Banane", 50, 5000);
    }


}
