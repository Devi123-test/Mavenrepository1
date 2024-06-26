package Constructor;

public class Constructor2 {

    Constructor2(int a, int b) {
        System.out.println(a+b);
        System.out.println("Constructor.Constructor method is executed with parameter");

    }
    Constructor2() {
        System.out.println("Constructor.Constructor method is executed without parameter");
    }

    void add() {
        System.out.println(15 + 24 + 86);
    }

    void sub() {
        System.out.println(45 - 12);
    }

    public static void main(String[] args) {

        Constructor2 c2 = new Constructor2(20, 30);
        Constructor2 cc2 = new Constructor2();

        c2.sub();
        c2.add();

    }
}
