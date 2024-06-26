package DAY1SelfPractice;

import java.io.InputStream;
import java.util.Scanner;

public class ifcondition {
    public static void main(String[] args) {
        //program to find max of 2 numbers
        Scanner S = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = S.nextInt();
        System.out.println("Enter Second number");
        int n2 = S.nextInt();
if (n1>n2)
    System.out.println("First no. is greater than Second no. ");
else System.out.println("First no. is smaller than Second no. ");
    }
}
