package Polymorphism;

public class Polymorphism1 {
    int a = 10, b = 20;

    void addition(){
        System.out.println("Addition of a+b is: " + (a+b));
    }

    int addition(int a, int b){
        return a+b;
    }

    int addition(int a, int b, int c, int d){
        return a+b+c+d;
    }

    void subtraction(){
        System.out.println("Subtraction of a-b is: " + (a-b));
    }

    int subtraction(int a, int b){
        return a-b;
    }

    void multiplication(){
        System.out.println("Multiplication of a*b is: " + (a*b));
    }

    int multiplication(int a, int b){
        return a*b;
    }


    public static void main(String[] args) {
        Polymorphism1 poly1 = new Polymorphism1();
        poly1.addition();
        poly1.subtraction();
        poly1.multiplication();
        poly1.addition(40, 50);
        poly1.addition(10,20,30,40);

        poly1.addition();
        System.out.println(poly1.addition(25, 30));


    }


}
