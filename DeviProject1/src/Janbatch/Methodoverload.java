package Janbatch;

public class Methodoverload {

    int x = 5, y = 7;

    void add(){
        System.out.println("Addition of two numbers: " + (x+y));
    }

    void add (int a, int b){
        System.out.println("Addition of two numbers from parameter: " + (a+b));
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {

        Methodoverload methodover = new Methodoverload();
        methodover.add();
        System.out.println(methodover.add(3,6,9));
        methodover.add(12, 25);

    }

}
