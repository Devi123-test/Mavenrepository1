package ExceptionHandling;

import java.util.Scanner;

class ErrorhandlingExamples {

    //Compile time exceptions and run time exceptions

    void add(int a, int b) {
        System.out.println("Sum of the values are: " + (a + b));
    }

    public static void main(String[] args) {

//        int a = "student";
        ErrorhandlingExamples erex1 = new ErrorhandlingExamples();
        Scanner sc = new Scanner(System.in);

//        System.out.println("User given input: "+num);
//        erex1.add(12, 67);


        System.out.println("Sample one");
        System.out.println("Sample two");
        System.out.println("Sample three");
        System.out.println("Sample four");
        System.out.println("Sample five");   //Compile time
//        System.out.println("Please give the number - numerator: ");
//        int num = sc.nextInt();
//        System.out.println("Please give the number - denominator: ");
//        int denom = sc.nextInt();
//        System.out.println(num / denom);
        try {
            System.out.println("Please give the number - numerator: ");
            int num = sc.nextInt();
            System.out.println("Please give the number - denominator: ");
            int denom = sc.nextInt();
            System.out.println(num / denom);           // Run time
        }
        catch (Exception e){
//            System.out.println("Number should not divide by zero");
            System.out.println("Exception outcome from the program: "+e);
        }
      finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Sample Six");
        System.out.println("Sample seven");
        System.out.println("Sample eight");
        System.out.println("Sample nine");
        System.out.println("Sample ten");
//    }
    }
}
