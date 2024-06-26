package Inheritance;

  public class Class1 {


  public int a = 10, b = 20;
  int x = 25, y = 45;  // Default
  public static int m = 12;
    private int prinum1 = 50; //Use only within the same calss

     protected int j = 12, k = 16;

     final int finnum1 = 30;

    public final int finnum2 = 30;

        private void primethod() {
        System.out.println("This is a private method won't be used outside");
    }


    public void primethodalt() {
        System.out.println("Trying to execute private method through other method alternative");
        primethod();
    }


   public static void staticmethod() {
        System.out.println("This is a static method");
    } //Use only within the same calss without creating object

     public final int finalmethodadd(int e, int f) {
         System.out.println("Sum of two numbers: "+(e+f));
        return e+f;
    }
   public void sum() {

        System.out.println("Sum Method running from Parent");
        System.out.println(a + b);
    }

    protected void protectedmethod (){

            System.out.println("Protected method executed from parent");
    }

    void sub() {
        System.out.println("Subtraction Method running from Parent");
        System.out.println(a - b);

    } // Default method

    public void div() {

        System.out.println("Division Method running from Parent");
        System.out.println( a / b);

    }

    void mul() {
        System.out.println("Multiplication Method running from Parent");
        System.out.println(a * b);
    } // Default method

    final void finalmethod() {
        System.out.println("Final method executed from parent");
    }

    public static void main(String[] args) {

        Class1 cl1 = new Class1();
        //Variables

        System.out.println("Public variable a: "+cl1.a);
        System.out.println("Public variable b: "+cl1.b);
        System.out.println("Default variable x: \""+cl1.x);
        System.out.println("Default variable y: \""+cl1.y);
        System.out.println("Private variable: "+cl1.prinum1);
        System.out.println("Final variable: "+cl1.finnum2);
        System.out.println("Static variable: "+m);
        int sum = (cl1.a+cl1.b+ cl1.prinum1+ cl1.finnum2+m);
//        cl1.finnum2+=15; // Cannot modify the final variable data
        System.out.println(m);
//        cl1.finnum2 = 60; // Once assigned we can modify the final variable

        //Methods
        cl1.primethod();
        staticmethod(); //Static method type can be called directly without object
        //Sum Default method

        cl1.primethod();
        staticmethod();
        cl1.sum();
        cl1.sub();
        cl1.mul();
        cl1.a = 15;
        System.out.println("Updated value of a:"+cl1.a);
        cl1.div();
        System.out.println(cl1.finnum1);
//        cl1.finnum1 = 40; // Cannot modify the final variable data


    }
}

