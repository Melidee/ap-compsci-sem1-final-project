package se.melidee;

public class ElectronicProduct implements Product {
    protected String name;
    protected Double price;
    protected Integer stock;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String newName) {
        name = newName;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double newPrice) {
        price = newPrice;
        
    }

    @Override
    public Integer getStock() {
        return stock;
    }

  /**
   * This function adds the amount to the stock.
   * 
   * @param amount The amount of stock to add to the current stock.
   */
    @Override
    public void restock(int amount) {
        stock += amount;
    }

    /**
     * The function `getTotalValue()` returns the total value of the stocked product
     * 
     * @return The total value of the stocked product.
     */
    @Override
    public Double getTotalValue() {
        return stock * price;
    }

    /**
     * If the balance is greater than the price and the stock is greater than the amount, then subtract
     * the price times the amount from the balance and subtract the amount from the stock
     * 
     * @param amount The amount of the item you want to buy.
     * @param balance the amount of money the user has
     * @return The balance after the purchase.
     */
    @Override
    public Double buy(int amount, double balance) {
        if (balance > price && stock > amount) {
            balance -= price * amount;
            stock -= amount;
        }
        return balance;
    }
}
