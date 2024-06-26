package javatraining;

import java.util.Scanner;

public class scannerinput {
    public static void main(String[] args) {
        String stuname[] = new String[5];
        int marks[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student1 name : ");
        stuname[0] = sc.next();
        System.out.println("Enter student1 total marks: ");
        marks[0] = sc.nextInt();
        System.out.println("Enter student2 name : ");
        stuname[1] = sc.next();
        System.out.println("Enter student2 total marks: ");
        marks[1] = sc.nextInt();
        System.out.println("Enter student3 name : ");
        stuname[2] = sc.next();
        System.out.println("Enter student3 total marks: ");
        marks[2] = sc.nextInt();
        System.out.println("Enter student4 name : ");
        stuname[3] = sc.next();
        System.out.println("Enter student4 total marks: ");
        marks[3] = sc.nextInt();
        System.out.println("Enter student5 name : ");
        stuname[4] = sc.next();
        System.out.println("Enter student5 total marks: ");
        marks[4] = sc.nextInt();

        System.out.println("Student1 name is :" + stuname[0] + " and marks are :" + marks[0]);
        System.out.println("Student2 name is :" + stuname[1] + " and marks are :" + marks[1]);
        System.out.println("Student3 name is :" + stuname[2] + " and marks are :" + marks[2]);
        System.out.println("Student4 name is :" + stuname[3] + " and marks are :" + marks[3]);
        System.out.println("Student5 name is :" + stuname[4] + " and marks are :" + marks[4]);

    }
}