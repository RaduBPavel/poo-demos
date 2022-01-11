package main.observer;

/***
 * Eu, Manager-ul sa fiu alertat in momentul in care unul din angajati face o anumita chestie (intreprinde o anumita
 * actiune)
 * Angajatul poate sa:
 *  - ia pauza
 *  - sa se apuce de munca
 */
public class Manager implements Observer {
    String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void update(String employeeName, boolean isWorking) {
        if (isWorking) {
            System.out.println("Angajatul: " + employeeName + " s-a apucat de munca");
        } else {
            System.out.println("Angajatul: " + employeeName + " si-a luat o pauza");
        }

    }
}
