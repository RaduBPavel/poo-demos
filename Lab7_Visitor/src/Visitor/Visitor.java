package Visitor;

public interface Visitor {
    int visit(Building building);
    int visit(School school);
    int visit(Factory factory);
}
