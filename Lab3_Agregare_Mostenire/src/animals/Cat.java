package animals;

public class Cat extends Animal {
    public boolean are_gheare;
    // String colour, int age

    public Cat(String colour, int age, boolean are_gheare) {
        super(colour, age);
        this.are_gheare = are_gheare;
    }

    public void meow() {
        System.out.println("Am facut meow");
    }

    @Override
    public void walk() {
        System.out.println("Merg si sunt o pisica");
    }
}
