package main;

import main.factory.*;
import main.observer.Employee;
import main.observer.Manager;
import main.strategy.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/***
 * Design Patterns
 *  - o modalitate de a scrie cod pentru a rezolva o anumita problema pe care o intalniti
 *  in timp ce scrieti un program
 *  - retete pe care le aplicati in locurile in care se potrivesc
 *  - Singleton, Visitor
 *
 * Singleton
 * - problema: voiam sa avem o singura instanta a unui anumit obiect in cadrul intregului program
 *
 * Visitor
 * - problema: se foloseste double dispatch, polimorfism static in dinamic
 * - sa nu adaugam logica de cod in clase care n ar trebui sa contina logica respectiva (incapsulare!!!)
 *
 * Disclaimer:
 * - daca aveti o anumita problema in cod pe care vreti sa o rezolvati, nu trebuie folosit neaparat un design pattern
 * - keep it simple, nu va complicati prea tare
 *
 * Design Patterns
 * - Creational Patterns - rezolva probleme legate de cum se instantiaza entitati (Singleton, Factory)
 * - Structural Patterns - rezolva probleme legate de cum se stabilesc relatiile intre entitati, ex: Decorator, Adapter
 * - Behavioural Patterns - rezolva probleme legate de interactiunea intre entitati (Visitor, Observer)
 * - Concurrency Pattenrs - rezolva probleme legate de cum comunica entitati in mod paralel (APD - an 3, sem 1)
 * - Architectural Patterns - rezolva probleme legate de cum interactiuneaza diferite componente in cadrul unui sistem
 * (Model View Controller - MVC - Java Spring si Springboot)
 *
 * N.B: Spring + Springboot - Framework-uri de web development (backend) pentru Java
 * Fiecare componenta din aplicatie este de sine statatoare
 * Ele se leaga unele de altele prin cadrul altor componente mai mari
 * Noi comunicam cu componentele alea mai mari pentru a folosi backend-ul
 *
 * Factory, Observer, Strategy
 * 1. Ce problema rezolva ele?
 * 2. Cum rezolva problema respectiva?
 *
 * Factory
 * - problema: avem o gramada de logica de creeare de obiecte in locuri in care n-ar trebui sa fie
 * + e greu de extins
 * - solutie: facem o instanta dedicata crearii altor instante intr-un mod mai programatic, in care logica nu
 * se duce prin toate partile posibile si imposibile
 *
 * Observer
 * - problema: vrem sa avem o modalitate in care o anumita instata este atentionata in momentul in care se
 * produc schimbari in starea altei instante / o alta instanta a facut o anumita actiune
 * - solutia: sa ne creeam interfete specializate care ne ofera posibilitatea asta
 *
 * Cum va functiona?
 * Observer -> e notificat de toate schimbarile care se petrec in instantele observabile (Observable)
 * Observable -> ce este observat, trebuie sa notifice observatorul cand apar modificari
 *
 * Observer -> primeste notificari de la Observable si actioneaza intr-un anumit fel
 * Observable -> are o lista de observatori, List<Observer> pe care ii notifica cand se produce o schimbare
 *
 * Strategy
 *  - problema: vrem sa dictam in mod dinamic unei instante cum sa se comporte, fara sa trebuiasca
 *  sa adaugam logica in plus aiurea in ea, pe care nu o sa o foloseasca poate niciodata
 *  - solutia: fiecare instanta careia vrem sa ii dam mai multe functionalitati care se schimba dinamic
 *  are ca atribut o interfata, din care se extind mai multe clase care fac actiuni diferite
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // -> clasa care ne lasa sa citim date de la tastatura
//        FurnitureFactory factory = new FurnitureFactory();
//        List<Furniture> furnitures = new ArrayList<>();
//
        int numElems = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < numElems; ++i) {
//            String furnitureType = scanner.nextLine();
//            furnitures.add(factory.createFurniture(furnitureType));
//        }
//
//        for (Furniture furniture : furnitures) {
//            furniture.show();
//        }

//        Manager manager = new Manager("Radu");
//        Employee razvan = new Employee("Razvan", manager);
//        Employee catalin = new Employee("Catalin", manager);
//        Employee octavian = new Employee("Octavian", manager);
//
//        razvan.stopWorking();
//        catalin.stopWorking();
//        octavian.stopWorking();
//
//        catalin.startWorking();
//        octavian.startWorking();

        IkeaSlotsRobot robot = new IkeaSlotsRobot();
        StrategyFactory factory = new StrategyFactory();
        Random random = new Random();
        for (int i = 0; i < numElems; ++i) {
            String strategy = scanner.nextLine();

            robot.setStrategy(factory.create(strategy));

            robot.joaca(random.nextInt() % 100);
        }
    }
}
