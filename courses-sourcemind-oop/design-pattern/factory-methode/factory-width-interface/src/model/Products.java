package model;

abstract class Products {
    private String productName;
    private int quantity;
    private  double price;

    public Products(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

     double totalAmount(){
        return this.getQuantity() * this.getPrice();
    }

    @Override
    public String toString() {
        return "Nom: " + productName +"\nQuantite: " + quantity + "\nPrix: " + price;
    }
}
