package model;

public class ConcreteProductA extends Products implements Produt{

    public ConcreteProductA(String productName, int quantity, double price) {
        super(productName, quantity, price);
    }



    @Override
    public void display() {
        System.out.println("Il sagit du produit de béton A.");
    }



}
