package Abstraction;

public class AbstractChild extends Abstraction1 {


    @Override
    void abs() {
        System.out.println("Execution of abs from AbstractChild");

    }

    @Override
    void photoverify() {
        System.out.println("Execution of Photo verify from AbstractBranchoff3");

    }

    @Override
    void addressverify() {
        System.out.println("Execution of address verify from AbstractBranchoff3");

    }

    @Override
    void fileverify() {
        System.out.println("Execution of file verify from AbstractBranchoff3");

    }

    void display1(){
        System.out.println("This is non Abstract method display1");
    }

    void additionalmethod(){
        System.out.println("This is additional method");
    }

    public static void main(String[] args) {
        AbstractChild child = new AbstractChild();
        child.photoverify();
        child.addressverify();
        child.fileverify();
        child.display1();
        child.nonabstractmethod();
        child.add(10, 20);
        child.additionalmethod();

    }

}
