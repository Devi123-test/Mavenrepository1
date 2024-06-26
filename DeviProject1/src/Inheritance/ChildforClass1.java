package Inheritance;

// Inheritance of parent to child
// Java doesn't support multiple parent inheritance to a child
public class ChildforClass1 extends Class1 {


    void tempmethod(){
        System.out.println("Temp method created in ChildforClass1");
    }

//    void finalmethod() {
//        System.out.println("Final method from child");
//    }  // Final method cannot override in child

   public void sum(){
        System.out.println("Sum method1 from child");

    }

    void sub(){
        System.out.println("Sub method2 from child");
    }


    public static void main(String[] args) {
//        Class1 c1 = new ChildforClass1();
//        c1.sum();

        ChildforClass1 chc1 = new ChildforClass1();

        chc1.tempmethod();
        chc1.sum();
        chc1.sub();
//        chc1.sum();
//        chc1.sub();
        chc1.mul();
        chc1.div();
        chc1.finalmethodadd(10, 20);

        System.out.println(chc1.a);
        chc1.protectedmethod();
//        cl1.finnum2 = 60;  // cannot modify the final variable

//        System.out.println(chc1.prinum1); //This is a private variable in Class1 hence cannot access here
//        chc1.primethod();  //This is a private method in Class1 hence cannot access here
//        System.out.println(cl1.prinum1); // Private is within the class cannot be called outside
        chc1.tempmethod();
        chc1.staticmethod();
        chc1.sum();
        chc1.sub();
        chc1.mul();
        chc1.div();
        chc1.finalmethodadd(10, 20);
        chc1.finalmethod();
        chc1.protectedmethod();
        System.out.println(chc1.j);
        System.out.println(chc1.k);
        System.out.println(chc1.finnum2);


    }

}
