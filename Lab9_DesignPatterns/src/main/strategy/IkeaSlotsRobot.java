package main.strategy;

import java.util.Random;

public class IkeaSlotsRobot {
    int avere = 0;
    Random random;
    PacaneleStrategy strategy;

    public IkeaSlotsRobot() {
        this.random = new Random();
        this.strategy = new IncaseazaStrategy();
    }

    public void joaca(int bani) {
        avere += strategy.joaca(bani);
    }

    public void setStrategy(PacaneleStrategy strategy) {
        this.strategy = strategy;
    }
}
