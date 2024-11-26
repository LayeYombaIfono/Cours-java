package model;

public class Eagle extends Animal implements FlyingAnimal{

    public Eagle(String name, int age) {
        super(name, age);
    }



    @Override
    public void fly() {
        System.out.println("Je suis un oiseau qui vole");
    }

    @Override
    public String toString() {
        return ("Nom: " + this.getName() + ", Age: " + this.getAge());
    }

}
