package zoo;

// Clasa noastra a devenit abstracta
public abstract class Animal {
    int age;
    String colour;

    // Avem o metoda abstracta -> ea exista la nivel de idee, dar nu este implementata in clasa Animal
    // Orice clasa care mosteneste clasa Animal trebuie neaparat sa implementeze si metoda walk -> suprascriere
    public abstract void walk();
}
