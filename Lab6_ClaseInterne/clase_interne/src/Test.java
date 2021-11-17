/*

clase interne:
- clase interne normale
- clase anonime
- clase interne statice -> rare
- clase interne blocurilor/metodelor -> rare

 */



interface Engine {
    public int getFuelCapacity();
}

class Car {

    private OttoEngine otto = new OttoEngine(11);
    private String manufacturer = "Mercedes";

    // o tratam ca orice camp al unei clase
    private class OttoEngine implements Engine {
        private int fuelCapacity;
        private String manufacturer = "Renault";

        public OttoEngine(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public int getFuelCapacity() {
            // pentru accesarea unui camp din clasa externa folosim: Clasaexterna.this
            System.out.println(Car.this.manufacturer);
            return fuelCapacity;
        }

        @Override
        public String toString() {
            return "OttoEngine{" +
                    "fuelCapacity=" + fuelCapacity +
                    '}';
        }
    }

    public OttoEngine getOtto() {
        return otto;
    }

    public OttoEngine getEngine() {
        OttoEngine engine = new OttoEngine(11);
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "otto=" + otto +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {

        Car car = new Car();

        Engine otto = car.getEngine();
        Engine otto2 = car.getOtto();

        System.out.println(otto.getFuelCapacity());

//        Car.OttoEngine firstEngine = car.getEngine();
//        Car.OttoEngine secondEngine = car.new OttoEngine(10);
//
//        System.out.println(firstEngine.getFuelCapacity());
//        System.out.println(secondEngine.getFuelCapacity());


//
//        System.out.println(otto);
//        System.out.println(otto2);


    }
}

