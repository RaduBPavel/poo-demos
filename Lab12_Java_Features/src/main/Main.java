package main;

import main.interfete.Bird;
import main.interfete.CanFlyAndSwim;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    /***
     * Interfete
     * - metode statice
     * - metode default
     *
     * Programare functionala in Java
     *
     */

    public static void main(String[] args) {
        /***
         * Interfetele - un mod de a descrie actiuni pe care le pot face anunmite obiecte
         * - metode neimplementate, care trebuie implementate cand se foloseste interfata
         * - variabile statice si finale in cadrul lor
         * - odata cu Java8, au aparut metode default si metode statice
         *
         * Interfata = clasa, doar ca cu mai putine posibilitati de a le folosi
         *
         * Metodele default din mai multe interfete nu pot sa aiba aceeasi semnatura a functiei, se supara
         * compilatorul
         */

//        CanFlyAndSwim.doSomething();
//        Bird bird = new Bird();
//        bird.swim();

        /***
         * PC, SD, POO
         * PC, SD - C -> programare procedurala (paradigma de programare procedurala)
         * POO - Java -> programare orientata obiect (paradigma de programare obiect)
         * PP - paradigma de programare functionala si logica
         *
         * Programare functionala - unitatea de baza este functia
         *
         * C - interactionam si modificam datele cu ajutorul procedurilor
         * Java - interactionam si modificam datele cu ajutorul obiectelor
         * Kotlin, Racket, Haskell - interactionam si modificam datele cu ajutorul functiilor
         *
         * Odata cu Java8, s-a introdus programarea functionala in Java
         * De obicei, in programarea functionala lucram cu colectii de elemente (Liste, Seturi, Dictionare, etc...)
         *
         * Stream -> flux de date (wrapper peste colectiile de date pe care le folosim care ne permite sa il modificam
         * folosind programare functionala)
         */

        List<Integer> my_list = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            my_list.add(i);
        }
        System.out.println(my_list);

        // Pentru a converti dintr-o colectie de date intr-un stream, folosim metoda stream()
        Stream<Integer> my_stream = my_list.stream();
        // Stream =/= colectie
        // Stream-u pointeaza catre primul element din stream, primul element catre al doilea si tot asa
        // stream == LinkedList

        System.out.println(my_stream);

        /***
         * Cum manipulam noi stream-ul asta pentru a ii modifica valorile din el?
         *
         * Cum transformam un stream intr-o colectie de date?
         * Folosim metoda collect()
         * Collectors - o clasa care contine metode de conversie din stream-uri in colectii
         * toSet, toMap
         *
         * Cum modificam datele din interiorul unui stream?
         * Map, Filter, Reduce
         */

        List<Integer> modified_list;
        modified_list = my_list.stream().collect(Collectors.toList());

        System.out.println(modified_list);

        /***
         * Map -> aplica o functie fiecarui element din cadrul stream-ului (Function -> primeste un tip A si intoarce un tip B)
         *
         * [0, 1, 2, 3, 4]
         * un map caruia ii dau o functie f care aduna 5 la elementul pe care il primeste
         * [4, 5, 6, 7, 8]
         *
         * [ add(0), add(1), ..., add(4)]
         * Cand scriem ceva functional, folosim lambda-uri mereu cand putem
         */

        List<Integer> map_list;
        map_list = my_list.stream()
                .map(x -> x * 2) // din cadrul clasei Main, o sa folosim metoda add (NU O APELAM, DOAR II ZICEM CA METODA AIA SE FOLOSESTE)
                .collect(Collectors.toList());

        System.out.println(map_list);

        /***
         * Filter -> aplica o functie fiecarui element din cadrul stream-ului, o functie care intoarce True sau False
         * daca e True, ramane in stream
         * daca e False, e stearsa din stream
         * Predicate -> primeste un tip A si intoarce o valoare de adevar (bool)
         *
         * [0, 1, 2, 3, 4, 5, 6]
         * pastram toate elementele pare
         * is_even() = x % 2 == 0
         * [is_even(0), is_even(1), ..., is_even(6)]
         * [True, False, True, False, True, False, True]
         * [0, 2, 4, 6]
         */

        List<Integer> filter_list;
        filter_list = my_list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(filter_list);

        /***
         * Reduce -> aplica o operatie (matematica, ce-o fi) pe fiecare element din cadrul unui stream
         * incepe cu un acumulator -> valoarea initiala a rezultatului
         * aplica functia pe acumulator si primul element si intoarce curr_result
         * aplica functia pe curr_result si al doilea element si intoarce curr_result
         * ...
         * aplica functia pe curr_result si ultimul element si intoarce curr_result
         *
         * [0, 1, 2, 3, 4, 5] -> noi vrem sa adunam toate elementele din stream
         * reduce(accumulator, functie)
         * functia din reduce e o functie de tip Function: primeste A si intoarce B
         * acc = 0
         * acc + 0 = 0 -> acc = 0
         * acc + 1 = 1 -> acc = 1
         * ...
         * acc + 5 = (0 + 1 + 2 + 3 + 4) + 5 = 15 (inainte, acc = 10, dupa acc = 15)
         * intoarce rezultatul final
         */

        int my_sum = 0;
        my_sum = my_list.stream()
                .reduce(0, (x, y) -> x + y); // unde x e acumulatorul si y este valoarea curenta
        System.out.println(my_sum);

        /***
         * flatMap, groupingBy
         *
         * flatMap
         * -> flat: aduce toate elementele dintr-un stream pe acelasi nivel (nivelul 0)
         * flat presupune ca toate elementele pe care le aducem la nivelul de sus sunt din cadrul unui stream
         * -> map: aplica o functie pe fiecare element din cadrul unui stream
         *
         * Stream: Stream0, Stream1, Stream2
         */

        List<List<Integer>> listOfLists =
                List.of(List.of(1, 2, 3, 4), List.of(10, 9, 8, 7), List.of(5, 6));
        // un stream care are pe pozitia 0 o lista, pe pozitia 1 alta lista, pe poz 2 alta lista

        List<Integer> result = listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(result);

        /***
         * groupingBy -> grupeaza toate elementele in functie de o caracteristica data (pe care o alegem noi)
         * -> nu mai intoarce un stream, intoarce un Map<caracteristica><lista<elemente>>
         * -> face parte din Collectors
         *
         * groupingBy(functie care se aplica pe elemente si ne intoarce o valoare, valoare dupa care grupeaza,
         * functie care se aplica pe elemente care s-au gasit a avea acea valoare)
         */

        // list_bird -> snake case, listBird -> camel case
        List<Bird> birdList = new ArrayList<>();
        birdList.add(new Bird(10, 20));
        birdList.add(new Bird(10, 40));
        birdList.add(new Bird(20, 20));
        birdList.add(new Bird(20, 50));

        Map<Integer, List<Integer>> myMap = new HashMap<>();
        myMap = birdList.stream()
                .collect(Collectors.groupingBy(Bird::getAge, Collectors.mapping(Bird::getWeight, Collectors.toList())));
        System.out.println(myMap);

        // HashMap -> dictionarului din Java si ti le baga la semi intamplare (le baga dupa hash)
        // TreeSet -> SortedSet care iti sorteaza elementele pe masura ce le baga
        // le sorteaza dupa ce comparator ii dai tu la TreeSet la declaratie

        // vreti sa sortati o lista de elemente
        // 1. le bagati intr-un treeSet
        SortedSet<Bird> treeSet = new TreeSet<>(Comparator.comparing(Bird::getWeight));
        treeSet.addAll(birdList);

        // 2. sa sortati lista
        birdList.stream()
                .sorted(Comparator.comparing(Bird::getWeight))
                .collect(Collectors.toList());
        /***
         * var -> C/C++ e un fel de auto
         * var tine loc de orice tip de date din Java, iar tipul unei variabile declarate cu var se afla la compilare
         */

        var my_num = 10; // asta e un Integer
    }
}
