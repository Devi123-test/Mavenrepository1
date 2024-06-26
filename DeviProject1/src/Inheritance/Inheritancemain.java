package Inheritance;

// Inheriting parent
// Also overriding sub and div from parent, we are executing those from child
public class Inheritancemain extends Class1{

    public void sam1(){

        System.out.println(super.a);
        super.a = 50;
        super.div();
//
//        System.out.println("Subtraction method is Method running from child");
//        System.out.println(a-b);
    }

//    void finalmethodadd(int m, int n){ {
//        System.out.println("Sum of two numbers: "+(e+f));
//    }

    public void sub(){
        System.out.println("Sub method running from child: "+(a-b));
    }

   public void div(){

        System.out.println("Division method is Method running from child");
        System.out.println(a/b);
    }

    void temp(){
        System.out.println("This is a temp method from child");
    }


//    public int finalmethodadd(int e, int f) {
//        System.out.println("Sum of two numbers: "+(e+f));
//        return e+f;
//    }  // Final method cannot override in child


    public static void main(String[] args) {
//        Class1 c1 = new Class1();
//        c1.sum();

        //cannot call sub frm the above method, as object created only for the parent

        Inheritancemain ch3 = new Inheritancemain();  //Can call both parent and child method

        ch3.sum();
        ch3.sam1();
        ch3.mul(); // Parent
        ch3.temp(); // Only in child
        ch3.div(); // Both
        ch3.sub(); // Both
        System.out.println(ch3.a);
        System.out.println(ch3.x + " " + ch3.y);
        System.out.println(ch3.j + " " + ch3.k);
        ch3.protectedmethod();
////        System.out.println(ch3.prinum1); // Private is within the class cannot be called outside
//        ch3.primethod();    //This is a private method in Class1 hence cannot access here


    }
}
