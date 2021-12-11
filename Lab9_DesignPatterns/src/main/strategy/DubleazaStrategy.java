package main.strategy;

import java.util.Random;

public class DubleazaStrategy implements PacaneleStrategy {
    @Override
    public int joaca(int bani) {
        int sansa = new Random().nextInt();

        if (sansa % 2 == 0) {
            System.out.println("Ai pierdut, teapa fraiere");
            return 0;
        } else {
            System.out.println("Bravo smechere, ai dublat suma");
            return bani * 2;
        }
    }
}
