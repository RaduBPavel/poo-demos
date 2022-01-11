package Overloading;

public class Human {
    public void walk() {
        System.out.println("Sunt om si merg");
    }

    public void walk(int km) {
        System.out.println("Merg " + km + " kilometri si sunt om");
    }
}
