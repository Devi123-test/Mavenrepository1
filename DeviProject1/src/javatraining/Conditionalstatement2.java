package Javatraining;

import java.util.Scanner;

public class Conditionalstatement2 {

    public static void main(String[] args) {
        String stuname;
        int totalmark;

//         stuname = "Student1";
//         totalmark = 460;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        stuname = sc.nextLine();
        System.out.println("Enter total marks: ");
        totalmark = sc.nextInt();

        System.out.println("Student: " + stuname + " Secured Total marks: " + totalmark);
        System.out.print("Student secured the grade: ");
//        if (totalmark > 450) {
//            System.out.println("Grade A");
//        } else if (totalmark > 400) {
//            System.out.println("Grade B");
//        } else if (totalmark > 350) {
//            System.out.println("Grade C");
//        } else if (totalmark > 300) {
//            System.out.println("Grade D");
//        } else {
//            System.out.println("Grade E");
//        }

        if ((totalmark > 300) && (totalmark < 350)) {
            System.out.println("Grade E");
        } else if ((totalmark > 350) && (totalmark < 400)) {
            System.out.println("Grade D");
        } else if ((totalmark > 400) && (totalmark < 450)) {
            System.out.println("Grade C");
        } else if (totalmark > 450) {
            System.out.println("Grade A");
        } else if (totalmark < 300) {
            System.out.println("No grade");
        }

    }
}
