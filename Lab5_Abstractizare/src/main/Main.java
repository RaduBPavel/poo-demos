package main;

import zoo.*;

import java.util.ArrayList;
import java.util.List;

/***
 * Agregare si mostenire (compunere)
 * agregarea - asociere slaba - un obiect se putea folosi de alt obiect si existau independent unul de celalalt
 * compunere - asociere puternica - un obiect se putea folosi de alt obiect si existau codependent unul de celalalt
 *
 * Mostenire - ne ofera un blueprint, o schema dupa care putem sa construim alte clase
 *
 * class Animal
 * class Dog extends Animal
 *
 * Animal este o schema dupa care se construieste clasa de Dog
 *
 * toate campurile din clasa parinte erau folosibile si de clasa copil
 * toate metodele din clasa parinte erau folosibile si de clasa copil
 *
 * in momentul in care instantiem o clasa Dog, de fapt instantiem si o clasa de tip Animal
 *
 * Animal
 * Dog, Cat, Parrot, etc...
 *
 * Animalul este un concept abstract care descrie mai multe lucruri pe care le vedem in jurul nostru
 * Piesa de mobilier
 * Forma
 *
 * Clase abstracte (keyword-ul abstract)
 * - clase care nu pot fi instantiate
 * - ele pot avea anumite comportamente (metode) care sunt si ele de asemenea abstracte (nu au implementare, exista doar
 * la nivel de idee)
 * - absolut orice clasa care are o metoda abstracta in implementarea ei trebuie sa fie si ea la randul ei abstracta
 *
 * Mostenire - ierarhic
 *
 * Animal -> Dog -> Bichon
 *
 * In momentul in care noi scriem un program, vrem in unele situatii sa ne asiguram ca anumite clase pe care le declaram
 * noi folosesc doar ca un blueprint pentru alte clase, iar acestea nu pot fi instantiate
 *
 * Interfete
 *
 * Clasele abstracte ne ofera un blueprint dupa care sa construim alte clase
 * Interfetele - o abstractizare la nivel mai inalt
 * - tot ce fac este sa imi descrie modul in care se poate comporta o clasa
 *
 * Motenirea este unica -> pentru fiecare copil putem sa avem maxim un parinte direct
 * C++, Python, etc...
 * Java nu s-a facut (de ce? asa au vrut astia care au facut limbajul)
 *
 * Mostenire multipla
 * O clasa poate sa implementeze mai multe interfete
 *
 * Mostenirea (clase normale si clase abstracte)
 *  - ne ofera un blueprint (o schema) dupa care noi putem construi alte clase
 *  - metode (normale sau abstracte) si proprietati
 *
 * Interfata (interface)
 *  - ne expune actiunile pe care o anumita instanta le poate face
 *  - metode (abstracte)
 *
 * Good practice: sa va ganditi inainte unde trebuie sa folositi mosteniri si unde interfete
 *
 */

public class Main {
    public static void main(String[] args) {
        Animal dog = new Bichon();
//        Animal test = new Animal();
        dog.walk();

        Bichon bichon = new Bichon();
        Parrot parrot = new Parrot();

        bichon.run();
        parrot.fly();

        Emu emu = new Emu();
        emu.walk();
        emu.fly();
        emu.run();

        // Putem declara o clasa parinte sa fie tipul de la compilare al unei clase copil
        // La fel putem face si cu interfetele

        List<CanFly> arr = new ArrayList<>();
        arr.add(parrot);
        arr.add(emu);

        for (CanFly item : arr) {
            item.fly(); // tipul de la compilare nu are o metoda de tip walk, are doar fly
        }

        CanFlyBetter chicken = new Chicken();
        chicken.flyBetter();
        chicken.fly();

        CanFly test1 = new Emu();
        CanFly2 test2 = new Emu();

        System.out.println("-----");
        test1.fly();
        test2.fly();
    }
}
