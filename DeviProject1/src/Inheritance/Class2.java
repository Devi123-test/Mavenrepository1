package Inheritance;

// Reusable concept
public class Class2 {

    public static void main(String[] args) {
        Class1 cl1 = new Class1();
        System.out.println(cl1.a);
        cl1.protectedmethod();
//        cl1.finnum2 = 60;  // cannot modify the final variable

//        System.out.println(cl1.prinum1); This is a private variable in Class1 hence cannot access here
//        cl1.primethod();  //This is a private method in Class1 hence cannot access here
//        System.out.println(cl1.prinum1); // Private is within the class cannot be called outside
        cl1.staticmethod();
        Class1.staticmethod();
        cl1.sum();
        cl1.sub();
        cl1.mul();
        cl1.div();
        cl1.protectedmethod();
        cl1.finalmethod();
//        cl1.finnum2 = 60; // Once assigned we can modify the final variable
        System.out.println(cl1.j);
        System.out.println(cl1.k);
        System.out.println(cl1.finnum2);
        System.out.println(cl1.x + " " + cl1.y);
//        cl1.primethod();
//        System.out.println(cl1.prinum1);

    }

}
