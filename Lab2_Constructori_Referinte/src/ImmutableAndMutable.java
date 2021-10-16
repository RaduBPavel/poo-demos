public class ImmutableAndMutable {

    // public String
    public void schimbaNume(String s1) {
        s1 = new String("Andreea");
        // return s1;
    }

    public void adaugaPopescu(StringBuilder sb) {
        sb.append(" Popescu");
    }

    public static void main(String[] args) {
        String s1 = new String("Maria");
        StringBuilder sb = new StringBuilder("Maria");

        ImmutableAndMutable immutableAndMutable = new ImmutableAndMutable();
        immutableAndMutable.schimbaNume(s1);
        System.out.println(s1);

        immutableAndMutable.adaugaPopescu(sb);
        System.out.println(sb);

        // ?
        // System.out.println(immutableAndMutable.schimbaNume(s1));

    }
}
