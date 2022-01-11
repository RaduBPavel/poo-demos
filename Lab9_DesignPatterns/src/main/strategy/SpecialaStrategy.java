package main.strategy;

public class SpecialaStrategy implements PacaneleStrategy {
    @Override
    public int joaca(int bani) {
        System.out.println("Joci la speciala");
        return bani;
    }
}
