package main.factory;

public class Bed extends Furniture {
    public Bed(String colour, int price) {
        super(colour, price);
    }

    @Override
    public void show() {
        System.out.println("Sunt un pat");
    }
}
