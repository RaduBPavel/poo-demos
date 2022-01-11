package Overriding;

public class Dog extends Animal {
    @Override
    public void run() {
        super.run();
        System.out.println("Sunt un caine si alerg");
    }
}
