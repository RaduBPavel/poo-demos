public class Jucator {

    public String name;

    public Jucator(String name) {
        this.name = name;
    }

    // arunce o exceptie catre alt jucator
    public void aruncaMinge(Minge minge) throws Minge {

        System.out.println("am aruncat mingea");
        throw minge;
    }

    // prinda o exceptie si sa afiseze ceva
    public void prindeMinge(Minge minge) {
        System.out.println("am prins o");
        System.out.println(minge.getMessage());
    }
}
