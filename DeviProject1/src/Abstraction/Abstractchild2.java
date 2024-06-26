package Abstraction;

public class Abstractchild2 extends Abstraction1 {
    @Override
    void abs() {
        System.out.println("abcd");
    }

    @Override
    void photoverify() {

    }

    @Override
    void addressverify() {

    }

    @Override
    void fileverify() {

        Abstractchild2 obj = new Abstractchild2();
        obj.photoverify();
//        obj.addressverify();
//        obj.fileverify();
        obj.nonabstractmethod();
        obj.add(10, 20);


    }
}
