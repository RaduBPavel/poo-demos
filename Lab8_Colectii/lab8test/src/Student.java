import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private Integer nota;

    public Student(String name, Integer nota) {
        this.name = name;
        this.nota = nota;
    }

    public String getName() {
        return name;
    }

    public Integer getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", nota=" + nota +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        /*
        descendent dupa nota, ascendent dupa nume
         */

        int nota = getNota() - o.getNota();
        if (nota > 0) {
            return -1;
        }
        else if (nota < 0) {
            return 1;
        }
        // note egale -> sortez dupa nume ascendent
        else {
            return getName().compareTo(o.getName());
        }
    }
}
