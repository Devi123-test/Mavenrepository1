package Inheritance;

public class Class4 extends Class1{

    int x = 10;
    int y = 20;

    public void sum(){
        System.out.println("Running inside add1 method: "+(x+y));
    }

    public static void main(String[] args) {
        Class4 cl4 = new Class4();

        System.out.println("Running inside main method: "+(cl4.x+cl4.y));
        cl4.sum();
        cl4.mul();
        cl4.sub();
        cl4.div();

    }


}
