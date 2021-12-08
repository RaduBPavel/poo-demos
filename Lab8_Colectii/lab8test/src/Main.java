/*
Collections
- interfete
- implementari
- algoritmi: cautare, sortare etc -> polimorfici - implementari diferite de colectii

- Set
    - nu permite elemente duplicate
    - nu avem garantia ordinii
- List
    - lista de elemente, permite duplicate
    - ordonata
- Map
    - pereche de elemente <key, value>, unde key si value sunt obiecte
    - nu avem garantia ordinii

Collection vs Collections

Collection:
- interfata
- list, set & queue: add, remove, clear, size, contains
- map face parte din frameworkul de collection, dar nu mosteneste interfata collection

Collections:
- utility class
- intervine asupra Collection cu metode statice de tipul sort, cautare, min, max

Parcurgere colectii:
- iteratori: obiect ce permite traversarea unei colectii si modificarea acesteia in acelasi timp cu iterarea
    - orice colectie are o metoda .iterator()
public interface Iterator<E> {
    boolean hasNext();
    E next();
    void remove(); // optional
}

- for each
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 1000; i++) {
            numbers.add(rand.nextInt(1001));
        }

        // vreau sa sterg toate numerele > 0
//        for(int i = 0; i < numbers.size(); i++) {
//            if(numbers.get(i) > -1) {
//                numbers.remove(i);
//            }
//        }

//        for(int i = 0; i < numbers.size(); i++) {
//            if(numbers.get(i) > -1) {
//                numbers.remove((Integer) i);
//            }
//        }

        // solutie -> folosim iterator
//        for(Iterator<Integer> it = numbers.iterator(); it.hasNext(); ) {
//            if(it.next() > -1) {
//                it.remove();
//            }
//        }

//        System.out.println(numbers);


//        Collection c = new ArrayList(); // by default -> Object
//        c.add(1);
//        c.add("da");
//        c.add(Boolean.valueOf(true));
//
//        System.out.println(c); // Downcast automat

//        Iterator it = c.iterator();
//        for( ; it.hasNext(); ) {
//            it.remove();
//        }

        Collections.sort(numbers);
//        Collections.reverse(numbers);

//        numbers.sort((o1, o2) -> {
//            int val = o1 - o2;
//            return Integer.compare(0, val);
//        });

//        numbers.stream().sorted(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                int val = o1.intValue() - o2.intValue();
//                if(val > 0) {
//                    return -1;
//                }
//                else if (val < 0) {
//                    return 1;
//                }
//                else return 0;
//            }
//        }).forEach(System.out::println);
//        System.out.println(numbers);

//        System.out.println(Collections.binarySearch(numbers, 2));
//        System.out.println(Collections.max(numbers));

        /*
        comparare elemente:
        1. cum v am aratat mai sus, folosind Comparator
        2. folosind interfata Comparable
         */

        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("Matei", 6));
        students.add(new Student("Radu", 22));
        students.add(new Student("Razvan", 22));
        students.add(new Student("Alex", 8));
        students.add(new Student("Mihai", 10));

//        Collections.sort(students);
//        System.out.println(students);

//        Set<Integer> integers = new HashSet<>();
//        for(int i = 0; i < 10; i++) {
//            integers.add(i);
//        }
//        System.out.println(integers);
//        String

        /*
        cum functioneaza hashcode in contract cu equals?

        1. intru pe instagram
        2. pun parola
        3. intru in cont

        parola: razvan123 -> Database: equals? NU

        razvan123 -> hashcode -> asjkfhaksjhf
        razvan123 - asjkfhaksjhf

        ^ compara cele 2, sunt egale -> ma loghez
        nu sunt egale -> am gresit parola
         */

        Map<String, Integer> test = new TreeMap<>();
        test.put("Matei", 10);
        test.put("Andrei", 4);
        test.put("Razvan", 6);
        test.put("Alex", 11);

//        System.out.println(test);
//        for (Map.Entry<String, Integer> entry : test.entrySet()) {
//            if(entry.getKey().equals("Andrei")) {
//                test.remove("Andrei");
//            }
//        }

        // solutie -> folosim iteratori

        Iterator<Map.Entry<String, Integer>> it = test.entrySet().iterator();
        for( ; it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            if(entry.getKey().equals("Andrei")) {
                it.remove();
            }
        }


        for (Map.Entry<String, Integer> entry : test.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }










    }
}
