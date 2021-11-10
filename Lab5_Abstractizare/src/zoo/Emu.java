package zoo;

public class Emu extends Animal implements CanRun, CanFly, CanFly2 {
    @Override
    public void walk() {
        System.out.println("Merg ca un emu");
    }

    @Override
    public void fly() {
        System.out.println("Zbor ca un emu");
    }

    @Override
    public void run() {
        System.out.println("Alerg ca un emu");
    }
}
