package Inheritance;

public class Accessmodifiermain {

    public int x=10, y =20, z = 30;

   public void add1(){
        System.out.println("Addition method result: "+(x+y));
    }

    void sub1(){
        System.out.println("Subtraction method result:"+(y-x));
    }

    void display(){
        System.out.println("Display method result");
    }


    public static void main(String[] args) {
        Accessmodifiermain cl1 = new Accessmodifiermain();
        System.out.println(cl1.x);
        System.out.println(cl1.y);
        cl1.add1();
        cl1.sub1();
    }


}
