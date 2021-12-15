package builder;

public class Mertan {

    // campuri obligatorii
    private String name;
    private int horsePower;
    private double roti;

    // optionale
    private boolean areNavigatie;
    private String lumini;
    private boolean semnalizare;

    private Mertan(MertanBuilder mb) {
        this.name = mb.name;
        this.horsePower = mb.horsePower;
        this.roti = mb.roti;
        this.areNavigatie = mb.areNavigatie;
        this.lumini = mb.lumini;
        this.semnalizare = mb.semnalizare;
    }

    static public class MertanBuilder {

        // campuri obligatorii
        private String name;
        private int horsePower;
        private double roti;

        // optionale
        private boolean areNavigatie;
        private String lumini;
        private boolean semnalizare;

        // campuri obligatorii
        public MertanBuilder(String name, int horsePower, double roti) {
            this.name = name;
            this.horsePower = horsePower;
            this.roti = roti;
        }

        // o metoda pt fiecare camp optional
        public MertanBuilder adaugaNavigatie(boolean navi) {
            this.areNavigatie = navi;
            return this;
        }

        public MertanBuilder adaugaLumini(String tipDeLumini) {
            this.lumini = tipDeLumini;
            return this;
        }

        public MertanBuilder adaugaSemnalizare(boolean semnalizare) {
            this.semnalizare = semnalizare;
            return this;
        }

        // final step
        public Mertan build() {
            return new Mertan(this);
        }
    }

    @Override
    public String toString() {
        return "Mertan{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                ", roti=" + roti +
                ", areNavigatie=" + areNavigatie +
                ", lumini='" + lumini + '\'' +
                ", semnalizare=" + semnalizare +
                '}';
    }
}
