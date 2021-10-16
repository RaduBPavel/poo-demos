public class ConstructorDefault {

    // primitive
    public int a;
    public short b;
    public long c;
    public float d;
    public double e;
    public boolean f;
    public char g;


    // obiecte
    public ConstructorDefault selfConstructorDefault;
    public String myString;
    public Integer myInt;
    public Double myDouble;
    public Boolean myBoolean;

    public static void main(String[] args) {

        ConstructorDefault constructorDefault = new ConstructorDefault();

        System.out.println(constructorDefault.a + " " + constructorDefault.b + " " + constructorDefault.c + " " +
                constructorDefault.d + " " + constructorDefault.e + " " + constructorDefault.f + " " +
                constructorDefault.g + " ");

        System.out.println((int)constructorDefault.g); // https://www.asciitable.com/

        System.out.println(constructorDefault.selfConstructorDefault + " "+ constructorDefault.myString + " "+
                constructorDefault.myInt + " " + constructorDefault.myDouble);

        // ?
        // System.out.println(constructorDefault.myBoolean);

        // ?
        // String test = new String();
        // System.out.println(test);
    }
}
