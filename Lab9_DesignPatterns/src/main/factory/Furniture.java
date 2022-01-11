package main.factory;

/***
 * Mai multe tipuri de mobilier
 * In functie de ce input primesti de la tastatura programu tau sa faca un anumit tip de mobilier
 * Sa-l bage intr-un vector si la sfarsit sa treaca prin toate elementele alea si sa apeleze o metoda
 * show() -> ofera detalii despre tipul de mobilier
 */
public abstract class Furniture {
    String colour;
    int price;

    public Furniture(String colour, int price) {
        this.colour = colour;
        this.price = price;
    }

    public abstract void show();
}
