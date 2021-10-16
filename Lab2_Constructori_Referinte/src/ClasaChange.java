public class ClasaChange {

    public void change(TransferParametri transferParametri) {
        transferParametri.are18 = false;
        transferParametri.nume = "Radu";
        transferParametri.varsta = 6;
    }

    public static void main(String[] args) {
        ClasaChange clasaChange = new ClasaChange();
        TransferParametri transferParametri = new TransferParametri();
        System.out.println(transferParametri);

        clasaChange.change(transferParametri);

        // ?
        // System.out.println(transferParametri);
    }
}
