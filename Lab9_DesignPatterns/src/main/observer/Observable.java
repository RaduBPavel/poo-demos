package main.observer;

import java.util.ArrayList;
import java.util.List;

/***
 * Ce trebuie sa poata face un observable?
 * 1. Trebuie sa stie sa ataseze observatori la lista lui de observatori
 * 2. Trebuie sa stie sa trimita notificari catre observatori cand apar schimbari
 * In momentul in care se produce o schimbare, apelam o metoda notify() care notifica observatorii
 */
public abstract class Observable {
    List<Observer> observers;

    public Observable() {
        this.observers = new ArrayList<>();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyObservers(String employeeName, boolean isWorking) {
        for (Observer observer : observers) {
            observer.update(employeeName, isWorking);
        }
    }
}
