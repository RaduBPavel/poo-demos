// lazy instantiation
//public class Frigider {
//
//    static Frigider instance = null;
//
//    private Frigider() {
//
//    }
//
//    public static Frigider getInstance() {
//        if(instance == null) {
//            instance = new Frigider();
//            return instance;
//        }
//        else {
//            return instance;
//        }
//    }
//}

// eager instantiation
public class Frigider {

    static Frigider instance = new Frigider();

    private Frigider() {
//        this. =
    }

    public static Frigider getInstance() {
        System.out.println("adsadas");
        return instance;
    }
}

class Test {
    public static void main(String[] args) {

//        Frigider frfr = new Frigider();

        Frigider frig1 = Frigider.getInstance();
        Frigider frig2 = Frigider.getInstance();

        System.out.println(frig1 == frig2);




    }
}
