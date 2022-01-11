package Visitor;

import java.util.Random;

public class Factory extends Building {
    String product;

    public Factory(int height, int width, String product) {
        super(height, width);
        this.product = product;
    }

    @Override
    public int accept(Visitor v) {
        return v.visit(this); // v.visit(Factory)
    }
}
