import builder.Mertan;
import command.Command;
import command.SubmissionCommand;
import command.User;
import command.VMCK;

public class Main {

    public static void main(String[] args) {

        /***
         * Builder:
         * - design pattern creational
         * - ex: StringBuilder
         *
         * - ce problema rezolva?
         *
         * - supraincarcarea de constructori + adaugare/schimbare setters/getters ++ multe metode de schimbat
         * - cod duplicat
         *
         */

        Mertan mertan1 = new Mertan.MertanBuilder("C", 350, 19.0).build();

        Mertan mertan2 = new Mertan.MertanBuilder("C", 350, 19.0)
                .adaugaLumini("LED")
                .adaugaNavigatie(Boolean.TRUE)
                .adaugaSemnalizare(Boolean.TRUE)
                .build();

//        System.out.println(mertan1);
//        System.out.println("--");
//        System.out.println(mertan2);


        // ------------------------------------------------ command

        // instanta de receiver
        User razvan = new User("Razvan");
        // instanta de invoker
        VMCK vmck = new VMCK();

        // commands

        /*
        1. incarc o submisie
        2. dupa cateva zile, incarc alta submisie
        3. am realizat ca ultima submisie e gresita, deci vreau sa revin la prima
         */

        Command cmd1 = new SubmissionCommand(razvan, 15, 37);
        vmck.execute(cmd1);

        Command cmd2 = new SubmissionCommand(razvan, 17, 55);
        vmck.execute(cmd2);

        // 3. am realizat ca ultima submisie e gresita, deci vreau sa revin la prima
        vmck.undo();

        // daca vreti sa vedeti stiva de apeluri, unde userul Razvan e mereu cu aceleasi campuri
        // de ce? se tine o referinta catre el -> soft copy
        // System.out.println(vmck.getStack());
        System.out.println(razvan.getSubmissionDate() + " " + razvan.getSubmissionID());
        // revine la 15, 37

        /*
        daca mai incerc un undo()
        -> o sa revina la 0 0 -> valorile initiale
        -> stack ul devine gol
         */

//        vmck.undo();
//        System.out.println(razvan.getSubmissionDate() + " " + razvan.getSubmissionID());

    }
}
