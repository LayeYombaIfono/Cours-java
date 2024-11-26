package model;

public class Duck extends Animal implements FlyingAnimal, SwimingAnimal{

    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("Je suis un oiseau qui vole");
    }

    @Override
    public void swim() {

        System.out.println("Je suis un oiseau qui nage");

    }

    @Override
    public String toString() {
        return ("Nom: " + this.getName() + ", Age: " + this.getAge());
    }
}
