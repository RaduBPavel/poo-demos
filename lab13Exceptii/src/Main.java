import chainOfResponsibility.DeleteQuery;
import chainOfResponsibility.GetQuery;
import chainOfResponsibility.PostQuery;
import chainOfResponsibility.Request;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/***
 * Lab13 - Exceptii
 *
 * Ce sunt exceptiile?
 * OOP -> orice in spate este pana la urma un obiect
 * Exceptie -> Obiect
 *
 * Cum sunt folosite exceptiile?
 *
 * Exceptiile sunt evenimente (conceptual) care apar asupra unor actiuni neasteptate/asteptate
 *
 * Actiuni asteptate = Exceptii checked -> programul POATE sa nu se inchida
 * - FIleNotFoundException
 * - IOException
 * ...
 * Exceptii definite de noi
 *
 * Actiuni neasteptate -> JVM ul nu stie sa le trateze, iar programul se inchide
 * - NullPointerException
 * - ArithmeticException
 * - ArrayIndexOutOfBounds
 * ^
 * array[10] -> 11
 *
 * de unde provin exceptiile?
 * Interfata Throwable
 *
 *
 *
 * blocul FINALLY se executa INTOTDEAUNA ORICE AR FI !!!!!!!!!
 *
 */



public class Main {

    public static void main(String[] args) throws FileNotFoundException, NullPointerException {

//        try (Scanner scanner = new Scanner(new File("src/dum111my.txt"))) {
//            String output = scanner.nextLine();
//            System.out.println(output);
//        } catch (NullPointerException | FileNotFoundException exception ){
//            // tratam exceptia cum vrem
//            System.out.println("Am prins exceptia");
////            return; // se va executa ultimul, imediat dupa finally
//            try {
//                throw new Exception();
//            } catch (Exception e) {
//                System.out.println("Am prins exceptia 2");
//            } finally {
//                System.out.println("Finally 2");
//            }
//        }
//        finally {
//            System.out.println("Sunt blocul finally");
//        }
//        System.out.println("Sunt blocul finally");

        // exceptii definite de noi

        Jucator aruncator = new Jucator("Razvan");
        Jucator prinzator = new Jucator("Radu");

        try {
            aruncator.aruncaMinge(new Minge());
        } catch (Minge minge) {
            prinzator.prindeMinge(minge);
        }

        // chain: get -> delete -> post -> []
        GetQuery getQuery = new GetQuery();
        DeleteQuery deleteQuery = new DeleteQuery();
        PostQuery postQuery = new PostQuery();

        getQuery.setNextChain(deleteQuery);
        deleteQuery.setNextChain(postQuery);

        Request request = new Request("jkadasda");
        getQuery.calculate(request);
    }
}


/***
 * exceptii si mostenirea lor
 *
 * doSomething() in clasa parinte care face throws Exception
 * Exception - exceptie parinte
 *
 * clasa copil:
 * @Override
 * doSomething() o sa putem sa aruncam doar exceptii COPIL ale lui Exception sau chiar Exception
 *
 * --alt exemplu
 *
 * doSomething() in clasa parinte care face throws FileNotFound
 * doSomething() din clasa copil NU o sa poata sa dea throw Exception (parinte al lui FileNotFound)
 * - poate arunca doar FileNotFound sau derivatele lui
 *
 */