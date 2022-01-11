package main.strategy;

public class StrategyFactory {
    public PacaneleStrategy create(String strategyType) {
        switch (strategyType) {
            case "incaseaza":
                return new IncaseazaStrategy();
            case "dubleaza":
                return new DubleazaStrategy();
            case "tripleaza":
                return new TripleazaStrategy();
            case "speciala":
                return new SpecialaStrategy();
            default:
                return null;
        }
    }
}
