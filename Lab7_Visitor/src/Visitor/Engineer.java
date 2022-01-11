package Visitor;

import java.util.Random;

public class Engineer implements Visitor {
    public int visit(Building building) {
        System.out.println("Am facut audit la o cladire");

        Random rand = new Random();
        return rand.nextInt(50, 100);
    }

    public int visit(School school) {
        System.out.println("Am facut audit la o scoala");

        Random rand = new Random();
        return rand.nextInt(200, 500);
    }

    public int visit(Factory factory) {
        System.out.println("Am facut audit la o fabrica");

        Random rand = new Random();
        return rand.nextInt(1000, 3000);
    }
}
