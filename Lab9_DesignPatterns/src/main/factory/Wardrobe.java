package main.factory;

public class Wardrobe extends Furniture {
    public Wardrobe(String colour, int price) {
        super(colour, price);
    }

    @Override
    public void show() {
        System.out.println("2 pe 4 ca dulapu");
    }
}
