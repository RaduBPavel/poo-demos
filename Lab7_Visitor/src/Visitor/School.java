package Visitor;

import java.util.Random;

public class School extends Building {
    int numStudents;

    public School(int height, int width, int numStudents) {
        super(height, width);
        this.numStudents = numStudents;
    }

    // this -> compilare = School, runtime = School

    @Override
    public int accept(Visitor v) {
        return v.visit(this); // v.visit(School)
    }
}
