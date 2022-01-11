package main.factory;

public class Table extends Furniture {
    public Table(String colour, int price) {
        super(colour, price);
    }

    @Override
    public void show() {
        System.out.println("Sunt o masa");
    }
}
