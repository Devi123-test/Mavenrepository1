package Janbatch;

public class Statictype {

   static int a = 10, b = 20;

   public static void add(int a, int b) {
        System.out.println("Addition of two number from void method is: " + (a + b));
    }

    public static void main(String[] args) {

//        Statictype obj = new Statictype();
//        obj.add(60, 70);
        add(60, 70);
        System.out.println(a);
        System.out.println(b);

    }
}
