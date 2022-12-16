package se.melidee;

public class Phone extends ElectronicProduct {
    private final String processor;
    private final Integer storage;

    
    public Phone(String name, Double price, Integer stock, String processor, Integer storage) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.processor = processor;
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public Integer getStorage() {
        return storage;
    }

    public void call() {
        System.out.println("ring ring... ring ring...");
    }
}
