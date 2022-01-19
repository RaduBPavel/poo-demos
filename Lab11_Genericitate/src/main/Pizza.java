package main;

class Pizza {
    protected String name = "Pizza";

    public String getName() {
        return name;
    }
}

class HamPizza extends Pizza {
    public HamPizza() {
        name = "HamPizza";
    }
}

class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "CheesePizza";
    }
}
