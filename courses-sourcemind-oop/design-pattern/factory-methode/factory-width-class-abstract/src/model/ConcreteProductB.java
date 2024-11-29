package model;

public class ConcreteProductB extends Product {

    public ConcreteProductB(String productName, double productPrice) {
        super(productName, productPrice);
    }

    @Override
    public void display() {
        System.out.println("Il sagit du produit de béton B.");
    }

    @Override
    public String toString() {
        return ("Nom: " + productName + "\nPrix: " + productPrice + " GNF");
    }
}
