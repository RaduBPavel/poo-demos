package zoo;

public class Bichon extends Dog implements CanRun {
    @Override
    public void walk() {
        System.out.println("Sunt un bichon plimbaret");
    }

    @Override
    public void bark() {
        System.out.println("Ham ham");
    }

    @Override
    public void run() {
        System.out.println("I can run");
    }
}
