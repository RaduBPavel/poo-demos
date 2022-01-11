package Visitor;

import java.util.Random;

public class Building implements Visitable {
    int height;
    int width;

    public Building(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea() {
        return height * width;
    }

    @Override
    public int accept(Visitor v) {
        return v.visit(this); // v.visit(Building)
    }
}
