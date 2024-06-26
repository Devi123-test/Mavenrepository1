package PRACTICE;
import java.util.Scanner;

public class scannerinputif {
    public static void main(String[] args) {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age");
        i = s.nextInt();
        if (i <=18) {
            System.out.println("Person not eligible to vote");
        }
       else System.out.println("Person eligible to vote");
    }
}
