package main.factory;

public class Toilet extends Furniture {
    public Toilet(String colour, int price) {
        super(colour, price);
    }

    @Override
    public void show() {
        System.out.println("sunt o toaleta");
    }
}
