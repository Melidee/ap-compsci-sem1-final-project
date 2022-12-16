package se.melidee;

public class Phone extends ElectronicProduct {
    private final String processor;
    private final Integer storage;

    /**
     * write the constructor as shown in the App class
     * @param name
     * @param price
     * @param stock
     * @param processor
     * @param storage
     */

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
