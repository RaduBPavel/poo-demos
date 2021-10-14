package com.company;

import newPackage.Cat;

public class Main {
    /***
     * Programare orientata obiect (POO)
     * - paradigme de progamare
     * - programarea secventiala (C, C++) -> ii dictezi compilatorului ce sa faca linie cu linie
     * - programarea orientata obiect (Java) -> simulam cum functioneaza si lumea reala
     *  -> modeleze interactiuni intre diferite entitati
     *
     *  Clasa - entitate
     *      - atribute (campuri) - descrieri ale atributiilor entitatii respective
     *      - metode - descrieri ale actiunilor pe care pot sa le faca diferite entitati
     *      - constructor - metoda care se apeleaza in momentul in care instantiem o clasa
     *      - sunt denumite cu litera mare
     *
     *  Primitive - unitati de logica de baza
     *  int a, char b, float c, boolean d
     *  Integer a, Char b, Float c, Boolean d
     *
     *  Modificatori de acces
     *
     *  public - poate fi accesat de oriunde, indiferent de locatie
     *  default - poate fi accesat din interiorul pachetului (default nu se scrie ca modificator, daca nu puneti nimic e automat default)
     *  protected - poate fi accesat din interiorul pachetului sau din clasele care mostenesc o alta clasa
     *  private - poate fi accesat doar in interiorul clasei
     *
     *  Fiecare clasa, fisier, ce-om implementa noi se afla in interiorul unui pachet
     *  Pachet - folder
     */

    public static void main(String[] args) {
        int first_num, second_num;

        Dog myDog = new Dog();
        System.out.println(myDog.getAge() + " " + myDog.getName() + " " + myDog.getColor());

        Dog myBetterDog = new Dog(5, "Tom", "black");
        System.out.println(myBetterDog.getAge() + " " + myBetterDog.getName() + " " + myBetterDog.getColor());

        myBetterDog.setAge(15);
        System.out.println(myBetterDog.getAge());

        Cat myCat = new Cat();
        System.out.println(myCat.age);

        // int[] arr = {1, 2, 3, 4}
        int[] arr = {1, 2, 3, 4}; // arr = [1, 2, 3, 4]
        int[] betterArr = new int[20]; // arr = [0, 0, ..., 0] == calloc

        // length - marimea array-ului
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}
