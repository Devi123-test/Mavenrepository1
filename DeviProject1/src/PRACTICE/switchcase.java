package PRACTICE;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        char grade;
        float marks=0;
        System.out.println("Enter your marks : ");
        Scanner sc = new Scanner(System.in);//scanner class
        marks = sc.nextFloat();//user input
        grade = (char)marks; //typecasting
        System.out.println(marks);
        if (marks > 90) {
            grade = 'A';
        } else if (marks > 80) {
            grade = 'B';
        } else if (marks > 70) {
            grade = 'C';
        } else if (marks > 60) {
            grade = 'D';
        } else if (marks > 50) {
            grade = 'E';
        } else if((marks>100) || (marks<0)) {
            grade = 'X';
//not giving right output if it is more than 100
        }
        System.out.println("Your grade is " + grade);
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            default:
                System.out.println("Invalid marks");
                break;
        }
    }
}
