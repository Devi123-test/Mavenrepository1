package Inheritance;

class Samplewithinpackage {

    public static void main(String[] args) {
        Class1 cl1 = new Class1();
        //Variables
        System.out.println("Public variable a: "+cl1.a);
        System.out.println("Public variable b: "+cl1.b);
        System.out.println("Default variable x: \""+cl1.x);
        System.out.println("Default variable y: \""+cl1.y);
//        System.out.println("Private variable: "+cl1.prinum1); // Private is within the class cannot be called outside
        System.out.println("Final variable: "+cl1.finnum2);
        System.out.println(cl1.m);
        System.out.println(Class1.m);

        //Methods
//        cl1.primethod(); // Private is within the class cannot be called outside
        cl1.staticmethod();
        Class1.staticmethod();
        //Sum Default method
        cl1.sum();
        cl1.sub();
        cl1.mul();
        cl1.div();

    }

}
