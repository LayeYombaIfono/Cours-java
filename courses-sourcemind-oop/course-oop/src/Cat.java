public class Cat {
    public String name;
    public char gender;
    public int age;
    public double weight;
    public String color;

    public void breathe(){

    }

    public void eat(){

    }

    public void run(){

    }

    public void sleep(){

    }

    public void meow(){

    }

    @Override
    public String toString() {
        return (
                "Nom : " + name + "\nGenre: " + gender
                + "\nAge: " + age + "\nPoid: " + weight + "\nCouleur: " + color

        );
    }
}
