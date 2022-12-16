package se.melidee;

/**
 * This is the entry point into our app
 * it is the first thing that runs our program
 * 
 * YOU SHOULD NOT NEED TO CHANGE THIS FILE TO MAKE THE PROGRAM WORK
 */
public class App {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone 13", 699.0, 10, "A15 Bionic", 128);
        System.out.println("The " + iPhone.getName() + " has a " + iPhone.getProcessor() + " Processor");
        System.out.println("This " + iPhone.getName() + "  has " + iPhone.getStorage() + " Gb of Storage");
        System.out.println("Let's make a call!");
        iPhone.call();
    }
}