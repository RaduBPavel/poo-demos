/*
clase anonime:
- nu au un nume
- nu au constructor
- au 2 limitari:
    1. pot extinde o singura clasa SAU
    2. pot implementa o singura interfata
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Dog {

    private int age;
    private int numberOfBones;

    public Dog(int age, int numberOfBones) {
        this.age = age;
        this.numberOfBones = numberOfBones;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfBones() {
        return numberOfBones;
    }

    public void setNumberOfBones(int numberOfBones) {
        this.numberOfBones = numberOfBones;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", numberOfBones=" + numberOfBones +
                '}';
    }
}

class Test1 {
    public static void main(String[] args) {

        Dog dog1 = new Dog(7, 10);
        Dog dog2 = new Dog(10, 23);
        Dog dog3 = new Dog(10, 17);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dogs);

        /*
        1.  sortare dupa age crescator
        2.  sortare dupa bones crescator
         */

        Collections.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                int compareAge = o1.getAge() - o2.getAge();
                if(compareAge > 0) {
                    return 1;
                }
                else if(compareAge < 0) {
                    return -1;
                }
                // au varsta egala
                else {
                    int compareNumberOfBOnes = o1.getNumberOfBones() - o2.getNumberOfBones();
                    if(compareNumberOfBOnes > 0) {
                        return 1;
                    }
                    else {
                        return -1;
                    }
                }
            }
        });

        Collections.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return 0;
            }
        });

        System.out.println(dogs);




    }
}
