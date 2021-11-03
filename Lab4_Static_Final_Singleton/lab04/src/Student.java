import java.util.ArrayList;

/***
 * deep copy - obiectele sunt indepenedente unul de celalalt
 * shalow copy - obiectele sunt dependente -> nu este o copie perfecta
 */

public class Student {

    public ArrayList<String> listaCumparaturi;

    public ArrayList<String> getListaCumparaturi() {
        return listaCumparaturi;
    }

    public void setListaCumparaturi(ArrayList<String> listaCumparaturi) {
        this.listaCumparaturi = listaCumparaturi;
    }

    public Student(ArrayList<String> listaCumparaturi) {
        // shallow copy
//        this.listaCumparaturi = listaCumparaturi;
        this.listaCumparaturi = new ArrayList<>(listaCumparaturi);
    }

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("paine");
        lista.add("apa");
        lista.add("spirt");
        lista.add("timisoreana");

        Student razvan = new Student(lista);
        razvan.getListaCumparaturi().remove("timisoreana");
        System.out.println(razvan.getListaCumparaturi());

        Student radu = new Student(lista);
        System.out.println(radu.getListaCumparaturi());

    }
}
