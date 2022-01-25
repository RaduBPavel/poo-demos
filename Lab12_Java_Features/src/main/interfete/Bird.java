package main.interfete;

public class Bird implements CanFlyAndSwim {
    @Override
    public void fly() {
        System.out.println("Pot sa zbor");
    }

    int age;
    int weight;

    public Bird(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }

    /*
    void swim() {
        System.out.println("Pot sa inot");
    }

    void swim() {
        System.out.println("Pot sa inot mai bine");
    }
    */
}
