/*
lambda: (parametru1, parametru2, parametru3) -> expresie
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>();
        for(int i = 0; i < 30; i++) {
            ints.add(i);
        }

        // Java 8
        ints.removeIf((obiect) -> obiect % 2 == 0);
        System.out.println(ints);

        ints.forEach((obiect) -> {
            if(obiect % 2 == 0) {
                System.out.println("nr pare\n");
            }
            else {
                System.out.println("nr impare\n");
            }
        });

        System.out.println(ints);


    }

}
