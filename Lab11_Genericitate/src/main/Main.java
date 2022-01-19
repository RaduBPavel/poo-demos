package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /***
         * SD: vectori, liste, hashmaps, stack, queue, etc...
         * C:
         * tip_variabila *nume_variabila;
         * int *vector, float *list;
         *
         * void *vector -> void* la orice element, cu conditia sa ii faceti cast cand folositi elementul respectiv
         *
         * Genericitate
         *
         * List<Integer>, Stack<Float>
         *
         * List my_list = new ArrayList<>();
         * my_list.add((String)element);
         * string my_el = (String)my_list.get(0);
         *
         * List<Integer> my_list = ...
         * my_list.add(...)
         * string my_el = my_list.get(...)
         *
         * Object care este parintele tuturor claselor din Java
         */

        MyGenericElement<Integer> element = new MyGenericElement<>(10);
        System.out.println(element.getElement());
        element.setElement(20);
        System.out.println(element.getElement());

        MyGenericTuple<Integer, Float, Double> tuple = new MyGenericTuple<>(10, 15.2f, 16.3);
        System.out.println(tuple);

        Integer test_int = 10;
        Object test_obj = test_int;

        System.out.println(test_int);
        System.out.println(test_obj);

//        List<String> string_list = new ArrayList<>();
//        List<Object> object_list = string_list;

        /***
         * Wildcards: ?
         * Denota ca in locul wildcard-ului poate sa fie orice tip de clasa
         * Object =/= orice tip de clasa
         *
         * MyWildcardElement<?> -> Integer sau Float sau Number sau Object sau ...
         *
         * Upper bounded wildcard -> se face la laborator
         * ? extends nume_clasa -> poate fi inlocuit cu orice tip de element care este copilul lui nume_clasa
         *
         * Lower bounded
         * ? super nume_clasa -> poate fi inlocuit cu orice tip de element care este parintele lui nume_clasa
         */

        /***
         * Cum scriem teste?
         */

        my_function(10, 10.5); // se deduce tipul generic pe care il folositi din apelul functiei
    }

    // Metoda care imi parcurge o lista de orice tip de elemente si imi printeaza fiecare element
    public static void traverseList(List<?> my_list) {
        // my_list e de tipul string
        List<String> my_string_list = (List<String>) my_list; // SA NU FACETI ASTA IN VIATA VOASTRA
        for (Object my_obj : my_list) {
            System.out.println(my_obj);
        }
    }

    // O sa primim o lista de elemente care are fie Pizza, HamPizza sau CheesePizza
    // SA NU FOLOSITI UPPER BOUNDED WILDCARDS -> NU SUNT LA FEL DE EXPLICITE CA ABORDAREA DE MAI JOS
    public static void printPizza(List<? extends Pizza> my_pizza_list) { // ASA AR FI CORECT
        for (Pizza pizza : my_pizza_list) {
            System.out.println(pizza.getName());
        }
    }

    // Metode generice
    // modificator_access static? <T1, T2, ..., Tn> tip_return semnatura_functie
    public static <T, V> void my_function(T element, V element2) {
        System.out.println(element + " " + element2);
    }

    static <T extends Pizza> void correctCopy(T[] a, Collection<T> c) {
        for (T o : a)
            c.add(o); // Operaţia va fi permisă
    }

//    static void incorrectCopy(Object[] a, Collection<?> c) {
//        for (Object o : a)
//            c.add(o);
//    }
}
