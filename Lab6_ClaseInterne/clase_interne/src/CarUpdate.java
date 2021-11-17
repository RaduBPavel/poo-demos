public class CarUpdate {
    static class Engine {
        static public void getFuelCapacity() {
            System.out.println("I am a generic Engine");
        }
    }
}

//class OttoEngine1 extends CarUpdate.Engine {
////    OttoEngine1() {
////    } // EROARE, avem nevoie de o legatura la obiectul clasei exterioare
//
//    OttoEngine1(CarUpdate car) { // OK
//        car.super();
//    }
//
//    @Override
//    public void getFuelCapacity() {
//        System.out.println("I am an Otto Engine");
//    }
//}

class Test2 {
    public static void main(String[] args) {
//        CarUpdate car = new CarUpdate();
//        OttoEngine1 ottoEngine = new OttoEngine1(car);
//        ottoEngine.getFuelCapacity();

        CarUpdate.Engine.getFuelCapacity();

    }
}