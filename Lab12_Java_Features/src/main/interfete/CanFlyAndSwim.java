package main.interfete;

public interface CanFlyAndSwim {
    void fly(); // trebuie neaparat sa fie suprascrisa

    // nu trebuie neaparat sa fie suprascrisa
    default void swim() {
        System.out.println("Pot sa inot");
    }

    static void doSomething() {
        System.out.println("Am facut ceva");
    }
}
