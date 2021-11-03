import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        HashMap<Integer, String> dictionar = new HashMap<>();

        // adaugare perechi

        Integer a1 = Integer.valueOf(3);
        dictionar.put(a1, "radu");
        dictionar.put(4, "razvan");
        dictionar.put(7, "catalin");
        System.out.println(dictionar);

        dictionar.put(4, "asdada");
        System.out.println(dictionar);

        if(dictionar.containsKey(4)) {
            System.out.println("exista");
        }

        System.out.println(dictionar.get(4));

        for (HashMap.Entry<Integer, String> entry: dictionar.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
