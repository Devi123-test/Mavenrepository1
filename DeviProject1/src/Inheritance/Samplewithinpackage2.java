package Inheritance;

public class Samplewithinpackage2 {

    public static void main(String[] args) {
        Class1 cl1 = new Class1();
        //Variables
        System.out.println("Public variable a: "+cl1.a);
        System.out.println("Public variable b: "+cl1.b);
        System.out.println("Default variable x: \""+cl1.x);
        System.out.println("Default variable y: \""+cl1.y);
//        System.out.println("Private variable: "+cl1.prinum1);
        System.out.println("Final variable: "+cl1.finnum2);
//        int sum = (cl1.a+cl1.b+ cl1.prinum1+ cl1.finnum2+m);
//        cl1.finnum2+=15; // Cannot modify the final variable data


        //Methods
//        cl1.primethod();
        Class1.staticmethod(); //Static method type can be called directly without object
        //Sum Default method
        cl1.sum();
        cl1.sub();
        cl1.mul();
        cl1.div();

    }
}
