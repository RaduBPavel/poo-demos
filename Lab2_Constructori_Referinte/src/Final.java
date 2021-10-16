public class Final {

    String padure = "Hoia";
    StringBuilder sb = new StringBuilder("Brad");

    public void randomize(String s, StringBuilder sb) {
        s += "Baciu"; // s = s + "Baciu"
        sb.append(" Pitt");

        s = null;
        sb = null;
    }

    public static void main(String[] args) {
        Final fin = new Final();

        fin.randomize(fin.padure, fin.sb);
        // System.out.println(fin.padure);
        // System.out.println(fin.sb);
    }
}


