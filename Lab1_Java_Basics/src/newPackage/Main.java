package newPackage;

public class Main {
    // int main(int argc, char *argv[]) -> C/C++
    public static void main(String[] args) {
        Cat myCat = new Cat();
        PrivateCat cat = new PrivateCat();
        System.out.println(myCat.age);
    }
}
