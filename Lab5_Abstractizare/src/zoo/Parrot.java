package zoo;

// implements
public class Parrot extends Animal implements CanFly {

    @Override
    public void walk() {
        System.out.println("I am a bird and I'm walking");
    }


    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
