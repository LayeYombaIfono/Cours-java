package model;

public class ConcreteProductA extends Product{
    private int quantity;

    public ConcreteProductA(String productName, double productPrice, int quantity) {
        super(productName, productPrice);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void display() {
        System.out.println("Il sagit du produit de béton A. ");
    }

    @Override
    public String toString() {
        return ("Nom: " + productName + "\nPrix: " + productPrice + " GNF" +"\nQuantité: " + quantity);
    }





}
