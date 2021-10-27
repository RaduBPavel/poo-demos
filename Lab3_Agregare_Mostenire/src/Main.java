import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Veterinar;

/***
 * OOP - modeleze programarea dupa cum functioneaza viata reala
 *
 * Agregare, compunere si mostenire
 *
 * Asocieri intre obiecte
 *  - agregare: o instanta a unui obiect foloseste o alta instanta a altui iar cele doua nu depind una de cealalta
 *  (asociere slaba)
 *  - compunere: o instata a unui obiect foloseste o alta instanta a altui obiect iar unul din ele depinde de celelalte
 *  (asociere puternica)
 *
 *  Mostenire
 *
 *  class A extends B -> clasa A mosteneste clasa B
 *  Animale
 *  Dog, Cat, Parrot
 *
 *  1. Toti copiii unei clase ii mostenesesc atat proprietatile, cat si metodele
 *  2. In momentul in care instantiem o clasa de tip copil, ce se intampla prima oara este ca se
 *  instantiaza o clasa de tip parinte
 *
 *  new Dog() -> Animal (new Animal())
 *
 *  Keyword-ul super se refera la instanta parintelui
 *  this(ceva) -> apela un constructor din cadrul declaratiei obiectului curent
 *  super(ceva) -> apeleaza un constructor din cadrul declaratiei obiectului parinte
 *
 *  Se poate referi si la campurile sau metodele instantei parinte
 *  super.camp sau sa apelez super.metoda()
 *
 *  Modificatori de acces
 *  new Dog()
 *  o instanta de Dog si o instanta de Animal
 *
 *  private -> poate fi accesat doar in cadrul instantei de Animal
 *
 *  Suprascriere si supraincarcare
 *
 *  Supraincarcare
 *  Semnatura functiei -> tipul de return + numar si tip de parametri
 *
 *  Noi putem sa avem mai multe functii cu acelasi nume atata timp cat au semnatura functiei diferita
 *
 *  Suprascriere
 *  Noi putem intr-o clasa copil sa oferim alta functionalitate unei metode prin intermediul supraincarcarii
 *  Se noteaza cu adnotare @Override
 *  Trebuie sa aiba aceeasi semnatura
 *
 *  Upcasting, downcasting
 *
 *  O chestie smechera cu mostenirea
 *
 *  Prezentare scurta la ArrayList
 *
 *  In Java, orice obiect este definit in doua feluri:
 *      - tipul de la compilare -> daca foloseste metodele care trebuie, daca are acces la metode/campuri
 *      - tipul de la runtime -> se folosesc metodele si campurile propriu-zise
 *
 *  instanceof
 *
 *  A instanceof NumeClasa -> verifica daca instanta de la runtime a unui obiecte este de tip NumeClasa
 *
 *  ArrayList -> vector dinamic
 *
 *  ArrayList<Tip elemente pe care vrem sa le stocam> arr = new ArrayList<>();
 *  arr.add(elem) -> adauga la sfarsit
 *  arr.get(index) -> returneaza elementu de la indexu index
 *  arr.remove(index) -> sterge elementul de la poz index
 *  arr.set(elem, index) -> seteaza elementul de la index cu valoarea elem
 *  arr.clear() -> sterge toate elementele
 *  arr.size() -> intoarce marimea array-ului (cate elemente sunt)
 */
public class Main {

    public static void main(String[] args) {
        Book[] books = {new Book("Autobiografie TJ Miles", "Radu"), new Book("Autobiografie Ilie Dumitrescu", "Razvan")};
        Library biblioteca = new Library("UPB", books);

        System.out.println(biblioteca.getBooks()[0].my_page);

        Dog rex = new Dog("alb", 10, "pechinez", "vita");
//        Cat angela = new Cat("negru", 15, true);

        System.out.println(rex.getColour());
        rex.bark();

//        System.out.println(angela.age);
//        angela.eat();

//        rex.eat();
//        rex.eat("vita");
//        rex.eat(10);
//
//        rex.walk();

        Veterinar veterinar = new Veterinar();
        veterinar.trateaza(rex); // veterinar.trateaza((Animal)rex)
        // Compilatorul stie sigur ca Dog e si un Animal
        // Apelez mereu cea mai restrictiva functie la nivel de tip al variabilelor

        Animal animal = new Animal("gri", 5);
//        System.out.println(((Dog)animal).rasa);
        // Orice chestie care nu e in animal si e in dog nu poate fi folosita
        // instanta de Animal cu colour = gri si age = 5

        Dog rex2 = new Dog("alb", 11, "samoyed", "pui");
        Cat angela2 = new Cat("tarcat", 12, true);

        rex2.walk();
        angela2.walk();

        Animal[] animals = new Animal[2]; // Upcasting
        animals[0] = rex2;
        animals[1] = angela2;

        for (Animal elem : animals) {
            elem.walk();
        }
    }

}
