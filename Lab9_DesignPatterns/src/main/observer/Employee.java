package main.observer;

public class Employee extends Observable {
    String name;
    boolean isWorking;

    public Employee(String name, Manager manager) {
        super();
        this.name = name;
        this.isWorking = false;
        super.attach(manager);
    }

    public void stopWorking() {
        this.isWorking = false;
        super.notifyObservers(this.name, false);
    }

    public void startWorking() {
        this.isWorking = true;
        super.notifyObservers(this.name, true);
    }
}
