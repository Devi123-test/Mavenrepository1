package Inheritance;

public class Testjava1 {

    public static void main(String[] args) {

        Class1 cl1 = new Class1();
        System.out.println("Public variable a: "+cl1.a);
        System.out.println("Public variable b: "+cl1.b);
        System.out.println("Default variable x: \""+cl1.x);
        System.out.println("Default variable y: \""+cl1.y);
//        System.out.println("Private variable: "+cl1.prinum1);
        System.out.println("Final variable: "+cl1.finnum2);
//        System.out.println("Static variable: "+m);
//        int sum = (cl1.a+cl1.b+ cl1.prinum1+ cl1.finnum2+m);
//        cl1.finnum2+=15; // Cannot modify the final variable data
//        System.out.println(m);
//        cl1.finnum2 = 60; // Once assigned we can modify the final variable

        //Methods
//        cl1.primethod();
        cl1.staticmethod(); //Static method type can be called directly without object
        //Sum Default method

//        cl1.primethod();
        cl1.staticmethod();
        cl1.sum();
        cl1.sub();
        cl1.mul();
        cl1.a = 11;
        System.out.println("Updated value of a:"+cl1.a);
        cl1.div();

    }

}
