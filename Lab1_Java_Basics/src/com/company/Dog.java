package com.company;

public class Dog {
    private int age;
    private String name;
    private String color;

    /***
     Doua tipuri de constructori
     Constructori fara parametri (default) -> daca nu avem un constructor default, se face unul automat
     si initializeaza campurile clasei cu valorile default specifice
     int -> 0, float -> 0, boolean -> 0, String -> null
     Constructori cu parametri

     Keyword-ul this -> instanta curenta care apeleaza logica respectiva
     Prima oara creeaza o instanta

     In momentul in care scrieti un constructor si lucrati cu atributele din ele
     referiti-va la ele prin this

     Getteri si setteri
     get - sa iau valoarea unui camp
     set - sa modific valoarea unui camp

     Ca sa apelam o metoda a unei clase facem in felul urmator
     nume_variabila.nume_metoda(parametri)
    ***/


    public Dog() {
        this.age = 10;
        this.name = "Rex";
        this.color = "alb";
    }

    public Dog(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void getOld(int numYears) {
        age += numYears;
    }

    public void bark() {
        System.out.println("Bark from " + this.name); // printf, cout
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
