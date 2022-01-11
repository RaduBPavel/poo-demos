package main.strategy;

import java.util.Random;

public class TripleazaStrategy implements PacaneleStrategy {
    @Override
    public int joaca(int bani) {
        int sansa = new Random().nextInt();

        if (sansa % 3 == 0) {
            System.out.println("Smecher barosan creier AMG");
            return bani * 3;
        } else {
            System.out.println("Am jucat ca niciodata si am pierdut ca intotdeauna");
            return 0;
        }
    }
}
