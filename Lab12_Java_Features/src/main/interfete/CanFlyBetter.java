package main.interfete;

public interface CanFlyBetter {
    void fly();

    default void swim() {
        System.out.println("Pot sa inot mai bine");
    }
}
