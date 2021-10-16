
public class Referinte {

    String nume;
    String altNume = "Razvan";
    String celalaltNume = new String("Razvan");

    public static void main(String[] args) {

        Referinte referinte = new Referinte();

        System.out.println(referinte.nume);
        System.out.println(referinte.altNume);

        // System.out.println(referinte.altNume == referinte.celalaltNume);
        // System.out.println(referinte.altNume.equals(referinte.celalaltNume));

        System.out.println("----------------------------------------");
        // String pool https://static.javatpoint.com/core/images/string-pool-in-java.png

        // String sigurAltNume = "Razvan";
        // System.out.println(referinte.altNume == sigurAltNume);

        String imInTheStringPool = "fhaifhaj";
        String imNot = new String("fhaifhaj");
        System.out.println(imInTheStringPool == imNot);

        String maybeIAmNow = imNot.intern();
        System.out.println(imInTheStringPool == maybeIAmNow);

        // Java String Pool - Heap - garbage collected by the JVM

    }
}
