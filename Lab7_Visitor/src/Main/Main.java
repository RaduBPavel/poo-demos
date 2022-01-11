package Main;

import Overloading.Human;
import Overriding.Animal;
import Overriding.Dog;
import Visitor.Building;
import Visitor.Engineer;
import Visitor.Factory;
import Visitor.School;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /***
         * Overloading, overriding
         *
         * Overloading
         *  - supraincarcare
         *  - aceeasi functie dar cu alti parametri sau alt numar de parametri
         *  - ne ajuta in cadrul unei clase sa definim mai multe functionalitati pentru acelasi nume de metoda
         *  - noi suprascriem o functie in momentul in care ii schimbam numarul parametrilor / tipul parametrilor
         *  - noi daca schimbam tipul de return NU se face supraincarcare
         *  - in Java, semnatura functiei este data de:
         *      - numele functiei
         *      - numarul si tipul parametrilor
         *  - se face la compilare -> noi in momentul in care scriem codul in editor si dupa copilam
         *      atunci se vad schimbarile
         */

//        Human razvan = new Human();
//        razvan.walk();
//        razvan.walk(10);

        /***
         * Overriding
         *  - suprascriere
         *  - aceeasi functie cu aceeasi semnatura (acelasi nume, aceeasi parametri, aceleasi tipuri la params)
         *  - metodele isi definesc functionalitatea in functie de tipul instantei
         *  - tipul instantei de la runtime
         *  - noua ne permite sa definim o anumita actiune pentru mai multe clase in diferite feluri
         */

//        Animal animal = new Animal();
//        Animal dog = new Dog();
//
//        animal.run();
//        dog.run();

        /***
         * Super
         *  - se refera la instanta parintelui
         *  - cand instantiem un Dog -> new Animal() -> new Dog()
         *  - vrem sa accesam specific o metoda din Animal in clasa Dog
         *  - vrem sa accesam specific o variabila din Animal in clasa Dog
         *  - super === this, doar ca super se refera la zona de memorie a parintelui, this la zona de memorie curenta
         */

        // Trebuie sa facem cumva ca sa calculam auditul energetic pentru fiecare cladire
        // rand(50, 100) daca este o cladire + un mesaj ca am facut audit la cladire
        // rand(200, 500) daca este o scoala + un mesaj ca am facut audit la scoala
        // rand(1000, 3000) daca este o fabrica + un mesaj ca am facut audit la fabrica

        Building building = new Building(10, 20);
        School school = new School(10, 40, 300);
        Factory factory = new Factory(20, 30, "tablie");

        List<Building> buildings = new ArrayList<>(); // se face upcast automat la Building
        buildings.add(building);
        buildings.add(school);
        buildings.add(factory);

        Engineer engineer = new Engineer();

        for (Building item : buildings) {
////            System.out.println(engineer.doAudit(item));
//            if (item instanceof Factory) {
//                engineer.doAudit((Factory) item);
//            } else if (item instanceof School) {
//                engineer.doAudit((School) item);
//            } else if (item instanceof Building) {
//                engineer.doAudit(item);
            System.out.println(item.accept(engineer));
        }

        /***
         * Encapsulation
         *  - o clasa nu trebuie sa faca lucruri pe care ea in mod normal nu le ar face
         *
         * Noi daca vrem sa mai adaugam o instanta de cladire, trebuie sa ne ducem dupa in cladirea
         * respectiva si sa suprascriem functia de doAudit()
         * Nu este recomandat de obicei sa schimbi clase care se afla in productie
         *
         * Pas 1: Unii algoritmi / unele functionalitati trebuie desprinse de anumite clase si trebuie
         * facute in locuri separate
         * Ce facem? Facem o instanta noua care se ocupa de chestia
         *
         * Noi in momentul in care compilam programul, o sa se execute urmatoarele functii
         *
         * engineer.doAudit(building) -> Building / Building
         * engineer.doAudit(school) -> Building / School
         * engineer.doAudit(factory) -> Building / Factory
         *
         * Pas 2: Cum facem sa ii specificam inginerului nostru ca instantele pe care le dam noi
         * sunt de un anumit tip si nu de tipul parintelui?
         *
         * this -> tip compilare = tip instanta = tipul clasei
         *
         * Visitor - design pattern
         *  - ne ajuta sa separam un anumit algoritm / o anumita functionalitate de clase
         *  - se foloseste in primul rand te conceptul de tip de la runtime vs tip de la compilare
         *  - tip compilare - in momentul in care compilam programul
         *  - tip runtime - in momentul in care rulam programul
         *  - de asemenea, se foloseste si the this -> acelasi tip la runtime + acelasi tip la compile time
         *
         *  - o clasa ii spune unui vizitator sa apeleze o metoda din cadrul vizitatorului cu parametrul this
         *      asta fortandu-l sa aleaga specific tipul de la runtime al instantei
         */
    }
}
