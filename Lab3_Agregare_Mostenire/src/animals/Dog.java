package animals;

public class Dog extends Animal {
    // String colour, int age;
    public String rasa;
    public String mancare_favorita;

    public Dog(String colour, int age, String rasa, String mancare_favorita) {
        super(colour, age); // new Animal(colour, age)
        this.rasa = rasa;
        this.mancare_favorita = mancare_favorita;
    }

    public void bark() {
        System.out.println("Am facut ham si am culoarea " + super.getColour());
    }

    @Override
    public void eat() {
        System.out.println("Am mancat nimic");
    }

    @Override
    public void eat(String mancare) {
        if (mancare.equals(this.mancare_favorita)) {
            System.out.println("Am mancat mancarea favorita care e: " + mancare_favorita);

        } else {
            System.out.println("Am mancat altceva care e: " + mancare);
        }
    }

    public int eat(int bucati) {
        System.out.println("Am mancat " + bucati + " bucati de carne");
        return 10;
    }

    @Override
    public void walk() {
        System.out.println("Sunt un caine si merg, nu doar un animal");
    }

    @Override
    public void animal_only() {
        System.out.println("ceva de caine");
    }
}
