package Janbatch;

public class Methods3 {

    void add(int a, int b) {
        System.out.println("Addition of two number from void method is: " + (a + b));
    }

    int addreturn(int a, int b) {
        System.out.println("Addition of two number from returnt type method is: ");
        return a+b;
    }

    // Program to give result based on the student marks, student name and marks are given as input
    int studentresult(String name, int mark1, int mark2, int mark3, int mark4, int mark5) {
        if (mark1 > 60 && mark2 >= 60 && mark3 >= 60 && mark4 >= 60 && mark5 >= 60) {

            System.out.println("Student " + name + " result: Pass");
            int totalmarks = mark1 + mark2 + mark3 + mark4 + mark5;
            return totalmarks;
        } else {
            System.out.println("Student " + name + " result: Fail");
            int totalmarks = mark1 + mark2 + mark3 + mark4 + mark5;
            return totalmarks;
        }
    }

    int x = 10, y = 20;
    int addreturn1() {
        System.out.println("Addition of two number from returnt type method is: ");
        return x+y;
    }

    public static void main(String[] args) {

        Methods3 obj = new Methods3();

//        obj.add(60, 70);
//        System.out.println(obj.addreturn(30, 50));

//        obj.studentresult("John", 65, 45, 60, 70, 80);
        System.out.println(obj.studentresult("John", 65, 45, 60, 70, 80));

        }

}
