import java.util.Locale;

// nu admite mostenire
public class Cat {

//    admite o unica initializare
    public int age;
    public String name;

    // static -> se aloca o zona de memorie speciala pentru blocurile STATICE
    // dinainte de a se crea obiectele
    // depind doar de clasa
    public static int friends;
    static {
        friends = 4;
    }



    public Cat(int age, String name) {
        this.name = name;
    }

    // nu o sa ma lase sa o suprascriu dar pot sa o supraincarc
    public final void getOlder(int age) {
        this.age += age;
    }

    // final pentru parametri -> nu se poate schimba valoarea
    public void getOlder(final int age1, int age2) {
//        age1 = 7;
        this.age = age1;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        // nu putem schimba referinta
        final Cat angela = new Cat(4, "Angela");
//        angela = new Cat(5, "Altnume");

//        angela.age = 5;
//        System.out.println(angela);

        System.out.println(Cat.friends);
//        System.out.println(angela.friends);

        // obiecte immutable: String, Integer ..
        String s1 = new String("abc");
        String s2 = s1.toUpperCase(Locale.forLanguageTag(s1)); // nu o sa afiseze ABC
        System.out.println(s1);
        System.out.println(s2);

        String s3 = new String();
        for(int i = 0; i < 50; i++) {
            s3 += "a";
        }

        System.out.println(s3);

        // mutable
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 50; i++) {
            sb.append("a");
        }

        System.out.println(sb);



    }

}

//class BritishShortHair extends Cat {
//
//    public BritishShortHair(int age, String name) {
//        super(age, name);
//    }

//    @Override
//    public final void getOlder(int age) {
//        this.age += age;
//    }

//    public  void getOlder(int age1, int age2) {
//        this.age += age1 + age2;
//    }
// }