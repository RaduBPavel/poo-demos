package animals;

public class Animal { // implicit este extends Object
    private String colour;
    private int age;
    public int urechi = 2;

        // default
    public Animal(String colour, int age) {
        this.colour = colour;
        this.age = age;
    }

    public void eat() {
        System.out.println("Pot sa mananc");
    }

    public void eat(String mancare) {
        System.out.println("alabala");
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }

    public void walk() {
        System.out.println("Sunt un animal si merg");
    }

    public void animal_only() {
        System.out.println("ceva");
    }
}
