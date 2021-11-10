package zoo;

public class Chicken extends Animal implements CanFlyBetter{
    @Override
    public void walk() {
        System.out.println("Alerg");
    }

    @Override
    public void fly() {
        System.out.println("Zbor 1 m");
    }

    @Override
    public void flyBetter() {
        System.out.println("Zbor 10 m");
    }
}
