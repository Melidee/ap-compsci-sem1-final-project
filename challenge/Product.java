package se.melidee;

public interface Product {
    // getters and setters for the name of the product
    String getName();
    void setName(String newName);

    // getters and setters for the price of the product
    Double getPrice();
    void setPrice(double newPrice);

    // getter for the amount of product in stock
    Integer getStock();

    // adds amount of stock to the product
    void restock(int amount);

    // get the value of all the stocked product combined
    Double getTotalValue();

    // buy a certain amount of product with a given balance
    Double buy(int amount, double balance);

}
