package main.factory;

public class Chair extends Furniture {
    public Chair(String colour, int price) {
        super(colour, price);
    }

    @Override
    public void show() {
        System.out.println("Sunt un scaun");
    }
}
