package model;

public class Cat extends Animal implements Walking{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return ("Nom: " + this.getName() + ", Age: " + this.getAge());
    }

    @Override
    public void wolk() {
        System.out.println("Je suis animal qui marche");
    }
}
